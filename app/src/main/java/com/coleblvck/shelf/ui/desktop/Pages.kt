package com.coleblvck.shelf.ui.desktop

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.content.App
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pages(modifier: Modifier, pagerState: PagerState, apps: List<App>, dashboardVisibilityToggle: () -> Unit ) {

    val coroutineScope = rememberCoroutineScope()

    BackHandler {
        coroutineScope.launch { pagerState.animateScrollToPage(1) }
        hideSystemUI = true
    }
    BoxWithConstraints(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            HorizontalPager(state = pagerState, modifier = Modifier.weight(1f)) { page: Int ->
                when (page) {
                    0 -> Drawer(type = currentDrawerType, apps = apps)
                    1 -> EmptyBox(dashboardVisibilityToggle = dashboardVisibilityToggle)

                }

            }
        }
    }
}




