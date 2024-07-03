package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Play-reverse-line`: ImageVector
    get() {
        if (`_play-reverse-line` != null) {
            return `_play-reverse-line`!!
        }
        `_play-reverse-line` = Builder(name = "Play-reverse-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6056f, 12.0001f)
                lineTo(14.0f, 7.7371f)
                verticalLineTo(16.263f)
                lineTo(7.6056f, 12.0001f)
                close()
                moveTo(4.6241f, 12.4161f)
                lineTo(15.2227f, 19.4818f)
                curveTo(15.4524f, 19.635f, 15.7629f, 19.5729f, 15.9161f, 19.3432f)
                curveTo(15.9708f, 19.261f, 16.0f, 19.1645f, 16.0f, 19.0658f)
                verticalLineTo(4.9343f)
                curveTo(16.0f, 4.6582f, 15.7762f, 4.4343f, 15.5f, 4.4343f)
                curveTo(15.4013f, 4.4343f, 15.3048f, 4.4636f, 15.2227f, 4.5183f)
                lineTo(4.6241f, 11.584f)
                curveTo(4.3943f, 11.7372f, 4.3322f, 12.0477f, 4.4854f, 12.2774f)
                curveTo(4.522f, 12.3323f, 4.5691f, 12.3795f, 4.6241f, 12.4161f)
                close()
            }
        }
        .build()
        return `_play-reverse-line`!!
    }

private var `_play-reverse-line`: ImageVector? = null
