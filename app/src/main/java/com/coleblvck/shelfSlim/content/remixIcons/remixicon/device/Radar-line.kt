package com.coleblvck.shelfSlim.content.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Radar-line`: ImageVector
    get() {
        if (`_radar-line` != null) {
            return `_radar-line`!!
        }
        `_radar-line` = Builder(name = "Radar-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5065f, 3.6233f)
                lineTo(11.4835f, 5.395f)
                curveTo(8.5738f, 4.5163f, 5.9697f, 4.9453f, 5.0721f, 6.5f)
                curveTo(3.8948f, 8.5392f, 5.8624f, 12.1524f, 9.7503f, 14.3971f)
                curveTo(13.6382f, 16.6418f, 17.7512f, 16.5392f, 18.9285f, 14.5f)
                curveTo(19.8261f, 12.9453f, 18.8956f, 10.4756f, 16.6797f, 8.395f)
                lineTo(17.7026f, 6.6233f)
                curveTo(20.7847f, 9.332f, 22.1654f, 12.8934f, 20.6605f, 15.5f)
                curveTo(18.8003f, 18.7221f, 13.4717f, 18.8551f, 8.7503f, 16.1292f)
                curveTo(4.0289f, 13.4033f, 1.4798f, 8.7221f, 3.34f, 5.5f)
                curveTo(4.8449f, 2.8934f, 8.6196f, 2.3085f, 12.5065f, 3.6233f)
                close()
                moveTo(15.8842f, 1.7728f)
                lineTo(17.6163f, 2.7728f)
                lineTo(12.6163f, 11.433f)
                lineTo(10.8842f, 10.433f)
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
        return `_radar-line`!!
    }

private var `_radar-line`: ImageVector? = null
