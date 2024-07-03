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

public val DeviceGroup.`Wifi-line`: ImageVector
    get() {
        if (`_wifi-line` != null) {
            return `_wifi-line`!!
        }
        `_wifi-line` = Builder(name = "Wifi-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.6895f, 6.9966f)
                curveTo(3.7803f, 4.497f, 7.7153f, 3.0f, 11.9999f, 3.0f)
                curveTo(16.2845f, 3.0f, 20.2195f, 4.497f, 23.3104f, 6.9966f)
                lineTo(22.0536f, 8.5525f)
                curveTo(19.3062f, 6.3307f, 15.8085f, 5.0f, 11.9999f, 5.0f)
                curveTo(8.1913f, 5.0f, 4.6936f, 6.3307f, 1.9462f, 8.5525f)
                lineTo(0.6895f, 6.9966f)
                close()
                moveTo(3.8312f, 10.8864f)
                curveTo(6.0635f, 9.0812f, 8.9054f, 8.0f, 11.9999f, 8.0f)
                curveTo(15.0944f, 8.0f, 17.9363f, 9.0812f, 20.1686f, 10.8864f)
                lineTo(18.9118f, 12.4424f)
                curveTo(17.023f, 10.9149f, 14.6183f, 10.0f, 11.9999f, 10.0f)
                curveTo(9.3815f, 10.0f, 6.9768f, 10.9149f, 5.088f, 12.4424f)
                lineTo(3.8312f, 10.8864f)
                close()
                moveTo(6.973f, 14.7763f)
                curveTo(8.3467f, 13.6653f, 10.0956f, 13.0f, 11.9999f, 13.0f)
                curveTo(13.9042f, 13.0f, 15.6531f, 13.6653f, 17.0268f, 14.7763f)
                lineTo(15.7701f, 16.3322f)
                curveTo(14.7398f, 15.499f, 13.4281f, 15.0f, 11.9999f, 15.0f)
                curveTo(10.5717f, 15.0f, 9.26f, 15.499f, 8.2297f, 16.3322f)
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
        return `_wifi-line`!!
    }

private var `_wifi-line`: ImageVector? = null
