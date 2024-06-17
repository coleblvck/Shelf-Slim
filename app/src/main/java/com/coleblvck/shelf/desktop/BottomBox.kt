package com.coleblvck.shelf.desktop

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.theme.colorWithAlpha
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BottomBox(modifier: Modifier) {

    val pagerState = rememberPagerState(
        initialPage = 1,
        pageCount = { bottomBoxWidgets.size }
    )
    val coroutineScope = rememberCoroutineScope()

    fun leadButtonClickAction() {
        if (pagerState.currentPage == 1) {
            coroutineScope.launch { pagerState.animateScrollToPage(0) }
        } else {
            coroutineScope.launch { pagerState.animateScrollToPage(1) }
        }
    }
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
            if (utilityBoxVisible) {
                Card(
                    modifier = Modifier
                        .height(48.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp),
                    colors = CardDefaults.cardColors(
                        colorWithAlpha(MaterialTheme.colorScheme.primary),
                        MaterialTheme.colorScheme.onPrimary,
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box {

                        }
                        IconButton(onClick = { leadButtonClickAction() }) {
                            Icon(
                                if (pagerState.currentPage == 1) {
                                    Icons.Filled.Menu
                                } else {
                                    Icons.Filled.Home
                                },
                                "Show Apps",
                                modifier = Modifier.size(32.dp),
                            )
                        }
                    }
                }
            }
            HorizontalPager(state = pagerState, modifier = Modifier.weight(1f)) { page: Int ->
                bottomBoxWidgets[page].invoke(Unit)

            }
        }
    }
}

var utilityBoxVisible by mutableStateOf(false)

val defaultBottomBoxWidgets: List<@Composable (Any) -> Unit> = listOf(
    {
        widgets[WidgetType.DRAWER]!!.invoke(
            DrawerType.BLINDS
        )
    },
    { widgets[WidgetType.EMPTYBOX]!!.invoke(Unit) },
)

var bottomBoxWidgets: List<@Composable (Any) -> Unit> =
    mutableListOf(
        defaultBottomBoxWidgets[0],
        defaultBottomBoxWidgets[1]
    )