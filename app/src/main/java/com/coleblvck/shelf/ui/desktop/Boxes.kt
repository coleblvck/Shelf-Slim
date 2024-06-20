package com.coleblvck.shelf.ui.desktop

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelf.content.App
import com.coleblvck.shelf.content.AppIcon
import com.coleblvck.shelf.ui.theme.colorWithAlpha

@Composable
fun Boxes(apps: List<App>) {
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
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {


            items(
                count = appList.size,
                contentType = { appList[0] },
                key = { appList[it].packageName },
                itemContent = { index ->
                    BoxesAppItem(app = appList[index])
                }
            )
        }
    }
}


@Composable
fun BoxesAppItem(app: App) {

    val context = LocalContext.current
    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) {

        }

    ElevatedCard(
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
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            AppIcon(app = app, modifier = Modifier)
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text = app.name,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center
            )
        }
    }
}