package com.shabalin13.testci.domain.usecases.mediaCatalog

import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem

interface SaveMediaCatalogItemsUseCase {
    suspend operator fun invoke(mediaCatalogItems: List<MediaCatalogItem>)
}
