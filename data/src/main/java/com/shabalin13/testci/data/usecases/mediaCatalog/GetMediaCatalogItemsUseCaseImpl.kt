package com.shabalin13.testci.data.usecases.mediaCatalog

import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem
import com.shabalin13.testci.domain.repositories.mediaCatalog.MediaCatalogRepository
import com.shabalin13.testci.domain.usecases.mediaCatalog.GetMediaCatalogItemsUseCase
import javax.inject.Inject

internal class GetMediaCatalogItemsUseCaseImpl @Inject constructor(
    private val repository: MediaCatalogRepository,
) : GetMediaCatalogItemsUseCase {
    override suspend fun invoke(): List<MediaCatalogItem> {
        return repository.getMediaCatalogItemsFromNetwork()
    }
}
