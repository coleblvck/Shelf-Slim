package com.coleblvck.shelfSlim.ui.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ActionIcon(
    modifier: Modifier = Modifier,
    vector: ImageVector,
    description: String = "Icon",
    action: () -> Unit,
    longPressAction: () -> Unit = {},
) {
    Icon(
        vector,
        contentDescription = description,
        modifier = modifier.size(30.dp).combinedClickable (
            onClick = action,
            onLongClick = longPressAction
        )
    )
}


@Composable
fun DisplayIcon(
    modifier: Modifier = Modifier,
    vector: ImageVector,
    description: String = "Decorative Icon"
) {
    Icon(
        vector,
        contentDescription = description,
        modifier = modifier.size(30.dp)
    )
}