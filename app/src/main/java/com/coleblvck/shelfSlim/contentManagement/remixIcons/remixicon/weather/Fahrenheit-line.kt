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

public val WeatherGroup.`Fahrenheit-line`: ImageVector
    get() {
        if (`_fahrenheit-line` != null) {
            return `_fahrenheit-line`!!
        }
        `_fahrenheit-line` = Builder(name = "Fahrenheit-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                curveTo(10.0f, 5.7909f, 11.7909f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 6.0f, 12.0f, 6.8954f, 12.0f, 8.0f)
                verticalLineTo(12.0f)
                close()
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
            }
        }
        .build()
        return `_fahrenheit-line`!!
    }

private var `_fahrenheit-line`: ImageVector? = null
