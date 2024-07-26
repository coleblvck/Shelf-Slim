package com.coleblvck.shelfSlim.ui.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.core.graphics.ColorUtils
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import com.coleblvck.shelfSlim.content.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.system.`Check-fill`
import kotlin.math.roundToInt

@Composable
fun ColourPicker(
    initialColour: Color,
    colorReceivingCallback: (Color) -> Unit = {},
    onDismiss: () -> Unit = {}
) {
    val currentColour = initialColour.toArgb()
    val red = remember {
        mutableIntStateOf(
            currentColour.red
        )
    }
    val green = remember {
        mutableIntStateOf(
            currentColour.green
        )
    }
    val blue = remember {
        mutableIntStateOf(
            currentColour.blue
        )
    }
    val alpha = remember {
        mutableIntStateOf(
            currentColour.alpha
        )
    }
    val pickedColor = remember {
        derivedStateOf {
            Color(
                red = red.intValue,
                green = green.intValue,
                blue = blue.intValue,
                alpha = alpha.intValue
            )
        }
    }

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = pickedColor.value,
                    contentColor = if (pickedColor.value.toArgb().isDark()) {
                        Color.White
                    } else {
                        Color.Black
                    }
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(

                        fontSize = 16.sp,
                        fontWeight = FontWeight.W500,
                        text = Integer.toHexString(pickedColor.value.toArgb()).uppercase()
                    )
                    ActionIcon(
                        vector = RemixIcon.System.`Check-fill`,
                        action = {
                            colorReceivingCallback(pickedColor.value)
                            onDismiss()
                        }
                    )
                }
            }
            Slider(
                colors = SliderDefaults.colors(
                    activeTrackColor = Color.Red,
                    thumbColor = Color.Red
                ),
                valueRange = 0f..255f,
                value = red.intValue.toFloat(),
                onValueChange = { value -> red.intValue = value.roundToInt() },
            )
            Slider(
                colors = SliderDefaults.colors(
                    activeTrackColor = Color.Green,
                    thumbColor = Color.Green
                ),
                valueRange = 0f..255f,
                value = green.intValue.toFloat(),
                onValueChange = { value -> green.intValue = value.roundToInt() },
            )
            Slider(
                colors = SliderDefaults.colors(
                    activeTrackColor = Color.Blue,
                    thumbColor = Color.Blue
                ),
                valueRange = 0f..255f,
                value = blue.intValue.toFloat(),
                onValueChange = { value -> blue.intValue = value.roundToInt() },
            )
            Slider(
                colors = SliderDefaults.colors(
                    activeTrackColor = Color.White,
                    thumbColor = Color.White
                ),
                valueRange = 0f..255f,
                value = alpha.intValue.toFloat(),
                onValueChange = { value -> alpha.intValue = value.roundToInt() },
            )
        }
    }
}

fun Int.toColour(): Color = Color(
    this.red,
    this.green,
    this.blue,
    this.alpha
)

fun Int.isDark(): Boolean =
    ColorUtils.calculateLuminance(this) < 0.5

@Composable
fun ColourPickerDialog(
    isVisible: State<Boolean>,
    onDismiss: () -> Unit,
    initialColour: Color = Color(255, 255, 255, 255),
    colorReceivingCallback: (Color) -> Unit = {}
) {
    if (isVisible.value) {
        Dialog(onDismissRequest = onDismiss) {
            ColourPicker(
                initialColour = initialColour,
                colorReceivingCallback = colorReceivingCallback,
                onDismiss = onDismiss
            )
        }
    }
}