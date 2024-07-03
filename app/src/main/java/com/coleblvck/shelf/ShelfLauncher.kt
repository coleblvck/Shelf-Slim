package com.coleblvck.shelf

import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.coleblvck.shelf.content.App
import com.coleblvck.shelf.ui.ShelfViewModel
import com.coleblvck.shelf.ui.desktop.Desktop


@OptIn(ExperimentalFoundationApi::class)
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(shelfViewModel: ShelfViewModel, modifier: Modifier) {

    var hideSystemUI = remember {
        mutableStateOf(true)
    }
    val context = LocalContext.current
    val window = (context as Activity).window
    val insetsController = WindowCompat.getInsetsController(window, window.decorView)
    insetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    if (hideSystemUI.value) {
        insetsController.hide(WindowInsetsCompat.Type.systemBars())
    } else {
        insetsController.show(WindowInsetsCompat.Type.systemBars())
    }

    val shelfUiState = shelfViewModel.uiState.collectAsState().value
    val searchText = remember {
        mutableStateOf("")
    }
    val apps: LazyPagingItems<App> =
        shelfViewModel.filteredAppList.collectAsLazyPagingItems()
    val pagesPagerState = rememberPagerState(
        initialPage = 1,
    ) { 2 }
    val isFLowVisible = shelfUiState.isFlowVisible
    val flowVisibilityToggle = shelfViewModel::toggleFlowVisibility
    val isDashboardVisible = shelfUiState.isDashboardVisible
    val dashboardVisibilityToggle = shelfViewModel::toggleDashboardVisibility
    fun searchCallback(): (String) -> Unit = {
        searchText.value = it
        shelfViewModel.filterApps(it)
    }
    Desktop(
        apps = apps,
        dashboardVisibilityToggle = dashboardVisibilityToggle,
        isDashboardVisible = isDashboardVisible,
        flowVisibilityToggle = flowVisibilityToggle,
        isFlowVisible = isFLowVisible,
        pagesPagerState = pagesPagerState,
        searchCallback = searchCallback(),
        searchText = searchText.value,
    )
}