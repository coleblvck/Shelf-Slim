package com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FlowHeader(
    flowHeaderHeading: String,
    updateFlowHeaderHeading: (String) -> Unit,
    flowHeaderSubHeading: String,
    updateFlowHeaderSubHeading: (String) -> Unit,
    flowHeaderEditDialogVisible: Boolean,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
) {
    HeaderEditDialog(
        flowHeaderHeading = flowHeaderHeading,
        updateFlowHeaderHeading = updateFlowHeaderHeading,
        flowHeaderSubHeading = flowHeaderSubHeading,
        updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
        updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility
    )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .combinedClickable(
                onClick = {},
                onDoubleClick = { updateHintVisibility(true) },
                onLongClick = { updateFlowHeaderEditDialogVisibility(true) },
            ),
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
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
                if (flowHeaderHeading != "") {
                    Text(
                        text = flowHeaderHeading,
                        fontSize = 60.sp,
                        fontWeight = FontWeight.W900
                    )
                }
                if (flowHeaderSubHeading != "") {
                    Text(
                        text = flowHeaderSubHeading,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
            }
        }
    }
}
