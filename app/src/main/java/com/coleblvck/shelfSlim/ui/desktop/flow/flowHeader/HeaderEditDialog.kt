package com.coleblvck.shelfSlim.ui.desktop.flow.flowHeader

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.ui.common.ColourPickerDialog
import com.coleblvck.shelfSlim.ui.common.toColour
import com.coleblvck.shelfSlim.ui.theme.colorWithAlpha
import kotlin.math.roundToInt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderEditDialog(
    flowHeaderHeading: State<Text>,
    updateFlowHeaderHeading: (Text) -> Unit,
    flowHeaderSubHeading: State<Text>,
    updateFlowHeaderSubHeading: (Text) -> Unit,
    flowHeaderBackground: State<Int?>,
    updateFlowHeaderBackground: (Int?) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit
) {
    val isHeaderBackgroundColourPickerVisible = remember {
        mutableStateOf(false)
    }
    val isHeadingColourPickerVisible = remember { mutableStateOf(false) }
    val headingColourInt = flowHeaderHeading.value.colour
    val isSubHeadingColourPickerVisible = remember {
        mutableStateOf(false)
    }
    val subHeadingColourInt = flowHeaderSubHeading.value.colour

    val editTransparency = remember {
        mutableStateOf(false)
    }

    @Composable
    fun HeaderBackgroundColourPicker() {
        ColourPickerDialog(
            isVisible = isHeaderBackgroundColourPickerVisible,
            onDismiss = { isHeaderBackgroundColourPickerVisible.value = false },
            initialColour = flowHeaderBackground.value?.toColour()
                ?: colorWithAlpha(MaterialTheme.colorScheme.background),
            colorReceivingCallback = { colour ->
                updateFlowHeaderBackground(colour.toArgb())
            }
        )
    }

    @Composable
    fun HeaderHeadingColourPicker() {
        ColourPickerDialog(
            isVisible = isHeadingColourPickerVisible,
            onDismiss = { isHeadingColourPickerVisible.value = false },
            initialColour = headingColourInt?.toColour() ?: Color.White,
            colorReceivingCallback = { colour ->
                updateFlowHeaderHeading(
                    flowHeaderHeading.value.copy(
                        colour = colour.toArgb()
                    )
                )
            }
        )
    }

    @Composable
    fun HeaderSubHeadingColourPicker() {
        ColourPickerDialog(
            isVisible = isSubHeadingColourPickerVisible,
            onDismiss = { isSubHeadingColourPickerVisible.value = false },
            initialColour = subHeadingColourInt?.toColour() ?: Color.White,
            colorReceivingCallback = { colour ->
                updateFlowHeaderSubHeading(
                    flowHeaderSubHeading.value.copy(
                        colour = colour.toArgb()
                    )
                )
            }
        )
    }
    if (flowHeaderEditDialogVisible.value) {
        HeaderBackgroundColourPicker()
        HeaderHeadingColourPicker()
        HeaderSubHeadingColourPicker()
        AlertDialog(
            onDismissRequest = {
                updateFlowHeaderEditDialogVisibility(false)
            },
            content = {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = if (editTransparency.value) {
                            Color.Transparent
                        } else {
                            MaterialTheme.colorScheme.primary
                        },
                        MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        ElevatedButton(
                            colors = ButtonDefaults.elevatedButtonColors(
                                containerColor = if (editTransparency.value) {
                                    Color.Transparent
                                } else {
                                    MaterialTheme.colorScheme.background
                                },
                                contentColor = MaterialTheme.colorScheme.onBackground
                            ),
                            modifier = Modifier.fillMaxWidth(),
                            onClick = { isHeaderBackgroundColourPickerVisible.value = true }) {
                            Text(text = "Background Colour")
                        }
                        Text(
                            text = "Edit Heading:",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.W900
                        )
                        ElevatedButton(
                            colors = ButtonDefaults.elevatedButtonColors(
                                containerColor = if (editTransparency.value) {
                                    Color.Transparent
                                } else {
                                    MaterialTheme.colorScheme.background
                                },
                                contentColor = MaterialTheme.colorScheme.onBackground
                            ),
                            onClick = { isHeadingColourPickerVisible.value = true }
                        ) {
                            Text(text = "Select Colour")
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "Size:",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W500
                            )
                            Slider(
                                colors = SliderDefaults.colors(
                                    activeTrackColor = MaterialTheme.colorScheme.tertiary,
                                    thumbColor = MaterialTheme.colorScheme.tertiary
                                ),
                                value = flowHeaderHeading.value.fontSize?.toFloat() ?: 60.toFloat(),
                                onValueChange = { value ->
                                    editTransparency.value = true
                                    updateFlowHeaderHeading(
                                        flowHeaderHeading.value.copy(
                                            fontSize = value.roundToInt()
                                        )
                                    )
                                },
                                onValueChangeFinished = { editTransparency.value = false },
                                valueRange = 10f..80f
                            )
                        }
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
                                value = flowHeaderHeading.value.text,
                                onValueChange = { newValue ->
                                    updateFlowHeaderHeading(
                                        flowHeaderHeading.value.copy(text = newValue)
                                    )
                                },
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
                        ElevatedButton(
                            colors = ButtonDefaults.elevatedButtonColors(
                                containerColor = if (editTransparency.value) {
                                    Color.Transparent
                                } else {
                                    MaterialTheme.colorScheme.background
                                },
                                contentColor = MaterialTheme.colorScheme.onBackground
                            ),
                            onClick = { isSubHeadingColourPickerVisible.value = true }
                        ) {
                            Text(text = "Select Colour")
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "Size:",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.W500
                            )
                            Slider(
                                colors = SliderDefaults.colors(
                                    activeTrackColor = MaterialTheme.colorScheme.tertiary,
                                    thumbColor = MaterialTheme.colorScheme.tertiary
                                ),
                                value = flowHeaderSubHeading.value.fontSize?.toFloat()
                                    ?: 20.toFloat(),
                                onValueChange = { value ->
                                    editTransparency.value = true
                                    updateFlowHeaderSubHeading(
                                        flowHeaderSubHeading.value.copy(
                                            fontSize = value.roundToInt()
                                        )
                                    )
                                },
                                onValueChangeFinished = { editTransparency.value = false },
                                valueRange = 10f..80f
                            )
                        }
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
                                value = flowHeaderSubHeading.value.text,
                                onValueChange = { newValue ->
                                    updateFlowHeaderSubHeading(
                                        flowHeaderSubHeading.value.copy(text = newValue)
                                    )
                                },
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