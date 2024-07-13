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

public val WeatherGroup.`Rainy-fill`: ImageVector
    get() {
        if (`_rainy-fill` != null) {
            return `_rainy-fill`!!
        }
        `_rainy-fill` = Builder(name = "Rainy-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.86f, 18.0f)
                lineTo(12.7071f, 14.8471f)
                curveTo(12.3166f, 14.4566f, 11.6834f, 14.4566f, 11.2929f, 14.8471f)
                lineTo(8.1814f, 17.9586f)
                curveTo(4.1476f, 17.5486f, 1.0f, 14.1419f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(11.9967f, 2.0f, 14.6086f, 3.6477f, 15.9791f, 6.0865f)
                curveTo(16.3109f, 6.0296f, 16.652f, 6.0f, 17.0f, 6.0f)
                curveTo(20.3137f, 6.0f, 23.0f, 8.6863f, 23.0f, 12.0f)
                curveTo(23.0f, 15.3137f, 20.3137f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(15.86f)
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
        return `_rainy-fill`!!
    }

private var `_rainy-fill`: ImageVector? = null
