package com.coleblvck.shelfSlim.state

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagingData
import com.coleblvck.shelfSlim.contentManagement.App
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf


class AppListState(private val shelfViewModel: ShelfViewModel) {

    private val contextLiveData = MutableLiveData<Context>()

    fun setContext(context: Context) {
        contextLiveData.value = context
    }

    var unfilteredList: List<App> = emptyList()
    var filteredList: MutableState<Flow<PagingData<App>>> = mutableStateOf(flowOf(PagingData.from(emptyList())))

    fun filterApps(term: String) {
        filteredList.value = flowOf(
            PagingData.from(
                unfilteredList.filter {
                        app: App ->
                    app.name.lowercase().contains(term.lowercase())
                }
            )
        )
    }

    suspend fun fetch() = coroutineScope {
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
                    name = appInfo.loadLabel(packageManager).toString(),
                    packageName = appInfo.activityInfo.packageName,
                    icon = appInfo.activityInfo.loadIcon(packageManager)
                )
                userAppList.add(app)
            }
        }

        unfilteredList = userAppList.sortedBy { it.name.lowercase() }
        filteredList.value = flowOf(
            PagingData.from(
                userAppList.sortedBy { it.name.lowercase() }
            )
        )
        shelfViewModel.drawerState.search(shelfViewModel.drawerState.searchText.value)
    }
}