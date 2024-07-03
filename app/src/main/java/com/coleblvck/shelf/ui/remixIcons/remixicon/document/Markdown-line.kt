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

public val DocumentGroup.`Markdown-line`: ImageVector
    get() {
        if (`_markdown-line` != null) {
            return `_markdown-line`!!
        }
        `_markdown-line` = Builder(name = "Markdown-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(7.0f, 15.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 10.5f)
                lineTo(11.0f, 8.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.5f)
                lineTo(9.0f, 13.5f)
                lineTo(7.0f, 11.5f)
                verticalLineTo(15.5f)
                close()
                moveTo(18.0f, 12.5f)
                horizontalLineTo(20.0f)
                lineTo(17.0f, 15.5f)
                lineTo(14.0f, 12.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return `_markdown-line`!!
    }

private var `_markdown-line`: ImageVector? = null
