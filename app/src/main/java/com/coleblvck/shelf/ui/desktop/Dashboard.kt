package com.coleblvck.shelf.ui.desktop

import android.os.Build
import android.widget.TextClock
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.coleblvck.shelf.ui.remixIcons.RemixIcon
import com.coleblvck.shelf.ui.remixIcons.remixicon.Health
import com.coleblvck.shelf.ui.remixIcons.remixicon.System
import com.coleblvck.shelf.ui.remixIcons.remixicon.health.`Pulse-fill`
import com.coleblvck.shelf.ui.remixIcons.remixicon.system.`Apps-2-fill`
import com.coleblvck.shelf.ui.remixIcons.remixicon.system.`Dashboard-fill`
import com.coleblvck.shelf.ui.remixIcons.remixicon.system.`Eye-2-fill`
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
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 1.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorWithAlpha(MaterialTheme.colorScheme.primary).compositeOver(MaterialTheme.colorScheme.primary),
                contentColor = MaterialTheme.colorScheme.onPrimary,
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.weight(1f)) {
                    DashboardClock(
                        color = MaterialTheme.colorScheme.onTertiary,
                    )
                }
                HorizontalSpacer()
                Icon(
                    RemixIcon.System.`Eye-2-fill`,
                    "Show Top Cards",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable(onClick = flowVisibilityToggle),
                )
                HorizontalSpacer()
                Icon(
                    RemixIcon.Health.`Pulse-fill`,
                    "Launch ***",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            Utils.launchApp(context = context, packageName = "com.coleblvck.antiiq")
                        },
                )
                HorizontalSpacer()
                Icon(
                    if (pagesPagerState.currentPage == 1) {
                        RemixIcon.System.`Apps-2-fill`
                    } else {
                        RemixIcon.System.`Dashboard-fill`
                    },
                    "Show Apps",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { leadButtonClickAction() },
                )

            }
        }
    }
}

@Composable
fun HorizontalSpacer(modifier: Modifier = Modifier) {
    Spacer(modifier = modifier.width(8.dp))
}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun DashboardClock(color: Color) {
    val context = LocalContext.current
    ElevatedCard(
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.tertiary).compositeOver(MaterialTheme.colorScheme.tertiary),
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

                    this.format12Hour = "hh:mm:ss a"
                    this.format24Hour = "kk:mm:ss"

                    timeZone?.let { this.timeZone = it }
                    textSize.let { this.textSize = 24f }
                    fontVariationSettings.let { this.fontVariationSettings = "'wght' 1000" }
                    setTextColor(color.toArgb())
                    isAllCaps = true
                }
            },
            modifier = Modifier.padding(horizontal = 8.dp),
        )
    }
}