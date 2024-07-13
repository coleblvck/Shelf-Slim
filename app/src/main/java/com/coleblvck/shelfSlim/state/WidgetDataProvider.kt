package com.coleblvck.shelfSlim.state

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.repeatOnLifecycle
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.WidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetHost
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetManager
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState
import kotlinx.coroutines.awaitCancellation

val LocalWidgetData =
    staticCompositionLocalOf<WidgetData> { throw IllegalStateException("WidgetData has not been provided.") }

@Composable
fun WidgetDataProvider(
    widgetsState: WidgetsState,
    content: @Composable () -> Unit
) {
    val lifecycleOwner = LocalLifecycleOwner.current
    val context = LocalContext.current
    val widgetHost = context.applicationContext.widgetHost
    val widgetManager = context.applicationContext.widgetManager
    LaunchedEffect(Unit) {
        lifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
            widgetHost.startListening()
            try {
                awaitCancellation()
            } finally {
                try {
                    widgetHost.stopListening()
                } catch (e: Exception) {
                    Log.d("", e.toString())
                }
            }
        }
    }

    val widgetTool = WidgetTool(
        host = widgetHost,
        manager = widgetManager,
    )

    val widgetData = WidgetData(
        widgetsState = widgetsState,
        widgetTool = widgetTool,
    )

    CompositionLocalProvider(LocalWidgetData provides widgetData) {
        content()
    }
}