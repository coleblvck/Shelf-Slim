package com.coleblvck.shelf.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-wifi-fill`: ImageVector
    get() {
        if (`_home-wifi-fill` != null) {
            return `_home-wifi-fill`!!
        }
        `_home-wifi-fill` = Builder(name = "Home-wifi-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.5523f, 19.5523f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.7087f, 1.2648f, 12.2913f, 1.2648f, 12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(9.7614f, 13.0f, 12.0f, 15.2386f, 12.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.134f, 10.866f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(7.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 16.3431f, 8.6568f, 15.0f, 7.0f, 15.0f)
                close()
            }
        }
        .build()
        return `_home-wifi-fill`!!
    }

private var `_home-wifi-fill`: ImageVector? = null
