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

public val DocumentGroup.`File-user-fill`: ImageVector
    get() {
        if (`_file-user-fill` != null) {
            return `_file-user-fill`!!
        }
        `_file-user-fill` = Builder(name = "File-user-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 11.5f)
                curveTo(13.3807f, 11.5f, 14.5f, 10.3807f, 14.5f, 9.0f)
                curveTo(14.5f, 7.6193f, 13.3807f, 6.5f, 12.0f, 6.5f)
                curveTo(10.6193f, 6.5f, 9.5f, 7.6193f, 9.5f, 9.0f)
                curveTo(9.5f, 10.3807f, 10.6193f, 11.5f, 12.0f, 11.5f)
                close()
                moveTo(7.5275f, 17.0f)
                horizontalLineTo(16.4725f)
                curveTo(16.2238f, 14.75f, 14.3163f, 13.0f, 12.0f, 13.0f)
                curveTo(9.6837f, 13.0f, 7.7762f, 14.75f, 7.5275f, 17.0f)
                close()
            }
        }
        .build()
        return `_file-user-fill`!!
    }

private var `_file-user-fill`: ImageVector? = null
