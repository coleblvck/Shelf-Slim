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

public val BusinessGroup.`Donut-chart-fill`: ImageVector
    get() {
        if (`_donut-chart-fill` != null) {
            return `_donut-chart-fill`!!
        }
        `_donut-chart-fill` = Builder(name = "Donut-chart-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9999f, 2.0494f)
                lineTo(11.0f, 5.0709f)
                curveTo(7.6077f, 5.5561f, 5.0f, 8.4735f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(13.5723f, 19.0f, 15.0236f, 18.4816f, 16.1922f, 17.6064f)
                lineTo(18.3289f, 19.7428f)
                curveTo(16.605f, 21.1536f, 14.4014f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9466f, 2.5512f, 10.9999f, 2.0494f)
                close()
                moveTo(21.9506f, 13.0001f)
                curveTo(21.7509f, 15.0111f, 20.9555f, 16.8468f, 19.7433f, 18.3283f)
                lineTo(17.6064f, 16.1922f)
                curveTo(18.2926f, 15.2759f, 18.7595f, 14.1859f, 18.9291f, 13.0f)
                lineTo(21.9506f, 13.0001f)
                close()
                moveTo(13.0011f, 2.0495f)
                curveTo(17.725f, 2.519f, 21.4815f, 6.2759f, 21.9506f, 10.9999f)
                lineTo(18.9291f, 10.9998f)
                curveTo(18.4905f, 7.9345f, 16.0661f, 5.5099f, 13.001f, 5.071f)
                lineTo(13.0011f, 2.0495f)
                close()
            }
        }
        .build()
        return `_donut-chart-fill`!!
    }

private var `_donut-chart-fill`: ImageVector? = null
