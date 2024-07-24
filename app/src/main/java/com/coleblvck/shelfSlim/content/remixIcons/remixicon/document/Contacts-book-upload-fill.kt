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

public val DocumentGroup.`Contacts-book-upload-fill`: ImageVector
    get() {
        if (`_contacts-book-upload-fill` != null) {
            return `_contacts-book-upload-fill`!!
        }
        `_contacts-book-upload-fill` = Builder(name = "Contacts-book-upload-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(19.0049f, 2.0f)
                curveTo(20.1068f, 2.0f, 21.0f, 2.8982f, 21.0f, 3.9908f)
                verticalLineTo(20.0092f)
                curveTo(21.0f, 21.1087f, 20.1074f, 22.0f, 19.0049f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0049f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(11.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return `_contacts-book-upload-fill`!!
    }

private var `_contacts-book-upload-fill`: ImageVector? = null
