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

public val MediaGroup.`Skip-forward-line`: ImageVector
    get() {
        if (`_skip-forward-line` != null) {
            return `_skip-forward-line`!!
        }
        `_skip-forward-line` = Builder(name = "Skip-forward-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.6667f)
                lineTo(5.7773f, 19.4818f)
                curveTo(5.5476f, 19.6349f, 5.2372f, 19.5729f, 5.084f, 19.3431f)
                curveTo(5.0292f, 19.261f, 5.0f, 19.1645f, 5.0f, 19.0657f)
                verticalLineTo(4.9343f)
                curveTo(5.0f, 4.6581f, 5.2239f, 4.4343f, 5.5f, 4.4343f)
                curveTo(5.5987f, 4.4343f, 5.6952f, 4.4635f, 5.7773f, 4.5182f)
                lineTo(16.0f, 11.3333f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 4.4477f, 16.4477f, 4.0f, 17.0f, 4.0f)
                curveTo(17.5523f, 4.0f, 18.0f, 4.4477f, 18.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.5523f, 17.5523f, 20.0f, 17.0f, 20.0f)
                curveTo(16.4477f, 20.0f, 16.0f, 19.5523f, 16.0f, 19.0f)
                verticalLineTo(12.6667f)
                close()
                moveTo(7.0f, 7.737f)
                verticalLineTo(16.263f)
                lineTo(13.3944f, 12.0f)
                lineTo(7.0f, 7.737f)
                close()
            }
        }
        .build()
        return `_skip-forward-line`!!
    }

private var `_skip-forward-line`: ImageVector? = null
