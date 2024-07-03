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

public val DeviceGroup.`Tv-2-line`: ImageVector
    get() {
        if (`_tv-2-line` != null) {
            return `_tv-2-line`!!
        }
        `_tv-2-line` = Builder(name = "Tv-2-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0009f)
                curveTo(2.0f, 3.4481f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4446f, 22.0f, 4.0009f)
                verticalLineTo(17.9991f)
                curveTo(22.0f, 18.5519f, 21.5447f, 19.0f, 21.0082f, 19.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 19.0f, 2.0f, 18.5554f, 2.0f, 17.9991f)
                verticalLineTo(4.0009f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_tv-2-line`!!
    }

private var `_tv-2-line`: ImageVector? = null
