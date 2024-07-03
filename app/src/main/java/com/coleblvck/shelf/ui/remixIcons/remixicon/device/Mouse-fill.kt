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

public val DeviceGroup.`Mouse-fill`: ImageVector
    get() {
        if (`_mouse-fill` != null) {
            return `_mouse-fill`!!
        }
        `_mouse-fill` = Builder(name = "Mouse-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1411f, 2.0f)
                horizontalLineTo(12.8589f)
                curveTo(14.8728f, 2.0f, 15.9528f, 2.2785f, 16.9305f, 2.8014f)
                curveTo(17.9083f, 3.3243f, 18.6757f, 4.0917f, 19.1986f, 5.0695f)
                curveTo(19.7215f, 6.0472f, 20.0f, 7.1272f, 20.0f, 9.1411f)
                verticalLineTo(14.8589f)
                curveTo(20.0f, 16.8728f, 19.7215f, 17.9528f, 19.1986f, 18.9305f)
                curveTo(18.6757f, 19.9083f, 17.9083f, 20.6757f, 16.9305f, 21.1986f)
                curveTo(15.9528f, 21.7215f, 14.8728f, 22.0f, 12.8589f, 22.0f)
                horizontalLineTo(11.1411f)
                curveTo(9.1272f, 22.0f, 8.0472f, 21.7215f, 7.0695f, 21.1986f)
                curveTo(6.0917f, 20.6757f, 5.3243f, 19.9083f, 4.8014f, 18.9305f)
                curveTo(4.2785f, 17.9528f, 4.0f, 16.8728f, 4.0f, 14.8589f)
                verticalLineTo(9.1411f)
                curveTo(4.0f, 7.1272f, 4.2785f, 6.0472f, 4.8014f, 5.0695f)
                curveTo(5.3243f, 4.0917f, 6.0917f, 3.3243f, 7.0695f, 2.8014f)
                curveTo(8.0472f, 2.2785f, 9.1272f, 2.0f, 11.1411f, 2.0f)
                close()
                moveTo(11.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_mouse-fill`!!
    }

private var `_mouse-fill`: ImageVector? = null
