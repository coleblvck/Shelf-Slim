package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Foggy-fill`: ImageVector
    get() {
        if (`_foggy-fill` != null) {
            return `_foggy-fill`!!
        }
        `_foggy-fill` = Builder(name = "Foggy-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5843f, 13.0069f)
                curveTo(1.2075f, 12.0786f, 1.0f, 11.0635f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 12.6709f, 22.9922f, 12.8399f, 22.977f, 13.0069f)
                horizontalLineTo(1.5843f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_foggy-fill`!!
    }

private var `_foggy-fill`: ImageVector? = null
