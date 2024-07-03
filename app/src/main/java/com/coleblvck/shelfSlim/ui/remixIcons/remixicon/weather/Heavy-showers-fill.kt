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

public val WeatherGroup.`Heavy-showers-fill`: ImageVector
    get() {
        if (`_heavy-showers-fill` != null) {
            return `_heavy-showers-fill`!!
        }
        `_heavy-showers-fill` = Builder(name = "Heavy-showers-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.748f)
                curveTo(3.5496f, 16.8599f, 1.0f, 13.7277f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.5376f, 20.5376f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_heavy-showers-fill`!!
    }

private var `_heavy-showers-fill`: ImageVector? = null
