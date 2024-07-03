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

public val OthersGroup.`Ping-pong-fill`: ImageVector
    get() {
        if (`_ping-pong-fill` != null) {
            return `_ping-pong-fill`!!
        }
        `_ping-pong-fill` = Builder(name = "Ping-pong-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(16.7467f, 2.0f, 21.0f, 6.2533f, 21.0f, 11.5f)
                curveTo(21.0f, 13.0291f, 20.6387f, 14.4739f, 19.9969f, 15.7536f)
                lineTo(22.4602f, 18.2175f)
                curveTo(22.8507f, 18.608f, 22.8507f, 19.2412f, 22.4602f, 19.6317f)
                lineTo(19.6317f, 22.4602f)
                curveTo(19.2412f, 22.8507f, 18.608f, 22.8507f, 18.2175f, 22.4602f)
                lineTo(15.7536f, 19.9969f)
                curveTo(14.4739f, 20.6387f, 13.0291f, 21.0f, 11.5f, 21.0f)
                curveTo(6.2533f, 21.0f, 2.0f, 16.7467f, 2.0f, 11.5f)
                curveTo(2.0f, 6.2533f, 6.2533f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(16.8033f, 15.3877f)
                lineTo(15.3891f, 16.8019f)
                lineTo(18.9246f, 20.3375f)
                lineTo(20.3388f, 18.9233f)
                lineTo(16.8033f, 15.3877f)
                close()
                moveTo(18.6669f, 9.283f)
                lineTo(9.283f, 18.6669f)
                curveTo(9.9837f, 18.8834f, 10.7282f, 19.0f, 11.5f, 19.0f)
                curveTo(12.4671f, 19.0f, 13.3914f, 18.817f, 14.2403f, 18.4836f)
                lineTo(13.2678f, 17.5104f)
                curveTo(12.8772f, 17.1199f, 12.8772f, 16.4867f, 13.2678f, 16.0962f)
                lineTo(16.0962f, 13.2678f)
                curveTo(16.4867f, 12.8772f, 17.1199f, 12.8772f, 17.5104f, 13.2678f)
                lineTo(18.4836f, 14.2403f)
                curveTo(18.817f, 13.3914f, 19.0f, 12.4671f, 19.0f, 11.5f)
                curveTo(19.0f, 10.7282f, 18.8834f, 9.9837f, 18.6669f, 9.283f)
                close()
            }
        }
        .build()
        return `_ping-pong-fill`!!
    }

private var `_ping-pong-fill`: ImageVector? = null
