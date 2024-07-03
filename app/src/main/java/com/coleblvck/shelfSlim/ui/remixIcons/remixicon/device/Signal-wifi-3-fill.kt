package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Signal-wifi-3-fill`: ImageVector
    get() {
        if (`_signal-wifi-3-fill` != null) {
            return `_signal-wifi-3-fill`!!
        }
        `_signal-wifi-3-fill` = Builder(name = "Signal-wifi-3-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.2196f, 4.4968f, 23.3104f, 6.9961f)
                lineTo(12.0005f, 21.0f)
                lineTo(0.6899f, 6.9967f)
                curveTo(3.7808f, 4.4971f, 7.7158f, 3.0f, 12.0005f, 3.0f)
                close()
                moveTo(12.0005f, 5.0f)
                curveTo(8.973f, 5.0f, 6.0779f, 5.8418f, 3.58f, 7.3918f)
                lineTo(5.4844f, 9.7485f)
                curveTo(7.4002f, 8.6366f, 9.626f, 8.0f, 12.0005f, 8.0f)
                curveTo(14.3751f, 8.0f, 16.6011f, 8.6367f, 18.5169f, 9.7486f)
                lineTo(20.4204f, 7.3913f)
                curveTo(17.9226f, 5.8417f, 15.0278f, 5.0f, 12.0005f, 5.0f)
                close()
            }
        }
        .build()
        return `_signal-wifi-3-fill`!!
    }

private var `_signal-wifi-3-fill`: ImageVector? = null
