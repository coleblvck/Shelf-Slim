package com.coleblvck.shelfSlim.state

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.coleblvck.shelfSlim.Shelf
import com.coleblvck.shelfSlim.contentManagement.listeners.Listeners
import com.coleblvck.shelfSlim.data.Warehouse
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.data.tools.CustomFunctionToolBox
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopState
import kotlinx.coroutines.launch

class ShelfViewModel(
    private val warehouse: Warehouse,
    private val shelf: Shelf
) : ViewModel() {

    private val utilityToolBox = warehouse.utilityToolBox

    val desktopState = DesktopState(utilityToolBox.packageManager)

    val customFunctionToolBox = CustomFunctionToolBox()

    @OptIn(ExperimentalFoundationApi::class)
    val pagesPagerState = ShelfPagerState(pageCount = 3, initialPage = 1)

    @OptIn(ExperimentalFoundationApi::class)
    val flowPagerState = ShelfPagerState(pageCount = 2, initialPage = 0)

    val widgetToolBox: WidgetToolBox = WidgetToolBox(warehouse.repositories.widgets, warehouse.utilityToolBox)



    val updateShelfContent: () -> Unit = {
        viewModelScope.launch {
            desktopState.appListToolBox.fetch()
        }
    }

    private val listeners: Listeners = Listeners(updateShelfContent)

    init {
        viewModelScope.launch {
            updateShelfContent()
        }
        listeners.register(shelf)
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