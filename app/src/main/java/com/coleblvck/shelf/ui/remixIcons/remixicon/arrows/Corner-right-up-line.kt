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

public val ArrowsGroup.`Corner-right-up-line`: ImageVector
    get() {
        if (`_corner-right-up-line` != null) {
            return `_corner-right-up-line`!!
        }
        `_corner-right-up-line` = Builder(name = "Corner-right-up-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9999f, 19.0001f)
                lineTo(5.0f, 19.0002f)
                lineTo(5.0f, 17.0002f)
                lineTo(11.9999f, 17.0001f)
                lineTo(12.0f, 6.8283f)
                lineTo(8.0503f, 10.778f)
                lineTo(6.6361f, 9.3638f)
                lineTo(13.0f, 2.9999f)
                lineTo(19.364f, 9.3638f)
                lineTo(17.9498f, 10.778f)
                lineTo(14.0f, 6.8282f)
                lineTo(13.9999f, 19.0001f)
                close()
            }
        }
        .build()
        return `_corner-right-up-line`!!
    }

private var `_corner-right-up-line`: ImageVector? = null
