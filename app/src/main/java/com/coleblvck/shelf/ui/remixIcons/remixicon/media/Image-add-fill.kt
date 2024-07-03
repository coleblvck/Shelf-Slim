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

public val MediaGroup.`Image-add-fill`: ImageVector
    get() {
        if (`_image-add-fill` != null) {
            return `_image-add-fill`!!
        }
        `_image-add-fill` = Builder(name = "Image-add-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0082f, 3.0f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                lineTo(22.0007f, 13.3417f)
                curveTo(21.3749f, 13.1204f, 20.7015f, 13.0f, 20.0f, 13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                lineTo(4.001f, 19.0f)
                lineTo(13.2929f, 9.7072f)
                curveTo(13.6528f, 9.346f, 14.22f, 9.3182f, 14.6123f, 9.6232f)
                lineTo(14.7065f, 9.7077f)
                lineTo(18.2521f, 13.2586f)
                curveTo(15.791f, 14.0069f, 14.0f, 16.2943f, 14.0f, 19.0f)
                curveTo(14.0f, 19.7015f, 14.1204f, 20.3749f, 14.3417f, 21.0007f)
                lineTo(2.9918f, 21.0f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                close()
                moveTo(8.0f, 7.0f)
                curveTo(9.1046f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 9.1046f, 11.0f, 8.0f, 11.0f)
                curveTo(6.8954f, 11.0f, 6.0f, 10.1046f, 6.0f, 9.0f)
                curveTo(6.0f, 7.8954f, 6.8954f, 7.0f, 8.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_image-add-fill`!!
    }

private var `_image-add-fill`: ImageVector? = null
