package com.coleblvck.shelf.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Moon-cloudy-line`: ImageVector
    get() {
        if (`_moon-cloudy-line` != null) {
            return `_moon-cloudy-line`!!
        }
        `_moon-cloudy-line` = Builder(name = "Moon-cloudy-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6705f, 5.0067f)
                curveTo(9.7926f, 2.6381f, 12.205f, 1.0f, 15.0f, 1.0f)
                curveTo(15.4162f, 1.0f, 15.8239f, 1.0363f, 16.2201f, 1.106f)
                curveTo(16.0772f, 1.5449f, 16.0f, 2.0134f, 16.0f, 2.5f)
                curveTo(16.0f, 4.9853f, 18.0147f, 7.0f, 20.5f, 7.0f)
                curveTo(20.9866f, 7.0f, 21.4551f, 6.9228f, 21.894f, 6.7799f)
                curveTo(21.9637f, 7.1761f, 22.0f, 7.5838f, 22.0f, 8.0f)
                curveTo(22.0f, 9.2228f, 21.6865f, 10.3724f, 21.1354f, 11.3727f)
                curveTo(22.2787f, 12.3806f, 23.0f, 13.856f, 23.0f, 15.5f)
                curveTo(23.0f, 18.5376f, 20.5376f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(4.5817f, 21.0f, 1.0f, 17.4183f, 1.0f, 13.0f)
                curveTo(1.0f, 8.6921f, 4.405f, 5.1795f, 8.6705f, 5.0067f)
                close()
                moveTo(10.8473f, 5.2143f)
                curveTo(13.4205f, 5.8226f, 15.5135f, 7.6735f, 16.4576f, 10.0986f)
                curveTo(16.7951f, 10.0339f, 17.1436f, 10.0f, 17.5f, 10.0f)
                curveTo(18.1745f, 10.0f, 18.8207f, 10.1214f, 19.4179f, 10.3436f)
                curveTo(19.6433f, 9.9194f, 19.8095f, 9.4589f, 19.9054f, 8.9732f)
                curveTo(16.79f, 8.6906f, 14.3094f, 6.21f, 14.0268f, 3.0947f)
                curveTo(12.7061f, 3.3552f, 11.5722f, 4.1358f, 10.8473f, 5.2143f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(19.433f, 19.0f, 21.0f, 17.433f, 21.0f, 15.5f)
                curveTo(21.0f, 13.567f, 19.433f, 12.0f, 17.5f, 12.0f)
                curveTo(16.5205f, 12.0f, 15.6351f, 12.4023f, 14.9998f, 13.0507f)
                curveTo(14.9999f, 13.0338f, 15.0f, 13.0169f, 15.0f, 13.0f)
                curveTo(15.0f, 9.6863f, 12.3137f, 7.0f, 9.0f, 7.0f)
                curveTo(5.6863f, 7.0f, 3.0f, 9.6863f, 3.0f, 13.0f)
                curveTo(3.0f, 16.3137f, 5.6863f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return `_moon-cloudy-line`!!
    }

private var `_moon-cloudy-line`: ImageVector? = null
