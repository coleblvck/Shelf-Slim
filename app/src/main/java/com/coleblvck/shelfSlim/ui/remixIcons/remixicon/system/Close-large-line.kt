package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Close-large-line`: ImageVector
    get() {
        if (`_close-large-line` != null) {
            return `_close-large-line`!!
        }
        `_close-large-line` = Builder(name = "Close-large-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5859f, 12.0f)
                lineTo(2.793f, 4.2071f)
                lineTo(4.2072f, 2.7929f)
                lineTo(12.0001f, 10.5857f)
                lineTo(19.793f, 2.7929f)
                lineTo(21.2072f, 4.2071f)
                lineTo(13.4143f, 12.0f)
                lineTo(21.2072f, 19.7928f)
                lineTo(19.793f, 21.2071f)
                lineTo(12.0001f, 13.4142f)
                lineTo(4.2072f, 21.2071f)
                lineTo(2.793f, 19.7928f)
                lineTo(10.5859f, 12.0f)
                close()
            }
        }
        .build()
        return `_close-large-line`!!
    }

private var `_close-large-line`: ImageVector? = null
