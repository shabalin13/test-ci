package com.shabalin13.testci.mediaDetails.navigation

sealed class MediaDetailsRoutes(val route: String) {
    data object MediaDetailsMain : MediaDetailsRoutes("mediaDetails/{$MEDIA_ID_KEY}") {
        fun createRoute(mediaId: Int) = "mediaDetails/$mediaId"
    }

    companion object {
        const val MEDIA_ID_KEY = "mediaId"
    }
}

/*
sealed class MediaDetailsRoutes(val route: String) {
    data object MediaDetailsGraph : MediaDetailsRoutes(BASE_ROUTE)
    data object MediaDetailsMain : MediaDetailsRoutes("$BASE_ROUTE/main/{$MEDIA_ID_KEY}") {
        fun createRoute(mediaId: Int) = "$BASE_ROUTE/main/$mediaId"
    }

    companion object {
        const val BASE_ROUTE = "mediaDetails"
        const val MEDIA_ID_KEY = "mediaId"
    }
}
 */
