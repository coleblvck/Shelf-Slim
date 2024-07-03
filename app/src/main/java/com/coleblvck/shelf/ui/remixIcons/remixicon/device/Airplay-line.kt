package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Airplay-line`: ImageVector
    get() {
        if (`_airplay-line` != null) {
            return `_airplay-line`!!
        }
        `_airplay-line` = Builder(name = "Airplay-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4f, 13.5333f)
                lineTo(17.4f, 20.2f)
                curveTo(17.5657f, 20.4209f, 17.5209f, 20.7343f, 17.3f, 20.9f)
                curveTo(17.2135f, 20.9649f, 17.1082f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7239f, 21.0f, 6.5f, 20.7761f, 6.5f, 20.5f)
                curveTo(6.5f, 20.3918f, 6.5351f, 20.2865f, 6.6f, 20.2f)
                lineTo(11.6f, 13.5333f)
                curveTo(11.7657f, 13.3124f, 12.0791f, 13.2676f, 12.3f, 13.4333f)
                curveTo(12.3379f, 13.4618f, 12.3716f, 13.4954f, 12.4f, 13.5333f)
                close()
                moveTo(12.0f, 16.33f)
                lineTo(10.0f, 19.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 16.33f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 19.0f, 2.0f, 18.5554f, 2.0f, 17.9991f)
                verticalLineTo(4.0009f)
                curveTo(2.0f, 3.4481f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4446f, 22.0f, 4.0009f)
                verticalLineTo(17.9991f)
                curveTo(22.0f, 18.5519f, 21.5447f, 19.0f, 21.0082f, 19.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_airplay-line`!!
    }

private var `_airplay-line`: ImageVector? = null
