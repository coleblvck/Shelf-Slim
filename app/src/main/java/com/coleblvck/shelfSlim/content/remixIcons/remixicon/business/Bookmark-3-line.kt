package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Bookmark-3-line`: ImageVector
    get() {
        if (`_bookmark-3-line` != null) {
            return `_bookmark-3-line`!!
        }
        `_bookmark-3-line` = Builder(name = "Bookmark-3-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(22.2763f)
                curveTo(21.0f, 22.5525f, 20.7761f, 22.7764f, 20.5f, 22.7764f)
                curveTo(20.4298f, 22.7764f, 20.3604f, 22.7615f, 20.2963f, 22.7329f)
                lineTo(12.0f, 19.0313f)
                lineTo(3.7037f, 22.7329f)
                curveTo(3.4516f, 22.8455f, 3.1559f, 22.7322f, 3.0434f, 22.4801f)
                curveTo(3.0148f, 22.4159f, 3.0f, 22.3465f, 3.0f, 22.2763f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(19.0f, 19.9645f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.9645f)
                lineTo(12.0f, 16.8412f)
                lineTo(19.0f, 19.9645f)
                close()
                moveTo(12.0f, 13.5f)
                lineTo(9.0611f, 15.0451f)
                lineTo(9.6224f, 11.7725f)
                lineTo(7.2447f, 9.4549f)
                lineTo(10.5305f, 8.9775f)
                lineTo(12.0f, 6.0f)
                lineTo(13.4695f, 8.9775f)
                lineTo(16.7553f, 9.4549f)
                lineTo(14.3776f, 11.7725f)
                lineTo(14.9389f, 15.0451f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return `_bookmark-3-line`!!
    }

private var `_bookmark-3-line`: ImageVector? = null
