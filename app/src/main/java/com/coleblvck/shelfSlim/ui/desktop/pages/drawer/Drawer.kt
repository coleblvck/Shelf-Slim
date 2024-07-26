package com.coleblvck.shelfSlim.ui.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.ui.common.SearchCard

enum class DrawerType {
    GRID, BLINDS
}

val getDrawerType: (String) -> DrawerType = {
    DrawerType.valueOf(it.uppercase())
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Drawer(
    shouldPadPagerItemHorizontally: State<Boolean>,
    drawerApps: State<List<App>>,
    drawerType: State<String>,
    drawerSearchText: State<String>,
    drawerSearchCallback: (String) -> Unit,
    searchCardPullState: PullRefreshState,
    animatedSearchCardHeight: State<Int>,
    resetSearchCardVisibility: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (animatedSearchCardHeight.value != 0) {
            SearchCard(
                modifier = Modifier
                    .height(animatedSearchCardHeight.value.dp)
                    .padding(
                        horizontal = if (shouldPadPagerItemHorizontally.value) {
                            12.dp
                        } else {
                            0.dp
                        }
                    ),
                searchText = drawerSearchText,
                searchCallback = drawerSearchCallback,
                resetVisibility = resetSearchCardVisibility
            )
        }
        when (getDrawerType(drawerType.value)) {
            DrawerType.BLINDS -> {
                Blinds(
                    shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                    drawerApps = drawerApps,
                    pullRefreshState = searchCardPullState
                )
            }

            DrawerType.GRID -> {
                Grid(
                    shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                    drawerApps = drawerApps,
                    pullRefreshState = searchCardPullState
                )
            }
        }
    }
}