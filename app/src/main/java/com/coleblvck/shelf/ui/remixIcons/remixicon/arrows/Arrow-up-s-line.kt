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

public val ArrowsGroup.`Arrow-up-s-line`: ImageVector
    get() {
        if (`_arrow-up-s-line` != null) {
            return `_arrow-up-s-line`!!
        }
        `_arrow-up-s-line` = Builder(name = "Arrow-up-s-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 10.8284f)
                lineTo(7.0502f, 15.7782f)
                lineTo(5.636f, 14.364f)
                lineTo(11.9999f, 8.0f)
                lineTo(18.3639f, 14.364f)
                lineTo(16.9497f, 15.7782f)
                lineTo(11.9999f, 10.8284f)
                close()
            }
        }
        .build()
        return `_arrow-up-s-line`!!
    }

private var `_arrow-up-s-line`: ImageVector? = null
