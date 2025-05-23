package com.shabalin13.testci.domain.repositories.mediaDetails

import com.shabalin13.testci.domain.models.mediaDetails.MediaDetails

interface MediaDetailsRepository {
    fun getMediaDetails(mediaId: Int): MediaDetails
}
