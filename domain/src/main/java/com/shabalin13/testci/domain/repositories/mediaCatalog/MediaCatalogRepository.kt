package com.shabalin13.testci.domain.repositories.mediaCatalog

import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem

interface MediaCatalogRepository {
    suspend fun getMediaCatalogItemsFromNetwork(): List<MediaCatalogItem>
    suspend fun saveMediaCatalogItemsToDb(mediaCatalogItems: List<MediaCatalogItem>)
}
