package com.coleblvck.shelfSlim.userInterface.desktop.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.Drawer
import com.coleblvck.shelfSlim.userInterface.desktop.pages.gestureBox.GestureBox
import com.coleblvck.shelfSlim.userInterface.desktop.pages.widgetBox.WidgetBox

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pages(
    modifier: Modifier,
    pagesPagerState: ShelfPagerState,
    drawerApps: State<List<App>>,
    drawerType: State<String>,
    drawerSearchText: State<String>,
    drawerSearchCallback: (String) -> Unit,
    dashboardVisibilityToggle: () -> Unit,
    showWidgetSelectionSheet: () -> Unit,
    widgetToolBox: WidgetToolBox,
) {
    val fling = PagerDefaults.flingBehavior(
        state = pagesPagerState,
        pagerSnapDistance = PagerSnapDistance.atMost(2)
    )
    HorizontalPager(
        state = pagesPagerState,
        flingBehavior = fling,
        modifier = modifier,
        beyondBoundsPageCount = 2,
    ) { page: Int ->
        when (page) {
            0 -> Drawer(
                drawerApps = drawerApps,
                drawerType = drawerType,
                drawerSearchText = drawerSearchText,
                drawerSearchCallback = drawerSearchCallback,
            )

            1 -> GestureBox(
                dashboardVisibilityToggle = dashboardVisibilityToggle
            )

            2 -> WidgetBox(
                widgetToolBox = widgetToolBox,
                showWidgetSelectionSheet = showWidgetSelectionSheet
            )

        }

    }

}