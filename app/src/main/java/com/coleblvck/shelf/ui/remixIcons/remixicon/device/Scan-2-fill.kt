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

public val DeviceGroup.`Scan-2-fill`: ImageVector
    get() {
        if (`_scan-2-fill` != null) {
            return `_scan-2-fill`!!
        }
        `_scan-2-fill` = Builder(name = "Scan-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2571f, 5.6713f)
                lineTo(6.3936f, 7.8078f)
                curveTo(5.5184f, 8.9764f, 5.0f, 10.4277f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(15.866f, 19.0f, 19.0f, 15.866f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(10.4277f, 5.0f, 8.9764f, 5.5184f, 7.8078f, 6.3936f)
                lineTo(5.6713f, 4.2571f)
                curveTo(7.3951f, 2.8464f, 9.5987f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 9.5987f, 2.8464f, 7.3951f, 4.2571f, 5.6713f)
                close()
                moveTo(7.8284f, 9.2426f)
                lineTo(12.0f, 13.4142f)
                lineTo(13.4142f, 12.0f)
                lineTo(9.2426f, 7.8284f)
                curveTo(10.033f, 7.3049f, 10.9809f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                curveTo(7.0f, 10.9809f, 7.3049f, 10.033f, 7.8284f, 9.2426f)
                close()
            }
        }
        .build()
        return `_scan-2-fill`!!
    }

private var `_scan-2-fill`: ImageVector? = null
