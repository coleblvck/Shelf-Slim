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

public val DocumentGroup.`Book-2-line`: ImageVector
    get() {
        if (`_book-2-line` != null) {
            return `_book-2-line`!!
        }
        `_book-2-line` = Builder(name = "Book-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 18.0f, 5.0f, 18.4477f, 5.0f, 19.0f)
                curveTo(5.0f, 19.5523f, 5.4477f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 22.0f, 3.0f, 20.6569f, 3.0f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 2.8954f, 3.8954f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(5.0f, 16.05f)
                curveTo(5.1616f, 16.0172f, 5.3288f, 16.0f, 5.5f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.05f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_book-2-line`!!
    }

private var `_book-2-line`: ImageVector? = null
