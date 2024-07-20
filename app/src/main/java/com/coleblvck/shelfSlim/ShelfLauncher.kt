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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferences
import com.coleblvck.shelfSlim.data.userPreferences.UserPreferencesToolBox
import com.coleblvck.shelfSlim.state.CustomFunctionToolBox
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.state.getIconValue
import com.coleblvck.shelfSlim.userInterface.desktop.Desktop
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopState
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.DashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.getDashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintDialog
import com.coleblvck.shelfSlim.userInterface.desktop.hint.hintContent
import com.coleblvck.shelfSlim.userInterface.misc.CustomMappingDialog
import com.coleblvck.shelfSlim.userInterface.widgets.WidgetSelectionSheet
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(
    desktopState: DesktopState,
    flowPagerState: ShelfPagerState,
    pagesPagerState: ShelfPagerState,
    userPreferences: UserPreferences,
    userPreferencesToolBox: UserPreferencesToolBox,
    customFunctionToolBox: CustomFunctionToolBox,
    modifier: Modifier,
) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        MaterialTheme.colorScheme.background
    )
    systemUiController.isSystemBarsVisible = desktopState.isSystemUiVisible.value
    systemUiController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

    val configuration = LocalConfiguration.current

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

    val dashIsHorizontal = {
        val dashPosition = getDashboardPosition(userPreferences.dashboardPosition.value)
        dashPosition == DashboardPosition.BOTTOM || dashPosition == DashboardPosition.TOP
    }

    val flowHeaderEditDialogVisible = remember {
        mutableStateOf(false)
    }

    Desktop(
        orientation = configuration.orientation,
        isFlowVisible = userPreferences.flowVisible.value,
        flowVisibilityToggle = { coroutineScope.launch { userPreferencesToolBox.toggleFlowVisibility() } },
        flowPagerState = flowPagerState,
        flowHeaderHeading = userPreferences.headerHeading.value,
        updateFlowHeaderHeading = userPreferencesToolBox::updateHeaderHeading,
        flowHeaderSubHeading = userPreferences.headerSubHeading.value,
        updateFlowHeaderSubHeading = userPreferencesToolBox::updateHeaderSubHeading,
        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible.value,
        updateFlowHeaderEditDialogVisibility = { flowHeaderEditDialogVisible.value = it },
        flowNoteText = userPreferences.flowNote.value,
        updateFlowNoteText = userPreferencesToolBox::updateFlowNote,
        flowAnimateToNote = {},
        updateHintVisibility = desktopState.updateHintVisibility,
        pagesPagerState = pagesPagerState,
        drawerApps = desktopState.appListToolBox.drawerApps,
        drawerType = userPreferences.drawerType.value,
        updateDrawerType = userPreferencesToolBox::updateDrawerType,
        drawerSearchText = desktopState.appListToolBox.searchText.value,
        drawerSearchCallback = desktopState.appListToolBox.search,
        dashIsHorizontal = dashIsHorizontal(),
        currentDashboardPosition = userPreferences.dashboardPosition.value,
        updateDashboardPosition = userPreferencesToolBox::updateDashboardPosition,
        isDashboardVisible = userPreferences.dashboardVisible.value,
        dashboardVisibilityToggle = userPreferencesToolBox::toggleDashboardVisibility,
        customFunctionAction = userPreferences.customFunctionAction.value,
        customFunctionIcon = getIconValue(userPreferences.customFunctionIcon.value),
        customFunctionParameter = userPreferences.customFunctionPackage.value,
        customFunctionToolBox = customFunctionToolBox,
        showWidgetSelectionSheet = desktopState.showWidgetSelectionSheet,
        systemUiVisibilityToggle = desktopState.toggleSystemUiVisibility,
    )

    CustomMappingDialog(
        currentCustomFunctionIcon = getIconValue(userPreferences.customFunctionIcon.value),
        updateCustomFunctionIcon = userPreferencesToolBox::updateCustomFunctionIcon,
        currentCustomFunctionAction = userPreferences.customFunctionAction.value,
        updateCustomFunctionAction = userPreferencesToolBox::updateCustomFunctionAction,
        currentCustomFunctionParameter = userPreferences.customFunctionPackage.value,
        updateCustomFunctionParameter = userPreferencesToolBox::updateCustomFunctionPackage,
        isCustomMappingDialogVisible = customFunctionToolBox.mappingDialogVisible.value,
        updateCustomMappingDialogVisibility = customFunctionToolBox.setMappingDialogVisibility,
        allApps = desktopState.appListToolBox.allApps.value
    )

    WidgetSelectionSheet(
        isWidgetSelectionSheetVisible = desktopState.isWidgetSelectionSheetVisible,
        onDismiss = { desktopState.isWidgetSelectionSheetVisible.value = false },
        sheetState = widgetSelectionSheetState,
    )


    HintDialog(
        isHintVisible = desktopState.isHintVisible.value,
        updateHintVisibility = desktopState.updateHintVisibility,
        hintContent = hintContent(
            userPreferences.dashboardPosition.value,
            dashIsHorizontal(),
            getIconValue(userPreferences.customFunctionIcon.value)
        )
    )
}