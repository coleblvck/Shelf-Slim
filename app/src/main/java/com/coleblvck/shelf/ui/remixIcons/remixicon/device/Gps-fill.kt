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

public val DeviceGroup.`Gps-fill`: ImageVector
    get() {
        if (`_gps-fill` != null) {
            return `_gps-fill`!!
        }
        `_gps-fill` = Builder(name = "Gps-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 16.0f)
                close()
                moveTo(9.3726f, 16.2548f)
                curveTo(7.9486f, 15.3737f, 7.0f, 13.7976f, 7.0f, 12.0f)
                curveTo(7.0f, 9.2386f, 9.2386f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                curveTo(17.0f, 13.7976f, 16.0514f, 15.3737f, 14.6274f, 16.2548f)
                lineTo(13.2718f, 13.5436f)
                curveTo(13.7165f, 13.1768f, 14.0f, 12.6215f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 12.6215f, 10.2835f, 13.1768f, 10.7282f, 13.5436f)
                lineTo(9.3726f, 16.2548f)
                close()
                moveTo(7.1315f, 20.7369f)
                curveTo(4.0701f, 19.0274f, 2.0f, 15.7554f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7554f, 19.9299f, 19.0274f, 16.8685f, 20.7369f)
                lineTo(15.5246f, 18.0492f)
                curveTo(17.6033f, 16.8354f, 19.0f, 14.5808f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 14.5808f, 6.3967f, 16.8354f, 8.4754f, 18.0492f)
                lineTo(7.1315f, 20.7369f)
                close()
            }
        }
        .build()
        return `_gps-fill`!!
    }

private var `_gps-fill`: ImageVector? = null
