package com.coleblvck.shelfSlim.ui.desktop.flow.flowHeader

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.alpha
import androidx.core.graphics.blue
import androidx.core.graphics.green
import androidx.core.graphics.red
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.ui.common.toColour
import com.coleblvck.shelfSlim.ui.theme.colorWithAlpha


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FlowHeader(
    shouldPadPagerItemHorizontally: State<Boolean>,
    flowHeaderHeading: State<Text>,
    updateFlowHeaderHeading: (Text) -> Unit,
    flowHeaderSubHeading: State<Text>,
    updateFlowHeaderSubHeading: (Text) -> Unit,
    flowHeaderBackground: State<Int?>,
    updateFlowHeaderBackground: (Int?) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
) {
    HeaderEditDialog(
        flowHeaderHeading = flowHeaderHeading,
        updateFlowHeaderHeading = updateFlowHeaderHeading,
        flowHeaderSubHeading = flowHeaderSubHeading,
        updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
        flowHeaderBackground = flowHeaderBackground,
        updateFlowHeaderBackground = updateFlowHeaderBackground,
        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
        updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility
    )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = if (shouldPadPagerItemHorizontally.value) {
                    12.dp
                } else {
                    0.dp
                }
            )
            .combinedClickable(
                onClick = {},
                onDoubleClick = { updateHintVisibility(true) },
                onLongClick = { updateFlowHeaderEditDialogVisibility(true) },
            ),
        colors = CardDefaults.cardColors(
            containerColor = flowHeaderBackground.value?.toColour()
                ?: colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground
        ),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (flowHeaderHeading.value.text != "") {
                    val headingColourInt = flowHeaderHeading.value.colour
                    val headingFontSize = flowHeaderHeading.value.fontSize
                    Text(
                        color = headingColourInt?.toColour() ?: Color.Unspecified,
                        text = flowHeaderHeading.value.text,
                        fontSize = headingFontSize?.sp ?: 60.sp,
                        fontWeight = FontWeight.W900
                    )
                }
                if (flowHeaderSubHeading.value.text != "") {
                    val subHeadingColour = flowHeaderSubHeading.value.colour
                    val subHeadingFontSize = flowHeaderSubHeading.value.fontSize
                    Text(
                        color = if (subHeadingColour != null) {
                            Color(
                                subHeadingColour.red,
                                subHeadingColour.green,
                                subHeadingColour.blue,
                                subHeadingColour.alpha
                            )
                        } else {
                            Color.Unspecified
                        },
                        text = flowHeaderSubHeading.value.text,
                        fontSize = subHeadingFontSize?.sp ?: 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
            }
        }
    }
}
