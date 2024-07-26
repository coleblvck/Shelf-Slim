package com.coleblvck.shelfSlim.ui.desktop

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
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.state.stateTools.customDashboardAction.CustomDashboardActionToolBox
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolBox
import com.coleblvck.shelfSlim.ui.desktop.dashboard.Dashboard
import com.coleblvck.shelfSlim.ui.desktop.dashboard.DashboardPosition
import com.coleblvck.shelfSlim.ui.desktop.dashboard.getDashboardPosition
import com.coleblvck.shelfSlim.ui.desktop.flow.Flow
import com.coleblvck.shelfSlim.ui.desktop.pages.Pages

@OptIn(ExperimentalMaterialApi::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun Desktop(
    isFlowVisible: State<Boolean>,
    flowVisibilityToggle: () -> Unit,
    flowPagerState: ShelfPagerState,
    flowHeaderHeading: State<Text>,
    updateFlowHeaderHeading: (Text) -> Unit,
    flowHeaderSubHeading: State<Text>,
    updateFlowHeaderSubHeading: (Text) -> Unit,
    flowHeaderBackground: State<Int?>,
    updateFlowHeaderBackground: (Int?) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    flowNoteText: State<Text>,
    updateFlowNoteText: (Text) -> Unit,
    flowAnimateToNote: () -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
    pagesPagerState: ShelfPagerState,
    drawerApps: State<List<App>>,
    drawerType: State<String>,
    updateDrawerType: (String) -> Unit,
    drawerSearchText: State<String>,
    drawerSearchCallback: (String) -> Unit,
    searchCardPullState: PullRefreshState,
    animatedSearchCardHeight: State<Int>,
    resetSearchCardVisibility: () -> Unit,
    dashboardIsHorizontal: State<Boolean>,
    currentDashboardPosition: State<String>,
    updateDashboardPosition: (String) -> Unit,
    isDashboardVisible: State<Boolean>,
    dashboardVisibilityToggle: () -> Unit,
    customFunctionAction: State<String>,
    customFunctionIcon: State<String>,
    customFunctionParameter: State<String>,
    customDashboardActionToolBox: CustomDashboardActionToolBox,
    showWidgetSelectionSheet: () -> Unit,
    systemUiVisibilityToggle: () -> Unit,
    widgetToolBox: WidgetToolBox,
) {
    val configuration = LocalConfiguration.current
    val orientation = configuration.orientation

    val shouldPadPagerItemHorizontally = remember {
        derivedStateOf {
            orientation == Configuration.ORIENTATION_PORTRAIT && dashboardIsHorizontal.value
        }
    }

    @Composable
    fun DesktopFlow(modifier: Modifier) {
        Flow(
            modifier = modifier,
            shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
            isFlowVisible = isFlowVisible,
            flowPagerState = flowPagerState,
            flowHeaderHeading = flowHeaderHeading,
            updateFlowHeaderHeading = updateFlowHeaderHeading,
            flowHeaderSubHeading = flowHeaderSubHeading,
            updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
            flowHeaderBackground = flowHeaderBackground,
            updateFlowHeaderBackground = updateFlowHeaderBackground,
            flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
            updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility,
            flowNoteText = flowNoteText,
            updateFlowNoteText = updateFlowNoteText,
            updateHintVisibility = updateHintVisibility
        )
    }

    @Composable
    fun DesktopPages (modifier: Modifier) {
        Pages(
            modifier = modifier,
            shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
            pagesPagerState = pagesPagerState,
            drawerApps = drawerApps,
            drawerType = drawerType,
            drawerSearchText = drawerSearchText,
            drawerSearchCallback = drawerSearchCallback,
            searchCardPullState = searchCardPullState,
            animatedSearchCardHeight = animatedSearchCardHeight,
            resetSearchCardVisibility = resetSearchCardVisibility,
            dashboardVisibilityToggle = dashboardVisibilityToggle,
            showWidgetSelectionSheet = showWidgetSelectionSheet,
            widgetToolBox = widgetToolBox
        )
    }

    @Composable
    fun DesktopDashboard() {
        Dashboard(
            pagesPagerState = pagesPagerState,
            dashboardIsHorizontal = dashboardIsHorizontal,
            flowAnimateToNote = flowAnimateToNote,
            systemUiVisibilityToggle = systemUiVisibilityToggle,
            isFlowVisible = isFlowVisible,
            flowVisibilityToggle = flowVisibilityToggle,
            isDashboardVisible = isDashboardVisible,
            customFunctionAction = customFunctionAction,
            customFunctionIcon = customFunctionIcon,
            customFunctionParameter = customFunctionParameter,
            customDashboardActionToolBox = customDashboardActionToolBox,
            currentDrawerType = drawerType,
            updateDrawerType = updateDrawerType,
            currentDashboardPosition = currentDashboardPosition,
            updateDashboardPosition = updateDashboardPosition,
        )
    }

    @Composable
    fun HorizontalDashDesktop() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.TOP) {
                DesktopDashboard()
            }
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                DesktopFlow(Modifier.weight(1f))
                DesktopPages(Modifier.weight(2F))
            } else {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    DesktopFlow(Modifier.weight(1f))
                    DesktopPages(Modifier.weight(1f))
                }
            }
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.BOTTOM) {
                DesktopDashboard()
            }
        }
    }

    @Composable
    fun VerticalDashDesktop() {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.LEFT) {
                DesktopDashboard()
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                    DesktopFlow(Modifier.weight(1f))
                    DesktopPages(Modifier.weight(2F))
                } else {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        DesktopFlow(Modifier.weight(1f))
                        DesktopPages(Modifier.weight(1f))
                    }
                }
            }
            if (getDashboardPosition(currentDashboardPosition.value) == DashboardPosition.RIGHT) {
                DesktopDashboard()
            }
        }
    }
    if (dashboardIsHorizontal.value) {
        HorizontalDashDesktop()
    } else {
        VerticalDashDesktop()
    }
}
