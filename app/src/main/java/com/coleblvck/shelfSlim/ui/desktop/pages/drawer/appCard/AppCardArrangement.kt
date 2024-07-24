package com.coleblvck.shelfSlim.ui.desktop.pages.drawer.appCard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.coleblvck.shelfSlim.data.classes.App
import com.coleblvck.shelfSlim.ui.desktop.pages.drawer.AppCardType


@Composable
fun AppCardGridArrangement(
    app: App
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        AppCardContent(
            app = app,
            cardType = AppCardType.BOX
        )
    }
}

@Composable
fun AppCardBlindArrangement(
    app: App
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        AppCardContent(
            app = app,
            cardType = AppCardType.STRIP
        )
    }
}