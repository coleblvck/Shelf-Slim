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

public val DocumentGroup.`Book-3-line`: ImageVector
    get() {
        if (`_book-3-line` != null) {
            return `_book-3-line`!!
        }
        `_book-3-line` = Builder(name = "Book-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 4.0f, 5.0f, 4.8954f, 5.0f, 6.0f)
                curveTo(5.0f, 7.1046f, 5.8954f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.7909f, 22.0f, 3.0f, 20.2091f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 3.7909f, 4.7909f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveTo(5.0f, 19.1046f, 5.8954f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                curveTo(6.2714f, 10.0f, 5.5883f, 9.8052f, 5.0f, 9.4649f)
                verticalLineTo(18.0f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 7.0f, 6.0f, 6.5523f, 6.0f, 6.0f)
                curveTo(6.0f, 5.4477f, 6.4477f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_book-3-line`!!
    }

private var `_book-3-line`: ImageVector? = null
