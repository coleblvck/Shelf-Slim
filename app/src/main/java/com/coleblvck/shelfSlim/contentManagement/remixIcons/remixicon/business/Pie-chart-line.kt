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

public val BusinessGroup.`Pie-chart-line`: ImageVector
    get() {
        if (`_pie-chart-line` != null) {
            return `_pie-chart-line`!!
        }
        `_pie-chart-line` = Builder(name = "Pie-chart-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.4578f)
                verticalLineTo(4.5815f)
                curveTo(6.0682f, 5.7683f, 4.0f, 8.6426f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(15.3574f, 20.0f, 18.2317f, 17.9318f, 19.4185f, 15.0f)
                horizontalLineTo(21.5422f)
                curveTo(20.2679f, 19.0571f, 16.4776f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 7.5224f, 4.9429f, 3.7321f, 9.0f, 2.4578f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 12.3375f, 21.9833f, 12.6711f, 21.9506f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0494f)
                curveTo(11.3289f, 2.0167f, 11.6625f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 4.0619f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.4869f, 7.3813f, 16.6187f, 4.5131f, 13.0f, 4.0619f)
                close()
            }
        }
        .build()
        return `_pie-chart-line`!!
    }

private var `_pie-chart-line`: ImageVector? = null
