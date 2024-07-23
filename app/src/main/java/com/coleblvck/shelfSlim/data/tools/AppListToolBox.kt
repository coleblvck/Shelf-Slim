package com.coleblvck.shelfSlim.data.tools

import android.content.Intent
import android.content.pm.PackageManager
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.contentManagement.App
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


class AppListToolBox(private val packageManager: PackageManager) {

    private val _allApps: MutableState<List<App>> = mutableStateOf(
        listOf()
    )
    val allApps: State<List<App>> get() = _allApps

    private val _drawerApps: MutableState<List<App>>  = mutableStateOf(listOf())

    val drawerApps: State<List<App>> get() = _drawerApps

    private fun filterApps(term: String) {
        CoroutineScope(Dispatchers.Main).launch {
            _drawerApps.value = allApps.value.filter {
                    app: App -> app.name.lowercase().contains(term.lowercase())
            }
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
                    activityName = appInfo.activityInfo.name,
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