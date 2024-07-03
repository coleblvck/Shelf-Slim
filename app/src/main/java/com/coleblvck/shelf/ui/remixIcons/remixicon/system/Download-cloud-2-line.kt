package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Download-cloud-2-line`: ImageVector
    get() {
        if (`_download-cloud-2-line` != null) {
            return `_download-cloud-2-line`!!
        }
        `_download-cloud-2-line` = Builder(name = "Download-cloud-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                verticalLineTo(18.585f)
                lineTo(14.8284f, 16.7574f)
                lineTo(16.2426f, 18.1716f)
                lineTo(12.0f, 22.4142f)
                lineTo(7.7574f, 18.1716f)
                lineTo(9.1716f, 16.7574f)
                lineTo(11.0f, 18.585f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.5934f, 2.0f, 18.5544f, 4.7076f, 18.9541f, 8.1939f)
                curveTo(21.2858f, 8.8315f, 23.0f, 10.9656f, 23.0f, 13.5f)
                curveTo(23.0f, 16.3688f, 20.8036f, 18.7246f, 18.0006f, 18.9776f)
                lineTo(18.0009f, 16.9644f)
                curveTo(19.6966f, 16.7214f, 21.0f, 15.2629f, 21.0f, 13.5f)
                curveTo(21.0f, 11.567f, 19.433f, 10.0f, 17.5f, 10.0f)
                curveTo(17.2912f, 10.0f, 17.0867f, 10.0183f, 16.8887f, 10.054f)
                curveTo(16.9616f, 9.7142f, 17.0f, 9.3616f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2386f, 14.7614f, 4.0f, 12.0f, 4.0f)
                curveTo(9.2386f, 4.0f, 7.0f, 6.2386f, 7.0f, 9.0f)
                curveTo(7.0f, 9.3616f, 7.0384f, 9.7142f, 7.1121f, 10.0533f)
                curveTo(6.9133f, 10.0183f, 6.7088f, 10.0f, 6.5f, 10.0f)
                curveTo(4.567f, 10.0f, 3.0f, 11.567f, 3.0f, 13.5f)
                curveTo(3.0f, 15.2003f, 4.2124f, 16.6174f, 5.8199f, 16.934f)
                lineTo(6.0001f, 16.9646f)
                lineTo(6.0004f, 18.9776f)
                curveTo(3.197f, 18.7252f, 1.0f, 16.3692f, 1.0f, 13.5f)
                curveTo(1.0f, 10.9656f, 2.7142f, 8.8315f, 5.0465f, 8.1941f)
                curveTo(5.4456f, 4.7076f, 8.4066f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_download-cloud-2-line`!!
    }

private var `_download-cloud-2-line`: ImageVector? = null
