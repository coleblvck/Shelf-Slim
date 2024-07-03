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

public val OthersGroup.`Goggles-fill`: ImageVector
    get() {
        if (`_goggles-fill` != null) {
            return `_goggles-fill`!!
        }
        `_goggles-fill` = Builder(name = "Goggles-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9515f, 6.9424f)
                curveTo(7.0808f, 6.1182f, 9.751f, 6.0f, 12.0f, 6.0f)
                curveTo(14.249f, 6.0f, 16.9192f, 6.1182f, 19.0485f, 6.9424f)
                curveTo(20.1296f, 7.3609f, 21.1294f, 7.9825f, 21.8583f, 8.9156f)
                curveTo(22.5975f, 9.8617f, 23.0f, 11.0541f, 23.0f, 12.5f)
                curveTo(23.0f, 13.9701f, 22.4751f, 15.4334f, 21.6205f, 16.5424f)
                curveTo(20.7689f, 17.6475f, 19.5033f, 18.5f, 18.0f, 18.5f)
                curveTo(16.5751f, 18.5f, 15.3437f, 17.7094f, 14.4251f, 17.1196f)
                curveTo(13.7195f, 16.6666f, 12.8833f, 16.0f, 12.0f, 16.0f)
                curveTo(11.1167f, 16.0f, 10.2804f, 16.6666f, 9.5749f, 17.1196f)
                curveTo(8.6563f, 17.7094f, 7.4249f, 18.5f, 6.0f, 18.5f)
                curveTo(4.4967f, 18.5f, 3.2311f, 17.6475f, 2.3795f, 16.5424f)
                curveTo(1.5249f, 15.4334f, 1.0f, 13.9701f, 1.0f, 12.5f)
                curveTo(1.0f, 11.0541f, 1.4025f, 9.8617f, 2.1417f, 8.9156f)
                curveTo(2.8706f, 7.9825f, 3.8704f, 7.3609f, 4.9515f, 6.9424f)
                close()
            }
        }
        .build()
        return `_goggles-fill`!!
    }

private var `_goggles-fill`: ImageVector? = null
