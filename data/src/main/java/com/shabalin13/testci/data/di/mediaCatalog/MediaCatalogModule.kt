package com.shabalin13.testci.data.di.mediaCatalog

import com.shabalin13.testci.data.repositories.mediaCatalog.MediaCatalogRepositoryImpl
import com.shabalin13.testci.data.usecases.mediaCatalog.GetMediaCatalogItemsUseCaseImpl
import com.shabalin13.testci.data.usecases.mediaCatalog.SaveMediaCatalogItemsUseCaseImpl
import com.shabalin13.testci.domain.repositories.mediaCatalog.MediaCatalogRepository
import com.shabalin13.testci.domain.usecases.mediaCatalog.GetMediaCatalogItemsUseCase
import com.shabalin13.testci.domain.usecases.mediaCatalog.SaveMediaCatalogItemsUseCase
import dagger.Binds
import dagger.Module

@Module
internal interface MediaCatalogModule {
    @Binds
    fun bindMediaCatalogRepository(
        impl: MediaCatalogRepositoryImpl,
    ): MediaCatalogRepository

    @Binds
    fun bindGetMediaCatalogItemsUseCase(
        impl: GetMediaCatalogItemsUseCaseImpl,
    ): GetMediaCatalogItemsUseCase

    @Binds
    fun bindSaveMediaCatalogItemsUseCase(
        impl: SaveMediaCatalogItemsUseCaseImpl,
    ): SaveMediaCatalogItemsUseCase
}
