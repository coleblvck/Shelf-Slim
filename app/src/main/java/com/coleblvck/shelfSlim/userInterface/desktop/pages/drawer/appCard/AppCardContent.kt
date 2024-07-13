package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.appCard

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.AppCardType


@Composable
fun AppCardContent(
    app: App,
    cardType: AppCardType,
) {
    val context = LocalContext.current
    val iconModel = remember(context, app) {
        ImageRequest.Builder(context).apply {
            data(app.icon)
        }.build()
    }
    AsyncImage(
        model = iconModel,
        contentDescription = "${app.name} Icon",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .padding(8.dp)
            .size(40.dp)
    )
    Text(
        modifier = Modifier
            .padding(8.dp),
        text = app.name,
        fontSize = when (cardType) {
            AppCardType.BOX -> 12.sp
            AppCardType.STRIP -> 16.sp
        },
        fontWeight = FontWeight.Medium,
        maxLines = 4,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center
    )
}