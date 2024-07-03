package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Dual-sim-2-fill`: ImageVector
    get() {
        if (`_dual-sim-2-fill` != null) {
            return `_dual-sim-2-fill`!!
        }
        `_dual-sim-2-fill` = Builder(name = "Dual-sim-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(19.7071f, 6.7071f)
                curveTo(19.8946f, 6.8946f, 20.0f, 7.149f, 20.0f, 7.4142f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.4477f, 4.4477f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(10.4023f, 7.5f, 9.0963f, 8.7489f, 9.0051f, 10.3237f)
                lineTo(9.0f, 10.5f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 9.9477f, 11.4477f, 9.5f, 12.0f, 9.5f)
                curveTo(12.5523f, 9.5f, 13.0f, 9.9477f, 13.0f, 10.5f)
                curveTo(13.0f, 10.7528f, 12.9062f, 10.9836f, 12.7514f, 11.1598f)
                lineTo(12.6691f, 11.2431f)
                lineTo(8.9993f, 14.547f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5953f)
                lineTo(14.0074f, 12.7294f)
                lineTo(14.0013f, 12.72f)
                lineTo(14.009f, 12.728f)
                curveTo(14.6175f, 12.179f, 15.0f, 11.3841f, 15.0f, 10.5f)
                curveTo(15.0f, 8.8432f, 13.6569f, 7.5f, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return `_dual-sim-2-fill`!!
    }

private var `_dual-sim-2-fill`: ImageVector? = null
