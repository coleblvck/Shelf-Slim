package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Cake-fill`: ImageVector
    get() {
        if (`_cake-fill` != null) {
            return `_cake-fill`!!
        }
        `_cake-fill` = Builder(name = "Cake-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.9999f)
                verticalLineTo(10.9999f)
                lineTo(20.0f, 10.9999f)
                curveTo(20.5523f, 10.9999f, 21.0f, 11.4476f, 21.0f, 11.9999f)
                verticalLineTo(19.9999f)
                lineTo(23.0f, 19.9999f)
                verticalLineTo(21.9999f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.9999f)
                lineTo(3.0f, 19.9999f)
                verticalLineTo(11.9999f)
                curveTo(3.0f, 11.4476f, 3.4477f, 10.9999f, 4.0f, 10.9999f)
                lineTo(11.0f, 10.9999f)
                verticalLineTo(6.9999f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.8301f, 0.4019f)
                curveTo(14.6586f, 1.8367f, 14.1669f, 3.6715f, 12.7321f, 4.4999f)
                lineTo(11.0f, 5.4999f)
                curveTo(10.1716f, 4.0651f, 10.6632f, 2.2303f, 12.0981f, 1.4019f)
                lineTo(13.8301f, 0.4019f)
                close()
            }
        }
        .build()
        return `_cake-fill`!!
    }

private var `_cake-fill`: ImageVector? = null
