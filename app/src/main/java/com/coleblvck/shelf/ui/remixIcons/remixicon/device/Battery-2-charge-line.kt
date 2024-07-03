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

public val DeviceGroup.`Battery-2-charge-line`: ImageVector
    get() {
        if (`_battery-2-charge-line` != null) {
            return `_battery-2-charge-line`!!
        }
        `_battery-2-charge-line` = Builder(name = "Battery-2-charge-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 7.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.4477f, 9.4477f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 2.0f, 15.0f, 2.4477f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 4.0f, 19.0f, 4.4477f, 19.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.4477f, 5.4477f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_battery-2-charge-line`!!
    }

private var `_battery-2-charge-line`: ImageVector? = null
