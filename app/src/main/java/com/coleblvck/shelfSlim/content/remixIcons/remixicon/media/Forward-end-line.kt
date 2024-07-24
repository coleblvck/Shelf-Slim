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

public val MediaGroup.`Forward-end-line`: ImageVector
    get() {
        if (`_forward-end-line` != null) {
            return `_forward-end-line`!!
        }
        `_forward-end-line` = Builder(name = "Forward-end-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                curveTo(21.4477f, 4.0f, 21.0f, 4.4477f, 21.0f, 5.0f)
                verticalLineTo(10.6665f)
                lineTo(11.7774f, 4.5181f)
                curveTo(11.6952f, 4.4633f, 11.5987f, 4.4341f, 11.5f, 4.4341f)
                curveTo(11.2239f, 4.4341f, 11.0f, 4.6579f, 11.0f, 4.9341f)
                verticalLineTo(10.6665f)
                lineTo(1.7773f, 4.5181f)
                curveTo(1.6952f, 4.4633f, 1.5987f, 4.4341f, 1.5f, 4.4341f)
                curveTo(1.2239f, 4.4341f, 1.0f, 4.6579f, 1.0f, 4.9341f)
                verticalLineTo(19.0656f)
                curveTo(1.0f, 19.1643f, 1.0292f, 19.2608f, 1.084f, 19.3429f)
                curveTo(1.2371f, 19.5727f, 1.5476f, 19.6348f, 1.7773f, 19.4816f)
                lineTo(11.0f, 13.3332f)
                verticalLineTo(19.0656f)
                curveTo(11.0f, 19.1643f, 11.0292f, 19.2608f, 11.084f, 19.3429f)
                curveTo(11.2372f, 19.5727f, 11.5476f, 19.6348f, 11.7774f, 19.4816f)
                lineTo(21.0f, 13.3332f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.5523f, 21.4477f, 20.0f, 22.0f, 20.0f)
                curveTo(22.5523f, 20.0f, 23.0f, 19.5523f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.4477f, 22.5523f, 4.0f, 22.0f, 4.0f)
                close()
                moveTo(3.0f, 7.7369f)
                lineTo(9.3945f, 11.9998f)
                lineTo(3.0f, 16.2628f)
                verticalLineTo(7.7369f)
                close()
                moveTo(13.0f, 16.2628f)
                verticalLineTo(7.7369f)
                lineTo(19.3944f, 11.9998f)
                lineTo(13.0f, 16.2628f)
                close()
            }
        }
        .build()
        return `_forward-end-line`!!
    }

private var `_forward-end-line`: ImageVector? = null
