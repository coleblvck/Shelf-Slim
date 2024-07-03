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

public val MediaGroup.`Forward-end-mini-line`: ImageVector
    get() {
        if (`_forward-end-mini-line` != null) {
            return `_forward-end-mini-line`!!
        }
        `_forward-end-mini-line` = Builder(name = "Forward-end-mini-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveTo(20.4477f, 6.0f, 20.0f, 6.4477f, 20.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 17.5523f, 20.4477f, 18.0f, 21.0f, 18.0f)
                curveTo(21.5523f, 18.0f, 22.0f, 17.5523f, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.4477f, 21.5523f, 6.0f, 21.0f, 6.0f)
                close()
                moveTo(4.0f, 9.8598f)
                lineTo(7.0319f, 11.9999f)
                lineTo(4.0f, 14.1401f)
                verticalLineTo(9.8598f)
                close()
                moveTo(2.5f, 17.535f)
                curveTo(2.6033f, 17.535f, 2.704f, 17.503f, 2.7883f, 17.4434f)
                lineTo(9.9213f, 12.4084f)
                curveTo(10.1469f, 12.2492f, 10.2007f, 11.9372f, 10.0415f, 11.7116f)
                curveTo(10.0086f, 11.665f, 9.9679f, 11.6243f, 9.9213f, 11.5914f)
                lineTo(2.7883f, 6.5564f)
                curveTo(2.5627f, 6.3972f, 2.2508f, 6.4509f, 2.0915f, 6.6765f)
                curveTo(2.032f, 6.7609f, 2.0f, 6.8616f, 2.0f, 6.9649f)
                verticalLineTo(17.035f)
                curveTo(2.0f, 17.3111f, 2.2239f, 17.535f, 2.5f, 17.535f)
                close()
                moveTo(16.0319f, 11.9999f)
                lineTo(13.0f, 14.1401f)
                verticalLineTo(9.8598f)
                lineTo(16.0319f, 11.9999f)
                close()
                moveTo(11.0915f, 6.6765f)
                curveTo(11.032f, 6.7609f, 11.0f, 6.8616f, 11.0f, 6.9649f)
                verticalLineTo(17.035f)
                curveTo(11.0f, 17.3111f, 11.2239f, 17.535f, 11.5f, 17.535f)
                curveTo(11.6033f, 17.535f, 11.704f, 17.503f, 11.7883f, 17.4434f)
                lineTo(18.9213f, 12.4084f)
                curveTo(19.1469f, 12.2492f, 19.2007f, 11.9372f, 19.0415f, 11.7116f)
                curveTo(19.0086f, 11.665f, 18.9679f, 11.6243f, 18.9213f, 11.5914f)
                lineTo(11.7883f, 6.5564f)
                curveTo(11.5627f, 6.3972f, 11.2508f, 6.4509f, 11.0915f, 6.6765f)
                close()
            }
        }
        .build()
        return `_forward-end-mini-line`!!
    }

private var `_forward-end-mini-line`: ImageVector? = null
