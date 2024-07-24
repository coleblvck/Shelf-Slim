package com.coleblvck.shelfSlim.ui.desktop.hint

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import com.coleblvck.shelfSlim.content.getIconMapVector
import com.coleblvck.shelfSlim.ui.common.SpanText
import com.coleblvck.shelfSlim.ui.common.DialogColumnCard


@Composable
fun HintDialog(
    isHintVisible: Boolean,
    updateHintVisibility: (Boolean) -> Unit,
    dashboardIsHorizontal: State<Boolean>,
    dashboardPosition: State<String>,
    currentCustomFunctionIcon: State<String>
) {
    val dashboardSwipeDirection: () -> String = {
        if (dashboardIsHorizontal.value) {
            "left"
        } else {
            "up"
        }
    }
    val hintContent = hintContent(
        dashboardPosition = dashboardPosition.value.lowercase(),
        dashIsHorizontal = dashboardIsHorizontal.value,
        dashboardSwipeDirection = dashboardSwipeDirection(),
        currentActionIcon = getIconMapVector(currentCustomFunctionIcon.value)
    )
    if (isHintVisible) {
        Dialog(onDismissRequest = { updateHintVisibility(false) }) {
            DialogColumnCard(
                headingText = "Hints/Updates",
                modifier = Modifier.verticalScroll(state = rememberScrollState())
            ) {
                for (inlineList: List<Any> in hintContent) {
                    if (inlineList.isNotEmpty())
                        SpanText(list = inlineList)
                }
            }
        }
    }
}