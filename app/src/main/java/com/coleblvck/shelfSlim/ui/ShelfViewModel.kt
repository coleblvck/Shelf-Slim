package com.coleblvck.shelfSlim.ui

import android.content.Context
import android.content.Intent
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.filter
import com.coleblvck.shelfSlim.content.App
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update

class ShelfViewModel : ViewModel() {

    private val contextLiveData = MutableLiveData<Context>()

    var apps: Flow<PagingData<App>> = flowOf(PagingData.from(emptyList()))

    var filteredAppList: Flow<PagingData<App>> = flowOf(PagingData.from(emptyList()))

    private val _uiState = MutableStateFlow(ShelfUiState())
    val uiState: StateFlow<ShelfUiState> = _uiState.asStateFlow()

    init {
        contextLiveData.observeForever { }
    }

    fun initContext(context: Context) {
        setContext(context)
        updateShelfApps()
    }

    fun setContext(context: Context) {
        contextLiveData.value = context
    }

    fun toggleFlowVisibility() {
        _uiState.update { currentState ->
            currentState.copy(
                isFlowVisible = !currentState.isFlowVisible
            )
        }
    }

    fun toggleDashboardVisibility() {
        _uiState.update {
            currentState ->
            currentState.copy(
                isDashboardVisible = !currentState.isDashboardVisible
            )
        }
    }

    fun updateShelfApps() {
        fetchApps()
        _uiState.update { currentState ->
            currentState.copy(
                apps = apps
            )
        }

    }

    fun filterApps(term: String) {
        filteredAppList = apps.map { pagingData: PagingData<App> ->
            pagingData.filter { app: App ->
                app.name.lowercase().contains(term.lowercase())
            }
        }
    }

    fun fetchApps() {
        val context = contextLiveData.value!!
        val packageManager = context.packageManager
        val allAppsList = packageManager.queryIntentActivities(
            Intent(
                Intent.ACTION_MAIN,
                null
            ).addCategory(Intent.CATEGORY_LAUNCHER), 0
        )
        val userAppList = ArrayList<App>()
        for (appInfo in allAppsList) {
            if (appInfo.activityInfo.packageName != context.packageName) {
                val bitmap: ImageBitmap = appInfo.activityInfo.loadIcon(packageManager).toBitmap().asImageBitmap()
                val app = App(
                    name = appInfo.loadLabel(packageManager).toString(),
                    packageName = appInfo.activityInfo.packageName,
                    bitmap = bitmap,
                )
                userAppList.add(app)
            }
        }

        apps = flowOf(PagingData.from(userAppList.sortedBy { it.name.lowercase() }))
        filteredAppList = apps
    }

}