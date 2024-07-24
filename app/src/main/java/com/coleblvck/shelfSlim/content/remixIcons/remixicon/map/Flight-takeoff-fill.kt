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

public val MapGroup.`Flight-takeoff-fill`: ImageVector
    get() {
        if (`_flight-takeoff-fill` != null) {
            return `_flight-takeoff-fill`!!
        }
        `_flight-takeoff-fill` = Builder(name = "Flight-takeoff-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.949f, 10.1118f)
                curveTo(22.1634f, 10.912f, 21.6886f, 11.7345f, 20.8884f, 11.9489f)
                lineTo(5.2218f, 16.1467f)
                curveTo(4.7786f, 16.2655f, 4.3114f, 16.0674f, 4.0887f, 15.6662f)
                lineTo(1.4658f, 10.9415f)
                lineTo(2.9147f, 10.5533f)
                lineTo(5.3825f, 12.9979f)
                lineTo(10.4778f, 11.6326f)
                lineTo(5.9673f, 4.559f)
                lineTo(7.8991f, 4.0413f)
                lineTo(14.8505f, 10.4609f)
                lineTo(20.1119f, 9.0511f)
                curveTo(20.9121f, 8.8367f, 21.7346f, 9.3116f, 21.949f, 10.1118f)
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
        return `_flight-takeoff-fill`!!
    }

private var `_flight-takeoff-fill`: ImageVector? = null
