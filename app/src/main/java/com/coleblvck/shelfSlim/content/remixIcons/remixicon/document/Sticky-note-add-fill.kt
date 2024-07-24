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

public val DocumentGroup.`Sticky-note-add-fill`: ImageVector
    get() {
        if (`_sticky-note-add-fill` != null) {
            return `_sticky-note-add-fill`!!
        }
        `_sticky-note-add-fill` = Builder(name = "Sticky-note-add-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(11.0f, 5.0f)
                curveTo(11.0f, 8.3137f, 8.3137f, 11.0f, 5.0f, 11.0f)
                curveTo(4.2987f, 11.0f, 3.6256f, 10.8797f, 3.0f, 10.6586f)
                verticalLineTo(20.0066f)
                curveTo(3.0f, 20.5551f, 3.4469f, 21.0f, 3.9983f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 14.45f, 14.45f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.9985f)
                curveTo(21.0f, 3.4475f, 20.5552f, 3.0f, 20.0066f, 3.0f)
                horizontalLineTo(10.6586f)
                curveTo(10.8797f, 3.6256f, 11.0f, 4.2987f, 11.0f, 5.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(16.0f, 20.997f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_sticky-note-add-fill`!!
    }

private var `_sticky-note-add-fill`: ImageVector? = null
