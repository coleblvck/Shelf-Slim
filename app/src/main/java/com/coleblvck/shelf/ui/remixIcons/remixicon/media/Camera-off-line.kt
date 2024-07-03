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

public val MediaGroup.`Camera-off-line`: ImageVector
    get() {
        if (`_camera-off-line` != null) {
            return `_camera-off-line`!!
        }
        `_camera-off-line` = Builder(name = "Camera-off-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5859f, 21.0f)
                horizontalLineTo(3.0002f)
                curveTo(2.4479f, 21.0f, 2.0002f, 20.5523f, 2.0002f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0002f, 5.4477f, 2.4479f, 5.0f, 3.0002f, 5.0f)
                horizontalLineTo(3.5859f)
                lineTo(1.3936f, 2.8076f)
                lineTo(2.8078f, 1.3934f)
                lineTo(22.6068f, 21.1924f)
                lineTo(21.1925f, 22.6066f)
                lineTo(19.5859f, 21.0f)
                close()
                moveTo(5.5859f, 7.0f)
                horizontalLineTo(4.0002f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.5859f)
                lineTo(15.4053f, 16.8194f)
                curveTo(14.4688f, 17.5588f, 13.286f, 18.0f, 12.0002f, 18.0f)
                curveTo(8.9626f, 18.0f, 6.5002f, 15.5376f, 6.5002f, 12.5f)
                curveTo(6.5002f, 11.2142f, 6.9414f, 10.0314f, 7.6808f, 9.0948f)
                lineTo(5.5859f, 7.0f)
                close()
                moveTo(9.1105f, 10.5246f)
                curveTo(8.7254f, 11.0868f, 8.5002f, 11.7671f, 8.5002f, 12.5f)
                curveTo(8.5002f, 14.433f, 10.0672f, 16.0f, 12.0002f, 16.0f)
                curveTo(12.7331f, 16.0f, 13.4134f, 15.7747f, 13.9756f, 15.3896f)
                lineTo(9.1105f, 10.5246f)
                close()
                moveTo(22.0002f, 17.7858f)
                lineTo(20.0002f, 15.7858f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.1717f)
                lineTo(14.1717f, 5.0f)
                horizontalLineTo(9.8286f)
                lineTo(9.5215f, 5.3071f)
                lineTo(8.1073f, 3.8929f)
                lineTo(9.0002f, 3.0f)
                horizontalLineTo(15.0002f)
                lineTo(17.0002f, 5.0f)
                horizontalLineTo(21.0002f)
                curveTo(21.5524f, 5.0f, 22.0002f, 5.4477f, 22.0002f, 6.0f)
                verticalLineTo(17.7858f)
                close()
                moveTo(11.2633f, 7.0489f)
                curveTo(11.5043f, 7.0167f, 11.7503f, 7.0f, 12.0002f, 7.0f)
                curveTo(15.0377f, 7.0f, 17.5002f, 9.4624f, 17.5002f, 12.5f)
                curveTo(17.5002f, 12.7499f, 17.4835f, 12.9958f, 17.4512f, 13.2369f)
                lineTo(15.1133f, 10.899f)
                curveTo(14.7794f, 10.251f, 14.2492f, 9.7207f, 13.6012f, 9.3868f)
                lineTo(11.2633f, 7.0489f)
                close()
            }
        }
        .build()
        return `_camera-off-line`!!
    }

private var `_camera-off-line`: ImageVector? = null
