package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Camera-off-fill`: ImageVector
    get() {
        if (`_camera-off-fill` != null) {
            return `_camera-off-fill`!!
        }
        `_camera-off-fill` = Builder(name = "Camera-off-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5859f, 21.0f)
                horizontalLineTo(3.0002f)
                curveTo(2.4479f, 21.0f, 2.0002f, 20.5523f, 2.0002f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0002f, 5.4478f, 2.4479f, 5.0f, 3.0002f, 5.0f)
                horizontalLineTo(3.5859f)
                lineTo(1.3936f, 2.8077f)
                lineTo(2.8078f, 1.3934f)
                lineTo(22.6068f, 21.1924f)
                lineTo(21.1925f, 22.6066f)
                lineTo(19.5859f, 21.0f)
                close()
                moveTo(7.5554f, 8.9695f)
                curveTo(6.589f, 10.0346f, 6.0002f, 11.4486f, 6.0002f, 13.0f)
                curveTo(6.0002f, 16.3137f, 8.6865f, 19.0f, 12.0002f, 19.0f)
                curveTo(13.5516f, 19.0f, 14.9656f, 18.4112f, 16.0307f, 17.4448f)
                lineTo(14.6139f, 16.028f)
                curveTo(13.9129f, 16.6337f, 12.9993f, 17.0f, 12.0002f, 17.0f)
                curveTo(9.791f, 17.0f, 8.0002f, 15.2092f, 8.0002f, 13.0f)
                curveTo(8.0002f, 12.0009f, 8.3665f, 11.0873f, 8.9722f, 10.3863f)
                lineTo(7.5554f, 8.9695f)
                close()
                moveTo(22.0002f, 17.7858f)
                lineTo(17.9549f, 13.7406f)
                curveTo(17.9848f, 13.4979f, 18.0002f, 13.2508f, 18.0002f, 13.0f)
                curveTo(18.0002f, 9.6863f, 15.3139f, 7.0f, 12.0002f, 7.0f)
                curveTo(11.7494f, 7.0f, 11.5023f, 7.0154f, 11.2596f, 7.0453f)
                lineTo(8.1073f, 3.8929f)
                lineTo(9.0002f, 3.0f)
                horizontalLineTo(15.0002f)
                lineTo(17.0002f, 5.0f)
                horizontalLineTo(21.0002f)
                curveTo(21.5524f, 5.0f, 22.0002f, 5.4478f, 22.0002f, 6.0f)
                verticalLineTo(17.7858f)
                close()
                moveTo(13.5085f, 9.2942f)
                curveTo(14.5045f, 9.7f, 15.3002f, 10.4957f, 15.706f, 11.4917f)
                lineTo(13.5085f, 9.2942f)
                close()
            }
        }
        .build()
        return `_camera-off-fill`!!
    }

private var `_camera-off-fill`: ImageVector? = null
