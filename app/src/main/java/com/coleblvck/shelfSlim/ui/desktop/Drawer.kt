package com.coleblvck.shelfSlim.ui.desktop

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.coleblvck.shelfSlim.content.App
import com.coleblvck.shelfSlim.ui.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.Logos
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos.`Firefox-fill`
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system.`Close-circle-fill`
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system.`Search-eye-fill`
import com.coleblvck.shelfSlim.ui.theme.colorWithAlpha
import com.coleblvck.shelfSlim.utils.Utils

enum class DrawerType {
    BLINDS, BOXES, GRID
}

val defaultDrawerType: DrawerType = DrawerType.BLINDS

var currentDrawerType: DrawerType = DrawerType.BOXES


@Composable
fun Drawer(
    type: DrawerType,
    apps: LazyPagingItems<App>,
    searchCallback: (String) -> Unit,
    searchText: String
) {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),

            colors = CardDefaults.cardColors(
                colorWithAlpha(MaterialTheme.colorScheme.tertiary).compositeOver(MaterialTheme.colorScheme.tertiary),
                MaterialTheme.colorScheme.onTertiary,
                MaterialTheme.colorScheme.tertiary,
                MaterialTheme.colorScheme.onTertiary,
            ),
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                HorizontalSpacer(modifier = Modifier.width(12.dp))
                Icon(
                    RemixIcon.System.`Search-eye-fill`,
                    contentDescription = "Search Icon",
                    modifier = Modifier
                        .size(30.dp)
                )
                BasicTextField(
                    value = searchText,
                    onValueChange = { searchCallback(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .weight(1f),
                    visualTransformation = VisualTransformation.None,
                    singleLine = true,
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onTertiary,
                    ),
                    cursorBrush = SolidColor(MaterialTheme.colorScheme.onTertiary)

                )
                if (searchText != "") {
                    HorizontalSpacer(modifier = Modifier.width(12.dp))
                    Icon(
                        RemixIcon.Logos.`Firefox-fill`,
                        contentDescription = "Search Icon",
                        modifier = Modifier
                            .size(30.dp).clickable { Utils.launchWebSearch(searchText, context) }
                    )
                }
                HorizontalSpacer(modifier = Modifier.width(12.dp))
                Icon(
                    RemixIcon.System.`Close-circle-fill`,
                    contentDescription = "Search Icon",
                    modifier = Modifier
                        .size(30.dp).clickable { searchCallback("") }
                )
                HorizontalSpacer(modifier = Modifier.width(12.dp))
            }
        }
        when (type) {
            DrawerType.BLINDS -> {
                Blinds(apps = apps)
            }

            DrawerType.BOXES -> {
                Boxes(apps = apps)
            }

            DrawerType.GRID -> {
                Blinds(apps = apps)
            }
        }
    }

}