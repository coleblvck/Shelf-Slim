package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Flight-land-line`: ImageVector
    get() {
        if (`_flight-land-line` != null) {
            return `_flight-land-line`!!
        }
        `_flight-land-line` = Builder(name = "Flight-land-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.949f, 14.8882f)
                curveTo(20.7346f, 15.6884f, 19.9121f, 16.1633f, 19.1119f, 15.9489f)
                lineTo(3.4453f, 11.751f)
                curveTo(3.002f, 11.6323f, 2.6965f, 11.2271f, 2.7042f, 10.7683f)
                lineTo(2.7951f, 5.3651f)
                lineTo(4.244f, 5.7534f)
                lineTo(5.1589f, 9.1044f)
                lineTo(10.2542f, 10.4696f)
                lineTo(9.8848f, 2.0884f)
                lineTo(11.8166f, 2.6061f)
                lineTo(14.6269f, 11.6413f)
                lineTo(19.8883f, 13.0511f)
                curveTo(20.6885f, 13.2655f, 21.1634f, 14.088f, 20.949f, 14.8882f)
                close()
                moveTo(4.0001f, 19.0f)
                horizontalLineTo(20.0001f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0001f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_flight-land-line`!!
    }

private var `_flight-land-line`: ImageVector? = null
