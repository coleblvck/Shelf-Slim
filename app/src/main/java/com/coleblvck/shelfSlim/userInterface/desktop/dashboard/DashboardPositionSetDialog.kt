package com.coleblvck.shelfSlim.userInterface.desktop.dashboard

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogButtonCard
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogColumnCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardPositionSetDialog(
    onDismiss: () -> Unit,
    currentDashboardPosition: String,
    updateDashboardPosition: (String) -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            DialogColumnCard(
                headingText = "Dashboard Position"
            ) {
                for (positionType in DashboardPosition.entries) {
                    DialogButtonCard(
                        selectionColorCondition = getDashboardPosition(currentDashboardPosition) == positionType,
                        text = positionType.name
                    ) {
                        updateDashboardPosition(positionType.name)
                    }
                }
            }
        }
    )
}