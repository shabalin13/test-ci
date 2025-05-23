package com.shabalin13.testci.mediaCatalog.di

import com.shabalin13.testci.mediaCatalog.ui.MediaCatalogViewModel
import dagger.Component

@Component(
    dependencies = [MediaCatalogDependencies::class]
)
internal interface MediaCatalogComponent {
    fun viewModelFactory(): MediaCatalogViewModel.MediaCatalogViewModelFactory

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: MediaCatalogDependencies,
        ): MediaCatalogComponent
    }
}
