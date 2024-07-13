package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Paypal-fill`: ImageVector
    get() {
        if (`_paypal-fill` != null) {
            return `_paypal-fill`!!
        }
        `_paypal-fill` = Builder(name = "Paypal-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0673f, 8.4777f)
                curveTo(20.5591f, 9.3582f, 20.6237f, 10.4924f, 20.3676f, 11.8053f)
                curveTo(19.627f, 15.6107f, 17.0916f, 16.9253f, 13.8536f, 16.9253f)
                horizontalLineTo(13.3536f)
                curveTo(12.9583f, 16.9253f, 12.6216f, 17.214f, 12.5596f, 17.6047f)
                lineTo(12.519f, 17.8253f)
                lineTo(11.8896f, 21.818f)
                lineTo(11.857f, 21.988f)
                curveTo(11.795f, 22.3787f, 11.4583f, 22.6667f, 11.063f, 22.6667f)
                horizontalLineTo(7.7203f)
                curveTo(7.4236f, 22.6667f, 7.197f, 22.402f, 7.243f, 22.1093f)
                lineTo(7.4181f, 21.0f)
                horizontalLineTo(8.9367f)
                lineTo(9.886f, 14.9793f)
                horizontalLineTo(11.2716f)
                curveTo(15.9496f, 14.9793f, 19.0209f, 12.7768f, 20.0673f, 8.4777f)
                close()
                moveTo(17.1066f, 3.3878f)
                curveTo(17.8693f, 4.2564f, 18.0908f, 5.1989f, 17.8597f, 6.6732f)
                curveTo(17.8405f, 6.7959f, 17.82f, 6.9139f, 17.7973f, 7.0325f)
                curveTo(17.0621f, 10.8057f, 14.7087f, 12.4793f, 10.8417f, 12.4793f)
                horizontalLineTo(8.957f)
                curveTo(8.3265f, 12.4793f, 7.7837f, 12.8928f, 7.6037f, 13.4811f)
                lineTo(7.5891f, 13.4788f)
                lineTo(6.6597f, 19.3733f)
                horizontalLineTo(3.1217f)
                curveTo(3.0899f, 19.3733f, 3.066f, 19.3454f, 3.071f, 19.3136f)
                lineTo(5.6691f, 2.8023f)
                curveTo(5.7417f, 2.3404f, 6.1398f, 2.0f, 6.6075f, 2.0f)
                horizontalLineTo(12.583f)
                curveTo(14.7658f, 2.0f, 16.2998f, 2.4687f, 17.1066f, 3.3878f)
                close()
            }
        }
        .build()
        return `_paypal-fill`!!
    }

private var `_paypal-fill`: ImageVector? = null
