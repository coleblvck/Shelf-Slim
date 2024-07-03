package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-image-line`: ImageVector
    get() {
        if (`_file-image-line` != null) {
            return `_file-image-line`!!
        }
        `_file-image-line` = Builder(name = "File-image-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(3.0f, 2.9918f)
                curveTo(3.0f, 2.4441f, 3.4475f, 2.0f, 3.9985f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(20.9997f, 7.0f)
                lineTo(21.0f, 20.9925f)
                curveTo(21.0f, 21.5489f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                close()
                moveTo(11.0f, 9.5f)
                curveTo(11.0f, 10.3284f, 10.3284f, 11.0f, 9.5f, 11.0f)
                curveTo(8.6716f, 11.0f, 8.0f, 10.3284f, 8.0f, 9.5f)
                curveTo(8.0f, 8.6716f, 8.6716f, 8.0f, 9.5f, 8.0f)
                curveTo(10.3284f, 8.0f, 11.0f, 8.6716f, 11.0f, 9.5f)
                close()
                moveTo(17.5f, 17.0f)
                lineTo(13.5f, 10.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return `_file-image-line`!!
    }

private var `_file-image-line`: ImageVector? = null
