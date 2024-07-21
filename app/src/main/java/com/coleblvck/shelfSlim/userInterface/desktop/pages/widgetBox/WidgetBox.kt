package com.coleblvck.shelfSlim.userInterface.desktop.pages.widgetBox

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Edit-2-fill`
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.userInterface.common.DisplayIcon
import com.coleblvck.shelfSlim.userInterface.common.HorizontalSpacer
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha
import com.coleblvck.shelfSlim.userInterface.widgets.WidgetView
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData


@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun WidgetBox(
    widgetToolBox: WidgetToolBox,
    showWidgetSelectionSheet: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (widgetToolBox.userWidgets.value.isNotEmpty()) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(0.dp)
                        .verticalScroll(
                            enabled = widgetToolBox.widgetPageScrollEnabled.value,
                            state = widgetToolBox.widgetPageScrollState
                        ),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    widgetToolBox.userWidgets.value.forEach { appWidgetData: AppWidgetData ->
                        key(appWidgetData.appWidgetId) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .aspectRatio(appWidgetData.verticalWeight),
                            ) {
                                WidgetView(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    widgetToolBox = widgetToolBox,
                                    appWidgetData = appWidgetData,
                                )
                            }
                        }
                    }
                }
            } else {
                ElevatedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                    colors = CardDefaults.elevatedCardColors(
                        MaterialTheme.colorScheme.background,
                        MaterialTheme.colorScheme.onBackground
                    )
                ) {

                    Text(
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentHeight(align = Alignment.CenterVertically),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(800),
                        text = "Widgets"
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ElevatedButton(
                    modifier = Modifier.weight(1f),
                    onClick = showWidgetSelectionSheet,
                    shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                    colors = ButtonDefaults.elevatedButtonColors(
                        MaterialTheme.colorScheme.background,
                        MaterialTheme.colorScheme.onBackground
                    )
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        DisplayIcon(
                            modifier = Modifier.size(24.dp),
                            vector = RemixIcon.Design.`Edit-2-fill`
                        )
                        HorizontalSpacer()
                        Text(
                            fontSize = 16.sp,
                            fontWeight = FontWeight(800),
                            text = "Manage"
                        )
                    }

                }
                Text(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(800),
                    text = "Scroll:"
                )
                Switch(
                    checked = widgetToolBox.widgetPageScrollEnabled.value,
                    onCheckedChange = widgetToolBox::widgetPageScrollSwitch
                )
            }
        }
    }
}