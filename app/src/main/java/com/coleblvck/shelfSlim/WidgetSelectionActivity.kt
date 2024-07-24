package com.coleblvck.shelfSlim

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProviderInfo
import android.content.Intent
import android.os.Bundle
import com.coleblvck.shelfSlim.state.stateTools.widgets.APPWIDGET_BIND_REQUEST_CODE
import com.coleblvck.shelfSlim.state.stateTools.widgets.APPWIDGET_CONFIGURE_REQUEST_CODE
import com.coleblvck.shelfSlim.state.stateTools.widgets.APP_WIDGET_HOST_ID
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetTool

class WidgetSelectionActivity : Activity() {
    private lateinit var widgetTool: WidgetTool
    private lateinit var providerInfo: AppWidgetProviderInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val widgetHost = AppWidgetHost(this, APP_WIDGET_HOST_ID)
        val widgetManager = AppWidgetManager.getInstance(this)
        widgetTool = WidgetTool(widgetHost, widgetManager)
        val intentProviderInfo = intent.getParcelableExtra<AppWidgetProviderInfo>(
            IntentExtraName.PROVIDER_INFO_EXTRA
        )
        if (intentProviderInfo == null) {
            finish()
            return
        } else {
            providerInfo = intentProviderInfo
        }
        val (bound, widgetId) = widgetTool.attemptBind(providerInfo)
        if (bound) {
            checkConfigureAndComplete(widgetId)
        } else {
            widgetTool.requestBindPrivileges(this, widgetId, providerInfo)
        }
    }

    private fun checkConfigureAndComplete(widgetId: Int) {
        if (widgetTool.canConfigure(widgetId)) {
            widgetTool.attemptConfigure(this, widgetId)
        } else {
            completeSuccessfulActivity(widgetId)
        }
    }

    private fun completeSuccessfulActivity(widgetId: Int) {
        val appWidgetProviderInfo = widgetTool.manager.getAppWidgetInfo(widgetId)
        val resultIntent = Intent()
        resultIntent.putExtra(IntentExtraName.WIDGET_ID_EXTRA, widgetId)
        resultIntent.putExtra(IntentExtraName.PROVIDER_INFO_EXTRA, appWidgetProviderInfo)
        setResult(RESULT_OK, resultIntent)
        finish()
        return
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && data != null) {
            if (requestCode == APPWIDGET_BIND_REQUEST_CODE) {
                val appWidgetId = data.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, -1)
                checkConfigureAndComplete(appWidgetId)
            }
            if (requestCode == APPWIDGET_CONFIGURE_REQUEST_CODE) {
                val appWidgetId = data.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, -1)
                completeSuccessfulActivity(appWidgetId)
            }
        } else {
            finish()
        }
    }
}

object IntentExtraName {
    const val WIDGET_ID_EXTRA = "WIDGET_ID_EXTRA"
    const val PROVIDER_INFO_EXTRA = "PROVIDER_INFO_EXTRA"
}