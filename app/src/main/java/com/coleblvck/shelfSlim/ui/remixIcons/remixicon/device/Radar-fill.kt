package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Radar-fill`: ImageVector
    get() {
        if (`_radar-fill` != null) {
            return `_radar-fill`!!
        }
        `_radar-fill` = Builder(name = "Radar-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3685f, 4.3981f)
                lineTo(10.8842f, 10.433f)
                lineTo(12.6163f, 11.433f)
                lineTo(16.1006f, 5.3981f)
                curveTo(20.27f, 8.17f, 22.4058f, 12.4771f, 20.6605f, 15.5f)
                curveTo(18.8003f, 18.7221f, 13.4717f, 18.8551f, 8.7503f, 16.1292f)
                curveTo(4.0289f, 13.4033f, 1.4798f, 8.7221f, 3.34f, 5.5f)
                curveTo(5.0853f, 2.4771f, 9.8832f, 2.1732f, 14.3685f, 4.3981f)
                close()
                moveTo(15.8842f, 1.7728f)
                lineTo(17.6163f, 2.7728f)
                lineTo(16.1163f, 5.3708f)
                lineTo(14.3842f, 4.3708f)
                lineTo(15.8842f, 1.7728f)
                close()
                moveTo(6.7323f, 20.0f)
                horizontalLineTo(17.0003f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0176f)
                curveTo(4.9401f, 22.0014f, 4.8619f, 21.9938f, 4.7848f, 21.9768f)
                curveTo(4.7702f, 21.9735f, 4.7558f, 21.97f, 4.7415f, 21.9662f)
                curveTo(4.6589f, 21.944f, 4.5778f, 21.9108f, 4.5003f, 21.866f)
                curveTo(4.4711f, 21.8492f, 4.443f, 21.831f, 4.4162f, 21.8118f)
                curveTo(4.3016f, 21.7292f, 4.2052f, 21.623f, 4.1342f, 21.5003f)
                curveTo(4.0633f, 21.3772f, 4.0194f, 21.2404f, 4.0052f, 21.0997f)
                curveTo(4.0045f, 21.0924f, 4.0038f, 21.085f, 4.0033f, 21.0777f)
                curveTo(3.9879f, 20.883f, 4.0292f, 20.6819f, 4.1343f, 20.5f)
                lineTo(6.3843f, 16.6029f)
                lineTo(8.1163f, 17.6029f)
                lineTo(6.7323f, 20.0f)
                close()
            }
        }
        .build()
        return `_radar-fill`!!
    }

private var `_radar-fill`: ImageVector? = null
