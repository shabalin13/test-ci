package com.shabalin13.testci.mediaDetails.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.shabalin13.testci.domain.models.mediaDetails.MediaDetails
import com.shabalin13.testci.domain.usecases.mediaDetails.GetMediaDetailsUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

internal class MediaDetailsViewModel(
    private val mediaId: Int,
    private val getMediaDetailsUseCase: GetMediaDetailsUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow<MediaDetails>(MediaDetails(-1, "Unknown info"))
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            _state.value = getMediaDetailsUseCase(mediaId)
        }
    }

    class MediaDetailsViewModelFactory @AssistedInject constructor(
        @Assisted(MEDIA_ID_TAG) private val mediaId: Int,
        private val getMediaDetailsUseCase: GetMediaDetailsUseCase,
    ) : ViewModelProvider.Factory {

        init {
            Log.d("Dagger", "MediaDetailsViewModelFactory created for mediaId=$mediaId")
        }

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            require(modelClass == MediaDetailsViewModel::class.java)
            return MediaDetailsViewModel(mediaId, getMediaDetailsUseCase) as T
        }

        @AssistedFactory
        interface Factory {
            fun create(
                @Assisted(MEDIA_ID_TAG) mediaId: Int,
            ): MediaDetailsViewModelFactory
        }

        companion object {
            const val MEDIA_ID_TAG = "MEDIA_ID_TAG"
        }
    }
}
