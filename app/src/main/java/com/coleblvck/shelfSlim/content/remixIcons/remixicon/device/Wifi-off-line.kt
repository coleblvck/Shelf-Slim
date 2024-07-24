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

public val DeviceGroup.`Wifi-off-line`: ImageVector
    get() {
        if (`_wifi-off-line` != null) {
            return `_wifi-off-line`!!
        }
        `_wifi-off-line` = Builder(name = "Wifi-off-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 18.0f)
                curveTo(12.7144f, 18.0f, 13.3704f, 18.2497f, 13.8856f, 18.6665f)
                lineTo(12.0001f, 21.0f)
                lineTo(10.1145f, 18.6665f)
                curveTo(10.6297f, 18.2497f, 11.2857f, 18.0f, 12.0001f, 18.0f)
                close()
                moveTo(2.8077f, 1.3934f)
                lineTo(20.4853f, 19.0711f)
                lineTo(19.0711f, 20.4853f)
                lineTo(13.8913f, 15.3042f)
                curveTo(13.2967f, 15.1069f, 12.6609f, 15.0f, 12.0001f, 15.0f)
                curveTo(10.5719f, 15.0f, 9.2602f, 15.499f, 8.23f, 16.3322f)
                lineTo(6.9736f, 14.7759f)
                curveTo(8.2496f, 13.7442f, 9.8492f, 13.0969f, 11.5964f, 13.01f)
                lineTo(9.0002f, 10.414f)
                curveTo(7.5527f, 10.8234f, 6.2265f, 11.5217f, 5.0878f, 12.4426f)
                lineTo(3.831f, 10.8868f)
                curveTo(4.8995f, 10.0226f, 6.1076f, 9.3244f, 7.4163f, 8.8312f)
                lineTo(5.1317f, 6.5451f)
                curveTo(3.9888f, 7.0891f, 2.9206f, 7.7647f, 1.9467f, 8.5523f)
                lineTo(0.6895f, 6.9967f)
                curveTo(1.6036f, 6.2575f, 2.5916f, 5.6059f, 3.6406f, 5.0548f)
                lineTo(1.3935f, 2.8077f)
                lineTo(2.8077f, 1.3934f)
                close()
                moveTo(14.5004f, 10.2854f)
                lineTo(12.2165f, 8.0024f)
                lineTo(12.0f, 8.0f)
                curveTo(15.0947f, 8.0f, 17.9369f, 9.0814f, 20.1693f, 10.8869f)
                lineTo(18.9123f, 12.4426f)
                curveTo(17.6438f, 11.4167f, 16.1427f, 10.6672f, 14.5004f, 10.2854f)
                close()
                moveTo(12.0001f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.22f, 4.4972f, 23.3109f, 6.9969f)
                lineTo(22.0534f, 8.5523f)
                curveTo(19.3061f, 6.3306f, 15.8085f, 5.0f, 12.0001f, 5.0f)
                curveTo(11.122f, 5.0f, 10.2604f, 5.0708f, 9.4207f, 5.2069f)
                lineTo(7.7245f, 3.5109f)
                curveTo(9.095f, 3.177f, 10.5268f, 3.0f, 12.0001f, 3.0f)
                close()
            }
        }
        .build()
        return `_wifi-off-line`!!
    }

private var `_wifi-off-line`: ImageVector? = null
