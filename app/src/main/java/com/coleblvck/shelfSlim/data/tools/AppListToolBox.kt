package com.coleblvck.shelfSlim.data.tools

import android.content.Intent
import android.content.pm.PackageManager
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.coleblvck.shelfSlim.contentManagement.App
import kotlinx.coroutines.coroutineScope


class AppListToolBox(private val packageManager: PackageManager) {

    private val _allApps: MutableState<List<App>> = mutableStateOf(
        listOf()
    )
    val allApps: State<List<App>> get() = _allApps

    private val _drawerApps: MutableLiveData<List<App>> by lazy {
        MutableLiveData<List<App>>()
    }

    val drawerApps: LiveData<List<App>> get() = _drawerApps

    fun filterApps(term: String) {
        _drawerApps.value = allApps.value.filter {
            app: App -> app.name.lowercase().contains(term.lowercase())
        }
    }

    suspend fun fetch() = coroutineScope {
        val allAppsList = packageManager.queryIntentActivities(
            Intent(
                Intent.ACTION_MAIN,
                null
            ).addCategory(Intent.CATEGORY_LAUNCHER), 0
        )
        val userAppList = ArrayList<App>()
        for (appInfo in allAppsList) {
            if (appInfo.activityInfo.packageName != "com.coleblvck.shelfSlim") {
                val app = App(
                    name = appInfo.loadLabel(packageManager).toString(),
                    packageName = appInfo.activityInfo.packageName,
                    icon = appInfo.activityInfo.loadIcon(packageManager)
                )
                userAppList.add(app)
            }
        }

        _allApps.value = userAppList.sortedBy { it.name.lowercase() }
        _drawerApps.value = allApps.value
        search(_searchText.value)
    }


    private val _searchText: MutableState<String> = mutableStateOf("")
    val searchText: State<String> get() = _searchText

    val search: (String) -> Unit = {
        _searchText.value = it
        filterApps(it)
    }

}