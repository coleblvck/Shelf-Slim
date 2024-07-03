package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Eye-off-fill`: ImageVector
    get() {
        if (`_eye-off-fill` != null) {
            return `_eye-off-fill`!!
        }
        `_eye-off-fill` = Builder(name = "Eye-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5205f, 5.9346f)
                lineTo(1.3937f, 2.8078f)
                lineTo(2.8079f, 1.3936f)
                lineTo(22.6069f, 21.1925f)
                lineTo(21.1927f, 22.6068f)
                lineTo(17.8827f, 19.2968f)
                curveTo(16.1814f, 20.3755f, 14.1638f, 21.0002f, 12.0003f, 21.0002f)
                curveTo(6.6081f, 21.0002f, 2.1221f, 17.1204f, 1.1816f, 12.0002f)
                curveTo(1.6183f, 9.6228f, 2.8193f, 7.5129f, 4.5205f, 5.9346f)
                close()
                moveTo(14.7577f, 16.1718f)
                lineTo(13.2937f, 14.7078f)
                curveTo(12.902f, 14.8952f, 12.4634f, 15.0002f, 12.0003f, 15.0002f)
                curveTo(10.3434f, 15.0002f, 9.0003f, 13.657f, 9.0003f, 12.0002f)
                curveTo(9.0003f, 11.537f, 9.1052f, 11.0984f, 9.2926f, 10.7067f)
                lineTo(7.8287f, 9.2428f)
                curveTo(7.3051f, 10.0332f, 7.0003f, 10.9811f, 7.0003f, 12.0002f)
                curveTo(7.0003f, 14.7616f, 9.2388f, 17.0002f, 12.0003f, 17.0002f)
                curveTo(13.0193f, 17.0002f, 13.9672f, 16.6953f, 14.7577f, 16.1718f)
                close()
                moveTo(7.9745f, 3.7601f)
                curveTo(9.2213f, 3.2696f, 10.5793f, 3.0002f, 12.0003f, 3.0002f)
                curveTo(17.3924f, 3.0002f, 21.8784f, 6.8799f, 22.8189f, 12.0002f)
                curveTo(22.5067f, 13.6998f, 21.8038f, 15.2628f, 20.8068f, 16.5925f)
                lineTo(16.947f, 12.7327f)
                curveTo(16.9821f, 12.4936f, 17.0003f, 12.249f, 17.0003f, 12.0002f)
                curveTo(17.0003f, 9.2387f, 14.7617f, 7.0002f, 12.0003f, 7.0002f)
                curveTo(11.7514f, 7.0002f, 11.5068f, 7.0183f, 11.2677f, 7.0534f)
                lineTo(7.9745f, 3.7601f)
                close()
            }
        }
        .build()
        return `_eye-off-fill`!!
    }

private var `_eye-off-fill`: ImageVector? = null
