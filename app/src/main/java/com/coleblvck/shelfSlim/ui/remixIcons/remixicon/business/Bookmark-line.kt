package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Bookmark-line`: ImageVector
    get() {
        if (`_bookmark-line` != null) {
            return `_bookmark-line`!!
        }
        `_bookmark-line` = Builder(name = "Bookmark-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 2.0f, 20.0f, 2.4477f, 20.0f, 3.0f)
                verticalLineTo(22.1433f)
                curveTo(20.0f, 22.4194f, 19.7761f, 22.6434f, 19.5f, 22.6434f)
                curveTo(19.4061f, 22.6434f, 19.314f, 22.6168f, 19.2344f, 22.5669f)
                lineTo(12.0f, 18.0313f)
                lineTo(4.7656f, 22.5669f)
                curveTo(4.5316f, 22.7136f, 4.2231f, 22.6429f, 4.0764f, 22.4089f)
                curveTo(4.0265f, 22.3293f, 4.0f, 22.2373f, 4.0f, 22.1433f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.4477f, 4.4477f, 2.0f, 5.0f, 2.0f)
                close()
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.4324f)
                lineTo(12.0f, 15.6707f)
                lineTo(18.0f, 19.4324f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_bookmark-line`!!
    }

private var `_bookmark-line`: ImageVector? = null
