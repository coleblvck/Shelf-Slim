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

public val WeatherGroup.`Cloud-windy-line`: ImageVector
    get() {
        if (`_cloud-windy-line` != null) {
            return `_cloud-windy-line`!!
        }
        `_cloud-windy-line` = Builder(name = "Cloud-windy-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 16.0f, 21.0f, 14.433f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.5205f, 9.0f, 15.6351f, 9.4023f, 14.9998f, 10.0507f)
                curveTo(14.9999f, 10.0338f, 15.0f, 10.0169f, 15.0f, 10.0f)
                curveTo(15.0f, 6.6863f, 12.3137f, 4.0f, 9.0f, 4.0f)
                curveTo(5.6863f, 4.0f, 3.0f, 6.6863f, 3.0f, 10.0f)
                verticalLineTo(10.0069f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.5376f, 20.5376f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_cloud-windy-line`!!
    }

private var `_cloud-windy-line`: ImageVector? = null
