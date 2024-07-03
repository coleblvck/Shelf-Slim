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

public val DeviceGroup.`Signal-wifi-error-line`: ImageVector
    get() {
        if (`_signal-wifi-error-line` != null) {
            return `_signal-wifi-error-line`!!
        }
        `_signal-wifi-error-line` = Builder(name = "Signal-wifi-error-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.2196f, 4.4968f, 23.3104f, 6.9961f)
                lineTo(22.0539f, 8.5522f)
                curveTo(19.3066f, 6.3306f, 15.809f, 5.0f, 12.0005f, 5.0f)
                curveTo(8.9116f, 5.0f, 6.0271f, 5.8753f, 3.5815f, 7.3915f)
                lineTo(12.0005f, 17.8169f)
                lineTo(17.9999f, 10.388f)
                verticalLineTo(13.571f)
                lineTo(12.0005f, 21.0f)
                lineTo(0.6899f, 6.9967f)
                curveTo(3.7808f, 4.4971f, 7.7158f, 3.0f, 12.0005f, 3.0f)
                close()
                moveTo(22.0005f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0005f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0005f)
                close()
                moveTo(22.0005f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0005f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0005f)
                close()
            }
        }
        .build()
        return `_signal-wifi-error-line`!!
    }

private var `_signal-wifi-error-line`: ImageVector? = null
