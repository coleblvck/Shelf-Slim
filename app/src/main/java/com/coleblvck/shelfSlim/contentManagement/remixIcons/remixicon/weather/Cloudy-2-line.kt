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

public val WeatherGroup.`Cloudy-2-line`: ImageVector
    get() {
        if (`_cloudy-2-line` != null) {
            return `_cloudy-2-line`!!
        }
        `_cloudy-2-line` = Builder(name = "Cloudy-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.6863f, 21.0f, 1.0f, 18.3137f, 1.0f, 15.0f)
                curveTo(1.0f, 12.3846f, 2.6735f, 10.16f, 5.008f, 9.3386f)
                curveTo(5.0027f, 9.2264f, 5.0f, 9.1135f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 9.1135f, 18.9973f, 9.2264f, 18.992f, 9.3386f)
                curveTo(21.3265f, 10.16f, 23.0f, 12.3846f, 23.0f, 15.0f)
                curveTo(23.0f, 18.3137f, 20.3137f, 21.0f, 17.0f, 21.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 19.0f, 21.0f, 17.2091f, 21.0f, 15.0f)
                curveTo(21.0f, 12.7909f, 19.2091f, 11.0f, 17.0f, 11.0f)
                curveTo(16.8561f, 11.0f, 16.714f, 11.0076f, 16.5741f, 11.0224f)
                curveTo(16.8479f, 10.4041f, 17.0f, 9.7198f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2386f, 14.7614f, 4.0f, 12.0f, 4.0f)
                curveTo(9.2386f, 4.0f, 7.0f, 6.2386f, 7.0f, 9.0f)
                curveTo(7.0f, 9.7198f, 7.1521f, 10.4041f, 7.4259f, 11.0224f)
                curveTo(7.286f, 11.0076f, 7.1439f, 11.0f, 7.0f, 11.0f)
                curveTo(4.7909f, 11.0f, 3.0f, 12.7909f, 3.0f, 15.0f)
                curveTo(3.0f, 17.2091f, 4.7909f, 19.0f, 7.0f, 19.0f)
                close()
            }
        }
        .build()
        return `_cloudy-2-line`!!
    }

private var `_cloudy-2-line`: ImageVector? = null
