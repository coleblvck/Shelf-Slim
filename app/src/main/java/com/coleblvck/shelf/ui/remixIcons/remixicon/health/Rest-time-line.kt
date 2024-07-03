package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Rest-time-line`: ImageVector
    get() {
        if (`_rest-time-line` != null) {
            return `_rest-time-line`!!
        }
        `_rest-time-line` = Builder(name = "Rest-time-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(7.6863f, 8.0f, 5.0f, 10.6863f, 5.0f, 14.0f)
                curveTo(5.0f, 17.3137f, 7.6863f, 20.0f, 11.0f, 20.0f)
                curveTo(14.2384f, 20.0f, 16.8776f, 17.4344f, 16.9959f, 14.2249f)
                lineTo(17.0f, 14.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 18.4183f, 15.4183f, 22.0f, 11.0f, 22.0f)
                curveTo(6.5817f, 22.0f, 3.0f, 18.4183f, 3.0f, 14.0f)
                curveTo(3.0f, 9.6651f, 6.58f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(15.6726f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                lineTo(18.3256f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_rest-time-line`!!
    }

private var `_rest-time-line`: ImageVector? = null
