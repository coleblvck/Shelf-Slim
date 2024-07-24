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

public val DeviceGroup.`Rfid-fill`: ImageVector
    get() {
        if (`_rfid-fill` != null) {
            return `_rfid-fill`!!
        }
        `_rfid-fill` = Builder(name = "Rfid-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 18.3641f)
                curveTo(21.8787f, 14.8493f, 21.8787f, 9.1509f, 18.364f, 5.6361f)
                lineTo(19.7782f, 4.2219f)
                curveTo(24.0739f, 8.5177f, 24.0739f, 15.4825f, 19.7782f, 19.7783f)
                lineTo(18.364f, 18.3641f)
                close()
                moveTo(5.636f, 5.6361f)
                curveTo(2.1213f, 9.1509f, 2.1213f, 14.8493f, 5.636f, 18.3641f)
                lineTo(4.2218f, 19.7783f)
                curveTo(-0.0739f, 15.4825f, -0.0739f, 8.5177f, 4.2218f, 4.2219f)
                lineTo(5.636f, 5.6361f)
                close()
                moveTo(15.5355f, 15.5355f)
                curveTo(17.4882f, 13.5829f, 17.4882f, 10.4171f, 15.5355f, 8.4644f)
                lineTo(16.9497f, 7.0502f)
                curveTo(19.6834f, 9.7839f, 19.6834f, 14.2161f, 16.9497f, 16.9497f)
                lineTo(15.5355f, 15.5355f)
                close()
                moveTo(8.4645f, 8.4644f)
                curveTo(6.5118f, 10.4171f, 6.5118f, 13.5829f, 8.4645f, 15.5355f)
                lineTo(7.0503f, 16.9497f)
                curveTo(4.3166f, 14.2161f, 4.3166f, 9.7839f, 7.0503f, 7.0502f)
                lineTo(8.4645f, 8.4644f)
                close()
                moveTo(12.0f, 14.0001f)
                curveTo(13.1046f, 14.0001f, 14.0f, 13.1046f, 14.0f, 12.0001f)
                curveTo(14.0f, 10.8955f, 13.1046f, 10.0001f, 12.0f, 10.0001f)
                curveTo(10.8954f, 10.0001f, 10.0f, 10.8955f, 10.0f, 12.0001f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0001f, 12.0f, 14.0001f)
                close()
            }
        }
        .build()
        return `_rfid-fill`!!
    }

private var `_rfid-fill`: ImageVector? = null
