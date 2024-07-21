package com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProviderInfo
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import androidx.compose.ui.unit.Density
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import kotlin.math.roundToInt


const val APP_WIDGET_HOST_ID = 23456
const val APPWIDGET_BIND_REQUEST_CODE = 12415
const val APPWIDGET_CONFIGURE_REQUEST_CODE = 56304


val Context.widgetHost: AppWidgetHost get() = AppWidgetHost(this.applicationContext, APP_WIDGET_HOST_ID)
val Context.widgetManager: AppWidgetManager get() = AppWidgetManager.getInstance(this.applicationContext)


class WidgetTool(val host: AppWidgetHost, val manager: AppWidgetManager) {

    val providerInfos: () -> List<AppWidgetProviderInfo> =
        {
            manager.installedProviders
        }

    val getAllPreviewData: (applicationContext: Context, density: Density) -> List<AppWidgetData> =
        { applicationContext: Context, density: Density ->
            val dataList = ArrayList<AppWidgetData>()
            val imageDensity = (100f * density.density).roundToInt()
            val packageManager = applicationContext.packageManager
            for (providerInfo in providerInfos()) {
                val thisPreviewData = AppWidgetData(
                    appName = packageManager.getApplicationInfo(
                        providerInfo.provider.packageName,
                        PackageManager.GET_META_DATA
                    ).loadLabel(packageManager).toString(),
                    widgetLabel = providerInfo.loadLabel(packageManager),
                    providerInfo = providerInfo,
                    appWidgetId = -1,
                    icon = getWidgetIcon(applicationContext, providerInfo, imageDensity),
                    previewImage = getWidgetPreviewDrawable(
                        applicationContext,
                        providerInfo,
                        imageDensity
                    ),
                    isPreview = true,
                    positionalIndex = -1,
                    verticalWeight = 0f
                )
                dataList.add(thisPreviewData)
            }
            dataList
        }

    val getWidgetIcon: (applicationContext: Context, providerInfo: AppWidgetProviderInfo, density: Int) -> Drawable? =
        { applicationContext: Context, providerInfo: AppWidgetProviderInfo, density: Int ->
            val icon: Drawable? = providerInfo.loadIcon(applicationContext, density)
            icon
        }

    val getWidgetPreviewDrawable: (applicationContext: Context, providerInfo: AppWidgetProviderInfo, density: Int) -> Drawable? =
        { applicationContext: Context, providerInfo: AppWidgetProviderInfo, density: Int ->
            val previewDrawable: Drawable? =
                providerInfo.loadPreviewImage(applicationContext, density)
            previewDrawable
        }

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