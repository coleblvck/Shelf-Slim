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

public val DocumentGroup.`File-search-line`: ImageVector
    get() {
        if (`_file-search-line` != null) {
            return `_file-search-line`!!
        }
        `_file-search-line` = Builder(name = "File-search-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.0f, 2.9918f)
                curveTo(3.0f, 2.4441f, 3.4475f, 2.0f, 3.9985f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(20.9997f, 7.0f)
                lineTo(21.0f, 20.9925f)
                curveTo(21.0f, 21.5489f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                close()
                moveTo(13.529f, 14.4464f)
                curveTo(11.9951f, 15.3524f, 9.9863f, 15.1464f, 8.6684f, 13.8284f)
                curveTo(7.1063f, 12.2663f, 7.1063f, 9.7337f, 8.6684f, 8.1716f)
                curveTo(10.2305f, 6.6095f, 12.7631f, 6.6095f, 14.3252f, 8.1716f)
                curveTo(15.6432f, 9.4895f, 15.8492f, 11.4983f, 14.9432f, 13.0322f)
                lineTo(17.1537f, 15.2426f)
                lineTo(15.7395f, 16.6569f)
                lineTo(13.529f, 14.4464f)
                close()
                moveTo(12.911f, 12.4142f)
                curveTo(13.6921f, 11.6332f, 13.6921f, 10.3668f, 12.911f, 9.5858f)
                curveTo(12.13f, 8.8047f, 10.8637f, 8.8047f, 10.0826f, 9.5858f)
                curveTo(9.3016f, 10.3668f, 9.3016f, 11.6332f, 10.0826f, 12.4142f)
                curveTo(10.8637f, 13.1953f, 12.13f, 13.1953f, 12.911f, 12.4142f)
                close()
            }
        }
        .build()
        return `_file-search-line`!!
    }

private var `_file-search-line`: ImageVector? = null
