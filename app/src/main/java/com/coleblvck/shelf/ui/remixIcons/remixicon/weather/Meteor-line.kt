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

public val WeatherGroup.`Meteor-line`: ImageVector
    get() {
        if (`_meteor-line` != null) {
            return `_meteor-line`!!
        }
        `_meteor-line` = Builder(name = "Meteor-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(19.0f, 4.122f)
                lineTo(12.0f, 7.3457f)
                verticalLineTo(4.916f)
                lineTo(8.5972f, 6.8809f)
                curveTo(6.4721f, 8.0659f, 5.1006f, 10.2673f, 5.0053f, 12.7258f)
                lineTo(5.0f, 13.0f)
                curveTo(5.0f, 16.866f, 8.134f, 20.0f, 12.0f, 20.0f)
                curveTo(15.7855f, 20.0f, 18.8691f, 16.9952f, 18.9959f, 13.2407f)
                lineTo(19.0f, 13.0f)
                verticalLineTo(4.122f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(14.7614f, 8.0f, 17.0f, 10.2386f, 17.0f, 13.0f)
                curveTo(17.0f, 15.7614f, 14.7614f, 18.0f, 12.0f, 18.0f)
                curveTo(9.2386f, 18.0f, 7.0f, 15.7614f, 7.0f, 13.0f)
                curveTo(7.0f, 10.2386f, 9.2386f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.3431f, 10.0f, 9.0f, 11.3431f, 9.0f, 13.0f)
                curveTo(9.0f, 14.6569f, 10.3431f, 16.0f, 12.0f, 16.0f)
                curveTo(13.6569f, 16.0f, 15.0f, 14.6569f, 15.0f, 13.0f)
                curveTo(15.0f, 11.3431f, 13.6569f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_meteor-line`!!
    }

private var `_meteor-line`: ImageVector? = null
