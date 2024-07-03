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

public val DeviceGroup.`Signal-wifi-off-line`: ImageVector
    get() {
        if (`_signal-wifi-off-line` != null) {
            return `_signal-wifi-off-line`!!
        }
        `_signal-wifi-off-line` = Builder(name = "Signal-wifi-off-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8082f, 1.3934f)
                lineTo(20.4858f, 19.0711f)
                lineTo(19.0716f, 20.4853f)
                lineTo(15.3889f, 16.8034f)
                lineTo(12.0005f, 21.0f)
                lineTo(0.6899f, 6.9967f)
                curveTo(1.6041f, 6.2575f, 2.592f, 5.6059f, 3.6411f, 5.0548f)
                lineTo(1.3939f, 2.8077f)
                lineTo(2.8082f, 1.3934f)
                close()
                moveTo(3.58f, 7.3918f)
                lineTo(12.0005f, 17.817f)
                lineTo(13.9669f, 15.3804f)
                lineTo(5.1316f, 6.5444f)
                curveTo(4.5998f, 6.7976f, 4.0819f, 7.0804f, 3.58f, 7.3918f)
                close()
                moveTo(12.0005f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.2196f, 4.4969f, 23.3104f, 6.9961f)
                lineTo(17.9039f, 13.689f)
                lineTo(16.4819f, 12.267f)
                lineTo(20.4204f, 7.3913f)
                curveTo(17.9226f, 5.8417f, 15.0278f, 5.0f, 12.0005f, 5.0f)
                curveTo(11.1277f, 5.0f, 10.2659f, 5.07f, 9.4214f, 5.2067f)
                lineTo(7.725f, 3.5109f)
                curveTo(9.0955f, 3.177f, 10.5273f, 3.0f, 12.0005f, 3.0f)
                close()
            }
        }
        .build()
        return `_signal-wifi-off-line`!!
    }

private var `_signal-wifi-off-line`: ImageVector? = null
