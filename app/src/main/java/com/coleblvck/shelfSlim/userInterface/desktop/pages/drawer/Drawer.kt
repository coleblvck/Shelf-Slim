package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.unit.dp
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
    drawerApps: State<List<App>>,
    drawerType: State<String>,
    drawerSearchText: State<String>,
    drawerSearchCallback: (String) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        SearchCard(
            searchText = drawerSearchText,
            searchCallback = drawerSearchCallback,
        )
        when (getDrawerType(drawerType.value)) {
            DrawerType.BLINDS -> {
                Blinds(
                    drawerApps = drawerApps,
                )
            }

            DrawerType.GRID -> {
                Grid(
                    drawerApps = drawerApps,
                )
            }
        }
    }

}