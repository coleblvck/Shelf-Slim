package com.coleblvck.shelfSlim.state.stateTools.widgets

import android.content.Context
import android.content.pm.PackageManager
import androidx.compose.foundation.ScrollState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.data.UtilityToolBox
import com.coleblvck.shelfSlim.data.entities.widget.AppWidgetData
import com.coleblvck.shelfSlim.data.entities.widget.AppWidgetPreviewData
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.data.repositories.widgetRepository.LocalWidgetRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.internal.toImmutableList
import kotlin.math.roundToInt

class WidgetToolBox(private val localWidgetRepository: LocalWidgetRepository, utilityToolBox: UtilityToolBox) {


    val shelf: Context = utilityToolBox.shelf.applicationContext
    private val packageManager = utilityToolBox.packageManager
    private val widgetTool = utilityToolBox.widgetTool
    private val displayDensity = shelf.resources.displayMetrics.density
    private val imageDensity = (100f * displayDensity).roundToInt()

    private val _widgetsEditModeEnabled: MutableState<Boolean> = mutableStateOf(false)
    val widgetsEditModeEnabled: State<Boolean> get() = _widgetsEditModeEnabled

    fun updateWidgetsEditMode(value: Boolean) {
        _widgetsEditModeEnabled.value = value
    }

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
            width = appWidgetData.width,
            height = appWidgetData.height
        )
    }



    private fun updateAllAppWidgetData(widgetList: List<Widget>) {
        val allAppWidgetData: MutableList<AppWidgetData> = mutableListOf()
        for (widget: Widget in widgetList) {
            val providerInfo = widgetTool.manager.getAppWidgetInfo(widget.id)
            val appInfo = packageManager.getApplicationInfo(
                providerInfo.provider.packageName,
                0
            )
            val appWidgetData = AppWidgetData(
                appWidgetId = widget.id,
                providerInfo = providerInfo,
                appName = packageManager.getApplicationLabel(appInfo).toString(),
                widgetLabel = providerInfo.loadLabel(packageManager),
                icon = providerInfo.loadIcon(shelf, imageDensity),
                positionalIndex = widget.positionalIndex,
                width = widget.width,
                height = widget.height

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
        widgetTool.deleteWidgetId(widgetId)
        CoroutineScope(Dispatchers.IO).launch {
            localWidgetRepository.deleteWidget(id = widgetId)
        }
    }

    fun updateUserWidgetWidth(widgetData: AppWidgetData, value: Int) {
        widgetData.width = value
        saveAppWidgetData(widgetData)
    }

    fun updateUserWidgetHeight(widgetData: AppWidgetData, value: Int) {
        var height  = value
        if (height < 80) {
            height = 80
        }
        widgetData.height = height
        saveAppWidgetData(widgetData)
    }

    private val _widgetPreviews: MutableState<List<AppWidgetPreviewData>> = mutableStateOf(listOf())
    val widgetPreviews: State<List<AppWidgetPreviewData>> get() = _widgetPreviews


    val getAllWidgetPreviewData: () -> Unit =
        {
            CoroutineScope(Dispatchers.IO).launch {
                val dataList = ArrayList<AppWidgetPreviewData>()
                for (providerInfo in widgetTool.manager.installedProviders) {
                    val thisPreviewData = AppWidgetPreviewData(
                        appName = packageManager.getApplicationInfo(
                            providerInfo.provider.packageName,
                            PackageManager.GET_META_DATA
                        ).loadLabel(packageManager).toString(),
                        widgetLabel = providerInfo.loadLabel(packageManager),
                        providerInfo = providerInfo,
                        icon = providerInfo.loadIcon(shelf, imageDensity),
                        previewImage = providerInfo.loadPreviewImage(shelf, imageDensity),
                    )
                    dataList.add(thisPreviewData)
                }
                _widgetPreviews.value = dataList
            }
        }

    fun newWidgetAddition(id: Int) {
        val providerInfo = widgetTool.manager.getAppWidgetInfo(id)
        val widgetData = AppWidgetData(
            appName = packageManager.getApplicationInfo(
                providerInfo.provider.packageName,
                PackageManager.GET_META_DATA
            ).loadLabel(packageManager).toString(),
            widgetLabel = providerInfo.loadLabel(packageManager),
            providerInfo = providerInfo,
            appWidgetId = id,
            icon = providerInfo.loadIcon(shelf, imageDensity),
            positionalIndex = userWidgets.value.size,
            width = 50,
            height = 200
        )
        _userWidgets.value = userWidgets.value.toMutableList().apply { add(userWidgets.value.size, widgetData) }
        for (widgetDataItem in userWidgets.value) {
            saveAppWidgetData(widgetDataItem)
        }
    }

    init {
        val liveWidgets = localWidgetRepository.getWidgets()
        liveWidgets.observeForever {
            updateAllAppWidgetData(it)
        }
    }
}