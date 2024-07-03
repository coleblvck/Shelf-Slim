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

public val WeatherGroup.`Thunderstorms-fill`: ImageVector
    get() {
        if (`_thunderstorms-fill` != null) {
            return `_thunderstorms-fill`!!
        }
        `_thunderstorms-fill` = Builder(name = "Thunderstorms-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9885f, 18.0f)
                lineTo(18.2044f, 16.4194f)
                curveTo(18.4061f, 16.1572f, 18.5154f, 15.8356f, 18.5154f, 15.5048f)
                curveTo(18.5154f, 14.6764f, 17.8439f, 14.0048f, 17.0154f, 14.0048f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0291f)
                curveTo(15.0f, 9.5632f, 14.7835f, 9.1237f, 14.4141f, 8.8398f)
                curveTo(13.7573f, 8.335f, 12.8156f, 8.4581f, 12.3107f, 9.1149f)
                lineTo(5.9453f, 17.3961f)
                curveTo(3.0425f, 16.1959f, 1.0f, 13.3365f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.5376f, 20.5376f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(16.9885f)
                close()
                moveTo(13.0f, 16.0048f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 22.5048f)
                verticalLineTo(18.0048f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 11.5f)
                verticalLineTo(16.0048f)
                close()
            }
        }
        .build()
        return `_thunderstorms-fill`!!
    }

private var `_thunderstorms-fill`: ImageVector? = null
