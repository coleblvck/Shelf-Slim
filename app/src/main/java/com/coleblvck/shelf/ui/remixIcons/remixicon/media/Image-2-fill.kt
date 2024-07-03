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

public val MediaGroup.`Image-2-fill`: ImageVector
    get() {
        if (`_image-2-fill` != null) {
            return `_image-2-fill`!!
        }
        `_image-2-fill` = Builder(name = "Image-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.1005f)
                lineTo(7.0f, 9.1005f)
                lineTo(12.5f, 14.6005f)
                lineTo(16.0f, 11.1005f)
                lineTo(19.0f, 14.1005f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.1005f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(14.6716f, 10.0f, 14.0f, 9.3284f, 14.0f, 8.5f)
                curveTo(14.0f, 7.6716f, 14.6716f, 7.0f, 15.5f, 7.0f)
                curveTo(16.3284f, 7.0f, 17.0f, 7.6716f, 17.0f, 8.5f)
                curveTo(17.0f, 9.3284f, 16.3284f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return `_image-2-fill`!!
    }

private var `_image-2-fill`: ImageVector? = null
