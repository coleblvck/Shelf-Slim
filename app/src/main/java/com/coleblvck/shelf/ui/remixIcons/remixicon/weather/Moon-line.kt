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

public val WeatherGroup.`Moon-line`: ImageVector
    get() {
        if (`_moon-line` != null) {
            return `_moon-line`!!
        }
        `_moon-line` = Builder(name = "Moon-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                curveTo(10.0f, 10.866f, 13.134f, 14.0f, 17.0f, 14.0f)
                curveTo(18.9584f, 14.0f, 20.729f, 13.1957f, 21.9995f, 11.8995f)
                curveTo(22.0f, 11.933f, 22.0f, 11.9665f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(12.0335f, 2.0f, 12.067f, 2.0f, 12.1005f, 2.0005f)
                curveTo(10.8043f, 3.271f, 10.0f, 5.0416f, 10.0f, 7.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(15.0583f, 20.0f, 17.7158f, 18.2839f, 19.062f, 15.7621f)
                curveTo(18.3945f, 15.9187f, 17.7035f, 16.0f, 17.0f, 16.0f)
                curveTo(12.0294f, 16.0f, 8.0f, 11.9706f, 8.0f, 7.0f)
                curveTo(8.0f, 6.2965f, 8.0813f, 5.6055f, 8.2379f, 4.938f)
                curveTo(5.7161f, 6.2842f, 4.0f, 8.9417f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_moon-line`!!
    }

private var `_moon-line`: ImageVector? = null
