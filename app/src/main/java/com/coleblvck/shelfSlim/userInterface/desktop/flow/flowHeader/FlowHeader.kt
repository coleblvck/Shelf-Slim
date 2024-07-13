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
import com.coleblvck.shelfSlim.userInterface.desktop.flow.FlowState
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintState
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FlowHeader(
    flowState: FlowState,
    hintState: HintState,
) {
    HeaderEditDialog(flowState = flowState)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .combinedClickable(
                onClick = {},
                onDoubleClick = { hintState.isVisible.value = true },
                onLongClick = { flowState.header.setEditDialogVisibility(true) },
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
                if (flowState.header.heading.value != "") {
                    Text(
                        text = flowState.header.heading.value,
                        fontSize = 60.sp,
                        fontWeight = FontWeight.W900
                    )
                }
                if (flowState.header.subHeading.value != "") {
                    Text(
                        text = flowState.header.subHeading.value,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
            }
        }
    }
}
