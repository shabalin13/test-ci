package com.shabalin13.testci.mediaDetails.di

import com.shabalin13.testci.domain.usecases.mediaDetails.GetMediaDetailsUseCase

interface MediaDetailsDependencies {
    val getMediaDetailsUseCase: GetMediaDetailsUseCase
}
