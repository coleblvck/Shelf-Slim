package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.paging.compose.collectAsLazyPagingItems
import com.coleblvck.shelfSlim.userInterface.common.cards.SearchCard

enum class DrawerType {
    GRID, BLINDS
}

val getDrawerType: (String) -> DrawerType = {
    DrawerType.valueOf(it.uppercase())
}



@Composable
fun Drawer(
    drawerState: DrawerState
) {
    val apps = drawerState.apps.value.collectAsLazyPagingItems()
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        SearchCard(
            searchText = drawerState.searchText,
            searchCallback = drawerState.search,
        )
        when (drawerState.drawerType.value) {
            DrawerType.BLINDS -> {
                Blinds(
                    apps = apps,
                )
            }

            DrawerType.GRID -> {
                Grid(
                    apps = apps,
                )
            }
        }
    }

}