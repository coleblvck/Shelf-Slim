package com.coleblvck.shelfSlim.state.stateTools.widgets

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProviderInfo
import android.content.Context
import android.content.Intent


const val APP_WIDGET_HOST_ID = 23456
const val APPWIDGET_BIND_REQUEST_CODE = 12415
const val APPWIDGET_CONFIGURE_REQUEST_CODE = 56304


val Context.widgetHost: AppWidgetHost get() = AppWidgetHost(this.applicationContext, APP_WIDGET_HOST_ID)
val Context.widgetManager: AppWidgetManager get() = AppWidgetManager.getInstance(this.applicationContext)


class WidgetTool(val host: AppWidgetHost, val manager: AppWidgetManager) {

    val attemptBind: (providerInfo: AppWidgetProviderInfo) -> Pair<Boolean, Int> =
        { providerInfo: AppWidgetProviderInfo ->
            val widgetId = host.allocateAppWidgetId()
            val canBind = manager.bindAppWidgetIdIfAllowed(widgetId, providerInfo.provider)
            canBind to widgetId
        }

    fun requestBindPrivileges(
        activity: Activity,
        appWidgetId: Int,
        provider: AppWidgetProviderInfo
    ) {
        val intent = Intent(AppWidgetManager.ACTION_APPWIDGET_BIND).apply {
            putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
            putExtra(AppWidgetManager.EXTRA_APPWIDGET_PROVIDER, provider.provider)
        }
        activity.startActivityForResult(intent, APPWIDGET_BIND_REQUEST_CODE)
    }

    val canConfigure: (widgetId: Int) -> Boolean = { widgetId: Int ->
        val providerInfo = manager.getAppWidgetInfo(widgetId)
        providerInfo.configure != null
    }

    val attemptConfigure: (activity: Activity, widgetId: Int) -> Unit =
        { activity: Activity, widgetId: Int ->
            host.startAppWidgetConfigureActivityForResult(
                activity,
                widgetId,
                0,
                APPWIDGET_CONFIGURE_REQUEST_CODE,
                null
            )
        }

    val deleteWidgetId: (widgetId: Int) -> Unit =
        { widgetId: Int ->
            host.deleteAppWidgetId(widgetId)
        }
}