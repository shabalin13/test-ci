package com.shabalin13.testci.mediaCatalog.navigation

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.shabalin13.testci.mediaCatalog.di.MediaCatalogComponentViewModel
import com.shabalin13.testci.mediaCatalog.di.MediaCatalogDependencies
import com.shabalin13.testci.mediaCatalog.ui.MediaCatalogScreen
import com.shabalin13.testci.mediaCatalog.ui.MediaCatalogViewModel

fun NavGraphBuilder.mediaCatalogNavGraph(
    navController: NavController,
    dependencies: MediaCatalogDependencies,
    onMediaCatalogItemClick: (mediaId: Int) -> Unit,
) {
    composable(MediaCatalogRoutes.MediaCatalogMain.route) { backStackEntry ->

        val parentEntry = remember(backStackEntry) {
            navController.getBackStackEntry(MediaCatalogRoutes.MediaCatalogGraph.route)
        }

        val componentViewModel: MediaCatalogComponentViewModel = viewModel(
            viewModelStoreOwner = parentEntry,
            factory = MediaCatalogComponentViewModel.Factory(dependencies)
        )

        val component = componentViewModel.component
        Log.d("Dagger", "Main MediaCatalogComponent created: $component")

        val viewModel = viewModel<MediaCatalogViewModel>(
            factory = component.viewModelFactory()
        )
        Log.d("Dagger", "Main MediaCatalogViewModel created: $viewModel")

        MediaCatalogScreen(
            viewModel = viewModel,
            onFiltersButtonClick = { navController.navigate(MediaCatalogRoutes.MediaCatalogFilters.route) },
            onMediaCatalogItemClick = onMediaCatalogItemClick
        )
    }

    composable(MediaCatalogRoutes.MediaCatalogFilters.route) { backStackEntry ->
        val parentEntry = remember(backStackEntry) {
            navController.getBackStackEntry(MediaCatalogRoutes.MediaCatalogGraph.route)
        }

        val componentViewModel: MediaCatalogComponentViewModel = viewModel(
            viewModelStoreOwner = parentEntry,
            factory = MediaCatalogComponentViewModel.Factory(dependencies)
        )

        val component = componentViewModel.component
        Log.d("Dagger", "Filters MediaCatalogComponent created: $component")

        val viewModel = viewModel<MediaCatalogViewModel>(
            factory = component.viewModelFactory()
        )
        Log.d("Dagger", "Filters MediaCatalogViewModel created: $viewModel")

        Text(
            text = "Filters"
        )
    }
}
