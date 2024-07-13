package com.coleblvck.shelfSlim.userInterface.misc

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.contentManagement.AppIcon
import com.coleblvck.shelfSlim.state.ActionType
import com.coleblvck.shelfSlim.state.AppListState
import com.coleblvck.shelfSlim.state.CustomFunction
import com.coleblvck.shelfSlim.userInterface.common.DisplayIcon
import com.coleblvck.shelfSlim.userInterface.common.iconMap

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomMappingDialog(
    customFunction: CustomFunction,
    appListState: AppListState
) {
    if (customFunction.mappingDialogVisible.value) {
        AlertDialog(
            onDismissRequest = {
                customFunction.setMappingDialogVisibility(false)
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
                                for (vectorEntry in iconMap.entries) {
                                    ElevatedCard(
                                        modifier = Modifier.clickable {
                                            customFunction.setCurrentIcon(
                                                vectorEntry.key,
                                                true
                                            )
                                        },
                                        colors = CardDefaults.elevatedCardColors(
                                            containerColor = if (customFunction.currentIcon.value == vectorEntry.value) {
                                                MaterialTheme.colorScheme.primary
                                            } else {
                                                MaterialTheme.colorScheme.background
                                            },
                                            contentColor = if (customFunction.currentIcon.value == vectorEntry.value) {
                                                MaterialTheme.colorScheme.onPrimary
                                            } else {
                                                MaterialTheme.colorScheme.onBackground
                                            },
                                        )
                                    ) {
                                        DisplayIcon(
                                            vector = vectorEntry.value,
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
                                            customFunction.setActionType(
                                                ActionType.None,
                                                true
                                            )
                                        },
                                    colors = CardDefaults.elevatedCardColors(
                                        containerColor = if (customFunction.currentAction.value == ActionType.None) {
                                            MaterialTheme.colorScheme.tertiary
                                        } else {
                                            MaterialTheme.colorScheme.primary
                                        },
                                        contentColor = if (customFunction.currentAction.value == ActionType.None) {
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
                                        for (app: App in appListState.unfilteredList) {
                                            ElevatedCard(
                                                modifier = Modifier.clickable {
                                                    customFunction.setCurrentPackage(
                                                        app.packageName,
                                                        true
                                                    )
                                                },
                                                colors = CardDefaults.elevatedCardColors(
                                                    containerColor = if (customFunction.currentPackage.value == app.packageName) {
                                                        MaterialTheme.colorScheme.tertiary
                                                    } else {
                                                        MaterialTheme.colorScheme.background
                                                    },
                                                    contentColor = if (customFunction.currentPackage.value == app.packageName) {
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
                                                    AppIcon(
                                                        model = app.icon,
                                                        modifier = Modifier.weight(1f)
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