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

public val SystemGroup.`Timer-2-line`: ImageVector
    get() {
        if (`_timer-2-line` != null) {
            return `_timer-2-line`!!
        }
        `_timer-2-line` = Builder(name = "Timer-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(15.5355f, 7.0503f)
                lineTo(16.9497f, 8.4645f)
                lineTo(12.0f, 13.4142f)
                lineTo(10.5858f, 12.0f)
                lineTo(15.5355f, 7.0503f)
                close()
            }
        }
        .build()
        return `_timer-2-line`!!
    }

private var `_timer-2-line`: ImageVector? = null