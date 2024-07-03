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

public val MediaGroup.`Video-off-fill`: ImageVector
    get() {
        if (`_video-off-fill` != null) {
            return `_video-off-fill`!!
        }
        `_video-off-fill` = Builder(name = "Video-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.4142f)
                lineTo(21.1925f, 22.6067f)
                lineTo(22.6067f, 21.1925f)
                lineTo(2.8077f, 1.3935f)
                lineTo(1.3935f, 2.8077f)
                lineTo(2.5858f, 4.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 4.0f, 1.0f, 4.4477f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.5523f, 1.4477f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 19.5523f, 17.0f, 19.0f)
                verticalLineTo(18.4142f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineTo(8.214f)
                lineTo(22.7083f, 18.4943f)
                curveTo(22.8805f, 18.4153f, 23.0f, 18.2415f, 23.0f, 18.0397f)
                verticalLineTo(5.9603f)
                curveTo(23.0f, 5.8578f, 22.9684f, 5.7576f, 22.9096f, 5.6736f)
                curveTo(22.7513f, 5.4474f, 22.4395f, 5.3924f, 22.2133f, 5.5507f)
                lineTo(17.0f, 9.2f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.4477f, 16.5523f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_video-off-fill`!!
    }

private var `_video-off-fill`: ImageVector? = null
