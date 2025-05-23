package com.shabalin13.testci.mediaDetails.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
internal fun MediaDetailsScreen(
    viewModel: MediaDetailsViewModel,
) {
    val state by viewModel.state.collectAsState()

    Text(state.toString())
}
