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

public val MediaGroup.`Skip-back-line`: ImageVector
    get() {
        if (`_skip-back-line` != null) {
            return `_skip-back-line`!!
        }
        `_skip-back-line` = Builder(name = "Skip-back-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                curveTo(7.5523f, 4.0f, 8.0f, 4.4477f, 8.0f, 5.0f)
                verticalLineTo(11.3333f)
                lineTo(18.2227f, 4.5182f)
                curveTo(18.4524f, 4.3651f, 18.7628f, 4.4271f, 18.916f, 4.6569f)
                curveTo(18.9708f, 4.739f, 19.0f, 4.8355f, 19.0f, 4.9343f)
                verticalLineTo(19.0657f)
                curveTo(19.0f, 19.3419f, 18.7761f, 19.5657f, 18.5f, 19.5657f)
                curveTo(18.4013f, 19.5657f, 18.3048f, 19.5365f, 18.2227f, 19.4818f)
                lineTo(8.0f, 12.6667f)
                verticalLineTo(19.0f)
                curveTo(8.0f, 19.5523f, 7.5523f, 20.0f, 7.0f, 20.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.4477f, 6.4477f, 4.0f, 7.0f, 4.0f)
                close()
                moveTo(17.0f, 7.737f)
                lineTo(10.6056f, 12.0f)
                lineTo(17.0f, 16.263f)
                verticalLineTo(7.737f)
                close()
            }
        }
        .build()
        return `_skip-back-line`!!
    }

private var `_skip-back-line`: ImageVector? = null
