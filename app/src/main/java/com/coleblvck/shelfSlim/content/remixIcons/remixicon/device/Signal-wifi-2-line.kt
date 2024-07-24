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

public val DeviceGroup.`Signal-wifi-2-line`: ImageVector
    get() {
        if (`_signal-wifi-2-line` != null) {
            return `_signal-wifi-2-line`!!
        }
        `_signal-wifi-2-line` = Builder(name = "Signal-wifi-2-line", defaultWidth = 24.0.dp,
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
                moveTo(12.0005f, 12.0f)
                curveTo(10.58f, 12.0f, 9.2364f, 12.3291f, 8.0417f, 12.9152f)
                lineTo(12.0005f, 17.8169f)
                lineTo(15.9589f, 12.915f)
                curveTo(14.7643f, 12.329f, 13.4209f, 12.0f, 12.0005f, 12.0f)
                close()
                moveTo(12.0005f, 5.0f)
                curveTo(8.973f, 5.0f, 6.0779f, 5.8418f, 3.58f, 7.3918f)
                lineTo(6.7585f, 11.327f)
                curveTo(8.3168f, 10.4807f, 10.1026f, 10.0f, 12.0005f, 10.0f)
                curveTo(13.8983f, 10.0f, 15.6838f, 10.4806f, 17.242f, 11.3267f)
                lineTo(20.4204f, 7.3913f)
                curveTo(17.9226f, 5.8417f, 15.0278f, 5.0f, 12.0005f, 5.0f)
                close()
            }
        }
        .build()
        return `_signal-wifi-2-line`!!
    }

private var `_signal-wifi-2-line`: ImageVector? = null
