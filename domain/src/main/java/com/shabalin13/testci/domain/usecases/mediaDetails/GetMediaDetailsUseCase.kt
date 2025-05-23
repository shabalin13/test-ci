package com.shabalin13.testci.domain.usecases.mediaDetails

import com.shabalin13.testci.domain.models.mediaDetails.MediaDetails

interface GetMediaDetailsUseCase {
    operator fun invoke(mediaId: Int): MediaDetails
}
