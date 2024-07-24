package com.coleblvck.shelfSlim.state.stateTools.widgets

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.awaitCancellation

val LocalWidgetTool =
    staticCompositionLocalOf<WidgetTool> { throw IllegalStateException("WidgetTool has not been provided.") }

@Composable
fun WidgetToolProvider(
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

    CompositionLocalProvider(LocalWidgetTool provides widgetTool) {
        content()
    }
}