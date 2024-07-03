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

public val DeviceGroup.`Tv-fill`: ImageVector
    get() {
        if (`_tv-fill` != null) {
            return `_tv-fill`!!
        }
        `_tv-fill` = Builder(name = "Tv-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4142f, 5.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 5.0f, 22.0f, 5.4446f, 22.0f, 6.0009f)
                verticalLineTo(19.9991f)
                curveTo(22.0f, 20.5519f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5553f, 2.0f, 19.9991f)
                verticalLineTo(6.0009f)
                curveTo(2.0f, 5.4481f, 2.4553f, 5.0f, 2.9918f, 5.0f)
                horizontalLineTo(8.5858f)
                lineTo(6.0503f, 2.4644f)
                lineTo(7.4645f, 1.0502f)
                lineTo(11.4142f, 5.0f)
                horizontalLineTo(12.5858f)
                lineTo(16.5355f, 1.0502f)
                lineTo(17.9497f, 2.4644f)
                lineTo(15.4142f, 5.0f)
                close()
            }
        }
        .build()
        return `_tv-fill`!!
    }

private var `_tv-fill`: ImageVector? = null
