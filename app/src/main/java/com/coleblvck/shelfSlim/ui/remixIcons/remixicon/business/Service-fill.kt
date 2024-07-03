package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Service-fill`: ImageVector
    get() {
        if (`_service-fill` != null) {
            return `_service-fill`!!
        }
        `_service-fill` = Builder(name = "Service-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1213f, 10.4792f)
                curveTo(13.7308f, 10.0886f, 13.0976f, 10.0886f, 12.7071f, 10.4792f)
                lineTo(12.0f, 11.1863f)
                curveTo(11.2189f, 11.9673f, 9.9526f, 11.9673f, 9.1715f, 11.1863f)
                curveTo(8.3905f, 10.4052f, 8.3905f, 9.1389f, 9.1715f, 8.3578f)
                lineTo(14.8022f, 2.7257f)
                curveTo(16.9061f, 2.2497f, 19.2008f, 2.8307f, 20.8388f, 4.4688f)
                curveTo(23.2582f, 6.8881f, 23.3716f, 10.7402f, 21.1792f, 13.2939f)
                lineTo(19.071f, 15.4289f)
                lineTo(14.1213f, 10.4792f)
                close()
                moveTo(3.1611f, 4.4688f)
                curveTo(5.3345f, 2.2954f, 8.6641f, 1.9828f, 11.17f, 3.5312f)
                lineTo(7.7573f, 6.9436f)
                curveTo(6.1952f, 8.5057f, 6.1952f, 11.0384f, 7.7573f, 12.6005f)
                curveTo(9.2721f, 14.1152f, 11.6995f, 14.1611f, 13.2695f, 12.7382f)
                lineTo(13.4142f, 12.6005f)
                lineTo(17.6568f, 16.8431f)
                lineTo(13.4142f, 21.0858f)
                curveTo(12.6331f, 21.8668f, 11.3668f, 21.8668f, 10.5858f, 21.0858f)
                lineTo(3.1611f, 13.6611f)
                curveTo(0.6227f, 11.1227f, 0.6227f, 7.0072f, 3.1611f, 4.4688f)
                close()
            }
        }
        .build()
        return `_service-fill`!!
    }

private var `_service-fill`: ImageVector? = null
