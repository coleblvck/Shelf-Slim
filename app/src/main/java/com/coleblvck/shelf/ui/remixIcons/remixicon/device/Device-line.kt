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

public val DeviceGroup.`Device-line`: ImageVector
    get() {
        if (`_device-line` != null) {
            return `_device-line`!!
        }
        `_device-line` = Builder(name = "Device-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 8.4477f, 22.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 22.0f, 12.0f, 21.5523f, 12.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 19.5523f, 3.0f, 19.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 8.4477f, 12.4477f, 8.0f, 13.0f, 8.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(14.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_device-line`!!
    }

private var `_device-line`: ImageVector? = null
