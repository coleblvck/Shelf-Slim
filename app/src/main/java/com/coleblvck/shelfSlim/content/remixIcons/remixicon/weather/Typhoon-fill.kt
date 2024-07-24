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

public val WeatherGroup.`Typhoon-fill`: ImageVector
    get() {
        if (`_typhoon-fill` != null) {
            return `_typhoon-fill`!!
        }
        `_typhoon-fill` = Builder(name = "Typhoon-fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 8.0f)
                curveTo(9.5147f, 8.0f, 7.5f, 9.7909f, 7.5f, 12.0f)
                curveTo(7.5f, 14.2092f, 9.5147f, 16.0f, 12.0f, 16.0f)
                curveTo(14.4853f, 16.0f, 16.5f, 14.2092f, 16.5f, 12.0f)
                curveTo(16.5f, 9.7909f, 14.4853f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_typhoon-fill`!!
    }

private var `_typhoon-fill`: ImageVector? = null
