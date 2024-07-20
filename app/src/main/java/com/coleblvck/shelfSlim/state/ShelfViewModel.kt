package com.coleblvck.shelfSlim.state

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.coleblvck.shelfSlim.Shelf
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.entities.widget.Widget
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopState
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.WidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetHost
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetManager
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState
import kotlinx.coroutines.launch

const val maximumWidgetAmount: Int = 4

class ShelfViewModel(
    private val warehouse: Warehouse,
    private val shelf: Shelf
) : ViewModel() {

    private val utilityToolBox = warehouse.utilityToolBox

    val desktopState = DesktopState(utilityToolBox.packageManager)

    val customFunctionToolBox = CustomFunctionToolBox()

    val widgetsState = WidgetsState(warehouse.repositories.widgets)

    @OptIn(ExperimentalFoundationApi::class)
    val pagesPagerState = ShelfPagerState(pageCount = 3, initialPage = 1)

    @OptIn(ExperimentalFoundationApi::class)
    val flowPagerState = ShelfPagerState(pageCount = 2, initialPage = 0)




    val updateShelfContent: () -> Unit = {
        viewModelScope.launch {
            desktopState.appListToolBox.fetch()
        }
    }


    val widgetTool = WidgetTool(
        host = shelf.widgetHost,
        manager = shelf.widgetManager
    )

    val widgets = warehouse.repositories.widgets.getWidgets()
    private val initialWidgetsObserver: Observer<List<Widget>> = Observer {
        list ->
            getInitialWidgets(list)
    }

    private fun getInitialWidgets(widgetList: List<Widget>) {
        for (widget in widgetList) {
            val providerInfo = widgetTool.manager.getAppWidgetInfo(widget.id)
            val appInfo = warehouse.utilityToolBox.packageManager.getApplicationInfo(providerInfo.provider.packageName, 0)
            val appWidgetData = AppWidgetData(
                appWidgetId = widget.id,
                providerInfo = providerInfo,
                widgetLabel = providerInfo.loadLabel(warehouse.utilityToolBox.packageManager),
                appName = warehouse.utilityToolBox.packageManager.getApplicationLabel(appInfo).toString(),
                icon = widgetTool.getWidgetIcon(shelf.applicationContext, providerInfo, 1),
                isPreview = false
            )
            widgetsState.helper.addUserWidget(appWidgetData)
        }
        widgets.removeObserver(initialWidgetsObserver)
    }

    private fun initUserWidgets() {
        widgets.observeForever(initialWidgetsObserver)
    }


    private val listeners: Listeners = Listeners(updateShelfContent)

    init {
        viewModelScope.launch {
            updateShelfContent()
        }
        listeners.register(shelf)
        initUserWidgets()
    }

    companion object {
        val Factory: (warehouse: Warehouse, shelf: Shelf) -> ViewModelProvider.Factory =
            { warehouse: Warehouse, shelf: Shelf ->
                object : ViewModelProvider.Factory {
                    @Suppress("UNCHECKED_CAST")
                    override fun <T : ViewModel> create(
                        modelClass: Class<T>,
                        extras: CreationExtras
                    ): T {
                        return ShelfViewModel(
                            warehouse = warehouse,
                            shelf = shelf
                        ) as T
                    }
                }
            }
    }
}

@OptIn(ExperimentalFoundationApi::class)
class ShelfPagerState @ExperimentalFoundationApi constructor(
    override val pageCount: Int,
    initialPage: Int
) :
    PagerState(currentPage = initialPage)