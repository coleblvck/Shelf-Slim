package com.coleblvck.shelfSlim.userInterface.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Health
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Pen-nib-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Pencil-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health.`Pulse-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Star-fill`

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

val iconMap: Map<String, ImageVector> = mapOf(
    "Pulse" to RemixIcon.Health.`Pulse-fill`,
    "Pen" to RemixIcon.Design.`Pen-nib-fill`,
    "Pencil" to RemixIcon.Design.`Pencil-fill`,
    "Star" to RemixIcon.System.`Star-fill`
)