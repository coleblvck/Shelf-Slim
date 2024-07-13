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

public val MediaGroup.`Play-fill`: ImageVector
    get() {
        if (`_play-fill` != null) {
            return `_play-fill`!!
        }
        `_play-fill` = Builder(name = "Play-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.376f, 12.4161f)
                lineTo(8.7774f, 19.4818f)
                curveTo(8.5476f, 19.635f, 8.2372f, 19.5729f, 8.084f, 19.3432f)
                curveTo(8.0292f, 19.261f, 8.0f, 19.1645f, 8.0f, 19.0658f)
                verticalLineTo(4.9343f)
                curveTo(8.0f, 4.6582f, 8.2239f, 4.4343f, 8.5f, 4.4343f)
                curveTo(8.5987f, 4.4343f, 8.6952f, 4.4636f, 8.7774f, 4.5183f)
                lineTo(19.376f, 11.584f)
                curveTo(19.6057f, 11.7372f, 19.6678f, 12.0477f, 19.5146f, 12.2774f)
                curveTo(19.478f, 12.3323f, 19.4309f, 12.3795f, 19.376f, 12.4161f)
                close()
            }
        }
        .build()
        return `_play-fill`!!
    }

private var `_play-fill`: ImageVector? = null
