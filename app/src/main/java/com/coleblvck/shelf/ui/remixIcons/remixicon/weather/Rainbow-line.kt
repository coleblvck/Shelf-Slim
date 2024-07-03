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

public val WeatherGroup.`Rainbow-line`: ImageVector
    get() {
        if (`_rainbow-line` != null) {
            return `_rainbow-line`!!
        }
        `_rainbow-line` = Builder(name = "Rainbow-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(18.0751f, 4.0f, 23.0f, 8.9249f, 23.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 10.1182f, 17.1132f, 6.1442f, 12.2654f, 6.0038f)
                lineTo(12.0f, 6.0f)
                curveTo(7.1182f, 6.0f, 3.1442f, 9.8868f, 3.0038f, 14.7346f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 8.9249f, 5.9249f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(15.866f, 8.0f, 19.0f, 11.134f, 19.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 12.3112f, 14.8777f, 10.1182f, 12.2169f, 10.0046f)
                lineTo(12.0f, 10.0f)
                curveTo(9.3112f, 10.0f, 7.1182f, 12.1223f, 7.0046f, 14.7831f)
                lineTo(7.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 11.134f, 8.134f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 13.3431f, 15.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 14.4872f, 12.614f, 14.0645f, 12.1166f, 14.0067f)
                lineTo(12.0f, 14.0f)
                curveTo(11.4872f, 14.0f, 11.0645f, 14.386f, 11.0067f, 14.8834f)
                lineTo(11.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 13.3431f, 10.3431f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_rainbow-line`!!
    }

private var `_rainbow-line`: ImageVector? = null
