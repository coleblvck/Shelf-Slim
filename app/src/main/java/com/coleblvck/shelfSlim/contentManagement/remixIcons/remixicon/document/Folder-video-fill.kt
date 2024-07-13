package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Folder-video-fill`: ImageVector
    get() {
        if (`_folder-video-fill` != null) {
            return `_folder-video-fill`!!
        }
        `_folder-video-fill` = Builder(name = "Folder-video-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineTo(12.4142f)
                lineTo(10.4142f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(15.0008f, 12.667f)
                curveTo(15.1846f, 12.7895f, 15.2343f, 13.0379f, 15.1117f, 13.2217f)
                curveTo(15.0824f, 13.2656f, 15.0447f, 13.3033f, 15.0008f, 13.3326f)
                lineTo(10.1219f, 16.5852f)
                curveTo(9.9381f, 16.7078f, 9.6897f, 16.6581f, 9.5672f, 16.4743f)
                curveTo(9.5234f, 16.4086f, 9.5f, 16.3314f, 9.5f, 16.2524f)
                verticalLineTo(9.7472f)
                curveTo(9.5f, 9.5262f, 9.6791f, 9.3472f, 9.9f, 9.3472f)
                curveTo(9.979f, 9.3472f, 10.0562f, 9.3705f, 10.1219f, 9.4143f)
                lineTo(15.0008f, 12.667f)
                close()
            }
        }
        .build()
        return `_folder-video-fill`!!
    }

private var `_folder-video-fill`: ImageVector? = null
