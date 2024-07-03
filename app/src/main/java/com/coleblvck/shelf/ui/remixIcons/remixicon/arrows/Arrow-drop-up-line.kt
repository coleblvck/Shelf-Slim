package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-drop-up-line`: ImageVector
    get() {
        if (`_arrow-drop-up-line` != null) {
            return `_arrow-drop-up-line`!!
        }
        `_arrow-drop-up-line` = Builder(name = "Arrow-drop-up-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.8284f)
                lineTo(9.1715f, 14.6569f)
                lineTo(7.7573f, 13.2426f)
                lineTo(12.0f, 9.0f)
                lineTo(16.2426f, 13.2426f)
                lineTo(14.8284f, 14.6569f)
                lineTo(12.0f, 11.8284f)
                close()
            }
        }
        .build()
        return `_arrow-drop-up-line`!!
    }

private var `_arrow-drop-up-line`: ImageVector? = null
