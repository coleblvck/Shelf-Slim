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

public val BuildingsGroup.`Home-wifi-line`: ImageVector
    get() {
        if (`_home-wifi-line` != null) {
            return `_home-wifi-line`!!
        }
        `_home-wifi-line` = Builder(name = "Home-wifi-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.1574f)
                lineTo(12.0f, 3.7029f)
                lineTo(6.0f, 9.1574f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.7087f, 1.2648f, 12.2913f, 1.2648f, 12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.5523f, 19.5523f, 21.0f, 19.0f, 21.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(11.866f, 10.0f, 15.0f, 13.134f, 15.0f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 14.2386f, 10.7614f, 12.0f, 8.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(9.6568f, 14.0f, 11.0f, 15.3431f, 11.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_home-wifi-line`!!
    }

private var `_home-wifi-line`: ImageVector? = null
