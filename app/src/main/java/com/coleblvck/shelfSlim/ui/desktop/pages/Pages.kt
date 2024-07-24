package com.coleblvck.shelfSlim.ui.desktop.pages

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolBox
import com.coleblvck.shelfSlim.ui.desktop.pages.drawer.Drawer
import com.coleblvck.shelfSlim.ui.desktop.pages.gestureBox.GestureBox
import com.coleblvck.shelfSlim.ui.desktop.pages.widgetBoard.WidgetBoard

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pages(
    modifier: Modifier,
    shouldPadPagerItemHorizontally: State<Boolean>,
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
        modifier = modifier.clip(RoundedCornerShape(12.dp)),
        beyondBoundsPageCount = 2,
        pageSpacing = 8.dp
    ) { page: Int ->
        when (page) {
            0 -> Drawer(
                shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                drawerApps = drawerApps,
                drawerType = drawerType,
                drawerSearchText = drawerSearchText,
                drawerSearchCallback = drawerSearchCallback,
            )

            1 -> GestureBox(
                shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                dashboardVisibilityToggle = dashboardVisibilityToggle
            )

            2 -> WidgetBoard(
                shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                widgetToolBox = widgetToolBox,
                showWidgetSelectionSheet = showWidgetSelectionSheet,
            )

        }

    }

}