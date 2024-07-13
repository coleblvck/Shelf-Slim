package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Video-off-line`: ImageVector
    get() {
        if (`_video-off-line` != null) {
            return `_video-off-line`!!
        }
        `_video-off-line` = Builder(name = "Video-off-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.0f, 16.4142f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.5858f)
                lineTo(15.0f, 16.4142f)
                close()
                moveTo(23.0f, 18.0397f)
                curveTo(23.0f, 18.2517f, 22.875f, 18.4176f, 22.7083f, 18.4943f)
                lineTo(21.0f, 16.786f)
                verticalLineTo(8.8413f)
                lineTo(17.0f, 11.6413f)
                verticalLineTo(12.786f)
                lineTo(15.0f, 10.786f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.214f)
                lineTo(8.214f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 4.0f, 17.0f, 4.4477f, 17.0f, 5.0f)
                verticalLineTo(9.2f)
                lineTo(22.2133f, 5.5507f)
                curveTo(22.5447f, 5.3188f, 23.0f, 5.5558f, 23.0f, 5.9603f)
                verticalLineTo(18.0397f)
                close()
            }
        }
        .build()
        return `_video-off-line`!!
    }

private var `_video-off-line`: ImageVector? = null
