package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogButtonCard
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogColumnCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerTypeDialog(
    onDismiss: () -> Unit,
    currentDrawerType: String,
    updateDrawerType: (String) -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            DialogColumnCard(
                headingText = "Drawer Type"
            ) {
                for (drawerType in DrawerType.entries) {
                    DialogButtonCard(
                        selectionColorCondition = getDrawerType(currentDrawerType) == drawerType,
                        text = drawerType.name
                    ) {
                        updateDrawerType(drawerType.name)
                    }
                }
            }
        }
    )
}