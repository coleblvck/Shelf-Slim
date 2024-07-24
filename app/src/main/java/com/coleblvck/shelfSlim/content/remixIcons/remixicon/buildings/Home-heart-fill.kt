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

public val BuildingsGroup.`Home-heart-fill`: ImageVector
    get() {
        if (`_home-heart-fill` != null) {
            return `_home-heart-fill`!!
        }
        `_home-heart-fill` = Builder(name = "Home-heart-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveTo(20.0f, 20.5523f, 19.5523f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 21.0f, 4.0f, 20.5523f, 4.0f, 20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                lineTo(11.3273f, 1.6115f)
                curveTo(11.7087f, 1.2648f, 12.2913f, 1.2648f, 12.6727f, 1.6115f)
                lineTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(12.0f, 17.0f)
                lineTo(15.3588f, 13.6412f)
                curveTo(16.2374f, 12.7625f, 16.2374f, 11.3379f, 15.3588f, 10.4592f)
                curveTo(14.4801f, 9.5806f, 13.0555f, 9.5806f, 12.1768f, 10.4592f)
                lineTo(12.0f, 10.636f)
                lineTo(11.8232f, 10.4592f)
                curveTo(10.9445f, 9.5806f, 9.5199f, 9.5806f, 8.6412f, 10.4592f)
                curveTo(7.7626f, 11.3379f, 7.7626f, 12.7625f, 8.6412f, 13.6412f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_home-heart-fill`!!
    }

private var `_home-heart-fill`: ImageVector? = null
