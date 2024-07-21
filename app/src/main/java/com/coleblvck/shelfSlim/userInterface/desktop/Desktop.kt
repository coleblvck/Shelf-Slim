package com.coleblvck.shelfSlim.userInterface.desktop

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.data.tools.CustomFunctionToolBox
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.Dashboard
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.DashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.getDashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.flow.Flow
import com.coleblvck.shelfSlim.userInterface.desktop.pages.Pages

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun Desktop(
    orientation: Int,
    isFlowVisible: State<Boolean>,
    flowVisibilityToggle: () -> Unit,
    flowPagerState: ShelfPagerState,
    flowHeaderHeading: State<String>,
    updateFlowHeaderHeading: (String) -> Unit,
    flowHeaderSubHeading: State<String>,
    updateFlowHeaderSubHeading: (String) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    flowNoteText: State<String>,
    updateFlowNoteText: (String) -> Unit,
    flowAnimateToNote: () -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
    pagesPagerState: ShelfPagerState,
    drawerApps: State<List<App>>,
    drawerType: State<String>,
    updateDrawerType: (String) -> Unit,
    drawerSearchText: State<String>,
    drawerSearchCallback: (String) -> Unit,
    dashIsHorizontal: () -> Boolean,
    currentDashboardPosition: State<String>,
    updateDashboardPosition: (String) -> Unit,
    isDashboardVisible: State<Boolean>,
    dashboardVisibilityToggle: () -> Unit,
    customFunctionAction: State<String>,
    customFunctionIcon: State<String>,
    customFunctionParameter: State<String>,
    customFunctionToolBox: CustomFunctionToolBox,
    showWidgetSelectionSheet: () -> Unit,
    systemUiVisibilityToggle: () -> Unit,
) {
    val flow: @Composable (modifier: Modifier) -> Unit = { modifier: Modifier ->
        Flow(
            modifier = modifier,
            isFlowVisible = isFlowVisible,
            flowPagerState = flowPagerState,
            flowHeaderHeading = flowHeaderHeading,
            updateFlowHeaderHeading = updateFlowHeaderHeading,
            flowHeaderSubHeading = flowHeaderSubHeading,
            updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
            flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
            updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility,
            flowNoteText = flowNoteText,
            updateFlowNoteText = updateFlowNoteText,
            updateHintVisibility = updateHintVisibility
        )
    }
    val pages: @Composable (modifier: Modifier) -> Unit = { modifier: Modifier ->
        Pages(
            modifier = modifier,
            pagesPagerState = pagesPagerState,
            drawerApps = drawerApps,
            drawerType = drawerType,
            drawerSearchText = drawerSearchText,
            drawerSearchCallback = drawerSearchCallback,
            dashboardVisibilityToggle = dashboardVisibilityToggle,
            showWidgetSelectionSheet = showWidgetSelectionSheet
        )
    }
    val dashboard: @Composable () -> Unit = {
        Dashboard(
            pagesPagerState = pagesPagerState,
            dashIsHorizontal = dashIsHorizontal,
            flowAnimateToNote = flowAnimateToNote,
            systemUiVisibilityToggle = systemUiVisibilityToggle,
            isFlowVisible = isFlowVisible,
            flowVisibilityToggle = flowVisibilityToggle,
            isDashboardVisible = isDashboardVisible,
            customFunctionAction = customFunctionAction,
            customFunctionIcon = customFunctionIcon,
            customFunctionParameter = customFunctionParameter,
            customFunctionToolBox = customFunctionToolBox,
            currentDrawerType = drawerType,
            updateDrawerType = updateDrawerType,
            currentDashboardPosition = currentDashboardPosition,
            updateDashboardPosition = updateDashboardPosition,
        )
    }
    val horizontalDashDesktop: @Composable () -> Unit = {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.TOP) {
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
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.BOTTOM) {
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
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.LEFT) {
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
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.RIGHT) {
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
