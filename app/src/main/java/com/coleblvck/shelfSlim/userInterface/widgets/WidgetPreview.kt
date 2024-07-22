package com.coleblvck.shelfSlim.userInterface.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.coerceIn
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.coleblvck.shelfSlim.contentManagement.AppIcon
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetPreviewData


@Composable
fun WidgetPreview(
    modifier: Modifier,
    appWidgetPreviewData: AppWidgetPreviewData,
) {

    ElevatedCard(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            ElevatedCard(
                modifier = Modifier.height(50.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Row(
                    modifier = Modifier.padding(4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    if (appWidgetPreviewData.icon != null) {
                        AppIcon(
                            modifier = Modifier.padding(0.dp),
                            model = appWidgetPreviewData.icon,
                        )
                    }
                    var fontSize by remember {
                        mutableStateOf(24.sp)
                    }
                    var readyToDraw by remember {
                        mutableStateOf(false)
                    }
                    Text(
                        text = "${appWidgetPreviewData.appName}: ${appWidgetPreviewData.widgetLabel}",
                        fontSize = fontSize,
                        textAlign = TextAlign.Left,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .weight(1f)
                            .drawWithContent {
                                if (readyToDraw) drawContent()
                            },
                        onTextLayout = { textLayoutResult: TextLayoutResult ->
                            if (textLayoutResult.didOverflowHeight) {
                                fontSize *= 0.9
                            } else {
                                readyToDraw = true
                            }
                        }
                    )
                }
            }
            if (appWidgetPreviewData.previewImage != null) {
                AsyncImage(
                    model = appWidgetPreviewData.previewImage,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .height(
                            appWidgetPreviewData.providerInfo.minHeight.dp.coerceIn(
                                60.dp,
                                200.dp
                            )
                        ),
                    contentDescription = ""
                )
            }
        }

    }

}