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

public val DocumentGroup.`File-unknow-line`: ImageVector
    get() {
        if (`_file-unknow-line` != null) {
            return `_file-unknow-line`!!
        }
        `_file-unknow-line` = Builder(name = "File-unknow-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.0f, 13.3551f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                curveTo(11.0f, 11.9477f, 11.4477f, 11.5f, 12.0f, 11.5f)
                curveTo(12.8284f, 11.5f, 13.5f, 10.8284f, 13.5f, 10.0f)
                curveTo(13.5f, 9.1716f, 12.8284f, 8.5f, 12.0f, 8.5f)
                curveTo(11.2723f, 8.5f, 10.6656f, 9.0182f, 10.5288f, 9.7058f)
                lineTo(8.5673f, 9.3135f)
                curveTo(8.8864f, 7.7092f, 10.302f, 6.5f, 12.0f, 6.5f)
                curveTo(13.933f, 6.5f, 15.5f, 8.067f, 15.5f, 10.0f)
                curveTo(15.5f, 11.5855f, 14.4457f, 12.9248f, 13.0f, 13.3551f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
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
            }
        }
        .build()
        return `_file-unknow-line`!!
    }

private var `_file-unknow-line`: ImageVector? = null
