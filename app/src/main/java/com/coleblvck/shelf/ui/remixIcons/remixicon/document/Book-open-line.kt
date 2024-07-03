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

public val DocumentGroup.`Book-open-line`: ImageVector
    get() {
        if (`_book-open-line` != null) {
            return `_book-open-line`!!
        }
        `_book-open-line` = Builder(name = "Book-open-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(10.1947f, 3.0f, 11.2671f, 3.5238f, 12.0f, 4.3542f)
                curveTo(12.7329f, 3.5238f, 13.8053f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                curveTo(13.8954f, 5.0f, 13.0f, 5.8954f, 13.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(11.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(11.0f, 5.8954f, 10.1046f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_book-open-line`!!
    }

private var `_book-open-line`: ImageVector? = null
