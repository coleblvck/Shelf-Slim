package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.ShelfViewModel


class DrawerState(private val shelfViewModel: ShelfViewModel) {
    private val defaultDrawerTypeKey = "GRID"
    private val _drawerType: MutableState<DrawerType> =
        mutableStateOf(getDrawerType(defaultDrawerTypeKey))
    val drawerType: State<DrawerType> get() = _drawerType

    private val preferenceStore = shelfViewModel.preferenceStore

    val setDrawerType: (drawerType: String, save: Boolean) -> Unit = { drawerType, save ->
        _drawerType.value = getDrawerType(drawerType)
        if (save) {
            preferenceStore.saveString(preferenceStore.keys.drawerTypeKey, drawerType)

        }
    }


    suspend fun initPreferences() {
        setDrawerType(
            preferenceStore.getString(
                preferenceStore.keys.drawerTypeKey,
                defaultDrawerTypeKey
            ), false
        )
    }

    val search: (String) -> Unit = {
        _searchText.value = it
        shelfViewModel.appListState.filterApps(it)
    }

    private val _searchText: MutableState<String> = mutableStateOf("")
    val searchText: State<String> get() = _searchText

    val apps get() = shelfViewModel.appListState.filteredList
}
