package com.shabalin13.testci.mediaDetails.navigation

import android.util.Log
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.shabalin13.testci.mediaDetails.di.MediaDetailsComponentViewModel
import com.shabalin13.testci.mediaDetails.di.MediaDetailsDependencies
import com.shabalin13.testci.mediaDetails.ui.MediaDetailsScreen
import com.shabalin13.testci.mediaDetails.ui.MediaDetailsViewModel

@Suppress("UnusedParameter")
fun NavGraphBuilder.mediaDetailsNavGraph(
    navController: NavController,
    dependencies: MediaDetailsDependencies,
) {
    composable(
        MediaDetailsRoutes.MediaDetailsMain.route,
        arguments = listOf(navArgument(MediaDetailsRoutes.MEDIA_ID_KEY) { type = NavType.IntType })
    ) { backStackEntry ->
        val arguments = requireNotNull(backStackEntry.arguments)
        val mediaId = arguments.getInt(MediaDetailsRoutes.MEDIA_ID_KEY)

        val componentViewModel: MediaDetailsComponentViewModel = viewModel(
            factory = MediaDetailsComponentViewModel.Factory(dependencies)
        )

        val component = componentViewModel.component
        Log.d("Dagger", "Main MediaDetailsComponent created: $component")

        val viewModel = viewModel<MediaDetailsViewModel>(
            factory = component.viewModelFactory.create(mediaId)
        )
        Log.d("Dagger", "Main MediaDetailsViewModel created: $viewModel")

        MediaDetailsScreen(
            viewModel = viewModel
        )
    }
}
