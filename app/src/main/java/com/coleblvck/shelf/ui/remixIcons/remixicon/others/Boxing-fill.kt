package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Boxing-fill`: ImageVector
    get() {
        if (`_boxing-fill` != null) {
            return `_boxing-fill`!!
        }
        `_boxing-fill` = Builder(name = "Boxing-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.501f, 11.0f)
                lineTo(9.6455f, 11.0069f)
                curveTo(10.3586f, 11.075f, 10.926f, 11.6424f, 10.9941f, 12.3555f)
                lineTo(11.001f, 12.5f)
                lineTo(10.9941f, 12.6445f)
                curveTo(10.926f, 13.3576f, 10.3586f, 13.925f, 9.6455f, 13.9931f)
                lineTo(9.501f, 14.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.501f)
                curveTo(11.2009f, 16.0f, 12.6178f, 14.7881f, 12.9348f, 13.1811f)
                lineTo(12.9654f, 13.0009f)
                lineTo(19.001f, 13.0f)
                curveTo(19.7123f, 13.0f, 20.3889f, 12.8515f, 21.0015f, 12.5837f)
                lineTo(21.001f, 17.0f)
                curveTo(21.001f, 18.3059f, 20.1666f, 19.4169f, 19.0019f, 19.829f)
                lineTo(19.001f, 21.0f)
                curveTo(19.001f, 21.5523f, 18.5533f, 22.0f, 18.001f, 22.0f)
                horizontalLineTo(6.001f)
                curveTo(5.4487f, 22.0f, 5.001f, 21.5523f, 5.001f, 21.0f)
                lineTo(5.0011f, 19.8293f)
                curveTo(3.8359f, 19.4175f, 3.001f, 18.3063f, 3.001f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(3.001f, 11.8954f, 3.8964f, 11.0f, 5.001f, 11.0f)
                horizontalLineTo(9.501f)
                close()
                moveTo(22.001f, 7.5f)
                verticalLineTo(8.0f)
                lineTo(21.9959f, 8.1763f)
                curveTo(21.908f, 9.6927f, 20.6938f, 10.907f, 19.1773f, 10.9949f)
                lineTo(19.001f, 11.0f)
                horizontalLineTo(12.6642f)
                curveTo(12.1305f, 9.8766f, 11.0161f, 9.0827f, 9.7089f, 9.0061f)
                lineTo(9.501f, 9.0f)
                horizontalLineTo(5.001f)
                curveTo(4.272f, 9.0f, 3.5886f, 9.195f, 3.0f, 9.5357f)
                lineTo(3.001f, 6.0f)
                curveTo(3.001f, 3.7909f, 4.7919f, 2.0f, 7.001f, 2.0f)
                horizontalLineTo(16.501f)
                curveTo(19.5386f, 2.0f, 22.001f, 4.4624f, 22.001f, 7.5f)
                close()
            }
        }
        .build()
        return `_boxing-fill`!!
    }

private var `_boxing-fill`: ImageVector? = null
