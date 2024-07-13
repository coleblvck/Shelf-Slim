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

public val DeviceGroup.`Wifi-fill`: ImageVector
    get() {
        if (`_wifi-fill` != null) {
            return `_wifi-fill`!!
        }
        `_wifi-fill` = Builder(name = "Wifi-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.6895f, 6.9966f)
                curveTo(3.7803f, 4.497f, 7.7153f, 3.0f, 11.9999f, 3.0f)
                curveTo(16.2845f, 3.0f, 20.2195f, 4.497f, 23.3104f, 6.9966f)
                lineTo(21.4253f, 9.3305f)
                curveTo(18.8496f, 7.2475f, 15.5704f, 6.0f, 11.9999f, 6.0f)
                curveTo(8.4294f, 6.0f, 5.1502f, 7.2475f, 2.5745f, 9.3305f)
                lineTo(0.6895f, 6.9966f)
                close()
                moveTo(3.8312f, 10.8864f)
                curveTo(6.0635f, 9.0812f, 8.9054f, 8.0f, 11.9999f, 8.0f)
                curveTo(15.0944f, 8.0f, 17.9363f, 9.0812f, 20.1686f, 10.8864f)
                lineTo(18.2835f, 13.2203f)
                curveTo(16.5664f, 11.8317f, 14.3803f, 11.0f, 11.9999f, 11.0f)
                curveTo(9.6195f, 11.0f, 7.4334f, 11.8317f, 5.7163f, 13.2203f)
                lineTo(3.8312f, 10.8864f)
                close()
                moveTo(6.973f, 14.7763f)
                curveTo(8.3467f, 13.6653f, 10.0956f, 13.0f, 11.9999f, 13.0f)
                curveTo(13.9042f, 13.0f, 15.6531f, 13.6653f, 17.0268f, 14.7763f)
                lineTo(15.1417f, 17.1102f)
                curveTo(14.2831f, 16.4158f, 13.1901f, 16.0f, 11.9999f, 16.0f)
                curveTo(10.8097f, 16.0f, 9.7167f, 16.4158f, 8.8581f, 17.1102f)
                lineTo(6.973f, 14.7763f)
                close()
                moveTo(10.1148f, 18.6661f)
                curveTo(10.63f, 18.2495f, 11.2858f, 18.0f, 11.9999f, 18.0f)
                curveTo(12.714f, 18.0f, 13.3698f, 18.2495f, 13.885f, 18.6661f)
                lineTo(11.9999f, 21.0f)
                lineTo(10.1148f, 18.6661f)
                close()
            }
        }
        .build()
        return `_wifi-fill`!!
    }

private var `_wifi-fill`: ImageVector? = null
