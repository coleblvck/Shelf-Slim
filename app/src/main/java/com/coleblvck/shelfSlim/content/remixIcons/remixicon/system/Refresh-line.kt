package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Refresh-line`: ImageVector
    get() {
        if (`_refresh-line` != null) {
            return `_refresh-line`!!
        }
        `_refresh-line` = Builder(name = "Refresh-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4626f, 4.4326f)
                curveTo(7.2156f, 2.9169f, 9.5007f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.1361f, 21.3302f, 16.1158f, 20.1892f, 17.7406f)
                lineTo(17.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(9.8498f, 4.0f, 7.8978f, 4.8483f, 6.4602f, 6.2284f)
                lineTo(5.4626f, 4.4326f)
                close()
                moveTo(18.5374f, 19.5674f)
                curveTo(16.7844f, 21.0831f, 14.4993f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 9.8639f, 2.6698f, 7.8842f, 3.8108f, 6.2594f)
                lineTo(7.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.1502f, 20.0f, 16.1022f, 19.1517f, 17.5398f, 17.7716f)
                lineTo(18.5374f, 19.5674f)
                close()
            }
        }
        .build()
        return `_refresh-line`!!
    }

private var `_refresh-line`: ImageVector? = null
