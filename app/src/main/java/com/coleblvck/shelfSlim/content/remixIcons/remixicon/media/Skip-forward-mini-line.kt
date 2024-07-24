package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Skip-forward-mini-line`: ImageVector
    get() {
        if (`_skip-forward-mini-line` != null) {
            return `_skip-forward-mini-line`!!
        }
        `_skip-forward-mini-line` = Builder(name = "Skip-forward-mini-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0319f, 12.0f)
                lineTo(9.0f, 9.8598f)
                verticalLineTo(14.1402f)
                lineTo(12.0319f, 12.0f)
                close()
                moveTo(7.5f, 17.535f)
                curveTo(7.2239f, 17.535f, 7.0f, 17.3112f, 7.0f, 17.035f)
                verticalLineTo(6.965f)
                curveTo(7.0f, 6.8617f, 7.032f, 6.761f, 7.0915f, 6.6766f)
                curveTo(7.2508f, 6.451f, 7.5627f, 6.3972f, 7.7883f, 6.5565f)
                lineTo(14.9213f, 11.5915f)
                curveTo(14.9679f, 11.6244f, 15.0086f, 11.665f, 15.0415f, 11.7117f)
                curveTo(15.2007f, 11.9373f, 15.1469f, 12.2492f, 14.9213f, 12.4085f)
                lineTo(7.7883f, 17.4435f)
                curveTo(7.704f, 17.5031f, 7.6033f, 17.535f, 7.5f, 17.535f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 6.4477f, 16.4477f, 6.0f, 17.0f, 6.0f)
                curveTo(17.5523f, 6.0f, 18.0f, 6.4477f, 18.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(18.0f, 17.5523f, 17.5523f, 18.0f, 17.0f, 18.0f)
                curveTo(16.4477f, 18.0f, 16.0f, 17.5523f, 16.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_skip-forward-mini-line`!!
    }

private var `_skip-forward-mini-line`: ImageVector? = null
