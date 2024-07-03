package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Phone-fill`: ImageVector
    get() {
        if (`_phone-fill` != null) {
            return `_phone-fill`!!
        }
        `_phone-fill` = Builder(name = "Phone-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.42f)
                verticalLineTo(19.9561f)
                curveTo(21.0f, 20.4811f, 20.5941f, 20.9167f, 20.0705f, 20.9537f)
                curveTo(19.6331f, 20.9846f, 19.2763f, 21.0f, 19.0f, 21.0f)
                curveTo(10.1634f, 21.0f, 3.0f, 13.8366f, 3.0f, 5.0f)
                curveTo(3.0f, 4.7237f, 3.0155f, 4.3669f, 3.0464f, 3.9295f)
                curveTo(3.0834f, 3.4059f, 3.5189f, 3.0f, 4.0439f, 3.0f)
                horizontalLineTo(7.5801f)
                curveTo(7.8368f, 3.0f, 8.0518f, 3.1944f, 8.0775f, 3.4498f)
                curveTo(8.1007f, 3.6791f, 8.1222f, 3.8631f, 8.1421f, 4.002f)
                curveTo(8.3443f, 5.4147f, 8.7575f, 6.7594f, 9.3487f, 8.003f)
                curveTo(9.4436f, 8.2027f, 9.3817f, 8.4416f, 9.2018f, 8.5701f)
                lineTo(7.0436f, 10.1118f)
                curveTo(8.3575f, 13.1811f, 10.8189f, 15.6425f, 13.8882f, 16.9565f)
                lineTo(15.4271f, 14.8019f)
                curveTo(15.5572f, 14.6199f, 15.799f, 14.5573f, 16.001f, 14.6532f)
                curveTo(17.2446f, 15.2439f, 18.5891f, 15.6566f, 20.0016f, 15.8584f)
                curveTo(20.1396f, 15.8782f, 20.3225f, 15.8995f, 20.5502f, 15.9225f)
                curveTo(20.8056f, 15.9483f, 21.0f, 16.1633f, 21.0f, 16.42f)
                close()
            }
        }
        .build()
        return `_phone-fill`!!
    }

private var `_phone-fill`: ImageVector? = null
