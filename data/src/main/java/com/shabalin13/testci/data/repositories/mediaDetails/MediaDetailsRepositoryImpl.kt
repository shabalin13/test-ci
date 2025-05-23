package com.shabalin13.testci.data.repositories.mediaDetails

import android.util.Log
import com.shabalin13.testci.data.di.BaseUrl
import com.shabalin13.testci.domain.models.mediaDetails.MediaDetails
import com.shabalin13.testci.domain.repositories.mediaDetails.MediaDetailsRepository
import javax.inject.Inject

internal class MediaDetailsRepositoryImpl @Inject constructor(
    @BaseUrl private val baseUrl: String,
) : MediaDetailsRepository {
    override fun getMediaDetails(mediaId: Int): MediaDetails {
        Log.d("Kinopoisk", "MediaDetailsRepository::getMediaDetails ($baseUrl?mediaId=$mediaId)")
        return MediaDetails(mediaId, "Additional info about media $mediaId")
    }
}
