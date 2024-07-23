package com.coleblvck.shelfSlim.userInterface.desktop.pages.widgetBox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.findActivity
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows.`Arrow-down-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows.`Arrow-up-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Delete-bin-7-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Settings-4-fill`
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.state.LocalWidgetTool
import com.coleblvck.shelfSlim.userInterface.common.DisplayIcon
import com.coleblvck.shelfSlim.userInterface.common.VerticalWidgetDragHandle
import com.coleblvck.shelfSlim.userInterface.widgets.WidgetView
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WidgetViewBox(
    appWidgetData: AppWidgetData,
    widgetToolBox: WidgetToolBox,
) {
    val widgetTool = LocalWidgetTool.current
    val context = LocalContext.current
    fun reConfigureWidget() {
        widgetTool.host.startAppWidgetConfigureActivityForResult(
            context.findActivity(),
            appWidgetData.appWidgetId,
            0,
            -1,
            null
        )
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(appWidgetData.height.dp),
    ) {
        WidgetView(
            modifier = Modifier
                .fillMaxSize(),
            appWidgetData = appWidgetData,
        )
        if (widgetToolBox.widgetsEditModeEnabled.value) {

            if (widgetToolBox.userWidgets.value.size > 1) {
                FlowColumn(
                    modifier = Modifier.align(Alignment.CenterStart),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val widgetIndex =
                        widgetToolBox.userWidgets.value.indexOf(appWidgetData)
                    if (widgetIndex != 0) {
                        ShelfIconButton(
                            clickAction = {
                                widgetToolBox.reorderUserWidgets(
                                    widgetIndex,
                                    widgetIndex - 1
                                )
                            },
                            vector = RemixIcon.Arrows.`Arrow-up-fill`,
                        )

                    }
                    if (widgetIndex != widgetToolBox.userWidgets.value.size - 1) {
                        ShelfIconButton(
                            clickAction = {
                                widgetToolBox.reorderUserWidgets(
                                    widgetIndex,
                                    widgetIndex + 1
                                )
                            },
                            vector = RemixIcon.Arrows.`Arrow-down-fill`,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier.align(Alignment.BottomCenter),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if (appWidgetData.providerInfo.configure != null) {
                    ShelfIconButton(
                        clickAction = ::reConfigureWidget,
                        vector = RemixIcon.System.`Settings-4-fill`,
                    )
                }
                VerticalWidgetDragHandle(
                    widgetToolBox = widgetToolBox,
                    appWidgetData = appWidgetData,
                )
                ShelfIconButton(
                    clickAction = {widgetToolBox.removeUserWidget(appWidgetData.appWidgetId)},
                    vector = RemixIcon.System.`Delete-bin-7-fill`
                )
            }
        }
    }
}

@Composable
fun ShelfIconButton(
    modifier: Modifier = Modifier,
    clickAction: () -> Unit =  {},
    vector: ImageVector
) {

    Surface(
        modifier = modifier
            .clickable { clickAction() },
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary
    ) {
        DisplayIcon(
            modifier = Modifier.padding(8.dp),
            vector = vector,
        )
    }
}