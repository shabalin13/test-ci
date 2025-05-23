package com.shabalin13.testci.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navigation
import com.shabalin13.testci.di.FeatureDependencies
import com.shabalin13.testci.mediaCatalog.navigation.MediaCatalogEntry
import com.shabalin13.testci.mediaCatalog.navigation.MediaCatalogRoutes
import com.shabalin13.testci.mediaDetails.navigation.MediaDetailsEntry
import com.shabalin13.testci.mediaDetails.navigation.MediaDetailsRoutes

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    featureDependencies: FeatureDependencies,
) {
    NavHost(
        navController = navController,
        startDestination = AppRoutes.AppGraph.route,
        modifier = modifier
    ) {
        navigation(
            startDestination = MediaCatalogRoutes.MediaCatalogGraph.route,
            route = AppRoutes.AppGraph.route
        ) {
            navigation(
                startDestination = MediaCatalogRoutes.MediaCatalogMain.route,
                route = MediaCatalogRoutes.MediaCatalogGraph.route
            ) {
                MediaCatalogEntry.getNavGraph(
                    navController,
                    featureDependencies,
                    onMediaCatalogItemClick = { mediaId ->
                        navController.navigate(
                            MediaDetailsRoutes.MediaDetailsMain.createRoute(
                                mediaId
                            )
                        )
                    }
                ).invoke(this)
            }

            MediaDetailsEntry.getNavGraph(
                navController,
                featureDependencies
            ).invoke(this)

//            navigation(
//                startDestination = MediaDetailsRoutes.MediaDetailsMain.route,
//                route = MediaCatalogRoutes.MediaCatalogGraph.route
//            ) {
//                MediaDetailsEntry.getNavGraph(
//                    navController,
//                    application.provideMediaDetailsDependencies()
//                ).invoke(this)
//            }
        }
    }
}
