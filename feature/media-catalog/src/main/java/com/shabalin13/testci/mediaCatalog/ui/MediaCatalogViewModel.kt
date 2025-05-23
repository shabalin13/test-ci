package com.shabalin13.testci.mediaCatalog.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem
import com.shabalin13.testci.domain.usecases.mediaCatalog.GetMediaCatalogItemsUseCase
import com.shabalin13.testci.domain.usecases.mediaCatalog.SaveMediaCatalogItemsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

internal class MediaCatalogViewModel(
    private val getMediaCatalogItemsUseCase: GetMediaCatalogItemsUseCase,
    private val saveMediaCatalogItemsUseCase: SaveMediaCatalogItemsUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow<List<MediaCatalogItem>>(emptyList())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = getMediaCatalogItemsUseCase()
        }
    }

    class MediaCatalogViewModelFactory @Inject constructor(
        private val getMediaCatalogItemsUseCase: GetMediaCatalogItemsUseCase,
        private val saveMediaCatalogItemsUseCase: SaveMediaCatalogItemsUseCase,
    ) : ViewModelProvider.Factory {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            require(modelClass == MediaCatalogViewModel::class.java)
            return MediaCatalogViewModel(
                getMediaCatalogItemsUseCase,
                saveMediaCatalogItemsUseCase
            ) as T
        }
    }
}
