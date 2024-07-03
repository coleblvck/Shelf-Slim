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

public val DeviceGroup.`Scan-2-line`: ImageVector
    get() {
        if (`_scan-2-line` != null) {
            return `_scan-2-line`!!
        }
        `_scan-2-line` = Builder(name = "Scan-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6713f, 4.2571f)
                lineTo(13.4142f, 12.0f)
                lineTo(12.0f, 13.4142f)
                lineTo(8.5538f, 9.968f)
                curveTo(8.2019f, 10.5635f, 8.0f, 11.2582f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.8749f, 14.3429f, 8.1369f, 12.2503f, 8.0077f)
                lineTo(10.4459f, 6.2032f)
                curveTo(10.9416f, 6.0707f, 11.4625f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 15.3137f, 15.3137f, 18.0f, 12.0f, 18.0f)
                curveTo(8.6863f, 18.0f, 6.0f, 15.3137f, 6.0f, 12.0f)
                curveTo(6.0f, 10.7042f, 6.4108f, 9.5043f, 7.1093f, 8.5235f)
                lineTo(5.6801f, 7.0944f)
                curveTo(4.6271f, 8.449f, 4.0f, 10.1513f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(10.8915f, 4.0f, 9.8356f, 4.2255f, 8.8757f, 4.6331f)
                lineTo(7.3744f, 3.1318f)
                curveTo(8.7577f, 2.4088f, 10.3311f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 8.8784f, 3.4303f, 6.0909f, 5.6713f, 4.2571f)
                close()
            }
        }
        .build()
        return `_scan-2-line`!!
    }

private var `_scan-2-line`: ImageVector? = null
