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

public val WeatherGroup.`Rainy-line`: ImageVector
    get() {
        if (`_rainy-line` != null) {
            return `_rainy-line`!!
        }
        `_rainy-line` = Builder(name = "Rainy-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 16.0f, 21.0f, 14.2091f, 21.0f, 12.0f)
                curveTo(21.0f, 9.7909f, 19.2091f, 8.0f, 17.0f, 8.0f)
                curveTo(16.2057f, 8.0f, 15.4654f, 8.2315f, 14.8431f, 8.6308f)
                curveTo(14.2236f, 5.9769f, 11.8427f, 4.0f, 9.0f, 4.0f)
                curveTo(5.6863f, 4.0f, 3.0f, 6.6863f, 3.0f, 10.0f)
                curveTo(3.0f, 12.973f, 5.1623f, 15.441f, 8.0f, 15.917f)
                verticalLineTo(17.9381f)
                curveTo(4.0537f, 17.446f, 1.0f, 14.0796f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(11.9967f, 2.0f, 14.6086f, 3.6477f, 15.9791f, 6.0865f)
                curveTo(16.3109f, 6.0296f, 16.652f, 6.0f, 17.0f, 6.0f)
                curveTo(20.3137f, 6.0f, 23.0f, 8.6863f, 23.0f, 12.0f)
                curveTo(23.0f, 15.3137f, 20.3137f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(10.2322f, 18.7322f)
                lineTo(12.0f, 16.9645f)
                lineTo(13.7678f, 18.7322f)
                curveTo(14.7441f, 19.7085f, 14.7441f, 21.2915f, 13.7678f, 22.2678f)
                curveTo(12.7915f, 23.2441f, 11.2085f, 23.2441f, 10.2322f, 22.2678f)
                curveTo(9.2559f, 21.2915f, 9.2559f, 19.7085f, 10.2322f, 18.7322f)
                close()
            }
        }
        .build()
        return `_rainy-line`!!
    }

private var `_rainy-line`: ImageVector? = null
