package com.coleblvck.shelfSlim.data.entities.widget

import android.appwidget.AppWidgetProviderInfo
import android.graphics.drawable.Drawable


data class AppWidgetPreviewData(
    val providerInfo: AppWidgetProviderInfo,
    val appName: String,
    val widgetLabel: String,
    val icon: Drawable?,
    val previewImage: Drawable?,
)