package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Thumb-down-fill`: ImageVector
    get() {
        if (`_thumb-down-fill` != null) {
            return `_thumb-down-fill`!!
        }
        `_thumb-down-fill` = Builder(name = "Thumb-down-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 3.0f, 23.0f, 3.4477f, 23.0f, 4.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.5523f, 22.5523f, 15.0f, 22.0f, 15.0f)
                close()
                moveTo(16.7071f, 16.2929f)
                lineTo(10.3066f, 22.6934f)
                curveTo(10.1307f, 22.8693f, 9.8521f, 22.8891f, 9.6531f, 22.7398f)
                lineTo(8.8005f, 22.1004f)
                curveTo(8.3158f, 21.7369f, 8.0974f, 21.1174f, 8.2469f, 20.5303f)
                lineTo(9.4002f, 16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.8954f, 16.0f, 1.0f, 15.1046f, 1.0f, 14.0f)
                verticalLineTo(11.8957f)
                curveTo(1.0f, 11.6344f, 1.0512f, 11.3757f, 1.1506f, 11.1342f)
                lineTo(4.245f, 3.6193f)
                curveTo(4.3993f, 3.2445f, 4.7645f, 3.0f, 5.1697f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 3.0f, 17.0f, 3.4477f, 17.0f, 4.0f)
                verticalLineTo(15.5858f)
                curveTo(17.0f, 15.851f, 16.8946f, 16.1054f, 16.7071f, 16.2929f)
                close()
            }
        }
        .build()
        return `_thumb-down-fill`!!
    }

private var `_thumb-down-fill`: ImageVector? = null
