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

public val MediaGroup.`Speed-mini-line`: ImageVector
    get() {
        if (`_speed-mini-line` != null) {
            return `_speed-mini-line`!!
        }
        `_speed-mini-line` = Builder(name = "Speed-mini-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0319f, 11.9999f)
                lineTo(6.0f, 9.8598f)
                verticalLineTo(14.1401f)
                lineTo(9.0319f, 11.9999f)
                close()
                moveTo(4.7883f, 17.4434f)
                curveTo(4.704f, 17.503f, 4.6033f, 17.535f, 4.5f, 17.535f)
                curveTo(4.2239f, 17.535f, 4.0f, 17.3111f, 4.0f, 17.035f)
                verticalLineTo(6.9649f)
                curveTo(4.0f, 6.8616f, 4.032f, 6.7609f, 4.0915f, 6.6765f)
                curveTo(4.2508f, 6.4509f, 4.5627f, 6.3972f, 4.7883f, 6.5564f)
                lineTo(11.9213f, 11.5914f)
                curveTo(11.9679f, 11.6243f, 12.0086f, 11.665f, 12.0415f, 11.7116f)
                curveTo(12.2007f, 11.9372f, 12.1469f, 12.2492f, 11.9213f, 12.4084f)
                lineTo(4.7883f, 17.4434f)
                close()
                moveTo(15.0f, 14.1401f)
                lineTo(18.0319f, 11.9999f)
                lineTo(15.0f, 9.8598f)
                verticalLineTo(14.1401f)
                close()
                moveTo(13.0f, 6.9649f)
                curveTo(13.0f, 6.8616f, 13.032f, 6.7609f, 13.0915f, 6.6765f)
                curveTo(13.2508f, 6.4509f, 13.5627f, 6.3972f, 13.7883f, 6.5564f)
                lineTo(20.9213f, 11.5914f)
                curveTo(20.9679f, 11.6243f, 21.0086f, 11.665f, 21.0415f, 11.7116f)
                curveTo(21.2007f, 11.9372f, 21.1469f, 12.2492f, 20.9213f, 12.4084f)
                lineTo(13.7883f, 17.4434f)
                curveTo(13.704f, 17.503f, 13.6033f, 17.535f, 13.5f, 17.535f)
                curveTo(13.2239f, 17.535f, 13.0f, 17.3111f, 13.0f, 17.035f)
                verticalLineTo(6.9649f)
                close()
            }
        }
        .build()
        return `_speed-mini-line`!!
    }

private var `_speed-mini-line`: ImageVector? = null
