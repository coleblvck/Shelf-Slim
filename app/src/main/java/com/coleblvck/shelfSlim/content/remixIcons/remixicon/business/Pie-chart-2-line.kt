package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Pie-chart-2-line`: ImageVector
    get() {
        if (`_pie-chart-2-line` != null) {
            return `_pie-chart-2-line`!!
        }
        `_pie-chart-2-line` = Builder(name = "Pie-chart-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.5f)
                curveTo(18.3513f, 0.5f, 23.5f, 5.6487f, 23.5f, 12.0f)
                curveTo(23.5f, 12.3369f, 23.4855f, 12.6704f, 23.4571f, 13.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.4489f, 18.0533f, 17.1853f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                verticalLineTo(0.5429f)
                curveTo(11.3296f, 0.5145f, 11.6631f, 0.5f, 12.0f, 0.5f)
                close()
                moveTo(11.0f, 4.0619f)
                curveTo(7.0537f, 4.554f, 4.0f, 7.9204f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.0796f, 20.0f, 19.446f, 16.9463f, 19.9381f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0619f)
                close()
                moveTo(13.0f, 2.552f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.448f)
                curveTo(20.9827f, 6.552f, 17.448f, 3.0173f, 13.0f, 2.552f)
                close()
            }
        }
        .build()
        return `_pie-chart-2-line`!!
    }

private var `_pie-chart-2-line`: ImageVector? = null
