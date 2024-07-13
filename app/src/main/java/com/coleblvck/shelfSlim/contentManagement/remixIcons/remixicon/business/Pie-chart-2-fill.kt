package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Pie-chart-2-fill`: ImageVector
    get() {
        if (`_pie-chart-2-fill` != null) {
            return `_pie-chart-2-fill`!!
        }
        `_pie-chart-2-fill` = Builder(name = "Pie-chart-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0494f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.4489f, 18.0533f, 17.1853f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8146f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                close()
                moveTo(13.0f, 0.5428f)
                curveTo(18.5535f, 1.0212f, 22.9788f, 5.4465f, 23.4571f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.5428f)
                close()
            }
        }
        .build()
        return `_pie-chart-2-fill`!!
    }

private var `_pie-chart-2-fill`: ImageVector? = null
