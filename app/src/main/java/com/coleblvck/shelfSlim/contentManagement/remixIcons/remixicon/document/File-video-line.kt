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

public val DocumentGroup.`File-video-line`: ImageVector
    get() {
        if (`_file-video-line` != null) {
            return `_file-video-line`!!
        }
        `_file-video-line` = Builder(name = "File-video-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(3.9985f, 2.0f)
                curveTo(3.4475f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5551f, 22.0f, 21.0f, 21.5489f, 21.0f, 20.9925f)
                lineTo(20.9997f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9985f)
                close()
                moveTo(15.0008f, 11.667f)
                lineTo(10.1219f, 8.4143f)
                curveTo(10.0562f, 8.3705f, 9.979f, 8.3472f, 9.9f, 8.3472f)
                curveTo(9.6791f, 8.3472f, 9.5f, 8.5262f, 9.5f, 8.7472f)
                verticalLineTo(15.2524f)
                curveTo(9.5f, 15.3314f, 9.5234f, 15.4086f, 9.5672f, 15.4743f)
                curveTo(9.6897f, 15.6581f, 9.9381f, 15.7078f, 10.1219f, 15.5852f)
                lineTo(15.0008f, 12.3326f)
                curveTo(15.0447f, 12.3033f, 15.0824f, 12.2656f, 15.1117f, 12.2217f)
                curveTo(15.2343f, 12.0379f, 15.1846f, 11.7895f, 15.0008f, 11.667f)
                close()
            }
        }
        .build()
        return `_file-video-line`!!
    }

private var `_file-video-line`: ImageVector? = null
