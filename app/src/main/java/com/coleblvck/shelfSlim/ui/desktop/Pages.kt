package com.coleblvck.shelfSlim.ui.desktop

import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.paging.compose.LazyPagingItems
import com.coleblvck.shelfSlim.content.App
import com.coleblvck.shelfSlim.utils.Utils
import kotlinx.coroutines.launch

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pages(
    modifier: Modifier,
    pagerState: PagerState,
    apps: LazyPagingItems<App>,
    dashboardVisibilityToggle: () -> Unit,
    flowVisibilityToggle: () -> Unit,
    searchCallback: (String) -> Unit,
    searchText: String
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    BackHandler {
        coroutineScope.launch { pagerState.animateScrollToPage(1) }
    }

    val fling = PagerDefaults.flingBehavior(
        state = pagerState,
        pagerSnapDistance = PagerSnapDistance.atMost(10)
    )
    HorizontalPager(
        state = pagerState,
        flingBehavior = fling,
        modifier = modifier,
        beyondBoundsPageCount = 1,
    ) { page: Int ->
        when (page) {
            0 -> Drawer(
                type = currentDrawerType,
                apps = apps,
                searchCallback = searchCallback,
                searchText = searchText
            )

            1 -> GestureBox(
                modifier = Modifier
                    .pointerInput(Unit) {
                        var dCalc: Float? = null
                        detectVerticalDragGestures(
                            onVerticalDrag = { _, dragAmount ->
                                dCalc = dragAmount
                            },
                            onDragEnd = {
                                if (dCalc != null) {
                                    if (dCalc!! > 50) {
                                        Utils.expandStatusBar(context)
                                    } else if (dCalc!! < -50) {
                                        flowVisibilityToggle.invoke()
                                    }
                                }
                            }
                        )
                    }
                    .pointerInput(Unit) {
                        detectTapGestures(onDoubleTap = {
                            dashboardVisibilityToggle()
                        })
                    })

        }

    }

}




