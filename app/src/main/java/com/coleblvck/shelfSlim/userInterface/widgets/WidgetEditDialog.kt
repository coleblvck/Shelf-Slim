package com.coleblvck.shelfSlim.userInterface.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.contentManagement.AppIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Arrows
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows.`Arrow-down-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows.`Arrow-up-fill`
import com.coleblvck.shelfSlim.data.entities.widget.WidgetToolBox
import com.coleblvck.shelfSlim.userInterface.common.ActionIcon
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import java.math.RoundingMode


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WidgetEditDialog(
    widgetToolBox: WidgetToolBox,
    widgetData: AppWidgetData,
    onDismiss: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.onBackground,
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        AppIcon(model = widgetData.icon!!)
                        Text(
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically),
                            textAlign = TextAlign.Left,
                            fontSize = 24.sp,
                            fontWeight = FontWeight(500),
                            text = widgetData.widgetLabel,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(3f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                modifier = Modifier.padding(8.dp),
                                fontSize = 20.sp,
                                fontWeight = FontWeight(600),
                                text = "Vertical Weight-Ratio: ${
                                    (1 / widgetData.verticalWeight).toBigDecimal()
                                        .setScale(1, RoundingMode.HALF_EVEN)
                                }"
                            )
                            Slider(
                                value = 1 / widgetData.verticalWeight,
                                onValueChange = { value ->
                                    widgetToolBox.updateUserWidgetWeight(
                                        widgetData,
                                        value
                                    )
                                },
                                steps = 17,
                                valueRange = 0.2f..2f,
                                colors = SliderDefaults.colors(
                                    thumbColor = MaterialTheme.colorScheme.tertiary,
                                    activeTrackColor = MaterialTheme.colorScheme.primary
                                )
                            )
                        }
                        if (widgetToolBox.userWidgets.value.size > 1) {
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                val widgetIndex =
                                    widgetToolBox.userWidgets.value.indexOf(widgetData)
                                if (widgetIndex != 0) {
                                    ActionIcon(
                                        modifier = Modifier.size(40.dp),
                                        vector = RemixIcon.Arrows.`Arrow-up-fill`,
                                        action = {
                                            widgetToolBox.reorderUserWidgets(
                                                widgetIndex,
                                                widgetIndex - 1
                                            )
                                        }
                                    )
                                }
                                if (widgetIndex != widgetToolBox.userWidgets.value.size - 1) {
                                    ActionIcon(
                                        modifier = Modifier.size(40.dp),
                                        vector = RemixIcon.Arrows.`Arrow-down-fill`,
                                        action = {
                                            widgetToolBox.reorderUserWidgets(
                                                widgetIndex,
                                                widgetIndex + 1
                                            )
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    )
}