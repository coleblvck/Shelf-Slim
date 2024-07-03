package com.coleblvck.shelf.ui.desktop

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import com.coleblvck.shelf.content.App


var appDrawerDisplayed by mutableStateOf(false)


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Desktop(
    apps: LazyPagingItems<App>,
    dashboardVisibilityToggle: () -> Unit,
    isDashboardVisible: Boolean,
    flowVisibilityToggle: () -> Unit,
    isFlowVisible: Boolean,
    pagesPagerState: PagerState,
    searchCallback: (String) -> Unit,
    searchText: String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth().padding(vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        AnimatedVisibility(
            visible = isFlowVisible,
            modifier = Modifier.weight(2f),
            enter = slideInVertically(animationSpec = TweenSpec(300, 0, LinearEasing)),
            exit = slideOutVertically(animationSpec = TweenSpec(300, 0, LinearEasing))
        ) {
            Flow()
        }

        Pages(
            modifier = Modifier
                .weight(4F)
                .fillMaxWidth(),
            pagerState = pagesPagerState,
            apps = apps,
            dashboardVisibilityToggle = dashboardVisibilityToggle,
            searchCallback = searchCallback,
            searchText = searchText
        )
        Dashboard(
            pagesPagerState = pagesPagerState,
            flowVisibilityToggle = flowVisibilityToggle,
            visible = isDashboardVisible
        )
    }
}
