package com.shabalin13.testci.mediaDetails.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.shabalin13.testci.mediaDetails.di.MediaDetailsDependencies

object MediaDetailsEntry {
    fun getNavGraph(
        navController: NavController,
        dependencies: MediaDetailsDependencies,
    ): NavGraphBuilder.() -> Unit {
        return {
            mediaDetailsNavGraph(navController, dependencies)
        }
    }
}
