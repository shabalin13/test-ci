package com.shabalin13.testci.mediaDetails.di

import com.shabalin13.testci.mediaDetails.ui.MediaDetailsViewModel
import dagger.Component

@Component(
    dependencies = [MediaDetailsDependencies::class]
)
internal interface MediaDetailsComponent {

    val viewModelFactory: MediaDetailsViewModel.MediaDetailsViewModelFactory.Factory

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: MediaDetailsDependencies,
        ): MediaDetailsComponent
    }
}
