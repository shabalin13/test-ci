package com.shabalin13.testci.data.repositories.mediaCatalog

import android.util.Log
import com.shabalin13.testci.data.di.BaseUrl
import com.shabalin13.testci.domain.models.mediaCatalog.MediaCatalogItem
import com.shabalin13.testci.domain.repositories.mediaCatalog.MediaCatalogRepository
import javax.inject.Inject

@Suppress("MagicNumber")
internal class MediaCatalogRepositoryImpl @Inject constructor(
    @BaseUrl private val baseUrl: String,
) : MediaCatalogRepository {
    override suspend fun getMediaCatalogItemsFromNetwork(): List<MediaCatalogItem> {
        Log.d("Kinopoisk", "MediaCatalogRepository::getMediaCatalogItemsFromNetwork ($baseUrl)")
        return listOf(
            MediaCatalogItem(0, "Value1"),
            MediaCatalogItem(1, "Value2"),
            MediaCatalogItem(2, "Value3"),
            MediaCatalogItem(3, "Value4"),
            MediaCatalogItem(4, "Value5"),
            MediaCatalogItem(5, "Value6"),
            MediaCatalogItem(6, "Value7"),
            MediaCatalogItem(7, "Value8")
        )
    }

    override suspend fun saveMediaCatalogItemsToDb(mediaCatalogItems: List<MediaCatalogItem>) {
        Log.d(
            "Kinopoisk",
            "MediaCatalogRepository::saveMediaCatalogItemsToDb (${mediaCatalogItems.size})"
        )
    }
}
