package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Sun-foggy-line`: ImageVector
    get() {
        if (`_sun-foggy-line` != null) {
            return `_sun-foggy-line`!!
        }
        `_sun-foggy-line` = Builder(name = "Sun-foggy-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 15.3137f, 15.3137f, 18.0f, 12.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(3.5147f, 4.9289f)
                lineTo(4.9289f, 3.5147f)
                lineTo(7.0503f, 5.636f)
                lineTo(5.636f, 7.0503f)
                lineTo(3.5147f, 4.9289f)
                close()
                moveTo(16.9497f, 18.364f)
                lineTo(18.364f, 16.9497f)
                lineTo(20.4853f, 19.0711f)
                lineTo(19.0711f, 20.4853f)
                lineTo(16.9497f, 18.364f)
                close()
                moveTo(19.0711f, 3.5147f)
                lineTo(20.4853f, 4.9289f)
                lineTo(18.364f, 7.0503f)
                lineTo(16.9497f, 5.636f)
                lineTo(19.0711f, 3.5147f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return `_sun-foggy-line`!!
    }

private var `_sun-foggy-line`: ImageVector? = null
