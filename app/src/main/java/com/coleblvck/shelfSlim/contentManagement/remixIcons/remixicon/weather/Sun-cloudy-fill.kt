package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Sun-cloudy-fill`: ImageVector
    get() {
        if (`_sun-cloudy-fill` != null) {
            return `_sun-cloudy-fill`!!
        }
        `_sun-cloudy-fill` = Builder(name = "Sun-cloudy-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9839f, 5.0599f)
                curveTo(11.1323f, 3.2224f, 13.1734f, 2.0f, 15.5f, 2.0f)
                curveTo(19.0899f, 2.0f, 22.0f, 4.9102f, 22.0f, 8.5f)
                curveTo(22.0f, 9.5803f, 21.7365f, 10.5991f, 21.2701f, 11.4955f)
                curveTo(22.3351f, 12.4985f, 23.0f, 13.9216f, 23.0f, 15.5f)
                curveTo(23.0f, 18.5376f, 20.5376f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(4.5817f, 21.0f, 1.0f, 17.4183f, 1.0f, 13.0f)
                curveTo(1.0f, 8.5817f, 4.5817f, 5.0f, 9.0f, 5.0f)
                curveTo(9.3331f, 5.0f, 9.6615f, 5.0204f, 9.9839f, 5.0599f)
                close()
                moveTo(12.0554f, 5.6042f)
                curveTo(14.0675f, 6.4364f, 15.6662f, 8.0658f, 16.4576f, 10.0986f)
                curveTo(16.7951f, 10.0339f, 17.1436f, 10.0f, 17.5f, 10.0f)
                curveTo(18.2351f, 10.0f, 18.9366f, 10.1442f, 19.5776f, 10.4059f)
                curveTo(19.8486f, 9.8272f, 20.0f, 9.1813f, 20.0f, 8.5f)
                curveTo(20.0f, 6.0147f, 17.9853f, 4.0f, 15.5f, 4.0f)
                curveTo(14.1177f, 4.0f, 12.8809f, 4.6233f, 12.0554f, 5.6042f)
                close()
            }
        }
        .build()
        return `_sun-cloudy-fill`!!
    }

private var `_sun-cloudy-fill`: ImageVector? = null