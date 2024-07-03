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

public val ArrowsGroup.`Arrow-drop-left-line`: ImageVector
    get() {
        if (`_arrow-drop-left-line` != null) {
            return `_arrow-drop-left-line`!!
        }
        `_arrow-drop-left-line` = Builder(name = "Arrow-drop-left-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8284f, 12.0005f)
                lineTo(14.6569f, 14.8289f)
                lineTo(13.2426f, 16.2431f)
                lineTo(9.0f, 12.0005f)
                lineTo(13.2426f, 7.7578f)
                lineTo(14.6569f, 9.172f)
                lineTo(11.8284f, 12.0005f)
                close()
            }
        }
        .build()
        return `_arrow-drop-left-line`!!
    }

private var `_arrow-drop-left-line`: ImageVector? = null
