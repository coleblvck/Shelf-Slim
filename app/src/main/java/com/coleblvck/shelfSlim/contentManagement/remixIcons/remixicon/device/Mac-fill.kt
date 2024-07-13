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

public val DeviceGroup.`Mac-fill`: ImageVector
    get() {
        if (`_mac-fill` != null) {
            return `_mac-fill`!!
        }
        `_mac-fill` = Builder(name = "Mac-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(20.0f)
                lineTo(16.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                lineTo(7.9964f, 21.0036f)
                lineTo(10.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 18.0f, 2.0f, 17.5511f, 2.0f, 16.9925f)
                verticalLineTo(4.0075f)
                curveTo(2.0f, 3.4511f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4489f, 22.0f, 4.0075f)
                verticalLineTo(16.9925f)
                curveTo(22.0f, 17.5489f, 21.5447f, 18.0f, 21.0082f, 18.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_mac-fill`!!
    }

private var `_mac-fill`: ImageVector? = null