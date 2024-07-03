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

public val DocumentGroup.`Contacts-book-2-fill`: ImageVector
    get() {
        if (`_contacts-book-2-fill` != null) {
            return `_contacts-book-2-fill`!!
        }
        `_contacts-book-2-fill` = Builder(name = "Contacts-book-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 22.0f, 3.0f, 20.6569f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.3431f, 4.3432f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 18.0f, 5.0f, 18.4477f, 5.0f, 19.0f)
                curveTo(5.0f, 19.5523f, 5.4477f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 12.3431f, 13.6569f, 11.0f, 12.0f, 11.0f)
                curveTo(10.3431f, 11.0f, 9.0f, 12.3431f, 9.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_contacts-book-2-fill`!!
    }

private var `_contacts-book-2-fill`: ImageVector? = null
