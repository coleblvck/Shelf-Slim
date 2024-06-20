package com.coleblvck.shelf.ui.desktop

import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelf.content.App


var appDrawerDisplayed by mutableStateOf(false)


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Desktop(
    apps: List<App>,
    dashboardVisibilityToggle: () -> Unit,
    isDashboardVisible: Boolean,
    flowVisibilityToggle: () -> Unit,
    isFlowVisible: Boolean
) {
    val pagesPagerState = rememberPagerState(
        initialPage = 1,
        pageCount = { 2 }
    )
    val context = LocalContext.current
    val window = (context as Activity).window
    val insetsController = WindowCompat.getInsetsController(window, window.decorView)
    if (hideSystemUI) {
        insetsController.apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    } else {
        insetsController.apply { show(WindowInsetsCompat.Type.systemBars()) }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (isFlowVisible) {
            Flow(
                modifier =
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
        }
        Pages(
            modifier = Modifier
                .weight(2F)
                .fillMaxWidth(),
            pagerState = pagesPagerState,
            apps = apps,
            dashboardVisibilityToggle = dashboardVisibilityToggle
        )
        Dashboard(
            pagesPagerState = pagesPagerState,
            flowVisibilityToggle = flowVisibilityToggle,
            visible = isDashboardVisible
        )
    }
}
