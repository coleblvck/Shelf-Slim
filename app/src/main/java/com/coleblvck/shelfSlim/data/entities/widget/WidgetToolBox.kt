package com.coleblvck.shelfSlim.data.entities.widget

import android.appwidget.AppWidgetManager
import android.content.pm.PackageManager
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.WidgetRepository
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData

class WidgetToolBox(
    private val widgetRepository: WidgetRepository,
    private val widgetManager: AppWidgetManager,
    private val packageManager: PackageManager
) {

    fun getAppWidgetData(id: Int) {
        val providerInfo = widgetManager.getAppWidgetInfo(id)
        val appWidgetData: AppWidgetData = AppWidgetData(
            appWidgetId = id,
            appName = packageManager.getApplicationInfo(
                providerInfo.provider.packageName,
                PackageManager.GET_META_DATA
            ).loadLabel(packageManager).toString(),
            providerInfo = providerInfo,
            isPreview = false,
            widgetLabel = providerInfo.loadLabel(packageManager)
        )
    }

    fun addWidget(id: Int) {
        val widget: Widget = Widget(
            id = id
        )
        widgetRepository.saveWidget(widget)
    }

    fun removeWidget(id: Int) {
        widgetRepository.deleteWidget(id)
    }
}