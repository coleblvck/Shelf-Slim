package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Heavy-showers-line`: ImageVector
    get() {
        if (`_heavy-showers-line` != null) {
            return `_heavy-showers-line`!!
        }
        `_heavy-showers-line` = Builder(name = "Heavy-showers-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.9297f)
                curveTo(2.6088f, 15.5465f, 1.0f, 12.9611f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.0176f, 21.3085f, 17.14f, 19.0f, 17.793f)
                verticalLineTo(15.6632f)
                curveTo(20.1825f, 15.1015f, 21.0f, 13.8962f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.5205f, 9.0f, 15.6351f, 9.4023f, 14.9998f, 10.0507f)
                curveTo(14.9999f, 10.0338f, 15.0f, 10.0169f, 15.0f, 10.0f)
                curveTo(15.0f, 6.6863f, 12.3137f, 4.0f, 9.0f, 4.0f)
                curveTo(5.6863f, 4.0f, 3.0f, 6.6863f, 3.0f, 10.0f)
                curveTo(3.0f, 11.777f, 3.7725f, 13.3736f, 5.0f, 14.4722f)
                verticalLineTo(16.9297f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(15.0f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_heavy-showers-line`!!
    }

private var `_heavy-showers-line`: ImageVector? = null
