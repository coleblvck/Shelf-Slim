package com.coleblvck.shelfSlim.ui.desktop.pages.drawer

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.coleblvck.shelfSlim.ui.common.ConditionalColorButtonCard
import com.coleblvck.shelfSlim.ui.common.DialogColumnCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerTypeDialog(
    onDismiss: () -> Unit,
    currentDrawerType: State<String>,
    updateDrawerType: (String) -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            DialogColumnCard(
                headingText = "Drawer Type"
            ) {
                for (drawerType in DrawerType.entries) {
                    ConditionalColorButtonCard(
                        selectionColorCondition = getDrawerType(currentDrawerType.value) == drawerType,
                        text = drawerType.name
                    ) {
                        updateDrawerType(drawerType.name)
                    }
                }
            }
        }
    )
}