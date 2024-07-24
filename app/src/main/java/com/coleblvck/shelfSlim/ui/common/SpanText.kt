package com.coleblvck.shelfSlim.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SpanText(
    list: List<Any>,
    fontSize: TextUnit = 18.sp,
    fontWeight: FontWeight = FontWeight(600),
    color: Color = Color.Unspecified
) {
    val getId: (ImageVector) -> String = {
        "image:${list.indexOf(it)}"
    }
    val annotatedString = buildAnnotatedString {
        for (item in list) {
            if (item is String) {
                append(item)
            } else {
                if (item is ImageVector) {
                    appendInlineContent(id = getId(item))
                }
            }
        }
    }

    val inlineContentMap = mutableMapOf<String, InlineTextContent>()
    for (item in list) {
        if (item is ImageVector) {
            inlineContentMap[getId(item)] = InlineTextContent(
                placeholder = Placeholder(20.sp, 20.sp, PlaceholderVerticalAlign.TextCenter)
            ) {
                DisplayIcon(vector = item)
            }
        }
    }
    Text(
        text = annotatedString, inlineContent = inlineContentMap,
        modifier = Modifier.padding(8.dp),
        fontSize = fontSize,
        fontWeight = fontWeight,
        color = color
    )
}