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

public val BuildingsGroup.`Home-smile-2-line`: ImageVector
    get() {
        if (`_home-smile-2-line` != null) {
            return `_home-smile-2-line`!!
        }
        `_home-smile-2-line` = Builder(name = "Home-smile-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                verticalLineTo(9.7987f)
                lineTo(12.0f, 4.2768f)
                lineTo(5.0f, 9.7987f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(9.3139f)
                curveTo(3.0f, 9.0077f, 3.1403f, 8.7184f, 3.3807f, 8.5288f)
                lineTo(11.3807f, 2.2179f)
                curveTo(11.7438f, 1.9314f, 12.2562f, 1.9314f, 12.6193f, 2.2179f)
                lineTo(20.6193f, 8.5288f)
                curveTo(20.8597f, 8.7184f, 21.0f, 9.0077f, 21.0f, 9.3139f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_home-smile-2-line`!!
    }

private var `_home-smile-2-line`: ImageVector? = null
