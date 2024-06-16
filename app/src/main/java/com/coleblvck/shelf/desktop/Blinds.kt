package com.coleblvck.shelf.desktop

import android.graphics.Color
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.coleblvck.shelf.content.appList
import com.coleblvck.shelf.ui.theme.colorWithAlpha

@Composable
fun Blinds() {
    val apps = remember {
        appList
    }
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        items(
            items = apps.sortedBy { ap: App -> ap.name },
            itemContent = {
                BlindsAppItem(app = it)
            }
        )
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
            AppIcon(app = app)
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