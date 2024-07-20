package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.userInterface.common.cards.SearchCard

enum class DrawerType {
    GRID, BLINDS
}

val getDrawerType: (String) -> DrawerType = {
    DrawerType.valueOf(it.uppercase())
}



@Composable
fun Drawer(
    drawerApps: LiveData<List<App>>,
    drawerType: String,
    drawerSearchText: String,
    drawerSearchCallback: (String) -> Unit
) {

    val apps: MutableState<List<App>> = remember {
        mutableStateOf(listOf())
    }
    val lifecycleOwner = LocalLifecycleOwner.current
    val appsObserver = Observer {
        appsObserved: List<App> ->
        apps.value = appsObserved
    }

    LaunchedEffect (Unit) {
        drawerApps.observe(lifecycleOwner, appsObserver)
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        SearchCard(
            searchText = drawerSearchText,
            searchCallback = drawerSearchCallback,
        )
        when (getDrawerType(drawerType)) {
            DrawerType.BLINDS -> {
                Blinds(
                    apps = apps.value,
                )
            }

            DrawerType.GRID -> {
                Grid(
                    apps = apps.value,
                )
            }
        }
    }

}