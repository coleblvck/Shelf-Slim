package com.coleblvck.shelf.ui

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.coleblvck.shelf.content.App
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ShelfViewModel() : ViewModel() {

    private val contextLiveData = MutableLiveData<Context>()

    private var _apps: MutableStateFlow<List<App>> = MutableStateFlow(emptyList())
    val apps: StateFlow<List<App>> = _apps.asStateFlow()

    var filteredAppList: List<App> by mutableStateOf(emptyList())

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
                apps = _apps.value
            )
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
                val app = App(
                    appInfo.loadLabel(packageManager).toString(),
                    appInfo.activityInfo.packageName,
                    appInfo.activityInfo.loadIcon(packageManager),
                )
                userAppList.add(app)
            }
        }

        _apps.value = userAppList
    }

}