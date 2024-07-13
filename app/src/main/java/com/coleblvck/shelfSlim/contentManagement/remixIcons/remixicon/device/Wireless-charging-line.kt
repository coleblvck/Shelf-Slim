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

public val DeviceGroup.`Wireless-charging-line`: ImageVector
    get() {
        if (`_wireless-charging-line` != null) {
            return `_wireless-charging-line`!!
        }
        `_wireless-charging-line` = Builder(name = "Wireless-charging-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9289f, 4.929f)
                lineTo(5.3432f, 6.3432f)
                curveTo(3.8954f, 7.7909f, 3.0f, 9.7909f, 3.0f, 12.0001f)
                curveTo(3.0f, 14.2092f, 3.8954f, 16.2092f, 5.3432f, 17.6569f)
                lineTo(3.9289f, 19.0712f)
                curveTo(2.1193f, 17.2616f, 1.0f, 14.7616f, 1.0f, 12.0001f)
                curveTo(1.0f, 9.2386f, 2.1193f, 6.7386f, 3.9289f, 4.929f)
                close()
                moveTo(20.0711f, 4.929f)
                curveTo(21.8808f, 6.7386f, 23.0f, 9.2386f, 23.0f, 12.0001f)
                curveTo(23.0f, 14.7616f, 21.8808f, 17.2616f, 20.0711f, 19.0712f)
                lineTo(18.6569f, 17.6569f)
                curveTo(20.1046f, 16.2092f, 21.0f, 14.2092f, 21.0f, 12.0001f)
                curveTo(21.0f, 9.7914f, 20.105f, 7.7919f, 18.6579f, 6.3442f)
                lineTo(20.0711f, 4.929f)
                close()
                moveTo(13.0f, 5.0001f)
                verticalLineTo(11.0001f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 19.0001f)
                verticalLineTo(13.0001f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 5.0001f)
                close()
                moveTo(6.7574f, 7.7574f)
                lineTo(8.1716f, 9.1716f)
                curveTo(7.4477f, 9.8955f, 7.0f, 10.8955f, 7.0f, 12.0001f)
                curveTo(7.0f, 13.1046f, 7.4477f, 14.1046f, 8.1716f, 14.8285f)
                lineTo(6.7574f, 16.2427f)
                curveTo(5.6716f, 15.1569f, 5.0f, 13.6569f, 5.0f, 12.0001f)
                curveTo(5.0f, 10.3432f, 5.6716f, 8.8432f, 6.7574f, 7.7574f)
                close()
                moveTo(17.2436f, 7.7584f)
                curveTo(18.3288f, 8.8441f, 19.0f, 10.3437f, 19.0f, 12.0001f)
                curveTo(19.0f, 13.6569f, 18.3284f, 15.1569f, 17.2426f, 16.2427f)
                lineTo(15.8284f, 14.8285f)
                curveTo(16.5523f, 14.1046f, 17.0f, 13.1046f, 17.0f, 12.0001f)
                curveTo(17.0f, 10.896f, 16.5527f, 9.8964f, 15.8294f, 9.1727f)
                lineTo(17.2436f, 7.7584f)
                close()
            }
        }
        .build()
        return `_wireless-charging-line`!!
    }

private var `_wireless-charging-line`: ImageVector? = null
