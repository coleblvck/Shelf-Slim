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

public val WeatherGroup.`Fire-fill`: ImageVector
    get() {
        if (`_fire-fill` != null) {
            return `_fire-fill`!!
        }
        `_fire-fill` = Builder(name = "Fire-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(7.8579f, 23.0f, 4.5f, 19.6421f, 4.5f, 15.5f)
                curveTo(4.5f, 13.3462f, 5.4079f, 11.4045f, 6.8618f, 10.0366f)
                curveTo(8.204f, 8.7738f, 11.5f, 6.4995f, 11.0f, 1.5f)
                curveTo(17.0f, 5.5f, 20.0f, 9.5f, 14.0f, 15.5f)
                curveTo(15.0f, 15.5f, 16.5f, 15.5f, 19.0f, 13.0296f)
                curveTo(19.2697f, 13.8032f, 19.5f, 14.6345f, 19.5f, 15.5f)
                curveTo(19.5f, 19.6421f, 16.1421f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return `_fire-fill`!!
    }

private var `_fire-fill`: ImageVector? = null
