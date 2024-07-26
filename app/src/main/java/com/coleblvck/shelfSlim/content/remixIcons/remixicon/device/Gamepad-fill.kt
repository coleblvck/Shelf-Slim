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

public val DeviceGroup.`Gamepad-fill`: ImageVector
    get() {
        if (`_gamepad-fill` != null) {
            return `_gamepad-fill`!!
        }
        `_gamepad-fill` = Builder(name = "Gamepad-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveTo(20.3137f, 4.0f, 23.0f, 6.6863f, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 17.3137f, 20.3137f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(3.6863f, 20.0f, 1.0f, 17.3137f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 6.6863f, 3.6863f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.999f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(10.0f)
                lineTo(9.999f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_gamepad-fill`!!
    }

private var `_gamepad-fill`: ImageVector? = null