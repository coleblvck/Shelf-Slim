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

public val WeatherGroup.`Snowy-fill`: ImageVector
    get() {
        if (`_snowy-fill` != null) {
            return `_snowy-fill`!!
        }
        `_snowy-fill` = Builder(name = "Snowy-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0268f, 17.4293f)
                curveTo(3.0808f, 16.2492f, 1.0f, 13.3676f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.369f, 20.8032f, 17.725f, 18.0f, 17.9776f)
                curveTo(17.9879f, 14.6742f, 15.3062f, 12.0f, 12.0f, 12.0f)
                curveTo(8.8788f, 12.0f, 6.3142f, 14.3833f, 6.0268f, 17.4293f)
                close()
                moveTo(13.0f, 16.268f)
                lineTo(14.9641f, 15.134f)
                lineTo(15.9641f, 16.866f)
                lineTo(14.0f, 18.0f)
                lineTo(15.9641f, 19.134f)
                lineTo(14.9641f, 20.866f)
                lineTo(13.0f, 19.732f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.732f)
                lineTo(9.0359f, 20.866f)
                lineTo(8.0359f, 19.134f)
                lineTo(10.0f, 18.0f)
                lineTo(8.0359f, 16.866f)
                lineTo(9.0359f, 15.134f)
                lineTo(11.0f, 16.268f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.268f)
                close()
            }
        }
        .build()
        return `_snowy-fill`!!
    }

private var `_snowy-fill`: ImageVector? = null
