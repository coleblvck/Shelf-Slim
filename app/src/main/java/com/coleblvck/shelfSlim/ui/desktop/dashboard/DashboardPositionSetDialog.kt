package com.coleblvck.shelfSlim.ui.desktop.dashboard

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.coleblvck.shelfSlim.ui.common.ConditionalColorButtonCard
import com.coleblvck.shelfSlim.ui.common.DialogColumnCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardPositionSetDialog(
    onDismiss: () -> Unit,
    currentDashboardPosition: State<String>,
    updateDashboardPosition: (String) -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            DialogColumnCard(
                headingText = "Dashboard Position"
            ) {
                for (positionType in DashboardPosition.entries) {
                    ConditionalColorButtonCard(
                        selectionColorCondition = getDashboardPosition(currentDashboardPosition.value) == positionType,
                        text = positionType.name
                    ) {
                        updateDashboardPosition(positionType.name)
                    }
                }
            }
        }
    )
}