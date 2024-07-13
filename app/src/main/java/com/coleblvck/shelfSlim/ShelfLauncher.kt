package com.coleblvck.shelfSlim

import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
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
import com.coleblvck.shelfSlim.state.ShelfViewModel
import com.coleblvck.shelfSlim.userInterface.desktop.Desktop
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintDialog
import com.coleblvck.shelfSlim.userInterface.misc.CustomMappingDialog
import com.coleblvck.shelfSlim.userInterface.widgets.WidgetSelectionSheet
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(
    shelfViewModel: ShelfViewModel,
    modifier: Modifier,
) {
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        MaterialTheme.colorScheme.background
    )
    val isSystemUiVisible = shelfViewModel.desktopUiState.isSystemUiVisible
    val systemUiVisibilityToggle = shelfViewModel.desktopUiState::toggleSystemUiVisibility
    systemUiController.isSystemBarsVisible = isSystemUiVisible.value
    systemUiController.systemBarsBehavior =
        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

    val isWidgetSelectionSheetVisible = remember {
        mutableStateOf(false)
    }

    val widgetSelectionSheetState = rememberModalBottomSheetState()

    val showWidgetSelectionSheet: () -> Unit = {
        isWidgetSelectionSheetVisible.value = true
    }

    val coroutineScope = rememberCoroutineScope()

    val configuration = LocalConfiguration.current

    BackHandler {
        if (shelfViewModel.pagesPagerState.currentPage != 1) {
            coroutineScope.launch { shelfViewModel.pagesPagerState.animateScrollToPage(1) }
        } else {
            if (shelfViewModel.desktopUiState.flow.pagerState.currentPage != 0) {
                coroutineScope.launch {
                    shelfViewModel.desktopUiState.flow.pagerState.animateScrollToPage(
                        0
                    )
                }
            }
        }
    }

    Desktop(
        orientation = configuration.orientation,
        drawerState = shelfViewModel.drawerState,
        desktopUiState = shelfViewModel.desktopUiState,
        pagesPagerState = shelfViewModel.pagesPagerState,
        customFunction = shelfViewModel.customFunction,
        showWidgetSelectionSheet = showWidgetSelectionSheet
    )

    CustomMappingDialog(
        customFunction = shelfViewModel.customFunction,
        appListState = shelfViewModel.appListState
    )

    WidgetSelectionSheet(
        isWidgetSelectionSheetVisible = isWidgetSelectionSheetVisible,
        onDismiss = { isWidgetSelectionSheetVisible.value = false },
        sheetState = widgetSelectionSheetState,
    )


    HintDialog(
        hintState = shelfViewModel.desktopUiState.hint
    )
}