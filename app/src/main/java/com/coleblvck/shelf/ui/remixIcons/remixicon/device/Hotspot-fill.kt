package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Hotspot-fill`: ImageVector
    get() {
        if (`_hotspot-fill` != null) {
            return `_hotspot-fill`!!
        }
        `_hotspot-fill` = Builder(name = "Hotspot-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                curveTo(18.0f, 21.5523f, 17.5523f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.4477f, 4.4477f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 7.0f)
                curveTo(14.1046f, 7.0f, 15.0f, 7.8954f, 15.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(15.7614f, 4.0f, 18.0f, 6.2386f, 18.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 7.3432f, 14.6569f, 6.0f, 13.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 1.0f)
                curveTo(17.4183f, 1.0f, 21.0f, 4.5817f, 21.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 5.6863f, 16.3137f, 3.0f, 13.0f, 3.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return `_hotspot-fill`!!
    }

private var `_hotspot-fill`: ImageVector? = null
