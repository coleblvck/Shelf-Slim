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

public val DeviceGroup.`Usb-line`: ImageVector
    get() {
        if (`_usb-line` != null) {
            return `_usb-line`!!
        }
        `_usb-line` = Builder(name = "Usb-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.381f)
                lineTo(16.0f, 11.882f)
                lineTo(15.999f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.999f)
                lineTo(18.0f, 13.118f)
                lineTo(13.0f, 15.618f)
                lineTo(13.0009f, 17.171f)
                curveTo(14.1656f, 17.5831f, 15.0f, 18.6941f, 15.0f, 20.0f)
                curveTo(15.0f, 21.6569f, 13.6569f, 23.0f, 12.0f, 23.0f)
                curveTo(10.3431f, 23.0f, 9.0f, 21.6569f, 9.0f, 20.0f)
                curveTo(9.0f, 18.813f, 9.6893f, 17.7871f, 10.6895f, 17.3006f)
                lineTo(6.0f, 14.0f)
                lineTo(5.9989f, 11.7318f)
                curveTo(5.4017f, 11.3858f, 5.0f, 10.7398f, 5.0f, 10.0f)
                curveTo(5.0f, 8.8954f, 5.8954f, 8.0f, 7.0f, 8.0f)
                curveTo(8.1046f, 8.0f, 9.0f, 8.8954f, 9.0f, 10.0f)
                curveTo(9.0f, 10.7403f, 8.5978f, 11.3866f, 8.0001f, 11.7324f)
                lineTo(8.0f, 13.0f)
                lineTo(11.0f, 15.086f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(11.4477f, 19.0f, 11.0f, 19.4477f, 11.0f, 20.0f)
                curveTo(11.0f, 20.5523f, 11.4477f, 21.0f, 12.0f, 21.0f)
                curveTo(12.5523f, 21.0f, 13.0f, 20.5523f, 13.0f, 20.0f)
                curveTo(13.0f, 19.4477f, 12.5523f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return `_usb-line`!!
    }

private var `_usb-line`: ImageVector? = null
