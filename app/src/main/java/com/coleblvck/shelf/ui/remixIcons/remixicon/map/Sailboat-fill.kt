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

public val MapGroup.`Sailboat-fill`: ImageVector
    get() {
        if (`_sailboat-fill` != null) {
            return `_sailboat-fill`!!
        }
        `_sailboat-fill` = Builder(name = "Sailboat-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.9999f)
                horizontalLineTo(21.0f)
                curveTo(21.2762f, 17.9999f, 21.5f, 18.2238f, 21.5f, 18.4999f)
                curveTo(21.5f, 18.6081f, 21.4649f, 18.7134f, 21.4f, 18.7999f)
                lineTo(19.3f, 21.5999f)
                curveTo(19.1112f, 21.8517f, 18.8148f, 21.9999f, 18.5f, 21.9999f)
                horizontalLineTo(5.5f)
                curveTo(5.1853f, 21.9999f, 4.8889f, 21.8517f, 4.7f, 21.5999f)
                lineTo(2.6f, 18.7999f)
                curveTo(2.4343f, 18.579f, 2.4791f, 18.2656f, 2.7f, 18.0999f)
                curveTo(2.7866f, 18.035f, 2.8918f, 17.9999f, 3.0f, 17.9999f)
                close()
                moveTo(15.0f, 2.4253f)
                verticalLineTo(14.9999f)
                curveTo(15.0f, 15.5522f, 14.5523f, 15.9999f, 14.0f, 15.9999f)
                horizontalLineTo(4.0403f)
                curveTo(3.7642f, 15.9999f, 3.5403f, 15.7761f, 3.5403f, 15.4999f)
                curveTo(3.5403f, 15.3864f, 3.579f, 15.2762f, 3.6499f, 15.1876f)
                lineTo(14.1096f, 2.113f)
                curveTo(14.2821f, 1.8973f, 14.5967f, 1.8624f, 14.8124f, 2.0349f)
                curveTo(14.931f, 2.1298f, 15.0f, 2.2734f, 15.0f, 2.4253f)
                close()
            }
        }
        .build()
        return `_sailboat-fill`!!
    }

private var `_sailboat-fill`: ImageVector? = null
