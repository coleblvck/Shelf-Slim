package com.coleblvck.shelfSlim.userInterface.desktop.hint

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import com.coleblvck.shelfSlim.userInterface.common.SpanText
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogColumnCard


@Composable
fun HintDialog(
    hintState: HintState,
) {
    if (hintState.isVisible.value) {
        Dialog(onDismissRequest = { hintState.isVisible.value = false }) {
            DialogColumnCard(
                headingText = "Hints/Updates",
                modifier = Modifier.verticalScroll(state = rememberScrollState())
            ) {
                for (inlineList: List<Any> in hintState.content.list()) {
                    if (inlineList.isNotEmpty())
                        SpanText(list = inlineList)
                }
            }
        }
    }
}