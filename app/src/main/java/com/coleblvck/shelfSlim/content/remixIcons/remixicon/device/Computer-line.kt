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

public val DeviceGroup.`Computer-line`: ImageVector
    get() {
        if (`_computer-line` != null) {
            return `_computer-line`!!
        }
        `_computer-line` = Builder(name = "Computer-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 18.0f, 2.0f, 17.5511f, 2.0f, 16.9925f)
                verticalLineTo(4.0075f)
                curveTo(2.0f, 3.4511f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4489f, 22.0f, 4.0075f)
                verticalLineTo(16.9925f)
                curveTo(22.0f, 17.5489f, 21.5447f, 18.0f, 21.0082f, 18.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_computer-line`!!
    }

private var `_computer-line`: ImageVector? = null
