package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Sailboat-line`: ImageVector
    get() {
        if (`_sailboat-line` != null) {
            return `_sailboat-line`!!
        }
        `_sailboat-line` = Builder(name = "Sailboat-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                curveTo(21.2762f, 18.0f, 21.5f, 18.2239f, 21.5f, 18.5f)
                curveTo(21.5f, 18.6082f, 21.4649f, 18.7135f, 21.4f, 18.8f)
                lineTo(19.3f, 21.6f)
                curveTo(19.1112f, 21.8518f, 18.8148f, 22.0f, 18.5f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(5.1853f, 22.0f, 4.8889f, 21.8518f, 4.7f, 21.6f)
                lineTo(2.6f, 18.8f)
                curveTo(2.4343f, 18.5791f, 2.4791f, 18.2657f, 2.7f, 18.1f)
                curveTo(2.7866f, 18.0351f, 2.8918f, 18.0f, 3.0f, 18.0f)
                close()
                moveTo(7.1613f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.7016f)
                lineTo(7.1613f, 14.0f)
                close()
                moveTo(15.0f, 2.4254f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 15.5523f, 14.5523f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(4.0403f)
                curveTo(3.7642f, 16.0f, 3.5403f, 15.7762f, 3.5403f, 15.5f)
                curveTo(3.5403f, 15.3865f, 3.579f, 15.2764f, 3.6499f, 15.1877f)
                lineTo(14.1096f, 2.1131f)
                curveTo(14.2821f, 1.8974f, 14.5967f, 1.8625f, 14.8124f, 2.035f)
                curveTo(14.931f, 2.1299f, 15.0f, 2.2735f, 15.0f, 2.4254f)
                close()
            }
        }
        .build()
        return `_sailboat-line`!!
    }

private var `_sailboat-line`: ImageVector? = null
