package com.coleblvck.shelfSlim.ui.desktop.pages.widgetBoard

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows.`Arrow-down-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows.`Arrow-up-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Delete-bin-7-fill`
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Settings-4-fill`
import com.coleblvck.shelfSlim.data.entities.widget.AppWidgetData
import com.coleblvck.shelfSlim.state.stateTools.widgets.LocalWidgetTool
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolBox
import com.coleblvck.shelfSlim.ui.common.DisplayIcon
import com.coleblvck.shelfSlim.ui.common.VerticalDragHandle
import com.coleblvck.shelfSlim.ui.widgets.WidgetView
import com.coleblvck.shelfSlim.utils.extensions.findActivity
import kotlin.math.roundToInt

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

    val height = appWidgetData.height
    val adjustedHeight = remember { mutableIntStateOf(height) }
    fun updateWidgetHeight(velocity: Float) {
        val toSave = adjustedHeight.intValue
        widgetToolBox.updateUserWidgetHeight(
            appWidgetData,
            toSave
        )
    }

    fun adjustHeight(delta: Float) {
        if (delta > 0) {
            adjustedHeight.intValue += delta.roundToInt()
        } else {
            if (adjustedHeight.intValue > 80) {
                adjustedHeight.intValue += delta.roundToInt()
            }
        }
        if (adjustedHeight.intValue < 80) {
            adjustedHeight.intValue = 80
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(adjustedHeight.intValue.dp),
    ) {
        WidgetView(
            modifier = Modifier
                .fillMaxSize(),
            appWidgetData = appWidgetData,
        )
        if (widgetToolBox.widgetsEditModeEnabled.value) {
            Divider(
                modifier = Modifier.align(Alignment.BottomCenter),
                color = MaterialTheme.colorScheme.primary
            )

            if (widgetToolBox.userWidgets.value.size > 1) {
                Card (
                    modifier = Modifier.align(Alignment.CenterStart),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        contentColor = MaterialTheme.colorScheme.onBackground
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    FlowColumn(
                        modifier = Modifier.padding(4.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        val widgetIndex =
                            widgetToolBox.userWidgets.value.indexOf(appWidgetData)
                        if (widgetIndex != 0) {
                            ShelfIconButtonCard(
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
                            ShelfIconButtonCard(
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
            }
            Card (
                modifier =  Modifier.align(Alignment.BottomCenter),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.onBackground
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier.padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    if (appWidgetData.providerInfo.configure != null) {
                        ShelfIconButtonCard(
                            clickAction = ::reConfigureWidget,
                            vector = RemixIcon.System.`Settings-4-fill`,
                        )
                    }
                    VerticalDragHandle(
                        whileDragging = ::adjustHeight,
                        onDragStopped = ::updateWidgetHeight
                    )
                    ShelfIconButtonCard(
                        clickAction = { widgetToolBox.removeUserWidget(appWidgetData.appWidgetId) },
                        vector = RemixIcon.System.`Delete-bin-7-fill`
                    )
                }
            }
        }
    }
}

@Composable
fun ShelfIconButtonCard(
    modifier: Modifier = Modifier,
    clickAction: () -> Unit = {},
    vector: ImageVector
) {

    Surface(
        modifier = modifier
            .clickable { clickAction() },
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.onTertiary
    ) {
        DisplayIcon(
            modifier = Modifier
                .padding(4.dp)
                .size(28.dp),
            vector = vector,
        )
    }
}