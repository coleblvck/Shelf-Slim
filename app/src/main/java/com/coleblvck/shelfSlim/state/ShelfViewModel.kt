package com.coleblvck.shelfSlim.state

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coleblvck.shelfSlim.ShelfActivity
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopUiState
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.DrawerState
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState
import com.coleblvck.shelfSlim.utils.PackageChangeListener
import com.coleblvck.shelfSlim.utils.PackageUpdateHandler
import kotlinx.coroutines.launch

const val maximumWidgetAmount: Int = 4

class ShelfViewModel : ViewModel() {


    private val contextLiveData = MutableLiveData<Context>()

    fun setContext(context: Context) {
        contextLiveData.value = context
    }

    private val isInitialized = mutableStateOf(false)

    private val _preferenceStore: PreferenceStore = PreferenceStore()
    val preferenceStore get() = _preferenceStore

    private val _appListState = AppListState(this)
    val appListState get() = _appListState

    private val _customFunction =
        CustomFunction(preferenceStore = preferenceStore, appListState = appListState)
    val customFunction get() = _customFunction

    private val _desktopUiState = DesktopUiState(_preferenceStore, customFunction)
    val desktopUiState get() = _desktopUiState

    private val _drawerState = DrawerState(this)
    val drawerState get() = _drawerState


    private val _widgetsState = WidgetsState()
    val widgetsState get() = _widgetsState

    @OptIn(ExperimentalFoundationApi::class)
    val pagesPagerState = ShelfPagerState(pageCount = 3, initialPage = 1)

    private val packageChangeListener = PackageChangeListener(PackageUpdateHandler(this))


    fun updateShelfContent() {
        viewModelScope.launch {
            appListState.fetch()
        }
    }

    private fun initPreferences() {
        viewModelScope.launch {
            _desktopUiState.flow.preferences.initialize()
            _desktopUiState.dashboard.preferences.initialize()
            _customFunction.initialize()
            _drawerState.initPreferences()
        }
    }

    private fun initContextLiveData(activity: ShelfActivity) {
        viewModelScope.launch {
            setContext(activity)
            _appListState.setContext(activity)
        }
    }

    fun initialize(activity: ShelfActivity) {
        viewModelScope.launch {
            if (!isInitialized.value) {
                _preferenceStore.initialize(activity)
                initContextLiveData(activity)
                updateShelfContent()
                packageChangeListener.register(activity.applicationContext)
                initPreferences()
                isInitialized.value = true
            } else {
                _appListState.setContext(activity)
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