package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Bell-fill`: ImageVector
    get() {
        if (`_bell-fill` != null) {
            return `_bell-fill`!!
        }
        `_bell-fill` = Builder(name = "Bell-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4142f, 10.5859f)
                lineTo(13.8936f, 11.0719f)
                lineTo(14.3585f, 11.5567f)
                lineTo(14.8177f, 12.0492f)
                curveTo(18.2758f, 15.8132f, 20.2896f, 19.2668f, 19.4246f, 20.1318f)
                curveTo(19.0242f, 20.5322f, 18.069f, 20.3157f, 16.7851f, 19.6246f)
                curveTo(13.5839f, 21.6383f, 9.3898f, 21.441f, 6.3825f, 19.0327f)
                lineTo(9.362f, 16.0538f)
                curveTo(10.0289f, 16.2315f, 10.7697f, 16.0587f, 11.2929f, 15.5356f)
                curveTo(12.0739f, 14.7546f, 12.0739f, 13.4882f, 11.2929f, 12.7072f)
                curveTo(10.5118f, 11.9261f, 9.2455f, 11.9261f, 8.4645f, 12.7072f)
                curveTo(7.9813f, 13.1904f, 7.797f, 13.8592f, 7.9117f, 14.4841f)
                lineTo(7.9465f, 14.6392f)
                lineTo(4.968f, 17.6184f)
                curveTo(2.5591f, 14.611f, 2.3616f, 10.4164f, 4.3755f, 7.2144f)
                curveTo(3.6843f, 5.9311f, 3.4678f, 4.9759f, 3.8683f, 4.5754f)
                curveTo(4.8446f, 3.5991f, 9.1185f, 6.2901f, 13.4142f, 10.5859f)
                close()
                moveTo(19.7782f, 4.2219f)
                curveTo(20.5592f, 5.0029f, 20.5592f, 6.2693f, 19.7782f, 7.0503f)
                curveTo(19.7254f, 7.1031f, 19.6704f, 7.1523f, 19.6135f, 7.1979f)
                curveTo(21.2304f, 9.7541f, 21.4333f, 12.9498f, 20.2214f, 15.6677f)
                curveTo(19.0324f, 13.7136f, 17.1513f, 11.4945f, 14.8284f, 9.1716f)
                lineTo(14.2905f, 8.6398f)
                curveTo(12.1634f, 6.5615f, 10.1352f, 4.8757f, 8.3327f, 3.7793f)
                curveTo(11.0504f, 2.5669f, 14.2459f, 2.7696f, 16.804f, 4.3871f)
                curveTo(16.8478f, 4.3296f, 16.897f, 4.2747f, 16.9497f, 4.2219f)
                curveTo(17.7308f, 3.4409f, 18.9971f, 3.4409f, 19.7782f, 4.2219f)
                close()
            }
        }
        .build()
        return `_bell-fill`!!
    }

private var `_bell-fill`: ImageVector? = null
