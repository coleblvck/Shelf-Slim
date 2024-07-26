package com.coleblvck.shelfSlim

import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProviderInfo
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.data.observeOnce
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.LocalWidgetRepository
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.WidgetRepository
import com.coleblvck.shelfSlim.data.roomDatabase.DatabaseAgent
import com.coleblvck.shelfSlim.data.roomDatabase.LocalRoomDatabase
import com.coleblvck.shelfSlim.state.stateTools.widgets.APPWIDGET_BIND_REQUEST_CODE
import com.coleblvck.shelfSlim.state.stateTools.widgets.APPWIDGET_CONFIGURE_REQUEST_CODE
import com.coleblvck.shelfSlim.state.stateTools.widgets.APP_WIDGET_HOST_ID
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetTool
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WidgetSelectionActivity : Activity() {
    private lateinit var widgetTool: WidgetTool
    private lateinit var providerInfo: AppWidgetProviderInfo
    private lateinit var localRoomDatabase: LocalRoomDatabase
    private lateinit var widgetRepository: WidgetRepository
    private lateinit var userWidgets: LiveData<List<Widget>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val widgetHost = AppWidgetHost(this, APP_WIDGET_HOST_ID)
        val widgetManager = AppWidgetManager.getInstance(this)
        widgetTool = WidgetTool(widgetHost, widgetManager)
        localRoomDatabase = DatabaseAgent.getLocalInstance(this.applicationContext)
        widgetRepository = LocalWidgetRepository(localRoomDatabase)
        userWidgets = widgetRepository.getWidgets()
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


    val observeOnceAndComplete: (Int) -> Observer<List<Widget>> = { widgetId ->
        Observer { widgets: List<Widget> ->
            val widget = Widget(
                id = widgetId,
                positionalIndex = widgets.size,
                width = 50,
                height = 200
            )
            widgetRepository.saveWidget(widget)
        }
    }

    private fun completeSuccessfulActivity(widgetId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            userWidgets.observeOnce(observeOnceAndComplete(widgetId))
        }
        setResult(RESULT_OK)
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
            if (resultCode == RESULT_CANCELED && data != null) {
                val appWidgetId = data.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, -1)
                widgetTool.deleteWidgetId(appWidgetId)
            }
            finish()
        }
    }
}

object IntentExtraName {
    const val WIDGET_ID_EXTRA = "WIDGET_ID_EXTRA"
    const val PROVIDER_INFO_EXTRA = "PROVIDER_INFO_EXTRA"
}