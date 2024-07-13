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

public val DeviceGroup.`Base-station-line`: ImageVector
    get() {
        if (`_base-station-line` != null) {
            return `_base-station-line`!!
        }
        `_base-station-line` = Builder(name = "Base-station-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                lineTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 13.0f)
                close()
                moveTo(12.0f, 16.6f)
                lineTo(9.74f, 20.0f)
                horizontalLineTo(14.26f)
                lineTo(12.0f, 16.6f)
                close()
                moveTo(10.9393f, 10.5606f)
                curveTo(10.3536f, 9.9749f, 10.3536f, 9.0251f, 10.9393f, 8.4393f)
                curveTo(11.5251f, 7.8535f, 12.4749f, 7.8535f, 13.0607f, 8.4393f)
                curveTo(13.6464f, 9.0251f, 13.6464f, 9.9749f, 13.0607f, 10.5606f)
                curveTo(12.4749f, 11.1464f, 11.5251f, 11.1464f, 10.9393f, 10.5606f)
                close()
                moveTo(5.2825f, 2.7825f)
                lineTo(6.6967f, 4.1967f)
                curveTo(3.7678f, 7.1256f, 3.7678f, 11.8744f, 6.6967f, 14.8033f)
                lineTo(5.2825f, 16.2175f)
                curveTo(1.5725f, 12.5075f, 1.5725f, 6.4925f, 5.2825f, 2.7825f)
                close()
                moveTo(18.7175f, 2.7825f)
                curveTo(22.4275f, 6.4925f, 22.4275f, 12.5075f, 18.7175f, 16.2175f)
                lineTo(17.3033f, 14.8033f)
                curveTo(20.2322f, 11.8744f, 20.2322f, 7.1256f, 17.3033f, 4.1967f)
                lineTo(18.7175f, 2.7825f)
                close()
                moveTo(8.1109f, 5.6109f)
                lineTo(9.5251f, 7.0251f)
                curveTo(8.1583f, 8.3919f, 8.1583f, 10.608f, 9.5251f, 11.9749f)
                lineTo(8.1109f, 13.3891f)
                curveTo(5.963f, 11.2412f, 5.963f, 7.7588f, 8.1109f, 5.6109f)
                horizontalLineTo(8.1109f)
                close()
                moveTo(15.8891f, 5.6109f)
                curveTo(18.037f, 7.7588f, 18.037f, 11.2412f, 15.8891f, 13.3891f)
                lineTo(14.4749f, 11.9749f)
                curveTo(15.8417f, 10.608f, 15.8417f, 8.3919f, 14.4749f, 7.0251f)
                lineTo(15.8891f, 5.6109f)
                close()
            }
        }
        .build()
        return `_base-station-line`!!
    }

private var `_base-station-line`: ImageVector? = null
