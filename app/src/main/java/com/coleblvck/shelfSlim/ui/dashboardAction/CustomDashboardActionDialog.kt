package com.coleblvck.shelfSlim.ui.dashboardAction

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.coleblvck.shelfSlim.content.IconMap
import com.coleblvck.shelfSlim.content.getIconMapVector
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.state.stateTools.customDashboardAction.ActionType
import com.coleblvck.shelfSlim.state.stateTools.customDashboardAction.getActionTypeValue
import com.coleblvck.shelfSlim.ui.common.DisplayIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDashboardActionDialog(
    currentCustomFunctionIcon: State<String>,
    updateCustomFunctionIcon: (String) -> Unit,
    currentCustomFunctionAction: State<String>,
    updateCustomFunctionAction: (String) -> Unit,
    currentCustomFunctionParameter: State<String>,
    updateCustomFunctionParameter: (String) -> Unit,
    isCustomMappingDialogVisible: State<Boolean>,
    updateCustomMappingDialogVisibility: (Boolean) -> Unit,
    allApps: State<List<App>>,
) {
    val customVectorImage = getIconMapVector(currentCustomFunctionIcon.value)

    if (isCustomMappingDialogVisible.value) {
        AlertDialog(
            onDismissRequest = {
                updateCustomMappingDialogVisibility(false)
            },
            content = {
                Card(
                    colors = CardDefaults.cardColors(
                        MaterialTheme.colorScheme.tertiary,
                        MaterialTheme.colorScheme.onTertiary
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Available Icons:",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900
                        )
                        ElevatedCard(
                            modifier = Modifier
                                .height(70.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.elevatedCardColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.onBackground
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .horizontalScroll(state = rememberScrollState())
                                    .fillMaxHeight()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                for (vectorEntry in IconMap.entries) {
                                    ElevatedCard(
                                        modifier = Modifier.clickable {
                                            updateCustomFunctionIcon(
                                                vectorEntry.name,
                                            )
                                        },
                                        colors = CardDefaults.elevatedCardColors(
                                            containerColor = if (customVectorImage == vectorEntry.vector) {
                                                MaterialTheme.colorScheme.primary
                                            } else {
                                                MaterialTheme.colorScheme.background
                                            },
                                            contentColor = if (customVectorImage == vectorEntry.vector) {
                                                MaterialTheme.colorScheme.onPrimary
                                            } else {
                                                MaterialTheme.colorScheme.onBackground
                                            },
                                        )
                                    ) {
                                        DisplayIcon(
                                            vector = vectorEntry.vector,
                                            modifier = Modifier
                                                .size(50.dp)
                                                .padding(8.dp)
                                        )
                                    }
                                }
                            }
                        }
                        Text(
                            text = "Available Actions:",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900
                        )
                        ElevatedCard(
                            modifier = Modifier
                                .fillMaxWidth(),
                            colors = CardDefaults.elevatedCardColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.onBackground
                            )
                        ) {
                            Column(modifier = Modifier.padding(8.dp)) {
                                ElevatedCard(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            updateCustomFunctionAction(
                                                "NONE",
                                            )
                                        },
                                    colors = CardDefaults.elevatedCardColors(
                                        containerColor = if (getActionTypeValue(currentCustomFunctionAction.value) == ActionType.NONE) {
                                            MaterialTheme.colorScheme.tertiary
                                        } else {
                                            MaterialTheme.colorScheme.primary
                                        },
                                        contentColor = if (getActionTypeValue(currentCustomFunctionAction.value) == ActionType.NONE) {
                                            MaterialTheme.colorScheme.onTertiary
                                        } else {
                                            MaterialTheme.colorScheme.onPrimary
                                        },
                                    )
                                ) {
                                    Text(
                                        modifier = Modifier.padding(8.dp),
                                        text = "Do Nothing",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.W900
                                    )
                                }
                                Text(
                                    text = "Launch App:",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W900
                                )
                                ElevatedCard(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .fillMaxWidth(),
                                    colors = CardDefaults.elevatedCardColors(
                                        MaterialTheme.colorScheme.primary,
                                        MaterialTheme.colorScheme.onPrimary
                                    )
                                ) {

                                    Row(
                                        modifier = Modifier
                                            .horizontalScroll(state = rememberScrollState())
                                            .fillMaxHeight()
                                            .padding(8.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        for (app: App in allApps.value) {
                                            ElevatedCard(
                                                modifier = Modifier.clickable {
                                                    updateCustomFunctionParameter(
                                                        app.packageName
                                                    )
                                                },
                                                colors = CardDefaults.elevatedCardColors(
                                                    containerColor = if (currentCustomFunctionParameter.value == app.packageName) {
                                                        MaterialTheme.colorScheme.tertiary
                                                    } else {
                                                        MaterialTheme.colorScheme.background
                                                    },
                                                    contentColor = if (currentCustomFunctionParameter.value == app.packageName) {
                                                        MaterialTheme.colorScheme.onTertiary
                                                    } else {
                                                        MaterialTheme.colorScheme.onBackground
                                                    },
                                                )
                                            ) {
                                                Column(
                                                    horizontalAlignment = Alignment.CenterHorizontally,
                                                    modifier = Modifier
                                                        .aspectRatio(1f)
                                                        .wrapContentHeight()
                                                ) {
                                                    AsyncImage(
                                                        model = app.icon,
                                                        modifier = Modifier
                                                            .padding(8.dp)
                                                            .size(40.dp)
                                                            .weight(1f),
                                                        contentDescription = "${app.name} Icon",
                                                        contentScale = ContentScale.Fit,
                                                    )
                                                    Text(
                                                        modifier = Modifier
                                                            .padding(8.dp),
                                                        text = app.name,
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Medium,
                                                        maxLines = 1,
                                                        overflow = TextOverflow.Ellipsis,
                                                        textAlign = TextAlign.Center
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}