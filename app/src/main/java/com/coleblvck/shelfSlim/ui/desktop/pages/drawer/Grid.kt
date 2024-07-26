package com.coleblvck.shelfSlim.ui.desktop.pages.drawer

import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshState
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.ui.theme.colorWithAlpha

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Grid(
    shouldPadPagerItemHorizontally: State<Boolean>,
    drawerApps: State<List<App>>,
    state: LazyStaggeredGridState = rememberLazyStaggeredGridState(),
    contentPadding: PaddingValues = PaddingValues(8.dp),
    pullRefreshState: PullRefreshState,
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = if (shouldPadPagerItemHorizontally.value) {
                    12.dp
                } else {
                    0.dp
                }
            ),

        color = colorWithAlpha(MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(12.dp)
    ) {
        LazyVerticalStaggeredGrid(
            modifier = Modifier.fillMaxSize().pullRefresh(state = pullRefreshState),
            state = state,
            columns = StaggeredGridCells.Adaptive(60.dp),
            contentPadding = contentPadding,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalItemSpacing = 8.dp,
            flingBehavior = ScrollableDefaults.flingBehavior(),
        ) {
            items(
                drawerApps.value,
                key = { it.listKey }
            ) { app ->
                DrawerAppItem(
                    app = app,
                    appCardType = AppCardType.BOX
                )
            }
        }
    }
}