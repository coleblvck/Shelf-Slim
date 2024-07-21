package com.coleblvck.shelfSlim.userInterface.widgets.management

import android.appwidget.AppWidgetProviderInfo
import android.graphics.drawable.Drawable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf


class UserWidgetsState {
    private val _widgets: MutableState<List<AppWidgetData>> = mutableStateOf(emptyList())
    val widgets: State<List<AppWidgetData>> get() = _widgets

    val setWidgets: (List<AppWidgetData>) -> Unit = {
        _widgets.value = it
    }
}

data class AppWidgetData(
    val appWidgetId: Int,
    var positionalIndex: Int,
    val providerInfo: AppWidgetProviderInfo,
    val appName: String,
    val widgetLabel: String,
    val icon: Drawable? = null,
    val previewImage: Drawable? = null,
    val isPreview: Boolean,
    var verticalWeight: Float
)