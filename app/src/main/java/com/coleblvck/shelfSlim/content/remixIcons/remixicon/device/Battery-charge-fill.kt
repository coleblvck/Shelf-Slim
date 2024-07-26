package com.coleblvck.shelfSlim.content.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Battery-charge-fill`: ImageVector
    get() {
        if (`_battery-charge-fill` != null) {
            return `_battery-charge-fill`!!
        }
        `_battery-charge-fill` = Builder(name = "Battery-charge-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 5.0f, 20.0f, 5.4477f, 20.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 18.5523f, 19.5523f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_battery-charge-fill`!!
    }

private var `_battery-charge-fill`: ImageVector? = null