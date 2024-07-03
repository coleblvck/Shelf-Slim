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

public val MediaGroup.`Image-line`: ImageVector
    get() {
        if (`_image-line` != null) {
            return `_image-line`!!
        }
        `_image-line` = Builder(name = "Image-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9918f, 21.0f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                lineTo(14.0f, 9.0f)
                lineTo(20.0f, 15.0f)
                close()
                moveTo(20.0f, 17.8284f)
                lineTo(14.0f, 11.8284f)
                lineTo(6.8284f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.8284f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(6.8954f, 11.0f, 6.0f, 10.1046f, 6.0f, 9.0f)
                curveTo(6.0f, 7.8954f, 6.8954f, 7.0f, 8.0f, 7.0f)
                curveTo(9.1046f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 9.1046f, 11.0f, 8.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_image-line`!!
    }

private var `_image-line`: ImageVector? = null
