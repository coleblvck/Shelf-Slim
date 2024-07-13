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

public val SystemGroup.`Loop-left-fill`: ImageVector
    get() {
        if (`_loop-left-fill` != null) {
            return `_loop-left-fill`!!
        }
        `_loop-left-fill` = Builder(name = "Loop-left-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(9.4095f, 4.0f, 7.1061f, 5.2305f, 5.6427f, 7.1427f)
                lineTo(8.0f, 9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                lineTo(4.2186f, 5.7186f)
                curveTo(6.0506f, 3.452f, 8.8556f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.5905f, 20.0f, 16.894f, 18.7695f, 18.3573f, 16.8573f)
                lineTo(16.0f, 14.5f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(20.5f)
                lineTo(19.7814f, 18.2814f)
                curveTo(17.9494f, 20.548f, 15.1444f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_loop-left-fill`!!
    }

private var `_loop-left-fill`: ImageVector? = null
