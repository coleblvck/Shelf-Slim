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

public val WeatherGroup.`Snowy-line`: ImageVector
    get() {
        if (`_snowy-line` != null) {
            return `_snowy-line`!!
        }
        `_snowy-line` = Builder(name = "Snowy-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.268f)
                lineTo(14.9641f, 15.134f)
                lineTo(15.9641f, 16.866f)
                lineTo(14.0f, 18.0f)
                lineTo(15.9641f, 19.134f)
                lineTo(14.9641f, 20.866f)
                lineTo(13.0f, 19.732f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.732f)
                lineTo(9.0359f, 20.866f)
                lineTo(8.0359f, 19.134f)
                lineTo(10.0f, 18.0f)
                lineTo(8.0359f, 16.866f)
                lineTo(9.0359f, 15.134f)
                lineTo(11.0f, 16.268f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.268f)
                close()
                moveTo(17.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 16.0f, 21.0f, 14.433f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.5205f, 9.0f, 15.6351f, 9.4023f, 14.9998f, 10.0507f)
                curveTo(14.9999f, 10.0338f, 15.0f, 10.0169f, 15.0f, 10.0f)
                curveTo(15.0f, 6.6863f, 12.3137f, 4.0f, 9.0f, 4.0f)
                curveTo(5.6863f, 4.0f, 3.0f, 6.6863f, 3.0f, 10.0f)
                curveTo(3.0f, 12.6124f, 4.6696f, 14.8349f, 7.0f, 15.6586f)
                verticalLineTo(17.748f)
                curveTo(3.5496f, 16.8599f, 1.0f, 13.7277f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.5376f, 20.5376f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_snowy-line`!!
    }

private var `_snowy-line`: ImageVector? = null
