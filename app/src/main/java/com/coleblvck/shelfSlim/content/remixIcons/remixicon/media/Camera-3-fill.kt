package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Camera-3-fill`: ImageVector
    get() {
        if (`_camera-3-fill` != null) {
            return `_camera-3-fill`!!
        }
        `_camera-3-fill` = Builder(name = "Camera-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0009f)
                curveTo(2.0f, 5.4481f, 2.4553f, 5.0f, 2.9918f, 5.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 5.0f, 22.0f, 5.4446f, 22.0f, 6.0009f)
                verticalLineTo(19.9991f)
                curveTo(22.0f, 20.5519f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5554f, 2.0f, 19.9991f)
                verticalLineTo(6.0009f)
                close()
                moveTo(14.0f, 18.0f)
                curveTo(16.7614f, 18.0f, 19.0f, 15.7614f, 19.0f, 13.0f)
                curveTo(19.0f, 10.2386f, 16.7614f, 8.0f, 14.0f, 8.0f)
                curveTo(11.2386f, 8.0f, 9.0f, 10.2386f, 9.0f, 13.0f)
                curveTo(9.0f, 15.7614f, 11.2386f, 18.0f, 14.0f, 18.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return `_camera-3-fill`!!
    }

private var `_camera-3-fill`: ImageVector? = null
