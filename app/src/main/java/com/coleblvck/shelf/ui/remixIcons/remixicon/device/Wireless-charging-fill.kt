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

public val DeviceGroup.`Wireless-charging-fill`: ImageVector
    get() {
        if (`_wireless-charging-fill` != null) {
            return `_wireless-charging-fill`!!
        }
        `_wireless-charging-fill` = Builder(name = "Wireless-charging-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9289f, 4.9288f)
                lineTo(5.3432f, 6.3431f)
                curveTo(3.8954f, 7.7908f, 3.0f, 9.7908f, 3.0f, 12.0f)
                curveTo(3.0f, 14.2091f, 3.8954f, 16.2091f, 5.3432f, 17.6568f)
                lineTo(3.9289f, 19.0711f)
                curveTo(2.1193f, 17.2615f, 1.0f, 14.7615f, 1.0f, 12.0f)
                curveTo(1.0f, 9.2385f, 2.1193f, 6.7385f, 3.9289f, 4.9288f)
                close()
                moveTo(20.0711f, 4.9288f)
                curveTo(21.8808f, 6.7385f, 23.0f, 9.2385f, 23.0f, 12.0f)
                curveTo(23.0f, 14.7615f, 21.8808f, 17.2615f, 20.0711f, 19.0711f)
                lineTo(18.6569f, 17.6568f)
                curveTo(20.1046f, 16.2091f, 21.0f, 14.2091f, 21.0f, 12.0f)
                curveTo(21.0f, 9.7913f, 20.105f, 7.7917f, 18.6579f, 6.3441f)
                lineTo(20.0711f, 4.9288f)
                close()
                moveTo(13.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(6.7574f, 7.7573f)
                lineTo(8.1716f, 9.1715f)
                curveTo(7.4477f, 9.8954f, 7.0f, 10.8954f, 7.0f, 12.0f)
                curveTo(7.0f, 13.1045f, 7.4477f, 14.1045f, 8.1716f, 14.8284f)
                lineTo(6.7574f, 16.2426f)
                curveTo(5.6716f, 15.1568f, 5.0f, 13.6568f, 5.0f, 12.0f)
                curveTo(5.0f, 10.3431f, 5.6716f, 8.8431f, 6.7574f, 7.7573f)
                close()
                moveTo(17.2436f, 7.7583f)
                curveTo(18.3288f, 8.844f, 19.0f, 10.3436f, 19.0f, 12.0f)
                curveTo(19.0f, 13.6568f, 18.3284f, 15.1568f, 17.2426f, 16.2426f)
                lineTo(15.8284f, 14.8284f)
                curveTo(16.5523f, 14.1045f, 17.0f, 13.1045f, 17.0f, 12.0f)
                curveTo(17.0f, 10.8959f, 16.5527f, 9.8963f, 15.8294f, 9.1725f)
                lineTo(17.2436f, 7.7583f)
                close()
            }
        }
        .build()
        return `_wireless-charging-fill`!!
    }

private var `_wireless-charging-fill`: ImageVector? = null
