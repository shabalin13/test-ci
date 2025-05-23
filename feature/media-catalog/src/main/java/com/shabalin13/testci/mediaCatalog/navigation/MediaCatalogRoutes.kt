package com.shabalin13.testci.mediaCatalog.navigation

sealed class MediaCatalogRoutes(val route: String) {
    data object MediaCatalogGraph : MediaCatalogRoutes(BASE_ROUTE)
    data object MediaCatalogMain : MediaCatalogRoutes("$BASE_ROUTE/main")
    data object MediaCatalogFilters : MediaCatalogRoutes("$BASE_ROUTE/filters")

    companion object {
        const val BASE_ROUTE = "mediaCatalog"
    }
}
