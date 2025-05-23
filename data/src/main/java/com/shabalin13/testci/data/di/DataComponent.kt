package com.shabalin13.testci.data.di

import com.shabalin13.testci.domain.usecases.mediaCatalog.GetMediaCatalogItemsUseCase
import com.shabalin13.testci.domain.usecases.mediaCatalog.SaveMediaCatalogItemsUseCase
import com.shabalin13.testci.domain.usecases.mediaDetails.GetMediaDetailsUseCase
import dagger.Component

@Component(
    modules = [DataModule::class]
)
interface DataComponent {

    val getMediaCatalogItemsUseCase: GetMediaCatalogItemsUseCase
    val saveMediaCatalogItemsUseCase: SaveMediaCatalogItemsUseCase
    val getMediaDetailsUseCase: GetMediaDetailsUseCase

    @Component.Factory
    interface Factory {
        fun create(): DataComponent
    }
}
