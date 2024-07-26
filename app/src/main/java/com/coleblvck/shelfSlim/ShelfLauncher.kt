package com.coleblvck.shelfSlim

import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferencesToolBox
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.state.stateTools.customDashboardAction.CustomDashboardActionToolBox
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolBox
import com.coleblvck.shelfSlim.ui.dashboardAction.CustomDashboardActionDialog
import com.coleblvck.shelfSlim.ui.desktop.Desktop
import com.coleblvck.shelfSlim.ui.desktop.DesktopState
import com.coleblvck.shelfSlim.ui.desktop.hint.HintDialog
import com.coleblvck.shelfSlim.ui.widgets.WidgetSelectionSheet
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.launch
import kotlin.math.roundToInt


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(
    modifier: Modifier,
    desktopState: DesktopState,
    flowPagerState: ShelfPagerState,
    pagesPagerState: ShelfPagerState,
    userPreferencesToolBox: UserPreferencesToolBox,
    customDashboardActionToolBox: CustomDashboardActionToolBox,
    widgetToolBox: WidgetToolBox
) {

    val userPreferences = userPreferencesToolBox.userPreferences

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        MaterialTheme.colorScheme.background
    )
    systemUiController.isSystemBarsVisible = desktopState.isSystemUiVisible.value
    systemUiController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

    val widgetSelectionSheetState = rememberModalBottomSheetState()

    val coroutineScope = rememberCoroutineScope()

    val fullSearchCardHeight = 48
    val searchCardIsFullyVisible = remember {
        mutableStateOf(false)
    }
    val resetSearchCardVisibility: () -> Unit = {
        searchCardIsFullyVisible.value = false
    }
    val searchCardPullState = rememberPullRefreshState(
        refreshing = searchCardIsFullyVisible.value,
        refreshThreshold = 150.dp,
        onRefresh = {
            coroutineScope.launch {
                searchCardIsFullyVisible.value = true
            }
        }
    )
    val animatedSearchCardHeight = animateIntAsState(
        targetValue = when {
            searchCardIsFullyVisible.value -> fullSearchCardHeight
            searchCardPullState.progress in 0f..1f -> (fullSearchCardHeight * searchCardPullState.progress).roundToInt()
            searchCardPullState.progress > 1f -> (fullSearchCardHeight + ((searchCardPullState.progress - 1f) * .1f) * 100).roundToInt()
            else -> 0
        },
        label = "columnOffset"
    )

    BackHandler {
        if (pagesPagerState.currentPage != 1) {
            if (pagesPagerState.currentPage == 0 && searchCardIsFullyVisible.value) {
                resetSearchCardVisibility()
            } else {
                if (searchCardIsFullyVisible.value) {
                    resetSearchCardVisibility()
                }
                coroutineScope.launch { pagesPagerState.animateScrollToPage(1) }
            }
        } else {
            if (searchCardIsFullyVisible.value) {
                resetSearchCardVisibility()
            }
            if (flowPagerState.currentPage != 0) {
                coroutineScope.launch {
                    flowPagerState.animateScrollToPage(
                        0
                    )
                }
            }
        }
    }

    val animateToFlowNote: () -> Unit = {
        if (!userPreferences.flowIsVisible.value) {
            userPreferencesToolBox.updateFlowVisibility(true)
        }
        if (flowPagerState.currentPage != 1) {
            coroutineScope.launch {
                flowPagerState.animateScrollToPage(1)
            }
        }
    }

    val flowHeaderEditDialogVisible = remember {
        mutableStateOf(false)
    }

    Desktop(
        isFlowVisible = userPreferences.flowIsVisible,
        flowVisibilityToggle = { coroutineScope.launch { userPreferencesToolBox.toggleFlowVisibility() } },
        flowPagerState = flowPagerState,
        flowHeaderHeading = userPreferences.headerHeading,
        updateFlowHeaderHeading = userPreferencesToolBox::updateHeaderHeading,
        flowHeaderSubHeading = userPreferences.headerSubHeading,
        updateFlowHeaderSubHeading = userPreferencesToolBox::updateHeaderSubHeading,
        flowHeaderBackground = userPreferences.headerBackground,
        updateFlowHeaderBackground = userPreferencesToolBox::updateHeaderBackground,
        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
        updateFlowHeaderEditDialogVisibility = { flowHeaderEditDialogVisible.value = it },
        flowNoteText = userPreferences.flowNote,
        updateFlowNoteText = userPreferencesToolBox::updateFlowNote,
        flowAnimateToNote = animateToFlowNote,
        updateHintVisibility = desktopState.updateHintVisibility,
        pagesPagerState = pagesPagerState,
        drawerApps = desktopState.appListToolBox.drawerApps,
        drawerType = userPreferences.drawerType,
        updateDrawerType = userPreferencesToolBox::updateDrawerType,
        drawerSearchText = desktopState.appListToolBox.searchText,
        drawerSearchCallback = desktopState.appListToolBox.search,
        searchCardPullState = searchCardPullState,
        animatedSearchCardHeight = animatedSearchCardHeight,
        resetSearchCardVisibility = resetSearchCardVisibility,
        dashboardIsHorizontal = userPreferences.dashboardIsHorizontal,
        currentDashboardPosition = userPreferences.dashboardPosition,
        updateDashboardPosition = userPreferencesToolBox::updateDashboardPosition,
        isDashboardVisible = userPreferences.dashboardIsVisible,
        dashboardVisibilityToggle = userPreferencesToolBox::toggleDashboardVisibility,
        customFunctionAction = userPreferences.customFunctionAction,
        customFunctionIcon = userPreferences.customFunctionIcon,
        customFunctionParameter = userPreferences.customFunctionPackage,
        customDashboardActionToolBox = customDashboardActionToolBox,
        showWidgetSelectionSheet = desktopState.showWidgetSelectionSheet,
        systemUiVisibilityToggle = desktopState.toggleSystemUiVisibility,
        widgetToolBox = widgetToolBox
    )

    CustomDashboardActionDialog(
        currentCustomFunctionIcon = userPreferences.customFunctionIcon,
        updateCustomFunctionIcon = userPreferencesToolBox::updateCustomFunctionIcon,
        currentCustomFunctionAction = userPreferences.customFunctionAction,
        updateCustomFunctionAction = userPreferencesToolBox::updateCustomFunctionAction,
        currentCustomFunctionParameter = userPreferences.customFunctionPackage,
        updateCustomFunctionParameter = userPreferencesToolBox::updateCustomFunctionPackage,
        isCustomMappingDialogVisible = customDashboardActionToolBox.mappingDialogVisible,
        updateCustomMappingDialogVisibility = customDashboardActionToolBox.setMappingDialogVisibility,
        allApps = desktopState.appListToolBox.allApps
    )

    WidgetSelectionSheet(
        widgetToolBox = widgetToolBox,
        isWidgetSelectionSheetVisible = desktopState.isWidgetSelectionSheetVisible,
        onDismiss = { desktopState.isWidgetSelectionSheetVisible.value = false },
        sheetState = widgetSelectionSheetState,
    )


    HintDialog(
        isHintVisible = desktopState.isHintVisible.value,
        updateHintVisibility = desktopState.updateHintVisibility,
        dashboardIsHorizontal = userPreferences.dashboardIsHorizontal,
        dashboardPosition = userPreferences.dashboardPosition,
        currentCustomFunctionIcon = userPreferences.customFunctionIcon
    )
}