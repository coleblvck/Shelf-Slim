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

public val ArrowsGroup.`Corner-up-left-line`: ImageVector
    get() {
        if (`_corner-up-left-line` != null) {
            return `_corner-up-left-line`!!
        }
        `_corner-up-left-line` = Builder(name = "Corner-up-left-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 10.0001f)
                lineTo(19.0003f, 19.0f)
                lineTo(17.0003f, 19.0f)
                lineTo(17.0002f, 12.0001f)
                lineTo(6.8283f, 12.0f)
                lineTo(10.7781f, 15.9497f)
                lineTo(9.3638f, 17.364f)
                lineTo(2.9999f, 11.0f)
                lineTo(9.3638f, 4.636f)
                lineTo(10.7781f, 6.0503f)
                lineTo(6.8283f, 10.0f)
                lineTo(19.0001f, 10.0001f)
                close()
            }
        }
        .build()
        return `_corner-up-left-line`!!
    }

private var `_corner-up-left-line`: ImageVector? = null
