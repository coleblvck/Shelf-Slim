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

public val DocumentGroup.`Contacts-book-line`: ImageVector
    get() {
        if (`_contacts-book-line` != null) {
            return `_contacts-book-line`!!
        }
        `_contacts-book-line` = Builder(name = "Contacts-book-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(19.0049f)
                curveTo(20.1068f, 2.0f, 21.0f, 2.8982f, 21.0f, 3.9908f)
                verticalLineTo(20.0092f)
                curveTo(21.0f, 21.1087f, 20.1074f, 22.0f, 19.0049f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 14.3431f, 12.3431f, 13.0f, 14.0f, 13.0f)
                curveTo(15.6569f, 13.0f, 17.0f, 14.3431f, 17.0f, 16.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveTo(12.8954f, 12.0f, 12.0f, 11.1046f, 12.0f, 10.0f)
                curveTo(12.0f, 8.8954f, 12.8954f, 8.0f, 14.0f, 8.0f)
                curveTo(15.1046f, 8.0f, 16.0f, 8.8954f, 16.0f, 10.0f)
                curveTo(16.0f, 11.1046f, 15.1046f, 12.0f, 14.0f, 12.0f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_contacts-book-line`!!
    }

private var `_contacts-book-line`: ImageVector? = null
