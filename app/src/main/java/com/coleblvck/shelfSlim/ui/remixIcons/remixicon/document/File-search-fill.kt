package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-search-fill`: ImageVector
    get() {
        if (`_file-search-fill` != null) {
            return `_file-search-fill`!!
        }
        `_file-search-fill` = Builder(name = "File-search-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.556f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(13.529f, 14.4464f)
                lineTo(15.7395f, 16.6569f)
                lineTo(17.1537f, 15.2426f)
                lineTo(14.9432f, 13.0322f)
                curveTo(15.8492f, 11.4983f, 15.6432f, 9.4895f, 14.3252f, 8.1716f)
                curveTo(12.7631f, 6.6095f, 10.2305f, 6.6095f, 8.6684f, 8.1716f)
                curveTo(7.1063f, 9.7337f, 7.1063f, 12.2663f, 8.6684f, 13.8284f)
                curveTo(9.9863f, 15.1464f, 11.9951f, 15.3524f, 13.529f, 14.4464f)
                close()
                moveTo(12.911f, 12.4142f)
                curveTo(12.13f, 13.1953f, 10.8637f, 13.1953f, 10.0826f, 12.4142f)
                curveTo(9.3016f, 11.6332f, 9.3016f, 10.3668f, 10.0826f, 9.5858f)
                curveTo(10.8637f, 8.8047f, 12.13f, 8.8047f, 12.911f, 9.5858f)
                curveTo(13.6921f, 10.3668f, 13.6921f, 11.6332f, 12.911f, 12.4142f)
                close()
            }
        }
        .build()
        return `_file-search-fill`!!
    }

private var `_file-search-fill`: ImageVector? = null
