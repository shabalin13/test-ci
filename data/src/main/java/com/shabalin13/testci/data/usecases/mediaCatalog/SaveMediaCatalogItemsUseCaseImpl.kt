package com.shabalin13.testci.data.usecases.mediaCatalog

import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem
import com.shabalin13.testci.domain.repositories.mediaCatalog.MediaCatalogRepository
import com.shabalin13.testci.domain.usecases.mediaCatalog.SaveMediaCatalogItemsUseCase
import javax.inject.Inject

internal class SaveMediaCatalogItemsUseCaseImpl @Inject constructor(
    private val repository: MediaCatalogRepository,
) : SaveMediaCatalogItemsUseCase {
    override suspend fun invoke(mediaCatalogItems: List<MediaCatalogItem>) {
        repository.saveMediaCatalogItemsToDb(mediaCatalogItems)
    }
}
