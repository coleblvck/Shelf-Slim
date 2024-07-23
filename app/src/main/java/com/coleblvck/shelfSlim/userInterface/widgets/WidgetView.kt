package com.coleblvck.shelfSlim.userInterface.widgets

import android.os.Build
import android.os.Bundle
import android.util.SizeF
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.ScrollView
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.children
import androidx.core.view.setPadding
import com.coleblvck.shelfSlim.state.LocalWidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import kotlin.math.roundToInt

@Composable
fun WidgetView(
    modifier: Modifier,
    appWidgetData: AppWidgetData,
) {
    val widgetTool = LocalWidgetTool.current

    BoxWithConstraints {
        val currentWidth = maxWidth
        val currentHeight = maxHeight
        AndroidView(
            modifier = modifier
                .fillMaxSize()
                .clip(
                    shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                ),
            factory = {
                widgetTool.host.createView(
                    it.applicationContext,
                    appWidgetData.appWidgetId,
                    appWidgetData.providerInfo
                ).apply {
                    setPadding(0)
                }
            },
            update = { view ->
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    val sizeF = SizeF(currentWidth.value, currentHeight.value)
                    view.updateAppWidgetSize(
                        Bundle(),
                        listOf(sizeF, sizeF)
                    )
                } else {
                    view.updateAppWidgetSize(
                        Bundle(),
                        currentWidth.value.roundToInt(),
                        currentHeight.value.roundToInt(),
                        currentWidth.value.roundToInt(),
                        currentHeight.value.roundToInt(),
                    )
                }
            },
        )
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
