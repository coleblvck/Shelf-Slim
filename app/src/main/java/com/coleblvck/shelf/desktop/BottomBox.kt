package com.coleblvck.shelf.desktop

import android.os.Build
import android.widget.TextClock
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
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
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.PlayArrow
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.coleblvck.shelf.ui.theme.colorWithAlpha
import kotlinx.coroutines.launch

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BottomBox(modifier: Modifier) {
    val context = LocalContext.current
    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) {

        }

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
            HorizontalPager(state = pagerState, modifier = Modifier.weight(1f)) { page: Int ->
                bottomBoxWidgets[page].invoke(Unit)

            }
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
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(modifier = Modifier.weight(1f)) {
                            MyTextClock(color = MaterialTheme.colorScheme.onPrimary)
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
                        IconButton(onClick = {
                            topBoxVisible = !topBoxVisible
                        }) {
                            Icon(Icons.Rounded.List,
                                "Show Top Cards",
                                modifier = Modifier.size(32.dp),
                            )
                        }
                        IconButton(onClick = {
                            val intent = context.packageManager.getLaunchIntentForPackage("com.coleblvck.antiiq")
                            intent?.let { launcher.launch(intent) }
                        }) {
                            Icon(Icons.Rounded.PlayArrow,
                                "Show Apps",
                                modifier = Modifier.size(32.dp),
                            )
                        }
                        IconButton(onClick = { leadButtonClickAction() }) {
                            Icon(
                                if (pagerState.currentPage == 1) {
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
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun MyTextClock(color: Color) {
    AndroidView(factory = { context ->
        TextClock(context).apply {
            format12Hour?.let {
                this.format24Hour = "hh: mm: ss"
            }
            timeZone?.let { this.timeZone = it }
            textSize.let { this.textSize = 24f }
            fontVariationSettings.let { this.fontVariationSettings = "'wght' 1000"}
            setTextColor(color.toArgb())
        }
    })
}

var utilityBoxVisible by mutableStateOf(true)

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