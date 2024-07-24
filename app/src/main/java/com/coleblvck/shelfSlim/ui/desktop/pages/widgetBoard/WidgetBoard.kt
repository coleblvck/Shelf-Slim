package com.coleblvck.shelfSlim.ui.desktop.pages.widgetBoard

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.content.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Close-circle-fill`
import com.coleblvck.shelfSlim.data.entities.widget.AppWidgetData
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetToolBox
import com.coleblvck.shelfSlim.ui.common.ActionIcon
import com.coleblvck.shelfSlim.ui.theme.colorWithAlpha
import kotlinx.coroutines.launch
import kotlin.math.roundToInt


@OptIn(ExperimentalMaterialApi::class)
@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun WidgetBoard(
    shouldPadPagerItemHorizontally: State<Boolean>,
    widgetToolBox: WidgetToolBox,
    showWidgetSelectionSheet: () -> Unit,
) {
    val maxRefreshHeight = 120
    val isRefreshing = remember {
        mutableStateOf(false)
    }
    val coroutineScope = rememberCoroutineScope()
    val pullRefreshState = rememberPullRefreshState(
        refreshing = isRefreshing.value,
        refreshThreshold = 150.dp,
        onRefresh = {
            coroutineScope.launch {
                isRefreshing.value = true
            }
        }
    )
    val refreshCardHeight = animateIntAsState(
        targetValue = when {
            isRefreshing.value -> maxRefreshHeight
            pullRefreshState.progress in 0f..1f -> (maxRefreshHeight * pullRefreshState.progress).roundToInt()
            pullRefreshState.progress > 1f -> (maxRefreshHeight + ((pullRefreshState.progress - 1f) * .1f) * 100).roundToInt()
            else -> 0
        },
        label = "columnOffset"
    )

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = if (shouldPadPagerItemHorizontally.value) {
                    12.dp
                } else {
                    0.dp
                }
            ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorWithAlpha(MaterialTheme.colorScheme.background),
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(8.dp))
                        .padding(0.dp)
                        .pullRefresh(state = pullRefreshState)
                        .verticalScroll(
                            enabled = if (widgetToolBox.userWidgets.value.isNotEmpty()) {
                                widgetToolBox.widgetPageScrollEnabled.value
                            } else {
                                true
                            },
                            state = widgetToolBox.widgetPageScrollState
                        ),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    if (widgetToolBox.userWidgets.value.isEmpty() && !widgetToolBox.widgetsEditModeEnabled.value) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically),
                            text = "Pull down to add widgets",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W500,
                            textAlign = TextAlign.Center
                        )
                    }
                    widgetToolBox.userWidgets.value.forEach { appWidgetData: AppWidgetData ->
                        key(appWidgetData.appWidgetId) {
                            WidgetViewBox(
                                appWidgetData = appWidgetData,
                                widgetToolBox = widgetToolBox,
                            )
                        }
                    }
                    if (widgetToolBox.widgetsEditModeEnabled.value) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            ElevatedButton(
                                modifier = Modifier.weight(1f),
                                onClick = { showWidgetSelectionSheet() },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.elevatedButtonColors(
                                    MaterialTheme.colorScheme.background,
                                    MaterialTheme.colorScheme.primary
                                )
                            ) {
                                Text(text = "Add")
                            }
                            ElevatedButton(
                                modifier = Modifier.weight(1f),
                                onClick = { widgetToolBox.updateWidgetsEditMode(false) },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.elevatedButtonColors(
                                    MaterialTheme.colorScheme.background,
                                    MaterialTheme.colorScheme.primary
                                )
                            ) {
                                Text(text = "Done")
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(100.dp))

                }
                if (widgetToolBox.userWidgets.value.isNotEmpty()) {
                    Row(
                        modifier = Modifier.align(Alignment.BottomEnd),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Card(
                            colors = CardDefaults.elevatedCardColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.onBackground
                            )
                        ) {
                            Text(
                                modifier = Modifier.padding(4.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight(800),
                                text = "Scroll:"
                            )
                        }
                        Switch(
                            checked = widgetToolBox.widgetPageScrollEnabled.value,
                            onCheckedChange = widgetToolBox::widgetPageScrollSwitch
                        )
                    }
                }


            }
            if (refreshCardHeight.value != 0) {
                ElevatedCard(
                    modifier = Modifier
                        .height(refreshCardHeight.value.dp)
                        .fillMaxWidth()
                        .animateContentSize(),
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.background,
                        contentColor = MaterialTheme.colorScheme.onBackground
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ElevatedButton(
                            enabled = !widgetToolBox.widgetsEditModeEnabled.value,
                            modifier = Modifier.fillMaxWidth(),
                            onClick = {
                                widgetToolBox.updateWidgetsEditMode(true)
                                isRefreshing.value = false
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.elevatedButtonColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.primary
                            )
                        ) {
                            Text(text = "Edit Widgets")
                        }
                        ActionIcon(
                            modifier = Modifier.weight(1f),
                            vector = RemixIcon.System.`Close-circle-fill`,
                            action = { isRefreshing.value = false }
                        )
                    }
                }
            }
        }
    }
}