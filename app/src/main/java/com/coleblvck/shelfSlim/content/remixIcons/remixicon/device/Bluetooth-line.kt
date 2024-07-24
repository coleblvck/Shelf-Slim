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

public val DeviceGroup.`Bluetooth-line`: ImageVector
    get() {
        if (`_bluetooth-line` != null) {
            return `_bluetooth-line`!!
        }
        `_bluetooth-line` = Builder(name = "Bluetooth-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3116f, 12.0f)
                lineTo(18.6548f, 16.3431f)
                lineTo(12.9979f, 22.0f)
                horizontalLineTo(10.9979f)
                verticalLineTo(15.3137f)
                lineTo(6.6339f, 19.6777f)
                lineTo(5.2197f, 18.2635f)
                lineTo(10.9979f, 12.4853f)
                verticalLineTo(11.5147f)
                lineTo(5.2197f, 5.7365f)
                lineTo(6.6339f, 4.3223f)
                lineTo(10.9979f, 8.6863f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.9979f)
                lineTo(18.6548f, 7.6568f)
                lineTo(14.3116f, 12.0f)
                close()
                moveTo(12.9979f, 13.5147f)
                verticalLineTo(19.1716f)
                lineTo(15.8263f, 16.3431f)
                lineTo(12.9979f, 13.5147f)
                close()
                moveTo(12.9979f, 10.4853f)
                lineTo(15.8263f, 7.6568f)
                lineTo(12.9979f, 4.8284f)
                verticalLineTo(10.4853f)
                close()
            }
        }
        .build()
        return `_bluetooth-line`!!
    }

private var `_bluetooth-line`: ImageVector? = null
