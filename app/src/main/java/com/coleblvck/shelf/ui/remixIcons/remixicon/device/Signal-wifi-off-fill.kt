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

public val DeviceGroup.`Signal-wifi-off-fill`: ImageVector
    get() {
        if (`_signal-wifi-off-fill` != null) {
            return `_signal-wifi-off-fill`!!
        }
        `_signal-wifi-off-fill` = Builder(name = "Signal-wifi-off-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8082f, 1.3934f)
                lineTo(20.4858f, 19.0711f)
                lineTo(19.0716f, 20.4853f)
                lineTo(15.3889f, 16.8024f)
                lineTo(12.0005f, 21.0f)
                lineTo(0.6899f, 6.9967f)
                curveTo(1.6041f, 6.2575f, 2.592f, 5.6059f, 3.6411f, 5.0548f)
                lineTo(1.3939f, 2.8077f)
                lineTo(2.8082f, 1.3934f)
                close()
                moveTo(12.0005f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.2196f, 4.4969f, 23.3104f, 6.9961f)
                lineTo(17.9039f, 13.689f)
                lineTo(7.725f, 3.5109f)
                curveTo(9.0955f, 3.177f, 10.5273f, 3.0f, 12.0005f, 3.0f)
                close()
            }
        }
        .build()
        return `_signal-wifi-off-fill`!!
    }

private var `_signal-wifi-off-fill`: ImageVector? = null
