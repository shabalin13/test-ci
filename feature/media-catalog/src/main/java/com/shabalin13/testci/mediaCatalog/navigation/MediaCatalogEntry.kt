package com.shabalin13.testci.mediaCatalog.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.shabalin13.testci.mediaCatalog.di.MediaCatalogDependencies

object MediaCatalogEntry {
    fun getNavGraph(
        navController: NavController,
        dependencies: MediaCatalogDependencies,
        onMediaCatalogItemClick: (mediaId: Int) -> Unit,
    ): NavGraphBuilder.() -> Unit {
        return {
            mediaCatalogNavGraph(navController, dependencies, onMediaCatalogItemClick)
        }
    }
}
