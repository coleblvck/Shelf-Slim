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

public val DeviceGroup.`Gamepad-line`: ImageVector
    get() {
        if (`_gamepad-line` != null) {
            return `_gamepad-line`!!
        }
        `_gamepad-line` = Builder(name = "Gamepad-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(4.8578f, 6.0f, 3.1089f, 7.684f, 3.0049f, 9.8004f)
                lineTo(3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 16.1422f, 4.684f, 17.8911f, 6.8004f, 17.9951f)
                lineTo(7.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(19.1422f, 18.0f, 20.8911f, 16.316f, 20.9951f, 14.1996f)
                lineTo(21.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 7.8578f, 19.316f, 6.1089f, 17.1996f, 6.0049f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.999f)
                lineTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                lineTo(7.999f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_gamepad-line`!!
    }

private var `_gamepad-line`: ImageVector? = null
