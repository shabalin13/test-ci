package com.shabalin13.testci.navigation

sealed class AppRoutes(val route: String) {
    data object AppGraph : AppRoutes(BASE_ROUTE)
    companion object {
        const val BASE_ROUTE = "kinopoisk"
    }
}
