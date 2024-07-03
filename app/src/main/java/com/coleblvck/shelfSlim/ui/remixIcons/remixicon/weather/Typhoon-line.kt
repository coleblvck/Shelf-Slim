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

public val WeatherGroup.`Typhoon-line`: ImageVector
    get() {
        if (`_typhoon-line` != null) {
            return `_typhoon-line`!!
        }
        `_typhoon-line` = Builder(name = "Typhoon-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6544f, 1.7f)
                lineTo(14.8716f, 4.2332f)
                curveTo(16.147f, 4.6233f, 17.3453f, 5.281f, 18.3612f, 6.2063f)
                curveTo(21.8744f, 9.4061f, 21.8744f, 14.594f, 18.3612f, 17.7938f)
                curveTo(15.7696f, 20.1542f, 11.7644f, 21.6563f, 6.3456f, 22.3f)
                lineTo(9.1284f, 19.7669f)
                curveTo(7.853f, 19.3767f, 6.6547f, 18.719f, 5.6388f, 17.7938f)
                curveTo(2.1256f, 14.594f, 2.1048f, 9.425f, 5.6388f, 6.2063f)
                curveTo(8.2304f, 3.8458f, 12.2356f, 2.3438f, 17.6544f, 1.7f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 8.6863f, 5.0f, 12.0f)
                curveTo(5.0f, 15.3137f, 8.134f, 18.0f, 12.0f, 18.0f)
                curveTo(15.866f, 18.0f, 19.0f, 15.3137f, 19.0f, 12.0f)
                curveTo(19.0f, 8.6863f, 15.866f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 8.3f)
                curveTo(14.2091f, 8.3f, 16.0f, 9.9566f, 16.0f, 12.0f)
                curveTo(16.0f, 14.0435f, 14.2091f, 15.7f, 12.0f, 15.7f)
                curveTo(9.7909f, 15.7f, 8.0f, 14.0435f, 8.0f, 12.0f)
                curveTo(8.0f, 9.9566f, 9.7909f, 8.3f, 12.0f, 8.3f)
                close()
                moveTo(12.0f, 10.3f)
                curveTo(10.8621f, 10.3f, 10.0f, 11.0975f, 10.0f, 12.0f)
                curveTo(10.0f, 12.9026f, 10.8621f, 13.7f, 12.0f, 13.7f)
                curveTo(13.1379f, 13.7f, 14.0f, 12.9026f, 14.0f, 12.0f)
                curveTo(14.0f, 11.0975f, 13.1379f, 10.3f, 12.0f, 10.3f)
                close()
            }
        }
        .build()
        return `_typhoon-line`!!
    }

private var `_typhoon-line`: ImageVector? = null
