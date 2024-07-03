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

public val DocumentGroup.`File-excel-fill`: ImageVector
    get() {
        if (`_file-excel-fill` != null) {
            return `_file-excel-fill`!!
        }
        `_file-excel-fill` = Builder(name = "File-excel-fill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(13.2f, 12.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(13.6f)
                lineTo(12.0f, 10.2857f)
                lineTo(10.4f, 8.0f)
                horizontalLineTo(8.0f)
                lineTo(10.8f, 12.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(10.4f)
                lineTo(12.0f, 13.7143f)
                lineTo(13.6f, 16.0f)
                horizontalLineTo(16.0f)
                lineTo(13.2f, 12.0f)
                close()
            }
        }
        .build()
        return `_file-excel-fill`!!
    }

private var `_file-excel-fill`: ImageVector? = null
