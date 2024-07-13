package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Sticky-note-2-fill`: ImageVector
    get() {
        if (`_sticky-note-2-fill` != null) {
            return `_sticky-note-2-fill`!!
        }
        `_sticky-note-2-fill` = Builder(name = "Sticky-note-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                lineTo(15.9968f, 21.0f)
                horizontalLineTo(3.9983f)
                curveTo(3.4469f, 21.0f, 3.0f, 20.5551f, 3.0f, 20.0066f)
                verticalLineTo(3.9934f)
                curveTo(3.0f, 3.4448f, 3.445f, 3.0f, 3.9934f, 3.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 3.0f, 21.0f, 3.4475f, 21.0f, 3.9985f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_sticky-note-2-fill`!!
    }

private var `_sticky-note-2-fill`: ImageVector? = null
