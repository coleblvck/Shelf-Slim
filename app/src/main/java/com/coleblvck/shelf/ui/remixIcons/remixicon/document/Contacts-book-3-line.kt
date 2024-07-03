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

public val DocumentGroup.`Contacts-book-3-line`: ImageVector
    get() {
        if (`_contacts-book-3-line` != null) {
            return `_contacts-book-3-line`!!
        }
        `_contacts-book-3-line` = Builder(name = "Contacts-book-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.5523f, 3.4477f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 22.0f, 21.0f, 21.5523f, 21.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.4477f, 20.5523f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 16.0f)
                curveTo(9.0f, 14.3431f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 14.3431f, 15.0f, 16.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 11.1046f, 10.0f, 10.0f)
                curveTo(10.0f, 8.8954f, 10.8954f, 8.0f, 12.0f, 8.0f)
                curveTo(13.1046f, 8.0f, 14.0f, 8.8954f, 14.0f, 10.0f)
                curveTo(14.0f, 11.1046f, 13.1046f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_contacts-book-3-line`!!
    }

private var `_contacts-book-3-line`: ImageVector? = null
