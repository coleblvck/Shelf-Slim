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

public val WeatherGroup.`Meteor-fill`: ImageVector
    get() {
        if (`_meteor-fill` != null) {
            return `_meteor-fill`!!
        }
        `_meteor-fill` = Builder(name = "Meteor-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 9.7206f, 4.7539f, 6.8509f, 7.3749f, 5.2778f)
                lineTo(14.0f, 1.453f)
                verticalLineTo(4.223f)
                lineTo(21.0f, 1.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(9.2386f, 8.0f, 7.0f, 10.2386f, 7.0f, 13.0f)
                curveTo(7.0f, 15.7614f, 9.2386f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.7614f, 17.0f, 13.0f)
                curveTo(17.0f, 10.2386f, 14.7614f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_meteor-fill`!!
    }

private var `_meteor-fill`: ImageVector? = null
