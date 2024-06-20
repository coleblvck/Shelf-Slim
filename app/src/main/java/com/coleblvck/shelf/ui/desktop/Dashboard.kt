package com.coleblvck.shelf.ui.desktop

import android.os.Build
import android.widget.TextClock
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.coleblvck.shelf.ui.theme.colorWithAlpha
import com.coleblvck.shelf.utils.Utils
import kotlinx.coroutines.launch


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Dashboard(pagesPagerState: PagerState, flowVisibilityToggle: () -> Unit, visible: Boolean) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    fun leadButtonClickAction() {
        if (pagesPagerState.currentPage == 1) {
            coroutineScope.launch { pagesPagerState.animateScrollToPage(0) }
        } else {
            coroutineScope.launch { pagesPagerState.animateScrollToPage(1) }
        }
    }

    if (visible) {
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
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.weight(1f)) {
                    DashboardClock(
                        color = MaterialTheme.colorScheme.onTertiary,
                    )
                }
                IconButton(onClick = {
                    hideSystemUI = !hideSystemUI
                }) {
                    Icon(
                        modifier = Modifier.size(32.dp),
                        imageVector = (
                                if (hideSystemUI) {
                                    Icons.Rounded.KeyboardArrowDown
                                } else {
                                    Icons.Rounded.KeyboardArrowUp
                                }
                                ),
                        contentDescription = (
                                if (hideSystemUI) {
                                    "Show system UI"
                                } else {
                                    "Hide system UI"
                                }
                                )
                    )

                }
                IconButton(
                    onClick = flowVisibilityToggle
                ) {
                    Icon(
                        Icons.Rounded.List,
                        "Show Top Cards",
                        modifier = Modifier.size(32.dp),
                    )
                }
                IconButton(onClick = {
                    Utils.launchApp(context = context, packageName = "com.coleblvck.antiiq")
                }) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        "Show Apps",
                        modifier = Modifier.size(32.dp),
                    )
                }
                IconButton(onClick = { leadButtonClickAction() }) {
                    Icon(
                        if (pagesPagerState.currentPage == 1) {
                            Icons.Rounded.Menu
                        } else {
                            Icons.Rounded.Home
                        },
                        "Show Apps",
                        modifier = Modifier.size(28.dp),
                    )
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun DashboardClock(color: Color) {
    val context = LocalContext.current
    ElevatedCard(
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.tertiary),
            MaterialTheme.colorScheme.onPrimary,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(20),
        modifier = Modifier.clickable { Utils.expandStatusBar(context = context) }
    ) {
        AndroidView(
            factory = { context ->
                TextClock(context).apply {
                    format12Hour?.let {
                        this.format24Hour = "hh: mm: ss"
                    }
                    timeZone?.let { this.timeZone = it }
                    textSize.let { this.textSize = 24f }
                    fontVariationSettings.let { this.fontVariationSettings = "'wght' 1000" }
                    setTextColor(color.toArgb())
                }
            },
            modifier = Modifier.padding(horizontal = 8.dp),
        )
    }
}