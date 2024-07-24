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

public val DocumentGroup.`Book-fill`: ImageVector
    get() {
        if (`_book-fill` != null) {
            return `_book-fill`!!
        }
        `_book-fill` = Builder(name = "Book-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(4.567f, 22.0f, 3.0f, 20.433f, 3.0f, 18.5f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.3431f, 4.3432f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 17.0f, 5.0f, 17.6716f, 5.0f, 18.5f)
                curveTo(5.0f, 19.3284f, 5.6716f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_book-fill`!!
    }

private var `_book-fill`: ImageVector? = null
