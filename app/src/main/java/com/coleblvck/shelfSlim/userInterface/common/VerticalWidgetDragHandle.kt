package com.coleblvck.shelfSlim.userInterface.common

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows.`Expand-height-fill`
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.userInterface.desktop.pages.widgetBox.ShelfIconButton
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import kotlin.math.roundToInt

@Composable
fun VerticalWidgetDragHandle(
    modifier: Modifier = Modifier,
    widgetToolBox: WidgetToolBox,
    appWidgetData: AppWidgetData,
) {

    fun updateWidgetHeight(delta: Float) {
        widgetToolBox.updateUserWidgetHeight(
            appWidgetData,
            appWidgetData.height + delta.roundToInt()
        )
    }

    val draggableState = rememberDraggableState { delta ->
        if (delta.roundToInt() > 0) {
            updateWidgetHeight(delta)
        } else {
            if (appWidgetData.height > 80) {
                updateWidgetHeight(delta)
            }
        }
    }

    ShelfIconButton(
        modifier = modifier
            .draggable(
                orientation = Orientation.Vertical,
                state = draggableState
            ),
        vector = RemixIcon.Arrows.`Expand-height-fill`
    )

}