package com.coleblvck.shelfSlim.data.entities.widget

import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.data.UtilityToolBox
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.LocalWidgetRepository
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.internal.toImmutableList

class WidgetToolBox(private val localWidgetRepository: LocalWidgetRepository, private val utilityToolBox: UtilityToolBox) {


    private val _widgetPageScrollEnabled: MutableState<Boolean> = mutableStateOf(true)
    val widgetPageScrollEnabled: State<Boolean> get() = _widgetPageScrollEnabled

    fun widgetPageScrollSwitch(value: Boolean) {
        _widgetPageScrollEnabled.value = value
    }

    val widgetPageScrollState = ScrollState(0)

    private val _userWidgets: MutableState<List<AppWidgetData>> = mutableStateOf(listOf())
    val userWidgets: State<List<AppWidgetData>> get() = _userWidgets


    private fun saveAppWidgetData(appWidgetData: AppWidgetData) {
        val widget = appWidgetDataToWidget(appWidgetData)
        localWidgetRepository.saveWidget(widget)
    }

    private fun appWidgetDataToWidget(appWidgetData: AppWidgetData): Widget {
        return Widget(
            id = appWidgetData.appWidgetId,
            positionalIndex = appWidgetData.positionalIndex,
            verticalWeight = appWidgetData.verticalWeight
        )
    }




    fun addUserWidget(appWidgetData: AppWidgetData) {
        saveAppWidgetData(appWidgetData)
    }

    private fun updateAllAppWidgetData(widgetList: List<Widget>) {
        val allAppWidgetData: MutableList<AppWidgetData> = mutableListOf()
        for (widget: Widget in widgetList) {
            val providerInfo = utilityToolBox.widgetTool.manager.getAppWidgetInfo(widget.id)
            val appInfo = utilityToolBox.packageManager.getApplicationInfo(
                providerInfo.provider.packageName,
                0
            )
            val appWidgetData = AppWidgetData(
                appWidgetId = widget.id,
                providerInfo = providerInfo,
                appName = utilityToolBox.packageManager.getApplicationLabel(appInfo).toString(),
                widgetLabel = providerInfo.loadLabel(utilityToolBox.packageManager),
                icon = providerInfo.loadIcon(utilityToolBox.shelf.applicationContext, 1),
                isPreview = false,
                positionalIndex = widget.positionalIndex,
                verticalWeight = widget.verticalWeight

            )
            allAppWidgetData.add(appWidgetData)
        }
        allAppWidgetData.sortBy { it.positionalIndex }
        _userWidgets.value = allAppWidgetData
    }

    private fun updatePositionalIndex(appWidgetDataList: MutableList<AppWidgetData>) {
        appWidgetDataList.forEachIndexed { index, appWidgetData ->
            appWidgetData.positionalIndex = index
        }
    }

    fun reorderUserWidgets(oldIndex: Int, newIndex: Int) {
        val mutableWidgetList: MutableList<AppWidgetData> = userWidgets.value.toMutableList()
        val toMove = mutableWidgetList.removeAt(oldIndex)
        mutableWidgetList.add(newIndex, toMove)
        updatePositionalIndex(mutableWidgetList)
        val finalList = mutableWidgetList.toImmutableList()
        finalList.forEach { saveAppWidgetData(it) }
    }

    fun removeUserWidget(widgetId: Int) {
        val currentList = userWidgets.value.toMutableList()
        currentList.removeIf { it.appWidgetId == widgetId }
        updatePositionalIndex(currentList)
        val newList = currentList.toImmutableList()
        newList.forEach { saveAppWidgetData(it) }
        utilityToolBox.widgetTool.deleteWidgetId(widgetId)
        CoroutineScope(Dispatchers.IO).launch {
            localWidgetRepository.deleteWidget(id = widgetId)
        }
    }

    fun updateUserWidgetWeight(widgetData: AppWidgetData, value: Float) {
        widgetData.verticalWeight = 1/value
        saveAppWidgetData(widgetData)
    }

    init {
        val liveWidgets = localWidgetRepository.getWidgets()
        liveWidgets.observeForever {
            updateAllAppWidgetData(it)
        }
    }
}