package com.coleblvck.shelfSlim.content.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-image-fill`: ImageVector
    get() {
        if (`_file-image-fill` != null) {
            return `_file-image-fill`!!
        }
        `_file-image-fill` = Builder(name = "File-image-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5551f, 22.0f, 21.0f, 21.556f, 21.0f, 21.0082f)
                verticalLineTo(7.0f)
                close()
                moveTo(11.0f, 9.5f)
                curveTo(11.0f, 10.3284f, 10.3284f, 11.0f, 9.5f, 11.0f)
                curveTo(8.6716f, 11.0f, 8.0f, 10.3284f, 8.0f, 9.5f)
                curveTo(8.0f, 8.6716f, 8.6716f, 8.0f, 9.5f, 8.0f)
                curveTo(10.3284f, 8.0f, 11.0f, 8.6716f, 11.0f, 9.5f)
                close()
                moveTo(17.5f, 17.0f)
                horizontalLineTo(8.0f)
                lineTo(13.5f, 10.0f)
                lineTo(17.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_file-image-fill`!!
    }

private var `_file-image-fill`: ImageVector? = null
