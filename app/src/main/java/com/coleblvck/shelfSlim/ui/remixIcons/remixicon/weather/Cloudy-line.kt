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

public val WeatherGroup.`Cloudy-line`: ImageVector
    get() {
        if (`_cloudy-line` != null) {
            return `_cloudy-line`!!
        }
        `_cloudy-line` = Builder(name = "Cloudy-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                curveTo(5.9102f, 6.0f, 3.0f, 8.9101f, 3.0f, 12.5f)
                curveTo(3.0f, 16.0899f, 5.9102f, 19.0f, 9.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 19.0f, 21.0f, 16.9853f, 21.0f, 14.5f)
                curveTo(21.0f, 12.0147f, 18.9853f, 10.0f, 16.5f, 10.0f)
                curveTo(16.1717f, 10.0f, 15.8516f, 10.0352f, 15.5433f, 10.1019f)
                curveTo(14.589f, 7.6989f, 12.2429f, 6.0f, 9.5f, 6.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineTo(9.5f)
                curveTo(4.8056f, 21.0f, 1.0f, 17.1944f, 1.0f, 12.5f)
                curveTo(1.0f, 7.8056f, 4.8056f, 4.0f, 9.5f, 4.0f)
                curveTo(12.5433f, 4.0f, 15.2131f, 5.5994f, 16.7146f, 8.0035f)
                curveTo(20.2051f, 8.1167f, 23.0f, 10.982f, 23.0f, 14.5f)
                curveTo(23.0f, 18.0899f, 20.0899f, 21.0f, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return `_cloudy-line`!!
    }

private var `_cloudy-line`: ImageVector? = null
