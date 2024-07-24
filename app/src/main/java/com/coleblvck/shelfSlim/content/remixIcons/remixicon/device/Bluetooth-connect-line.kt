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

public val DeviceGroup.`Bluetooth-connect-line`: ImageVector
    get() {
        if (`_bluetooth-connect-line` != null) {
            return `_bluetooth-connect-line`!!
        }
        `_bluetooth-connect-line` = Builder(name = "Bluetooth-connect-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3113f, 12.0f)
                lineTo(18.6544f, 16.3431f)
                lineTo(12.9976f, 22.0f)
                horizontalLineTo(10.9976f)
                verticalLineTo(15.3137f)
                lineTo(6.6336f, 19.6777f)
                lineTo(5.2194f, 18.2635f)
                lineTo(10.9976f, 12.4853f)
                verticalLineTo(11.5147f)
                lineTo(5.2194f, 5.7365f)
                lineTo(6.6336f, 4.3223f)
                lineTo(10.9976f, 8.6863f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.9976f)
                lineTo(18.6544f, 7.6568f)
                lineTo(14.3113f, 12.0f)
                close()
                moveTo(12.9976f, 13.5147f)
                verticalLineTo(19.1716f)
                lineTo(15.826f, 16.3431f)
                lineTo(12.9976f, 13.5147f)
                close()
                moveTo(12.9976f, 10.4853f)
                lineTo(15.826f, 7.6568f)
                lineTo(12.9976f, 4.8284f)
                verticalLineTo(10.4853f)
                close()
                moveTo(19.5f, 13.5f)
                curveTo(18.6716f, 13.5f, 18.0f, 12.8284f, 18.0f, 12.0f)
                curveTo(18.0f, 11.1716f, 18.6716f, 10.5f, 19.5f, 10.5f)
                curveTo(20.3284f, 10.5f, 21.0f, 11.1716f, 21.0f, 12.0f)
                curveTo(21.0f, 12.8284f, 20.3284f, 13.5f, 19.5f, 13.5f)
                close()
                moveTo(6.5f, 13.5f)
                curveTo(5.6716f, 13.5f, 5.0f, 12.8284f, 5.0f, 12.0f)
                curveTo(5.0f, 11.1716f, 5.6716f, 10.5f, 6.5f, 10.5f)
                curveTo(7.3284f, 10.5f, 8.0f, 11.1716f, 8.0f, 12.0f)
                curveTo(8.0f, 12.8284f, 7.3284f, 13.5f, 6.5f, 13.5f)
                close()
            }
        }
        .build()
        return `_bluetooth-connect-line`!!
    }

private var `_bluetooth-connect-line`: ImageVector? = null
