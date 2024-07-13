package com.coleblvck.shelfSlim.userInterface.desktop

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.state.CustomFunction
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.Dashboard
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.DashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.flow.Flow
import com.coleblvck.shelfSlim.userInterface.desktop.pages.Pages
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.DrawerState

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Desktop(
    orientation: Int,
    drawerState: DrawerState,
    desktopUiState: DesktopUiState,
    pagesPagerState: PagerState,
    customFunction: CustomFunction,
    showWidgetSelectionSheet: () -> Unit
) {
    val flow: @Composable (modifier: Modifier) -> Unit = { modifier: Modifier ->
        Flow(
            modifier = modifier,
            flowState = desktopUiState.flow,
            hintState = desktopUiState.hint
        )
    }
    val pages: @Composable (modifier: Modifier) -> Unit = { modifier: Modifier ->
        Pages(
            modifier = modifier,
            drawerState = drawerState,
            pagerState = pagesPagerState,
            desktopUiState = desktopUiState,
            showWidgetSelectionSheet = showWidgetSelectionSheet
        )
    }
    val dashboard: @Composable () -> Unit = {
        Dashboard(
            drawerState = drawerState,
            desktopUiState = desktopUiState,
            pagesPagerState = pagesPagerState,
            customFunction = customFunction
        )
    }
    val dashboardPosition = desktopUiState.dashboard.currentPosition.value
    val dashIsHorizontal = desktopUiState.dashboard.dashIsHorizontal

    val horizontalDashDesktop: @Composable () -> Unit = {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (dashboardPosition == DashboardPosition.TOP) {
                dashboard()
            }
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                flow(Modifier.weight(1f))
                pages(Modifier.weight(2F))
            } else {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    flow(Modifier.weight(1f))
                    pages(Modifier.weight(1f))
                }
            }
            if (dashboardPosition == DashboardPosition.BOTTOM) {
                dashboard()
            }
        }
    }
    val verticalDashDesktop: @Composable () -> Unit = {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            if (dashboardPosition == DashboardPosition.LEFT) {
                dashboard()
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                    flow(Modifier.weight(1f))
                    pages(Modifier.weight(2F))
                } else {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        flow(Modifier.weight(1f))
                        pages(Modifier.weight(1f))
                    }
                }
            }
            if (dashboardPosition == DashboardPosition.RIGHT) {
                dashboard()
            }
        }
    }
    if (dashIsHorizontal()) {
        horizontalDashDesktop()
    } else {
        verticalDashDesktop()
    }
}
