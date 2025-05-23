package com.shabalin13.testci.mediaCatalog.di

import com.shabalin13.testci.domain.usecases.mediaCatalog.GetMediaCatalogItemsUseCase
import com.shabalin13.testci.domain.usecases.mediaCatalog.SaveMediaCatalogItemsUseCase

interface MediaCatalogDependencies {
    val getMediaCatalogItemsUseCase: GetMediaCatalogItemsUseCase
    val saveMediaCatalogItemsUseCase: SaveMediaCatalogItemsUseCase
}
