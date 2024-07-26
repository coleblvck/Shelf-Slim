package com.coleblvck.shelfSlim.ui.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshState
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.classes.App

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Blinds(
    shouldPadPagerItemHorizontally: State<Boolean>,
    drawerApps: State<List<App>>,
    state: LazyListState = rememberLazyListState(),
    contentPadding: PaddingValues = PaddingValues(0.dp),
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

        color = Color.Transparent,
        shape = RoundedCornerShape(12.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().pullRefresh(state = pullRefreshState),
            state = state,
            contentPadding = contentPadding,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                drawerApps.value,
                key = { it.listKey }
            ) { app ->
                DrawerAppItem(
                    app = app,
                    appCardType = AppCardType.STRIP
                )
            }
        }
    }
}