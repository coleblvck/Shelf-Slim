package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Search-line`: ImageVector
    get() {
        if (`_search-line` != null) {
            return `_search-line`!!
        }
        `_search-line` = Builder(name = "Search-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.6168f)
                lineTo(22.3137f, 20.8995f)
                lineTo(20.8995f, 22.3137f)
                lineTo(16.6168f, 18.031f)
                curveTo(15.0769f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.0769f, 18.031f, 16.6168f)
                close()
                moveTo(16.0247f, 15.8748f)
                curveTo(17.2475f, 14.6146f, 18.0f, 12.8956f, 18.0f, 11.0f)
                curveTo(18.0f, 7.1325f, 14.8675f, 4.0f, 11.0f, 4.0f)
                curveTo(7.1325f, 4.0f, 4.0f, 7.1325f, 4.0f, 11.0f)
                curveTo(4.0f, 14.8675f, 7.1325f, 18.0f, 11.0f, 18.0f)
                curveTo(12.8956f, 18.0f, 14.6146f, 17.2475f, 15.8748f, 16.0247f)
                lineTo(16.0247f, 15.8748f)
                close()
            }
        }
        .build()
        return `_search-line`!!
    }

private var `_search-line`: ImageVector? = null
