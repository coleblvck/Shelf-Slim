package com.coleblvck.shelfSlim

import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.data.tools.CustomFunctionToolBox
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferences
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferencesToolBox
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.desktop.Desktop
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopState
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintDialog
import com.coleblvck.shelfSlim.userInterface.misc.CustomMappingDialog
import com.coleblvck.shelfSlim.userInterface.widgets.WidgetSelectionSheet
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(
    modifier: Modifier,
    desktopState: DesktopState,
    flowPagerState: ShelfPagerState,
    pagesPagerState: ShelfPagerState,
    userPreferences: UserPreferences,
    userPreferencesToolBox: UserPreferencesToolBox,
    customFunctionToolBox: CustomFunctionToolBox,
    widgetToolBox: WidgetToolBox
) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        MaterialTheme.colorScheme.background
    )
    systemUiController.isSystemBarsVisible = desktopState.isSystemUiVisible.value
    systemUiController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

    val widgetSelectionSheetState = rememberModalBottomSheetState()

    val coroutineScope = rememberCoroutineScope()


    BackHandler {
        if (pagesPagerState.currentPage != 1) {
            coroutineScope.launch { pagesPagerState.animateScrollToPage(1) }
        } else {
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
        dashboardIsHorizontal = userPreferences.dashboardIsHorizontal,
        currentDashboardPosition = userPreferences.dashboardPosition,
        updateDashboardPosition = userPreferencesToolBox::updateDashboardPosition,
        isDashboardVisible = userPreferences.dashboardIsVisible,
        dashboardVisibilityToggle = userPreferencesToolBox::toggleDashboardVisibility,
        customFunctionAction = userPreferences.customFunctionAction,
        customFunctionIcon = userPreferences.customFunctionIcon,
        customFunctionParameter = userPreferences.customFunctionPackage,
        customFunctionToolBox = customFunctionToolBox,
        showWidgetSelectionSheet = desktopState.showWidgetSelectionSheet,
        systemUiVisibilityToggle = desktopState.toggleSystemUiVisibility,
        widgetToolBox = widgetToolBox
    )

    CustomMappingDialog(
        currentCustomFunctionIcon = userPreferences.customFunctionIcon,
        updateCustomFunctionIcon = userPreferencesToolBox::updateCustomFunctionIcon,
        currentCustomFunctionAction = userPreferences.customFunctionAction,
        updateCustomFunctionAction = userPreferencesToolBox::updateCustomFunctionAction,
        currentCustomFunctionParameter = userPreferences.customFunctionPackage,
        updateCustomFunctionParameter = userPreferencesToolBox::updateCustomFunctionPackage,
        isCustomMappingDialogVisible = customFunctionToolBox.mappingDialogVisible,
        updateCustomMappingDialogVisibility = customFunctionToolBox.setMappingDialogVisibility,
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