package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Speed-fill`: ImageVector
    get() {
        if (`_speed-fill` != null) {
            return `_speed-fill`!!
        }
        `_speed-fill` = Builder(name = "Speed-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.3334f)
                lineTo(2.7773f, 19.4818f)
                curveTo(2.5476f, 19.635f, 2.2371f, 19.5729f, 2.084f, 19.3432f)
                curveTo(2.0292f, 19.261f, 2.0f, 19.1645f, 2.0f, 19.0658f)
                verticalLineTo(4.9343f)
                curveTo(2.0f, 4.6582f, 2.2239f, 4.4343f, 2.5f, 4.4343f)
                curveTo(2.5987f, 4.4343f, 2.6952f, 4.4636f, 2.7773f, 4.5183f)
                lineTo(12.0f, 10.6667f)
                verticalLineTo(4.9343f)
                curveTo(12.0f, 4.6582f, 12.2239f, 4.4343f, 12.5f, 4.4343f)
                curveTo(12.5987f, 4.4343f, 12.6952f, 4.4636f, 12.7774f, 4.5183f)
                lineTo(23.376f, 11.584f)
                curveTo(23.6057f, 11.7372f, 23.6678f, 12.0477f, 23.5146f, 12.2774f)
                curveTo(23.478f, 12.3323f, 23.4309f, 12.3795f, 23.376f, 12.4161f)
                lineTo(12.7774f, 19.4818f)
                curveTo(12.5476f, 19.635f, 12.2372f, 19.5729f, 12.084f, 19.3432f)
                curveTo(12.0292f, 19.261f, 12.0f, 19.1645f, 12.0f, 19.0658f)
                verticalLineTo(13.3334f)
                close()
            }
        }
        .build()
        return `_speed-fill`!!
    }

private var `_speed-fill`: ImageVector? = null
