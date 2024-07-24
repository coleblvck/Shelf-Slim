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

public val DocumentGroup.`Contacts-book-3-fill`: ImageVector
    get() {
        if (`_contacts-book-3-fill` != null) {
            return `_contacts-book-3-fill`!!
        }
        `_contacts-book-3-fill` = Builder(name = "Contacts-book-3-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
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
            }
        }
        .build()
        return `_contacts-book-3-fill`!!
    }

private var `_contacts-book-3-fill`: ImageVector? = null
