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

public val BusinessGroup.`Cloud-fill`: ImageVector
    get() {
        if (`_cloud-fill` != null) {
            return `_cloud-fill`!!
        }
        `_cloud-fill` = Builder(name = "Cloud-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveTo(13.5705f, 7.0f, 10.6449f, 9.158f, 9.5073f, 12.1903f)
                lineTo(11.3805f, 12.8927f)
                curveTo(12.2337f, 10.6185f, 14.4278f, 9.0f, 17.0f, 9.0f)
                curveTo(17.6983f, 9.0f, 18.3687f, 9.1193f, 18.992f, 9.3386f)
                curveTo(21.3265f, 10.16f, 23.0f, 12.3846f, 23.0f, 15.0f)
                curveTo(23.0f, 18.3137f, 20.3137f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.6863f, 21.0f, 1.0f, 18.3137f, 1.0f, 15.0f)
                curveTo(1.0f, 12.3846f, 2.6735f, 10.16f, 5.008f, 9.3386f)
                curveTo(5.0027f, 9.2264f, 5.0f, 9.1135f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.242f, 2.0f, 17.9693f, 4.204f, 18.7652f, 7.1954f)
                curveTo(18.1973f, 7.0675f, 17.6065f, 7.0f, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_cloud-fill`!!
    }

private var `_cloud-fill`: ImageVector? = null
