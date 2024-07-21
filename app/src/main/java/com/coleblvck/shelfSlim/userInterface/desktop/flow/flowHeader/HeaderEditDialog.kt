package com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderEditDialog(
    flowHeaderHeading: State<String>,
    updateFlowHeaderHeading: (String) -> Unit,
    flowHeaderSubHeading: State<String>,
    updateFlowHeaderSubHeading: (String) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit
) {
    if (flowHeaderEditDialogVisible.value) {
        AlertDialog(
            onDismissRequest = {
                updateFlowHeaderEditDialogVisibility(false)
            },
            content = {
                Card(
                    colors = CardDefaults.cardColors(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Edit Heading:",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900
                        )
                        ElevatedCard(
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.elevatedCardColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.onBackground
                            )
                        ) {
                            BasicTextField(
                                modifier = Modifier
                                    .padding(12.dp)
                                    .fillMaxSize(),
                                value = flowHeaderHeading.value,
                                onValueChange = updateFlowHeaderHeading,
                                visualTransformation = VisualTransformation.None,
                                singleLine = false,
                                textStyle = TextStyle(
                                    fontSize = 20.sp,
                                    color = MaterialTheme.colorScheme.onBackground,
                                ),
                                cursorBrush = SolidColor(MaterialTheme.colorScheme.onBackground)
                            )
                        }
                        Text(
                            text = "Edit Sub-Heading:",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900
                        )
                        ElevatedCard(
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth(),
                            colors = CardDefaults.elevatedCardColors(
                                MaterialTheme.colorScheme.background,
                                MaterialTheme.colorScheme.onBackground
                            )
                        ) {
                            BasicTextField(
                                modifier = Modifier
                                    .padding(12.dp)
                                    .fillMaxSize(),
                                value = flowHeaderSubHeading.value,
                                onValueChange = updateFlowHeaderSubHeading,
                                visualTransformation = VisualTransformation.None,
                                singleLine = false,
                                textStyle = TextStyle(
                                    fontSize = 20.sp,
                                    color = MaterialTheme.colorScheme.onBackground,
                                ),
                                cursorBrush = SolidColor(MaterialTheme.colorScheme.onBackground)
                            )
                        }
                    }
                }
            }
        )
    }
}