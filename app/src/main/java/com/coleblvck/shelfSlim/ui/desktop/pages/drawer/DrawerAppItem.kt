package com.coleblvck.shelfSlim.ui.desktop.pages.drawer

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.ui.desktop.pages.drawer.appCard.AppCard
import com.coleblvck.shelfSlim.ui.desktop.pages.drawer.appCard.AppCardLongPressDialog
import com.coleblvck.shelfSlim.utils.Utils

enum class AppCardType {
    BOX, STRIP
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DrawerAppItem(
    app: App,
    appCardType: AppCardType
) {
    val context = LocalContext.current

    val showThisAppLongPressDialog = remember {
        mutableStateOf(false)
    }

    when {
        showThisAppLongPressDialog.value -> AppCardLongPressDialog(onDismiss = {
            showThisAppLongPressDialog.value = false
        }, app = app)
    }

    AppCard(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = {
                    Utils.launchApp(app.packageName, context)
                },
                onLongClick = { showThisAppLongPressDialog.value = true }
            ),
        app = app,
        appCardType = appCardType
    )
}