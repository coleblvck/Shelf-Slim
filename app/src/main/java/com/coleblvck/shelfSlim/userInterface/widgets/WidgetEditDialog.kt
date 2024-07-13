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
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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
import com.coleblvck.shelfSlim.userInterface.common.ActionIcon
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WidgetEditDialog(
    widgetData: AppWidgetData,
    widgetsState: WidgetsState,
    onDismiss: () -> Unit,
) {
    val weightList = listOf(1f, 2f, 3f, 4f)

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
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row (
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
                                text = "Vertical Weight"
                            )
                            Row {
                                weightList.forEach { weight ->
                                    ElevatedCard(
                                        colors = CardDefaults.elevatedCardColors(
                                            containerColor = if (widgetData.verticalWeight.value == weight) {
                                                MaterialTheme.colorScheme.primary
                                            } else {
                                                MaterialTheme.colorScheme.background
                                            },
                                            contentColor = if (widgetData.verticalWeight.value == weight) {
                                                MaterialTheme.colorScheme.onPrimary
                                            } else {
                                                MaterialTheme.colorScheme.onBackground
                                            },
                                        ),
                                        onClick = { widgetData.verticalWeight.value = weight }
                                    ) {
                                        Text(
                                            modifier = Modifier.padding(8.dp),
                                            fontSize = 20.sp,
                                            fontWeight = FontWeight(600),
                                            text = weight.toString()
                                        )
                                    }
                                }
                            }
                        }
                        if (widgetsState.userWidgets.widgets.value.size > 1) {
                            Column(
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {

                                if (widgetsState.userWidgets.widgets.value.indexOf(widgetData) != 0) {
                                    ActionIcon(
                                        modifier = Modifier.size(40.dp),
                                        vector = RemixIcon.Arrows.`Arrow-up-fill`,
                                        action = {
                                            widgetsState.helper.userWidgetShift(
                                                widgetData,
                                                -1
                                            )
                                        }
                                    )
                                }
                                if (widgetsState.userWidgets.widgets.value.indexOf(widgetData) != widgetsState.userWidgets.widgets.value.size - 1) {
                                    ActionIcon(
                                        modifier = Modifier.size(40.dp),
                                        vector = RemixIcon.Arrows.`Arrow-down-fill`,
                                        action = {
                                            widgetsState.helper.userWidgetShift(
                                                widgetData,
                                                +1
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