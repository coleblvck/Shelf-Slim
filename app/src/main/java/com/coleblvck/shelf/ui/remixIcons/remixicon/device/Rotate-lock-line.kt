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

public val DeviceGroup.`Rotate-lock-line`: ImageVector
    get() {
        if (`_rotate-lock-line` != null) {
            return `_rotate-lock-line`!!
        }
        `_rotate-lock-line` = Builder(name = "Rotate-lock-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.1364f, 21.3301f, 16.1162f, 20.1889f, 17.741f)
                lineTo(17.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.1502f, 20.0f, 16.1023f, 19.1517f, 17.5398f, 17.7716f)
                lineTo(18.5379f, 19.567f)
                curveTo(16.7848f, 21.083f, 14.4995f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.6569f, 7.0f, 15.0f, 8.3432f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.3432f, 10.3431f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.4872f, 9.0f, 11.0645f, 9.386f, 11.0067f, 9.8834f)
                lineTo(11.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.4872f, 12.614f, 9.0645f, 12.1166f, 9.0067f)
                lineTo(12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_rotate-lock-line`!!
    }

private var `_rotate-lock-line`: ImageVector? = null
