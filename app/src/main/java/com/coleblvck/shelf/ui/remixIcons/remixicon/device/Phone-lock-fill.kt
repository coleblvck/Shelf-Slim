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

public val DeviceGroup.`Phone-lock-fill`: ImageVector
    get() {
        if (`_phone-lock-fill` != null) {
            return `_phone-lock-fill`!!
        }
        `_phone-lock-fill` = Builder(name = "Phone-lock-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(18.5523f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                lineTo(19.0012f, 10.1003f)
                curveTo(18.6777f, 10.0345f, 18.3429f, 10.0f, 18.0f, 10.0f)
                curveTo(15.5811f, 10.0f, 13.5634f, 11.7177f, 13.1001f, 13.9998f)
                lineTo(12.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(19.6569f, 12.0f, 21.0f, 13.3431f, 21.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 22.0f, 14.0f, 21.5523f, 14.0f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.3431f, 16.3431f, 12.0f, 18.0f, 12.0f)
                close()
                moveTo(18.0f, 14.0f)
                curveTo(17.4872f, 14.0f, 17.0f, 14.45f, 17.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 14.4477f, 18.5523f, 14.0f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_phone-lock-fill`!!
    }

private var `_phone-lock-fill`: ImageVector? = null
