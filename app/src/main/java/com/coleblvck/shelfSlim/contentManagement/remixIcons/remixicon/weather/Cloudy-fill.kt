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

public val WeatherGroup.`Cloudy-fill`: ImageVector
    get() {
        if (`_cloudy-fill` != null) {
            return `_cloudy-fill`!!
        }
        `_cloudy-fill` = Builder(name = "Cloudy-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.9855f)
                curveTo(4.5383f, 20.7267f, 1.0f, 17.0266f, 1.0f, 12.5f)
                curveTo(1.0f, 7.8056f, 4.8056f, 4.0f, 9.5f, 4.0f)
                curveTo(12.5433f, 4.0f, 15.2131f, 5.5994f, 16.7146f, 8.0035f)
                curveTo(20.2051f, 8.1167f, 23.0f, 10.982f, 23.0f, 14.5f)
                curveTo(23.0f, 17.9216f, 20.3562f, 20.7257f, 17.0f, 20.9811f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.9855f)
                close()
            }
        }
        .build()
        return `_cloudy-fill`!!
    }

private var `_cloudy-fill`: ImageVector? = null
