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

public val WeatherGroup.`Cloud-windy-fill`: ImageVector
    get() {
        if (`_cloud-windy-fill` != null) {
            return `_cloud-windy-fill`!!
        }
        `_cloud-windy-fill` = Builder(name = "Cloud-windy-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                verticalLineTo(15.0069f)
                horizontalLineTo(2.0742f)
                curveTo(1.3911f, 13.8286f, 1.0f, 12.46f, 1.0f, 11.0f)
                curveTo(1.0f, 6.5817f, 4.5817f, 3.0f, 9.0f, 3.0f)
                curveTo(12.3949f, 3.0f, 15.2959f, 5.1147f, 16.4576f, 8.0986f)
                curveTo(16.7951f, 8.0339f, 17.1436f, 8.0f, 17.5f, 8.0f)
                curveTo(20.5376f, 8.0f, 23.0f, 10.4624f, 23.0f, 13.5f)
                curveTo(23.0f, 16.5376f, 20.5376f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(2.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_cloud-windy-fill`!!
    }

private var `_cloud-windy-fill`: ImageVector? = null
