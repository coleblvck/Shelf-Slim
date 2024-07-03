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

public val LogosGroup.`Opera-fill`: ImageVector
    get() {
        if (`_opera-fill` != null) {
            return `_opera-fill`!!
        }
        `_opera-fill` = Builder(name = "Opera-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7101f, 6.365f)
                curveTo(7.6035f, 7.67f, 6.8885f, 9.6008f, 6.8385f, 11.765f)
                verticalLineTo(12.235f)
                curveTo(6.8893f, 14.4f, 7.6035f, 16.3283f, 8.7101f, 17.6342f)
                curveTo(10.1443f, 19.4975f, 12.276f, 20.6792f, 14.6593f, 20.6792f)
                curveTo(16.1226f, 20.6792f, 17.4926f, 20.2317f, 18.6651f, 19.4533f)
                curveTo(16.9001f, 21.0383f, 14.5626f, 22.0f, 12.001f, 22.0f)
                curveTo(11.841f, 22.0f, 11.6818f, 21.9967f, 11.526f, 21.9883f)
                curveTo(6.221f, 21.7408f, 2.001f, 17.3633f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4758f, 6.4785f, 2.0f, 12.001f, 2.0f)
                horizontalLineTo(12.0385f)
                curveTo(14.5843f, 2.01f, 16.9051f, 2.9717f, 18.666f, 4.5458f)
                curveTo(17.4926f, 3.7708f, 16.1235f, 3.32f, 14.6576f, 3.32f)
                curveTo(12.276f, 3.32f, 10.1435f, 4.5033f, 8.7076f, 6.365f)
                horizontalLineTo(8.7101f)
                close()
                moveTo(22.001f, 12.0f)
                curveTo(22.001f, 14.9633f, 20.7135f, 17.6233f, 18.666f, 19.4542f)
                curveTo(16.101f, 20.7042f, 13.711f, 19.83f, 12.9193f, 19.2833f)
                curveTo(15.4385f, 18.73f, 17.3418f, 15.6833f, 17.3418f, 12.0f)
                curveTo(17.3418f, 8.315f, 15.4393f, 5.2708f, 12.9193f, 4.7167f)
                curveTo(13.7101f, 4.1717f, 16.101f, 3.2975f, 18.666f, 4.5458f)
                curveTo(20.7135f, 6.375f, 22.001f, 9.0375f, 22.001f, 12.0f)
                close()
            }
        }
        .build()
        return `_opera-fill`!!
    }

private var `_opera-fill`: ImageVector? = null
