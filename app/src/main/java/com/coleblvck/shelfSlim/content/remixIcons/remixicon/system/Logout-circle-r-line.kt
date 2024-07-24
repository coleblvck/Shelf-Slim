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

public val SystemGroup.`Logout-circle-r-line`: ImageVector
    get() {
        if (`_logout-circle-r-line` != null) {
            return `_logout-circle-r-line`!!
        }
        `_logout-circle-r-line` = Builder(name = "Logout-circle-r-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(15.2713f, 2.0f, 18.1757f, 3.5708f, 20.0002f, 5.9992f)
                lineTo(17.2909f, 5.9993f)
                curveTo(15.8807f, 4.755f, 14.0285f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.029f, 20.0f, 15.8816f, 19.2446f, 17.2919f, 17.9998f)
                lineTo(20.0009f, 17.9998f)
                curveTo(18.1765f, 20.4288f, 15.2717f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                lineTo(24.0f, 12.0f)
                lineTo(19.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_logout-circle-r-line`!!
    }

private var `_logout-circle-r-line`: ImageVector? = null
