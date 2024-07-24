package com.coleblvck.shelfSlim.ui.common

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import com.coleblvck.shelfSlim.content.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows.`Expand-height-fill`
import com.coleblvck.shelfSlim.ui.desktop.pages.widgetBoard.ShelfIconButtonCard

@Composable
fun VerticalDragHandle(
    modifier: Modifier = Modifier,
    onDragStarted: (Offset) -> Unit = {},
    whileDragging: (Float) -> Unit,
    onDragStopped: (Float) -> Unit = {},
) {
    val draggableState = rememberDraggableState { delta ->
        whileDragging(delta)
    }

    ShelfIconButtonCard(
        modifier = modifier
            .draggable(
                orientation = Orientation.Vertical,
                state = draggableState,
                onDragStarted = {offset -> onDragStarted(offset)},
                onDragStopped = { velocity -> onDragStopped(velocity) }
            ),
        vector = RemixIcon.Arrows.`Expand-height-fill`
    )
}