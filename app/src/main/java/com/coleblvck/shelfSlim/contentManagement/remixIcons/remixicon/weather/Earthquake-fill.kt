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

public val WeatherGroup.`Earthquake-fill`: ImageVector
    get() {
        if (`_earthquake-fill` != null) {
            return `_earthquake-fill`!!
        }
        `_earthquake-fill` = Builder(name = "Earthquake-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3273f, 1.6115f)
                curveTo(11.677f, 1.2937f, 12.1956f, 1.2672f, 12.5734f, 1.532f)
                lineTo(12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.5128f, 19.614f, 20.9355f, 19.1166f, 20.9933f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(12.5f)
                lineTo(15.0f, 17.0f)
                lineTo(11.5f, 14.0f)
                lineTo(15.5f, 11.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.5f, 6.0f)
                lineTo(10.5f, 9.0f)
                lineTo(13.0f, 11.0f)
                lineTo(8.0f, 14.0f)
                lineTo(11.75f, 17.5f)
                lineTo(8.5f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4872f, 21.0f, 4.0645f, 20.6139f, 4.0067f, 20.1166f)
                lineTo(4.0f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.3273f, 1.6115f)
                close()
            }
        }
        .build()
        return `_earthquake-fill`!!
    }

private var `_earthquake-fill`: ImageVector? = null
