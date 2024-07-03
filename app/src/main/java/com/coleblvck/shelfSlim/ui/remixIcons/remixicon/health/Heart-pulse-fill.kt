package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Heart-pulse-fill`: ImageVector
    get() {
        if (`_heart-pulse-fill` != null) {
            return `_heart-pulse-fill`!!
        }
        `_heart-pulse-fill` = Builder(name = "Heart-pulse-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.5376f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 16.0f, 14.5f, 20.0f, 12.0f, 21.5f)
                curveTo(10.0224f, 20.3135f, 4.9163f, 17.5626f, 2.8685f, 13.0f)
                lineTo(7.5662f, 13.0f)
                lineTo(8.5f, 11.4437f)
                lineTo(11.5f, 16.4437f)
                lineTo(13.5662f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.4338f)
                lineTo(11.5f, 12.5563f)
                lineTo(8.5f, 7.5564f)
                lineTo(6.4338f, 11.0f)
                lineTo(2.2102f, 10.9999f)
                curveTo(2.0742f, 10.3626f, 2.0f, 9.6961f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return `_heart-pulse-fill`!!
    }

private var `_heart-pulse-fill`: ImageVector? = null
