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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.state.CustomFunctionToolBox
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
    isFlowVisible: Boolean,
    flowVisibilityToggle: () -> Unit,
    flowPagerState: ShelfPagerState,
    flowHeaderHeading: String,
    updateFlowHeaderHeading: (String) -> Unit,
    flowHeaderSubHeading: String,
    updateFlowHeaderSubHeading: (String) -> Unit,
    flowHeaderEditDialogVisible: Boolean,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    flowNoteText: String,
    updateFlowNoteText: (String) -> Unit,
    flowAnimateToNote: () -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
    pagesPagerState: ShelfPagerState,
    drawerApps: LiveData<List<App>>,
    drawerType: String,
    updateDrawerType: (String) -> Unit,
    drawerSearchText: String,
    drawerSearchCallback: (String) -> Unit,
    dashIsHorizontal: Boolean,
    currentDashboardPosition: String,
    updateDashboardPosition: (String) -> Unit,
    isDashboardVisible: Boolean,
    dashboardVisibilityToggle: () -> Unit,
    customFunctionAction: String,
    customFunctionIcon: ImageVector,
    customFunctionParameter: String,
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
            if (getDashboardPosition(currentDashboardPosition) == DashboardPosition.TOP) {
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
            if (getDashboardPosition(currentDashboardPosition) == DashboardPosition.BOTTOM) {
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
            if (getDashboardPosition(currentDashboardPosition) == DashboardPosition.LEFT) {
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
            if (getDashboardPosition(currentDashboardPosition) == DashboardPosition.RIGHT) {
                dashboard()
            }
        }
    }
    if (dashIsHorizontal) {
        horizontalDashDesktop()
    } else {
        verticalDashDesktop()
    }
}
