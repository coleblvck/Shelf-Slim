package com.coleblvck.shelfSlim.ui.desktop.hint

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.coleblvck.shelfSlim.content.getIconMapVector
import com.coleblvck.shelfSlim.ui.common.DialogColumnCard
import com.coleblvck.shelfSlim.ui.common.SpanText


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
    val context = LocalContext.current
    val url = "https://github.com/coleblvck"
    if (isHintVisible) {
        Dialog(onDismissRequest = { updateHintVisibility(false) }) {
            DialogColumnCard(
                headingText = "Hints/Updates",
                modifier = Modifier.verticalScroll(state = rememberScrollState())
            ) {
                for (inlineList: List<Any> in hintContent) {
                    if (inlineList.isNotEmpty()) {
                        SpanText(list = inlineList)
                    }
                }
                Text(
                    modifier = Modifier.padding(8.dp).clickable {
                        val webSearchIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(webSearchIntent)
                    },
                    text = "- Click this block of text to visit: github.com/coleblvck",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W600
                )
            }
        }
    }
}