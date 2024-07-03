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

public val WeatherGroup.`Celsius-line`: ImageVector
    get() {
        if (`_celsius-line` != null) {
            return `_celsius-line`!!
        }
        `_celsius-line` = Builder(name = "Celsius-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.0f)
                curveTo(2.567f, 10.0f, 1.0f, 8.433f, 1.0f, 6.5f)
                curveTo(1.0f, 4.567f, 2.567f, 3.0f, 4.5f, 3.0f)
                curveTo(6.433f, 3.0f, 8.0f, 4.567f, 8.0f, 6.5f)
                curveTo(8.0f, 8.433f, 6.433f, 10.0f, 4.5f, 10.0f)
                close()
                moveTo(4.5f, 8.0f)
                curveTo(5.3284f, 8.0f, 6.0f, 7.3284f, 6.0f, 6.5f)
                curveTo(6.0f, 5.6716f, 5.3284f, 5.0f, 4.5f, 5.0f)
                curveTo(3.6716f, 5.0f, 3.0f, 5.6716f, 3.0f, 6.5f)
                curveTo(3.0f, 7.3284f, 3.6716f, 8.0f, 4.5f, 8.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.7909f, 18.2091f, 6.0f, 16.0f, 6.0f)
                curveTo(13.7909f, 6.0f, 12.0f, 7.7909f, 12.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 17.2091f, 13.7909f, 19.0f, 16.0f, 19.0f)
                curveTo(18.2091f, 19.0f, 20.0f, 17.2091f, 20.0f, 15.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 18.3137f, 19.3137f, 21.0f, 16.0f, 21.0f)
                curveTo(12.6863f, 21.0f, 10.0f, 18.3137f, 10.0f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 6.6863f, 12.6863f, 4.0f, 16.0f, 4.0f)
                curveTo(19.3137f, 4.0f, 22.0f, 6.6863f, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_celsius-line`!!
    }

private var `_celsius-line`: ImageVector? = null
