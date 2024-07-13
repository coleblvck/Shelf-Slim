package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.appCard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Delete-bin-7-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Information-fill`
import com.coleblvck.shelfSlim.userInterface.common.ActionIcon
import com.coleblvck.shelfSlim.userInterface.common.cards.DialogColumnCard
import com.coleblvck.shelfSlim.utils.Utils


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppCardLongPressDialog(
    onDismiss: () -> Unit,
    app: App,
) {
    val context = LocalContext.current
    AlertDialog(
        onDismissRequest = onDismiss,
        content = {
            DialogColumnCard (
                headingText = app.name
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ActionIcon(
                        modifier = Modifier.size(40.dp),
                        vector = RemixIcon.System.`Information-fill`,
                        action = {
                            Utils.openAppSettings(packageName = app.packageName, context = context)
                            onDismiss()
                        }
                    )
                    ActionIcon(
                        modifier = Modifier.size(40.dp),
                        vector = RemixIcon.System.`Delete-bin-7-fill`,
                        action = {
                            Utils.uninstallApp(packageName = app.packageName, context = context)
                            onDismiss()
                        }
                    )
                }
            }
        }
    )
}
