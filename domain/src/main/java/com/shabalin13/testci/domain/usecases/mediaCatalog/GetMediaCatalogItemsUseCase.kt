package com.shabalin13.testci.domain.usecases.mediaCatalog

import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem

interface GetMediaCatalogItemsUseCase {
    suspend operator fun invoke(): List<MediaCatalogItem>
}
