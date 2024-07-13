package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.appCard

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.AppCardType
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha


@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    app: App,
    appCardType: AppCardType
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground,
        ),
        shape = when (appCardType) {
            AppCardType.BOX -> RoundedCornerShape(corner = CornerSize(8.dp))
            else -> CardDefaults.shape
        }
    ) {
        when (appCardType) {
            AppCardType.BOX -> AppCardGridArrangement(app = app)
            AppCardType.STRIP -> AppCardBlindArrangement(app = app)
        }
    }
}