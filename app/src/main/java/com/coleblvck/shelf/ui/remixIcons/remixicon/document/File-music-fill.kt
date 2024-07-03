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

public val DocumentGroup.`File-music-fill`: ImageVector
    get() {
        if (`_file-music-fill` != null) {
            return `_file-music-fill`!!
        }
        `_file-music-fill` = Builder(name = "File-music-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.556f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.0f, 12.05f)
                curveTo(10.8384f, 12.0172f, 10.6712f, 12.0f, 10.5f, 12.0f)
                curveTo(9.1193f, 12.0f, 8.0f, 13.1193f, 8.0f, 14.5f)
                curveTo(8.0f, 15.8807f, 9.1193f, 17.0f, 10.5f, 17.0f)
                curveTo(11.8807f, 17.0f, 13.0f, 15.8807f, 13.0f, 14.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.05f)
                close()
            }
        }
        .build()
        return `_file-music-fill`!!
    }

private var `_file-music-fill`: ImageVector? = null
