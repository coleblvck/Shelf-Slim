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

public val ArrowsGroup.`Corner-left-up-line`: ImageVector
    get() {
        if (`_corner-left-up-line` != null) {
            return `_corner-left-up-line`!!
        }
        `_corner-left-up-line` = Builder(name = "Corner-left-up-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0001f, 19.0001f)
                lineTo(19.0f, 19.0002f)
                lineTo(19.0f, 17.0002f)
                lineTo(12.0001f, 17.0001f)
                lineTo(12.0f, 6.8283f)
                lineTo(15.9498f, 10.778f)
                lineTo(17.364f, 9.3638f)
                lineTo(11.0f, 2.9999f)
                lineTo(4.6361f, 9.3638f)
                lineTo(6.0503f, 10.778f)
                lineTo(10.0f, 6.8282f)
                lineTo(10.0001f, 19.0001f)
                close()
            }
        }
        .build()
        return `_corner-left-up-line`!!
    }

private var `_corner-left-up-line`: ImageVector? = null
