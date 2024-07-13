package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Device-fill`: ImageVector
    get() {
        if (`_device-fill` != null) {
            return `_device-fill`!!
        }
        `_device-fill` = Builder(name = "Device-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 6.0f, 10.0f, 6.4477f, 10.0f, 7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 19.5523f, 3.0f, 19.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 22.0f, 12.0f, 21.5523f, 12.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 8.4477f, 12.4477f, 8.0f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_device-fill`!!
    }

private var `_device-fill`: ImageVector? = null
