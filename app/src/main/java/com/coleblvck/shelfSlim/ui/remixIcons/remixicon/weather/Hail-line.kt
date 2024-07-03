package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Hail-line`: ImageVector
    get() {
        if (`_hail-line` != null) {
            return `_hail-line`!!
        }
        `_hail-line` = Builder(name = "Hail-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.4185f)
                curveTo(3.0682f, 16.2317f, 1.0f, 13.3574f, 1.0f, 10.0f)
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
                curveTo(3.0f, 12.2208f, 4.2066f, 14.1599f, 6.0f, 15.1973f)
                verticalLineTo(17.4185f)
                close()
                moveTo(10.0f, 17.0f)
                curveTo(8.8954f, 17.0f, 8.0f, 16.1046f, 8.0f, 15.0f)
                curveTo(8.0f, 13.8954f, 8.8954f, 13.0f, 10.0f, 13.0f)
                curveTo(11.1046f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                curveTo(12.0f, 16.1046f, 11.1046f, 17.0f, 10.0f, 17.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(13.8954f, 20.0f, 13.0f, 19.1046f, 13.0f, 18.0f)
                curveTo(13.0f, 16.8954f, 13.8954f, 16.0f, 15.0f, 16.0f)
                curveTo(16.1046f, 16.0f, 17.0f, 16.8954f, 17.0f, 18.0f)
                curveTo(17.0f, 19.1046f, 16.1046f, 20.0f, 15.0f, 20.0f)
                close()
                moveTo(10.0f, 23.0f)
                curveTo(8.8954f, 23.0f, 8.0f, 22.1046f, 8.0f, 21.0f)
                curveTo(8.0f, 19.8954f, 8.8954f, 19.0f, 10.0f, 19.0f)
                curveTo(11.1046f, 19.0f, 12.0f, 19.8954f, 12.0f, 21.0f)
                curveTo(12.0f, 22.1046f, 11.1046f, 23.0f, 10.0f, 23.0f)
                close()
            }
        }
        .build()
        return `_hail-line`!!
    }

private var `_hail-line`: ImageVector? = null
