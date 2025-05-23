package com.shabalin13.testci.data.di.mediaDetails

import com.shabalin13.testci.data.repositories.mediaDetails.MediaDetailsRepositoryImpl
import com.shabalin13.testci.data.usecases.mediaDetails.GetMediaDetailsUseCaseImpl
import com.shabalin13.testci.domain.repositories.mediaDetails.MediaDetailsRepository
import com.shabalin13.testci.domain.usecases.mediaDetails.GetMediaDetailsUseCase
import dagger.Binds
import dagger.Module

@Module
internal interface MediaDetailsModule {
    @Binds
    fun bindMediaDetailsRepository(
        impl: MediaDetailsRepositoryImpl,
    ): MediaDetailsRepository

    @Binds
    fun bindGetMediaDetailsUseCase(
        impl: GetMediaDetailsUseCaseImpl,
    ): GetMediaDetailsUseCase
}
