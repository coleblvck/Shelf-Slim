package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Gps-line`: ImageVector
    get() {
        if (`_gps-line` != null) {
            return `_gps-line`!!
        }
        `_gps-line` = Builder(name = "Gps-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1317f, 20.7371f)
                curveTo(4.0702f, 19.0275f, 2.0f, 15.7555f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7555f, 19.9298f, 19.0275f, 16.8683f, 20.7371f)
                lineTo(15.9724f, 18.9457f)
                curveTo(18.3788f, 17.5664f, 20.0f, 14.9725f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 14.9725f, 5.6212f, 17.5664f, 8.0276f, 18.9457f)
                lineTo(7.1317f, 20.7371f)
                close()
                moveTo(8.9243f, 17.1528f)
                curveTo(7.1727f, 16.105f, 6.0f, 14.1894f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 14.1894f, 16.8273f, 16.105f, 15.0757f, 17.1528f)
                lineTo(14.1772f, 15.3561f)
                curveTo(15.2744f, 14.6429f, 16.0f, 13.4062f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 13.4062f, 8.7256f, 14.6429f, 9.8228f, 15.3561f)
                lineTo(8.9243f, 17.1528f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_gps-line`!!
    }

private var `_gps-line`: ImageVector? = null
