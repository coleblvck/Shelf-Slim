package com.coleblvck.shelfSlim.userInterface.common.cards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Logos
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos.`Firefox-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Close-circle-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Search-2-fill`
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha
import com.coleblvck.shelfSlim.utils.Utils


@Composable
fun SearchCard(
    searchText: String,
    searchCallback: (String) -> Unit,
) {
    val context = LocalContext.current
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
        Row(
            modifier = Modifier.padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Icon(
                RemixIcon.System.`Search-2-fill`,
                contentDescription = "Decorative Search Icon",
                modifier = Modifier
                    .size(30.dp)
            )
            BasicTextField(
                value = searchText,
                onValueChange = searchCallback,
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
                Icon(
                    RemixIcon.Logos.`Firefox-fill`,
                    contentDescription = "Web Search Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { Utils.launchWebSearch(searchText, context) }
                )
                Icon(
                    RemixIcon.System.`Close-circle-fill`,
                    contentDescription = "Search Clear Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { searchCallback("") }
                )
            }
        }
    }
}