package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Home-smile-fill`: ImageVector
    get() {
        if (`_home-smile-fill` != null) {
            return `_home-smile-fill`!!
        }
        `_home-smile-fill` = Builder(name = "Home-smile-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.5f, 13.0f)
                curveTo(7.5f, 15.4853f, 9.5147f, 17.5f, 12.0f, 17.5f)
                curveTo(14.4853f, 17.5f, 16.5f, 15.4853f, 16.5f, 13.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 14.3807f, 13.3807f, 15.5f, 12.0f, 15.5f)
                curveTo(10.6193f, 15.5f, 9.5f, 14.3807f, 9.5f, 13.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return `_home-smile-fill`!!
    }

private var `_home-smile-fill`: ImageVector? = null
