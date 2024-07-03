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

public val SystemGroup.`Download-cloud-fill`: ImageVector
    get() {
        if (`_download-cloud-fill` != null) {
            return `_download-cloud-fill`!!
        }
        `_download-cloud-fill` = Builder(name = "Download-cloud-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.9811f)
                curveTo(3.6438f, 20.7257f, 1.0f, 17.9216f, 1.0f, 14.5f)
                curveTo(1.0f, 12.1716f, 2.2243f, 10.1291f, 4.0643f, 8.9812f)
                curveTo(4.5647f, 5.044f, 7.9269f, 2.0f, 12.0f, 2.0f)
                curveTo(16.0731f, 2.0f, 19.4353f, 5.044f, 19.9357f, 8.9812f)
                curveTo(21.7757f, 10.1291f, 23.0f, 12.1716f, 23.0f, 14.5f)
                curveTo(23.0f, 17.9216f, 20.3562f, 20.7257f, 17.0f, 20.9811f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.9811f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 17.0f)
                lineTo(16.0f, 12.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_download-cloud-fill`!!
    }

private var `_download-cloud-fill`: ImageVector? = null
