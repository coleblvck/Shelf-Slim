package com.coleblvck.shelfSlim.userInterface.desktop.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopUiState
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.Drawer
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.DrawerState
import com.coleblvck.shelfSlim.userInterface.desktop.pages.gestureBox.GestureBox
import com.coleblvck.shelfSlim.userInterface.desktop.pages.widgetBox.WidgetBox

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pages(
    modifier: Modifier,
    drawerState: DrawerState,
    pagerState: PagerState,
    desktopUiState: DesktopUiState,
    showWidgetSelectionSheet: () -> Unit
) {
    val fling = PagerDefaults.flingBehavior(
        state = pagerState,
        pagerSnapDistance = PagerSnapDistance.atMost(2)
    )
    HorizontalPager(
        state = pagerState,
        flingBehavior = fling,
        modifier = modifier,
        beyondBoundsPageCount = 2,
    ) { page: Int ->
        when (page) {
            0 -> Drawer(
                drawerState = drawerState
            )

            1 -> GestureBox(
                desktopUiState = desktopUiState
            )

            2 -> WidgetBox(
                showWidgetSelectionSheet = showWidgetSelectionSheet
            )

        }

    }

}