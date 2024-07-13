package com.coleblvck.shelfSlim.userInterface.widgets

import android.os.Build
import android.os.Bundle
import android.util.SizeF
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ScrollView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.coerceIn
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.children
import androidx.core.view.setPadding
import coil.compose.AsyncImage
import com.coleblvck.shelfSlim.contentManagement.AppIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Pencil-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Delete-bin-3-fill`
import com.coleblvck.shelfSlim.state.LocalWidgetData
import com.coleblvck.shelfSlim.userInterface.common.ActionIcon
import com.coleblvck.shelfSlim.userInterface.common.HorizontalSpacer
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import kotlin.math.roundToInt

@Composable
fun WidgetView(
    modifier: Modifier,
    appWidgetData: AppWidgetData,
    isEditPreview: Boolean = false,
) {
    val widgetData = LocalWidgetData.current
    val widgetsState = widgetData.widgetsState
    val widgetTool = widgetData.widgetTool
    val dataSize = appWidgetData.size
    /*
    // For Widgets that do not occupy all available space
    val size = remember {
        mutableStateOf(Size.Zero)
    }

     */

    if (appWidgetData.isPreview || isEditPreview) {
        ElevatedCard(
            modifier = modifier,
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground
            )
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                ElevatedCard(
                    modifier = Modifier.height(50.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(4.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        if (appWidgetData.icon != null) {
                            AppIcon(
                                modifier = Modifier.padding(0.dp),
                                model = appWidgetData.icon,
                            )
                        }
                        var fontSize by remember {
                            mutableStateOf(24.sp)
                        }
                        var readyToDraw by remember {
                            mutableStateOf(false)
                        }
                        Text(
                            text = "${appWidgetData.appName}: ${appWidgetData.widgetLabel}",
                            fontSize = fontSize,
                            textAlign = TextAlign.Left,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .weight(1f)
                                .drawWithContent {
                                    if (readyToDraw) drawContent()
                                },
                            onTextLayout = { textLayoutResult: TextLayoutResult ->
                                if (textLayoutResult.didOverflowHeight) {
                                    fontSize *= 0.9
                                } else {
                                    readyToDraw = true
                                }
                            }
                        )
                        if (isEditPreview) {
                            val editDialogVisible = remember {
                                mutableStateOf(false)
                            }
                            if (editDialogVisible.value) {
                                WidgetEditDialog(
                                    widgetData = appWidgetData,
                                    widgetsState = widgetsState,
                                    onDismiss = { editDialogVisible.value = false }
                                )
                            }
                            ActionIcon(
                                vector = RemixIcon.Design.`Pencil-fill`,
                                action = { editDialogVisible.value = true })
                            ActionIcon(
                                vector = RemixIcon.System.`Delete-bin-3-fill`,
                                action = {
                                    widgetsState.helper.removeUserWidget(
                                        appWidgetData.appWidgetId,
                                        widgetTool
                                    )
                                }
                            )
                            HorizontalSpacer()
                        }
                    }
                }
                if (appWidgetData.previewImage != null && !isEditPreview) {
                    AsyncImage(
                        model = appWidgetData.previewImage,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .height(
                                appWidgetData.providerInfo.minHeight.dp.coerceIn(
                                    60.dp,
                                    200.dp
                                )
                            ),
                        contentDescription = ""
                    )
                }
            }
        }
    } else {
        BoxWithConstraints {
            val currentWidth = maxWidth
            val currentHeight = maxHeight
            dataSize.value = listOf(currentWidth, currentHeight)
            AndroidView(
                modifier = modifier
                    .fillMaxSize()
                    .clip(
                        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                    ),
                    /*
                    // For Widgets that do not occupy all available space
                    .onGloballyPositioned { coordinates ->

                        size.value = coordinates.size.toSize()
                    }
                    .onSizeChanged { intSize ->
                        size.value = intSize.toSize()
                    },

                     */
                factory = {
                    val widgetView = widgetTool.host.createView(
                        it.applicationContext,
                        appWidgetData.appWidgetId,
                        appWidgetData.providerInfo
                    )
                    widgetView.setPadding(0)
                    widgetView
                },
                update = { view ->
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                        val sizeF = SizeF(currentWidth.value, currentHeight.value)
                        view.updateAppWidgetSize(
                            Bundle.EMPTY,
                            listOf(sizeF, sizeF)
                        )
                    } else {
                        view.updateAppWidgetSize(
                            Bundle.EMPTY,
                            currentWidth.value.roundToInt(),
                            currentHeight.value.roundToInt(),
                            currentWidth.value.roundToInt(),
                            currentHeight.value.roundToInt(),
                        )
                    }
                    /*
                    // For Widgets that do not occupy all available space
                    val child: View = view.getChildAt(0)
                    child.layoutParams = child.layoutParams.apply {
                        width = size.value.width.toInt()
                        height = size.value.height.toInt()
                    }
                    */
                    view.setPadding(0)
                },
            )
        }
    }
}


private fun enableDisableViewClick(view: View, enabled: Boolean) {
    view.isClickable = enabled
    if (view is ViewGroup) {
        for (child in view.children) {
            enableDisableViewClick(child, enabled)
        }
    }
}

private fun enableDisableNestedScroll(view: View, enabled: Boolean) {
    if (view is ViewGroup) {
        for (child in view.children) {
            enableDisableNestedScroll(child, enabled)
        }
    }
    if (view is ListView || view is ScrollView) {
        view.isNestedScrollingEnabled = enabled
    }
}

@Composable
fun Dp.dpToPx() = with(LocalDensity.current) { this@dpToPx.toPx() }


@Composable
fun Int.pxToDp() = with(LocalDensity.current) { this@pxToDp.toDp() }
