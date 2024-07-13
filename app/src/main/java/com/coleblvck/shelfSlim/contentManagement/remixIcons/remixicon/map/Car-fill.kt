package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Car-fill`: ImageVector
    get() {
        if (`_car-fill` != null) {
            return `_car-fill`!!
        }
        `_car-fill` = Builder(name = "Car-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
                verticalLineTo(12.0f)
                lineTo(4.5133f, 5.2977f)
                curveTo(4.8061f, 4.5171f, 5.5523f, 4.0f, 6.386f, 4.0f)
                horizontalLineTo(17.614f)
                curveTo(18.4477f, 4.0f, 19.1939f, 4.5171f, 19.4867f, 5.2977f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.4477f, 22.0f, 19.0f, 21.5523f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.136f, 12.0f)
                horizontalLineTo(19.864f)
                lineTo(17.614f, 6.0f)
                horizontalLineTo(6.386f)
                lineTo(4.136f, 12.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(7.3284f, 17.0f, 8.0f, 16.3284f, 8.0f, 15.5f)
                curveTo(8.0f, 14.6716f, 7.3284f, 14.0f, 6.5f, 14.0f)
                curveTo(5.6716f, 14.0f, 5.0f, 14.6716f, 5.0f, 15.5f)
                curveTo(5.0f, 16.3284f, 5.6716f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(18.3284f, 17.0f, 19.0f, 16.3284f, 19.0f, 15.5f)
                curveTo(19.0f, 14.6716f, 18.3284f, 14.0f, 17.5f, 14.0f)
                curveTo(16.6716f, 14.0f, 16.0f, 14.6716f, 16.0f, 15.5f)
                curveTo(16.0f, 16.3284f, 16.6716f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_car-fill`!!
    }

private var `_car-fill`: ImageVector? = null
