package com.coleblvck.shelfSlim.userInterface.common.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.userInterface.common.DisplayIcon

@Composable
fun DialogColumnCard(
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    headingText: String? = null,
    headingIcon: ImageVector? = null,
    content: @Composable () -> Unit
) {

    ElevatedCard(
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary,
        ),
    ) {
        Column(
            modifier = modifier
                .wrapContentHeight()
                .padding(24.dp),
            horizontalAlignment = horizontalAlignment,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            if (headingText != null || headingIcon != null)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (headingIcon != null) {
                        DisplayIcon(
                            vector = headingIcon
                        )
                    }
                    if (headingText != null) {
                        Text(
                            text = headingText,
                            fontSize = 24.sp,
                            fontWeight = FontWeight(600),
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
            content()
        }
    }
}




