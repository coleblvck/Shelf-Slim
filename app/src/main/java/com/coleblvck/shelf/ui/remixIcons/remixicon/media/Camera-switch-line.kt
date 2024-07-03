package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Camera-switch-line`: ImageVector
    get() {
        if (`_camera-switch-line` != null) {
            return `_camera-switch-line`!!
        }
        `_camera-switch-line` = Builder(name = "Camera-switch-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8284f, 5.0f)
                lineTo(7.8284f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.1716f)
                lineTo(14.1716f, 5.0f)
                horizontalLineTo(9.8284f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(9.6404f, 7.5304f)
                curveTo(10.3555f, 7.1903f, 11.1555f, 7.0f, 12.0f, 7.0f)
                curveTo(15.0376f, 7.0f, 17.5f, 9.4624f, 17.5f, 12.5f)
                curveTo(17.5f, 14.05f, 16.8588f, 15.4502f, 15.8273f, 16.4499f)
                lineTo(13.75f, 12.6f)
                horizontalLineTo(15.4986f)
                curveTo(15.4995f, 12.5668f, 15.5f, 12.5334f, 15.5f, 12.5f)
                curveTo(15.5f, 10.567f, 13.933f, 9.0f, 12.0f, 9.0f)
                curveTo(11.4912f, 9.0f, 11.0078f, 9.1086f, 10.5716f, 9.3038f)
                lineTo(9.6404f, 7.5304f)
                close()
                moveTo(14.3175f, 17.4894f)
                curveTo(13.6132f, 17.817f, 12.828f, 18.0f, 12.0f, 18.0f)
                curveTo(8.9624f, 18.0f, 6.5f, 15.5376f, 6.5f, 12.5f)
                curveTo(6.5f, 10.9678f, 7.1265f, 9.5819f, 8.1374f, 8.5846f)
                lineTo(10.25f, 12.5f)
                horizontalLineTo(8.5f)
                curveTo(8.5f, 14.433f, 10.067f, 16.0f, 12.0f, 16.0f)
                curveTo(12.4923f, 16.0f, 12.9608f, 15.8984f, 13.3857f, 15.715f)
                lineTo(14.3175f, 17.4894f)
                close()
            }
        }
        .build()
        return `_camera-switch-line`!!
    }

private var `_camera-switch-line`: ImageVector? = null
