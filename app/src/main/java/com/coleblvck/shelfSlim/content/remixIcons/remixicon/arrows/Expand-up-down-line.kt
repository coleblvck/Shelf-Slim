package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-up-down-line`: ImageVector
    get() {
        if (`_expand-up-down-line` != null) {
            return `_expand-up-down-line`!!
        }
        `_expand-up-down-line` = Builder(name = "Expand-up-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2072f, 9.0428f)
                lineTo(12.0001f, 2.8357f)
                lineTo(5.793f, 9.0428f)
                lineTo(7.2072f, 10.457f)
                lineTo(12.0001f, 5.6641f)
                lineTo(16.793f, 10.457f)
                lineTo(18.2072f, 9.0428f)
                close()
                moveTo(5.7928f, 14.9572f)
                lineTo(11.9999f, 21.1643f)
                lineTo(18.207f, 14.9572f)
                lineTo(16.7928f, 13.543f)
                lineTo(11.9999f, 18.3359f)
                lineTo(7.207f, 13.543f)
                lineTo(5.7928f, 14.9572f)
                close()
            }
        }
        .build()
        return `_expand-up-down-line`!!
    }

private var `_expand-up-down-line`: ImageVector? = null
