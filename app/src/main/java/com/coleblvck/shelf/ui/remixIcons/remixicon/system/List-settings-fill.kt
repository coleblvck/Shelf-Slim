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

public val SystemGroup.`List-settings-fill`: ImageVector
    get() {
        if (`_list-settings-fill` != null) {
            return `_list-settings-fill`!!
        }
        `_list-settings-fill` = Builder(name = "List-settings-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(2.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.674f, 13.0251f)
                lineTo(21.8301f, 12.634f)
                lineTo(22.8301f, 14.366f)
                lineTo(21.914f, 15.1711f)
                curveTo(21.9704f, 15.4386f, 22.0f, 15.7158f, 22.0f, 16.0f)
                curveTo(22.0f, 16.2842f, 21.9704f, 16.5614f, 21.914f, 16.8289f)
                lineTo(22.8301f, 17.634f)
                lineTo(21.8301f, 19.366f)
                lineTo(20.674f, 18.9749f)
                curveTo(20.2635f, 19.3441f, 19.7763f, 19.6295f, 19.2391f, 19.8044f)
                lineTo(19.0f, 21.0f)
                horizontalLineTo(17.0f)
                lineTo(16.7609f, 19.8044f)
                curveTo(16.2237f, 19.6295f, 15.7365f, 19.3441f, 15.326f, 18.9749f)
                lineTo(14.1699f, 19.366f)
                lineTo(13.1699f, 17.634f)
                lineTo(14.086f, 16.8289f)
                curveTo(14.0296f, 16.5614f, 14.0f, 16.2842f, 14.0f, 16.0f)
                curveTo(14.0f, 15.7158f, 14.0296f, 15.4386f, 14.086f, 15.1711f)
                lineTo(13.1699f, 14.366f)
                lineTo(14.1699f, 12.634f)
                lineTo(15.326f, 13.0251f)
                curveTo(15.7365f, 12.6559f, 16.2237f, 12.3705f, 16.7609f, 12.1956f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(19.0f)
                lineTo(19.2391f, 12.1956f)
                curveTo(19.7763f, 12.3705f, 20.2635f, 12.6559f, 20.674f, 13.0251f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(18.5523f, 17.0f, 19.0f, 16.5523f, 19.0f, 16.0f)
                curveTo(19.0f, 15.4477f, 18.5523f, 15.0f, 18.0f, 15.0f)
                curveTo(17.4477f, 15.0f, 17.0f, 15.4477f, 17.0f, 16.0f)
                curveTo(17.0f, 16.5523f, 17.4477f, 17.0f, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_list-settings-fill`!!
    }

private var `_list-settings-fill`: ImageVector? = null
