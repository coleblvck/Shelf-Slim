package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Book-shelf-line`: ImageVector
    get() {
        if (`_book-shelf-line` != null) {
            return `_book-shelf-line`!!
        }
        `_book-shelf-line` = Builder(name = "Book-shelf-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 21.0f, 15.0f, 20.5523f, 15.0f, 20.0f)
                verticalLineTo(15.2973f)
                lineTo(15.9995f, 19.9996f)
                curveTo(16.1143f, 20.5398f, 16.6454f, 20.8847f, 17.1856f, 20.7699f)
                lineTo(21.0982f, 19.9382f)
                curveTo(21.6384f, 19.8234f, 21.9832f, 19.2924f, 21.8684f, 18.7522f)
                lineTo(18.9576f, 5.0581f)
                curveTo(18.8428f, 4.5179f, 18.3118f, 4.173f, 17.7716f, 4.2879f)
                lineTo(14.9927f, 4.8785f)
                curveTo(14.9328f, 4.3835f, 14.5112f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 3.4477f, 9.5523f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(17.3321f, 16.6496f)
                lineTo(19.2884f, 16.2338f)
                lineTo(19.7042f, 18.1898f)
                lineTo(17.7479f, 18.6057f)
                lineTo(17.3321f, 16.6496f)
                close()
                moveTo(16.9163f, 14.6933f)
                lineTo(15.253f, 6.8679f)
                lineTo(17.2092f, 6.4521f)
                lineTo(18.8726f, 14.2775f)
                lineTo(16.9163f, 14.6933f)
                close()
            }
        }
        .build()
        return `_book-shelf-line`!!
    }

private var `_book-shelf-line`: ImageVector? = null
