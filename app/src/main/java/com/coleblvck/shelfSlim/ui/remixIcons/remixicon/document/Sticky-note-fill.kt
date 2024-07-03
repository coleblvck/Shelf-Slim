package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Sticky-note-fill`: ImageVector
    get() {
        if (`_sticky-note-fill` != null) {
            return `_sticky-note-fill`!!
        }
        `_sticky-note-fill` = Builder(name = "Sticky-note-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                lineTo(14.8834f, 14.0067f)
                curveTo(14.4243f, 14.0601f, 14.0601f, 14.4243f, 14.0067f, 14.8834f)
                lineTo(14.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.9983f)
                curveTo(3.4469f, 21.0f, 3.0f, 20.5551f, 3.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(3.0f, 3.4448f, 3.445f, 3.0f, 3.9934f, 3.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 3.0f, 21.0f, 3.4475f, 21.0f, 3.9985f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(16.0f, 20.997f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_sticky-note-fill`!!
    }

private var `_sticky-note-fill`: ImageVector? = null
