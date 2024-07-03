package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Upload-cloud-2-fill`: ImageVector
    get() {
        if (`_upload-cloud-2-fill` != null) {
            return `_upload-cloud-2-fill`!!
        }
        `_upload-cloud-2-fill` = Builder(name = "Upload-cloud-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.5858f)
                lineTo(16.2426f, 16.8284f)
                lineTo(14.8284f, 18.2426f)
                lineTo(13.0f, 16.415f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.413f)
                lineTo(9.1716f, 18.2426f)
                lineTo(7.7574f, 16.8284f)
                lineTo(12.0f, 12.5858f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.5934f, 2.0f, 18.5544f, 4.7076f, 18.9541f, 8.1939f)
                curveTo(21.2858f, 8.8315f, 23.0f, 10.9656f, 23.0f, 13.5f)
                curveTo(23.0f, 16.3688f, 20.8036f, 18.7246f, 18.0006f, 18.9776f)
                lineTo(18.0f, 17.0f)
                curveTo(18.0f, 13.6863f, 15.3137f, 11.0f, 12.0f, 11.0f)
                curveTo(8.7616f, 11.0f, 6.1224f, 13.5656f, 6.0041f, 16.7751f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0004f, 18.9776f)
                curveTo(3.197f, 18.7252f, 1.0f, 16.3692f, 1.0f, 13.5f)
                curveTo(1.0f, 10.9656f, 2.7142f, 8.8315f, 5.0465f, 8.1941f)
                curveTo(5.4456f, 4.7076f, 8.4066f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_upload-cloud-2-fill`!!
    }

private var `_upload-cloud-2-fill`: ImageVector? = null
