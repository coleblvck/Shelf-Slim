package com.coleblvck.shelfSlim.userInterface.desktop.flow.flowNote

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlowNote(
    flowNoteText: State<String>,
    updateFlowNoteText: (String) -> Unit,
) {

    val enabled by remember {
        mutableStateOf(true)
    }
    val singleLine by remember {
        mutableStateOf(false)
    }
    val interactionSource = remember {
        MutableInteractionSource()
    }
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),
        colors = CardDefaults.elevatedCardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground
        )
    ) {
        BasicTextField(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize(),
            value = flowNoteText.value,
            onValueChange = updateFlowNoteText,
            visualTransformation = VisualTransformation.None,
            interactionSource = interactionSource,
            enabled = enabled,
            singleLine = singleLine,
            textStyle = TextStyle(
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onBackground,
            ),
            cursorBrush = SolidColor(MaterialTheme.colorScheme.onBackground)
        ) {
                innerTextField ->
            OutlinedTextFieldDefaults.DecorationBox(
                value = flowNoteText.value,
                innerTextField = innerTextField,
                enabled = enabled,
                singleLine = singleLine,
                visualTransformation = VisualTransformation.None,
                interactionSource = interactionSource,
                placeholder = {
                    Text(text = "Start typing to take a note...")
                },
            )
        }
    }
}