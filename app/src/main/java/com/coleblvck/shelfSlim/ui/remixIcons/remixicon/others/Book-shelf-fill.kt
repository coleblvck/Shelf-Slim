package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Book-shelf-fill`: ImageVector
    get() {
        if (`_book-shelf-fill` != null) {
            return `_book-shelf-fill`!!
        }
        `_book-shelf-fill` = Builder(name = "Book-shelf-fill", defaultWidth = 24.0.dp, defaultHeight
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
                verticalLineTo(10.6973f)
                lineTo(17.0215f, 20.2076f)
                curveTo(17.1363f, 20.7479f, 17.6673f, 21.0927f, 18.2075f, 20.9779f)
                lineTo(21.142f, 20.3541f)
                curveTo(21.6822f, 20.2393f, 22.027f, 19.7083f, 21.9122f, 19.1681f)
                lineTo(19.0015f, 5.474f)
                curveTo(18.8866f, 4.9338f, 18.3556f, 4.589f, 17.8154f, 4.7038f)
                lineTo(15.0f, 5.3022f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 4.4477f, 14.5523f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 3.4477f, 8.5523f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(18.7699f, 18.8137f)
                lineTo(18.3541f, 16.8577f)
                lineTo(19.3323f, 16.6498f)
                lineTo(19.748f, 18.6058f)
                lineTo(18.7699f, 18.8137f)
                close()
            }
        }
        .build()
        return `_book-shelf-fill`!!
    }

private var `_book-shelf-fill`: ImageVector? = null
