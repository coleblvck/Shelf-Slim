package com.coleblvck.shelf.ui.desktop

import android.app.Activity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelf.content.App
import com.coleblvck.shelf.content.AppIcon
import com.coleblvck.shelf.content.openAppSettings
import com.coleblvck.shelf.ui.theme.colorWithAlpha


@Composable
fun Blinds(apps: List<App>) {
    val appList = remember {
        apps.sortedBy { ap: App -> ap.name }
    }
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),

        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground,
        ),
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .wrapContentHeight(), verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(
                count = appList.size,
                contentType = { appList[0] },
                key = { appList[it].packageName },
                itemContent = { index ->
                    BlindsAppItem(app = appList[index])
                }
            )
        }
    }
}

@Composable
fun BlindsAppItem(app: App) {

    val context = LocalContext.current
    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) {

        }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                val intent = context.packageManager.getLaunchIntentForPackage(app.packageName)
                intent?.let { launcher.launch(intent) }
            },
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground,
        ),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AppIcon(app = app, modifier = Modifier.clickable {
                openAppSettings(context as Activity, app)
            })
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text = app.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}