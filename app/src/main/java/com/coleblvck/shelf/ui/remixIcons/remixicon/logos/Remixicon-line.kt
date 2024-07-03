package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Remixicon-line`: ImageVector
    get() {
        if (`_remixicon-line` != null) {
            return `_remixicon-line`!!
        }
        `_remixicon-line` = Builder(name = "Remixicon-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3646f, 6.0f)
                lineTo(15.1491f, 15.6629f)
                lineTo(15.8699f, 15.38f)
                curveTo(17.5538f, 14.719f, 18.7326f, 13.2237f, 18.9607f, 11.4839f)
                curveTo(18.8083f, 11.4946f, 18.655f, 11.5f, 18.501f, 11.5f)
                curveTo(15.2512f, 11.5f, 12.5584f, 9.1151f, 12.0774f, 6.0f)
                horizontalLineTo(6.3646f)
                close()
                moveTo(14.001f, 5.0f)
                curveTo(14.001f, 7.4853f, 16.0157f, 9.5f, 18.501f, 9.5f)
                curveTo(19.306f, 9.5f, 20.0617f, 9.2886f, 20.7155f, 8.9183f)
                curveTo(20.9013f, 9.5356f, 21.001f, 10.1891f, 21.001f, 10.8654f)
                curveTo(21.001f, 13.7561f, 19.1794f, 16.2295f, 16.6006f, 17.2417f)
                lineTo(20.001f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.001f)
                curveTo(14.0381f, 4.0f, 14.0753f, 4.0003f, 14.1123f, 4.0009f)
                curveTo(14.0394f, 4.3222f, 14.001f, 4.6566f, 14.001f, 5.0f)
                close()
                moveTo(18.501f, 7.5f)
                curveTo(17.1203f, 7.5f, 16.001f, 6.3807f, 16.001f, 5.0f)
                curveTo(16.001f, 3.6193f, 17.1203f, 2.5f, 18.501f, 2.5f)
                curveTo(19.8817f, 2.5f, 21.001f, 3.6193f, 21.001f, 5.0f)
                curveTo(21.001f, 6.3807f, 19.8817f, 7.5f, 18.501f, 7.5f)
                close()
                moveTo(5.001f, 7.47f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.481f)
                lineTo(5.001f, 7.47f)
                close()
            }
        }
        .build()
        return `_remixicon-line`!!
    }

private var `_remixicon-line`: ImageVector? = null
