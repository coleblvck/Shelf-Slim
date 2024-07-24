package com.coleblvck.shelfSlim.data.entities.widget

import android.appwidget.AppWidgetProviderInfo
import android.graphics.drawable.Drawable

data class AppWidgetData(
    val appWidgetId: Int,
    var positionalIndex: Int,
    val providerInfo: AppWidgetProviderInfo,
    val appName: String,
    val widgetLabel: String,
    val icon: Drawable? = null,
    var width: Int,
    var height: Int
)