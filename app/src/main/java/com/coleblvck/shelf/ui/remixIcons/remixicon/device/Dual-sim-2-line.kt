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

public val DeviceGroup.`Dual-sim-2-line`: ImageVector
    get() {
        if (`_dual-sim-2-line` != null) {
            return `_dual-sim-2-line`!!
        }
        `_dual-sim-2-line` = Builder(name = "Dual-sim-2-line", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(14.171f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.829f)
                lineTo(14.171f, 4.0f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(13.6569f, 7.5f, 15.0f, 8.8432f, 15.0f, 10.5f)
                curveTo(15.0f, 11.3841f, 14.6175f, 12.179f, 14.009f, 12.728f)
                lineTo(14.0013f, 12.72f)
                lineTo(14.0074f, 12.7294f)
                lineTo(12.5953f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                lineTo(8.9993f, 14.547f)
                lineTo(12.6691f, 11.2431f)
                curveTo(12.8723f, 11.06f, 13.0f, 10.7949f, 13.0f, 10.5f)
                curveTo(13.0f, 9.9477f, 12.5523f, 9.5f, 12.0f, 9.5f)
                curveTo(11.4477f, 9.5f, 11.0f, 9.9477f, 11.0f, 10.5f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.8432f, 10.3431f, 7.5f, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return `_dual-sim-2-line`!!
    }

private var `_dual-sim-2-line`: ImageVector? = null
