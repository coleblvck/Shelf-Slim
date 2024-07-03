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

public val DeviceGroup.`Phone-line`: ImageVector
    get() {
        if (`_phone-line` != null) {
            return `_phone-line`!!
        }
        `_phone-line` = Builder(name = "Phone-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3656f, 10.6821f)
                curveTo(10.302f, 12.3288f, 11.6712f, 13.698f, 13.3179f, 14.6344f)
                lineTo(14.2024f, 13.3961f)
                curveTo(14.4965f, 12.9845f, 15.0516f, 12.8573f, 15.4956f, 13.0998f)
                curveTo(16.9024f, 13.8683f, 18.4571f, 14.3353f, 20.0789f, 14.4637f)
                curveTo(20.599f, 14.5049f, 21.0f, 14.9389f, 21.0f, 15.4606f)
                verticalLineTo(19.9234f)
                curveTo(21.0f, 20.4361f, 20.6122f, 20.8657f, 20.1022f, 20.9181f)
                curveTo(19.5723f, 20.9726f, 19.0377f, 21.0f, 18.5f, 21.0f)
                curveTo(9.9396f, 21.0f, 3.0f, 14.0604f, 3.0f, 5.5f)
                curveTo(3.0f, 4.9623f, 3.0274f, 4.4277f, 3.0819f, 3.8978f)
                curveTo(3.1343f, 3.3877f, 3.5639f, 3.0f, 4.0767f, 3.0f)
                horizontalLineTo(8.5394f)
                curveTo(9.0611f, 3.0f, 9.4951f, 3.401f, 9.5363f, 3.9211f)
                curveTo(9.6647f, 5.5429f, 10.1317f, 7.0976f, 10.9002f, 8.5044f)
                curveTo(11.1427f, 8.9484f, 11.0155f, 9.5035f, 10.6039f, 9.7976f)
                lineTo(9.3656f, 10.6821f)
                close()
                moveTo(6.8443f, 10.0252f)
                lineTo(8.7442f, 8.6681f)
                curveTo(8.2055f, 7.5051f, 7.8363f, 6.2718f, 7.6473f, 5.0f)
                horizontalLineTo(5.0091f)
                curveTo(5.003f, 5.1663f, 5.0f, 5.333f, 5.0f, 5.5f)
                curveTo(5.0f, 12.9558f, 11.0442f, 19.0f, 18.5f, 19.0f)
                curveTo(18.667f, 19.0f, 18.8337f, 18.997f, 19.0f, 18.9909f)
                verticalLineTo(16.3527f)
                curveTo(17.7282f, 16.1637f, 16.4949f, 15.7945f, 15.3319f, 15.2558f)
                lineTo(13.9748f, 17.1558f)
                curveTo(13.4258f, 16.9425f, 12.8956f, 16.6915f, 12.3874f, 16.4061f)
                lineTo(12.3293f, 16.373f)
                curveTo(10.3697f, 15.2587f, 8.7413f, 13.6303f, 7.627f, 11.6707f)
                lineTo(7.5939f, 11.6126f)
                curveTo(7.3085f, 11.1044f, 7.0575f, 10.5742f, 6.8443f, 10.0252f)
                close()
            }
        }
        .build()
        return `_phone-line`!!
    }

private var `_phone-line`: ImageVector? = null
