package com.shabalin13.testci.mediaCatalog.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
internal fun MediaCatalogScreen(
    viewModel: MediaCatalogViewModel,
    onFiltersButtonClick: () -> Unit,
    onMediaCatalogItemClick: (mediaId: Int) -> Unit,
) {
    val state by viewModel.state.collectAsState()

    Column {
        TextButton(onClick = onFiltersButtonClick) {
            Text("Go to filters")
        }
        for (mediaCatalogItem in state) {
            Text(
                mediaCatalogItem.value,
                modifier = Modifier.clickable {
                    onMediaCatalogItemClick(mediaCatalogItem.id)
                }
            )
        }
    }
}
