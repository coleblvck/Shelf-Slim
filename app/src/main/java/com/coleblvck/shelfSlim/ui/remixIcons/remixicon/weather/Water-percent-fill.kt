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

public val WeatherGroup.`Water-percent-fill`: ImageVector
    get() {
        if (`_water-percent-fill` != null) {
            return `_water-percent-fill`!!
        }
        `_water-percent-fill` = Builder(name = "Water-percent-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.269f)
                lineTo(5.636f, 6.633f)
                curveTo(2.1213f, 10.1477f, 2.1213f, 15.8462f, 5.636f, 19.3609f)
                curveTo(9.1508f, 22.8756f, 14.8492f, 22.8756f, 18.364f, 19.3609f)
                curveTo(21.8787f, 15.8462f, 21.8787f, 10.1477f, 18.364f, 6.633f)
                lineTo(12.0f, 0.269f)
                close()
                moveTo(16.2427f, 10.1714f)
                lineTo(9.1716f, 17.2425f)
                lineTo(7.7574f, 15.8282f)
                lineTo(14.8285f, 8.7572f)
                lineTo(16.2427f, 10.1714f)
                close()
                moveTo(8.111f, 9.1107f)
                curveTo(8.6967f, 8.5249f, 9.6465f, 8.5249f, 10.2323f, 9.1107f)
                curveTo(10.8181f, 9.6965f, 10.8181f, 10.6463f, 10.2323f, 11.232f)
                curveTo(9.6465f, 11.8178f, 8.6967f, 11.8178f, 8.111f, 11.232f)
                curveTo(7.5252f, 10.6463f, 7.5252f, 9.6965f, 8.111f, 9.1107f)
                close()
                moveTo(15.8891f, 16.8889f)
                curveTo(15.3033f, 17.4747f, 14.3536f, 17.4747f, 13.7678f, 16.8889f)
                curveTo(13.182f, 16.3031f, 13.182f, 15.3534f, 13.7678f, 14.7676f)
                curveTo(14.3536f, 14.1818f, 15.3033f, 14.1818f, 15.8891f, 14.7676f)
                curveTo(16.4749f, 15.3534f, 16.4749f, 16.3031f, 15.8891f, 16.8889f)
                close()
            }
        }
        .build()
        return `_water-percent-fill`!!
    }

private var `_water-percent-fill`: ImageVector? = null
