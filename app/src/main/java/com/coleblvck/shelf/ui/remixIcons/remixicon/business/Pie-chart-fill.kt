package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Pie-chart-fill`: ImageVector
    get() {
        if (`_pie-chart-fill` != null) {
            return `_pie-chart-fill`!!
        }
        `_pie-chart-fill` = Builder(name = "Pie-chart-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0494f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.4489f, 18.0533f, 17.1853f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5229f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                close()
                moveTo(13.0f, 2.0494f)
                curveTo(17.7244f, 2.5185f, 21.4816f, 6.2756f, 21.9506f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0494f)
                close()
            }
        }
        .build()
        return `_pie-chart-fill`!!
    }

private var `_pie-chart-fill`: ImageVector? = null
