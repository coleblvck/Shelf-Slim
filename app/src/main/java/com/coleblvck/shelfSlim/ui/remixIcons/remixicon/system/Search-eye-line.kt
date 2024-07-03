package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Search-eye-line`: ImageVector
    get() {
        if (`_search-eye-line` != null) {
            return `_search-eye-line`!!
        }
        `_search-eye-line` = Builder(name = "Search-eye-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.1779f, 7.1762f)
                curveTo(11.4834f, 7.4898f, 11.0f, 8.1885f, 11.0f, 9.0f)
                curveTo(11.0f, 10.1046f, 11.8954f, 11.0f, 13.0f, 11.0f)
                curveTo(13.8115f, 11.0f, 14.5102f, 10.5166f, 14.8238f, 9.8221f)
                curveTo(14.9383f, 10.1945f, 15.0f, 10.59f, 15.0f, 11.0f)
                curveTo(15.0f, 13.2091f, 13.2091f, 15.0f, 11.0f, 15.0f)
                curveTo(8.7909f, 15.0f, 7.0f, 13.2091f, 7.0f, 11.0f)
                curveTo(7.0f, 8.7909f, 8.7909f, 7.0f, 11.0f, 7.0f)
                curveTo(11.41f, 7.0f, 11.8055f, 7.0617f, 12.1779f, 7.1762f)
                close()
            }
        }
        .build()
        return `_search-eye-line`!!
    }

private var `_search-eye-line`: ImageVector? = null
