package com.shabalin13.testci.data.usecases.mediaDetails

import com.shabalin13.testci.domain.models.mediaDetails.MediaDetails
import com.shabalin13.testci.domain.repositories.mediaDetails.MediaDetailsRepository
import com.shabalin13.testci.domain.usecases.mediaDetails.GetMediaDetailsUseCase
import javax.inject.Inject

internal class GetMediaDetailsUseCaseImpl @Inject constructor(
    private val repository: MediaDetailsRepository,
) : GetMediaDetailsUseCase {
    override fun invoke(mediaId: Int): MediaDetails {
        return repository.getMediaDetails(mediaId)
    }
}
