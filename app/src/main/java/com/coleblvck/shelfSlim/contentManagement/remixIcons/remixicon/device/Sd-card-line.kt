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

public val DeviceGroup.`Sd-card-line`: ImageVector
    get() {
        if (`_sd-card-line` != null) {
            return `_sd-card-line`!!
        }
        `_sd-card-line` = Builder(name = "Sd-card-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.8284f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.8284f)
                lineTo(6.0f, 7.8284f)
                close()
                moveTo(4.2929f, 6.7071f)
                lineTo(9.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 2.0f, 20.0f, 2.4477f, 20.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(7.4142f)
                curveTo(4.0f, 7.149f, 4.1054f, 6.8946f, 4.2929f, 6.7071f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_sd-card-line`!!
    }

private var `_sd-card-line`: ImageVector? = null
