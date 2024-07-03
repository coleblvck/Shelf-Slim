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

public val WeatherGroup.`Windy-line`: ImageVector
    get() {
        if (`_windy-line` != null) {
            return `_windy-line`!!
        }
        `_windy-line` = Builder(name = "Windy-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                curveTo(12.433f, 15.0f, 14.0f, 16.567f, 14.0f, 18.5f)
                curveTo(14.0f, 20.433f, 12.433f, 22.0f, 10.5f, 22.0f)
                curveTo(8.9996f, 22.0f, 7.7197f, 21.0559f, 7.222f, 19.7293f)
                lineTo(9.0951f, 19.0268f)
                curveTo(9.3084f, 19.5954f, 9.857f, 20.0f, 10.5f, 20.0f)
                curveTo(11.3284f, 20.0f, 12.0f, 19.3284f, 12.0f, 18.5f)
                curveTo(12.0f, 17.6716f, 11.3284f, 17.0f, 10.5f, 17.0f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(18.5f)
                curveTo(20.433f, 11.0f, 22.0f, 12.567f, 22.0f, 14.5f)
                curveTo(22.0f, 16.433f, 20.433f, 18.0f, 18.5f, 18.0f)
                curveTo(16.9996f, 18.0f, 15.7197f, 17.0559f, 15.222f, 15.7293f)
                lineTo(17.0951f, 15.0268f)
                curveTo(17.3084f, 15.5954f, 17.857f, 16.0f, 18.5f, 16.0f)
                curveTo(19.3284f, 16.0f, 20.0f, 15.3284f, 20.0f, 14.5f)
                curveTo(20.0f, 13.6716f, 19.3284f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 13.0f, 2.0f, 11.6569f, 2.0f, 10.0f)
                curveTo(2.0f, 8.3432f, 3.3431f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 7.0f, 15.0f, 6.3284f, 15.0f, 5.5f)
                curveTo(15.0f, 4.6716f, 14.3284f, 4.0f, 13.5f, 4.0f)
                curveTo(12.857f, 4.0f, 12.3084f, 4.4046f, 12.0951f, 4.9732f)
                lineTo(10.222f, 4.2707f)
                curveTo(10.7197f, 2.9441f, 11.9996f, 2.0f, 13.5f, 2.0f)
                curveTo(15.433f, 2.0f, 17.0f, 3.567f, 17.0f, 5.5f)
                curveTo(17.0f, 7.433f, 15.433f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 9.0f, 4.0f, 9.4477f, 4.0f, 10.0f)
                curveTo(4.0f, 10.5523f, 4.4477f, 11.0f, 5.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_windy-line`!!
    }

private var `_windy-line`: ImageVector? = null
