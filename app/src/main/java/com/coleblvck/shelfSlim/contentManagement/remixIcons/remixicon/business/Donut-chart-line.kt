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

public val BusinessGroup.`Donut-chart-line`: ImageVector
    get() {
        if (`_donut-chart-line` != null) {
            return `_donut-chart-line`!!
        }
        `_donut-chart-line` = Builder(name = "Donut-chart-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9999f, 2.0494f)
                lineTo(11.0f, 4.0619f)
                curveTo(7.0537f, 4.554f, 4.0f, 7.9204f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(13.8487f, 20.0f, 15.5509f, 19.3729f, 16.9055f, 18.3199f)
                lineTo(18.3289f, 19.7428f)
                curveTo(16.605f, 21.1536f, 14.4014f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9466f, 2.5512f, 10.9999f, 2.0494f)
                close()
                moveTo(21.9506f, 13.0001f)
                curveTo(21.7509f, 15.0111f, 20.9555f, 16.8468f, 19.7433f, 18.3283f)
                lineTo(18.3199f, 16.9055f)
                curveTo(19.1801f, 15.799f, 19.756f, 14.4606f, 19.9381f, 12.9999f)
                lineTo(21.9506f, 13.0001f)
                close()
                moveTo(13.0011f, 2.0495f)
                curveTo(17.725f, 2.519f, 21.4815f, 6.2759f, 21.9506f, 10.9999f)
                lineTo(19.9381f, 11.0f)
                curveTo(19.4869f, 7.3816f, 16.6192f, 4.5136f, 13.001f, 4.062f)
                lineTo(13.0011f, 2.0495f)
                close()
            }
        }
        .build()
        return `_donut-chart-line`!!
    }

private var `_donut-chart-line`: ImageVector? = null
