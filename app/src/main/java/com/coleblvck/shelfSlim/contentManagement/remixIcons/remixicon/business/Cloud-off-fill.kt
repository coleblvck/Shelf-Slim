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

public val BusinessGroup.`Cloud-off-fill`: ImageVector
    get() {
        if (`_cloud-off-fill` != null) {
            return `_cloud-off-fill`!!
        }
        `_cloud-off-fill` = Builder(name = "Cloud-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5147f, 2.1005f)
                lineTo(22.6066f, 21.1924f)
                lineTo(21.1924f, 22.6066f)
                lineTo(19.1782f, 20.5924f)
                curveTo(18.503f, 20.8556f, 17.7684f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.6863f, 21.0f, 1.0f, 18.3137f, 1.0f, 15.0f)
                curveTo(1.0f, 12.3846f, 2.6735f, 10.16f, 5.008f, 9.3386f)
                curveTo(5.0027f, 9.2264f, 5.0f, 9.1135f, 5.0f, 9.0f)
                curveTo(5.0f, 8.2223f, 5.1268f, 7.4742f, 5.3609f, 6.7753f)
                lineTo(2.1005f, 3.5147f)
                lineTo(3.5147f, 2.1005f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(17.6983f, 9.0f, 18.3687f, 9.1193f, 18.992f, 9.3386f)
                curveTo(21.3265f, 10.16f, 23.0f, 12.3846f, 23.0f, 15.0f)
                curveTo(23.0f, 16.0883f, 22.7103f, 17.1089f, 22.2037f, 17.9889f)
                lineTo(14.0109f, 9.7964f)
                curveTo(14.891f, 9.2898f, 15.9117f, 9.0f, 17.0f, 9.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.242f, 2.0f, 17.9693f, 4.204f, 18.7652f, 7.1954f)
                curveTo(18.1973f, 7.0675f, 17.6065f, 7.0f, 17.0f, 7.0f)
                curveTo(15.357f, 7.0f, 13.8297f, 7.4953f, 12.5592f, 8.3447f)
                lineTo(7.6942f, 3.4806f)
                curveTo(8.8817f, 2.5528f, 10.3763f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_cloud-off-fill`!!
    }

private var `_cloud-off-fill`: ImageVector? = null
