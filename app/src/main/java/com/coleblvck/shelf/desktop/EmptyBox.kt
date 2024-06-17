package com.coleblvck.shelf.desktop

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun EmptyBox() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
            .combinedClickable(onDoubleClick = { topBoxVisible = !topBoxVisible }) { },
        colors = CardDefaults.cardColors(
            Color.Transparent,
            MaterialTheme.colorScheme.onTertiary,
            MaterialTheme.colorScheme.tertiary,
            MaterialTheme.colorScheme.onTertiary
        )
    ) {

    }
}