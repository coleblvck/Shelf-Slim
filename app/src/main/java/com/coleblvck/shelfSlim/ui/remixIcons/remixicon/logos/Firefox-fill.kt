package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Firefox-fill`: ImageVector
    get() {
        if (`_firefox-fill` != null) {
            return `_firefox-fill`!!
        }
        `_firefox-fill` = Builder(name = "Firefox-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5228f, 17.5238f, 22.0f, 12.001f, 22.0f)
                curveTo(6.4781f, 22.0f, 2.001f, 17.5228f, 2.001f, 12.0f)
                curveTo(2.001f, 10.5365f, 2.3154f, 9.1463f, 2.8803f, 7.8935f)
                curveTo(3.3474f, 6.955f, 4.1141f, 6.0195f, 4.7308f, 5.7004f)
                curveTo(4.0776f, 6.9827f, 3.7582f, 8.2407f, 3.6905f, 9.0827f)
                curveTo(4.1453f, 7.5827f, 5.0062f, 6.3262f, 6.2111f, 5.4391f)
                curveTo(8.2772f, 3.9202f, 11.059f, 3.852f, 12.1671f, 4.8198f)
                curveTo(10.1107f, 5.5258f, 7.8707f, 8.3665f, 8.3643f, 11.6952f)
                curveTo(8.4442f, 12.2447f, 8.6091f, 12.7785f, 8.853f, 13.2774f)
                curveTo(8.4691f, 12.2661f, 8.4353f, 10.8435f, 9.0546f, 9.9193f)
                curveTo(9.7465f, 8.8891f, 10.7332f, 8.6714f, 11.2607f, 8.7827f)
                curveTo(11.0526f, 8.7391f, 10.5929f, 9.6194f, 10.5252f, 9.7742f)
                curveTo(10.3523f, 10.1679f, 10.2664f, 10.5943f, 10.2736f, 11.0242f)
                curveTo(10.2888f, 11.9223f, 10.6594f, 12.7778f, 11.3042f, 13.4032f)
                curveTo(13.2256f, 15.2754f, 16.3268f, 14.5387f, 17.7155f, 12.4016f)
                curveTo(18.6687f, 10.9306f, 18.7848f, 8.4343f, 17.5607f, 6.4504f)
                curveTo(17.2554f, 5.967f, 16.8913f, 5.5233f, 16.4768f, 5.1294f)
                curveTo(14.6262f, 3.3639f, 11.9979f, 2.5605f, 9.495f, 2.9255f)
                curveTo(8.3891f, 3.1021f, 7.4476f, 3.4205f, 6.6708f, 3.8807f)
                curveTo(7.7555f, 2.7978f, 9.9123f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return `_firefox-fill`!!
    }

private var `_firefox-fill`: ImageVector? = null
