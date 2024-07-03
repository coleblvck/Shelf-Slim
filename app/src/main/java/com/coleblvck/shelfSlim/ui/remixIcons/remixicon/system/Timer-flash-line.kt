package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Timer-flash-line`: ImageVector
    get() {
        if (`_timer-flash-line` != null) {
            return `_timer-flash-line`!!
        }
        `_timer-flash-line` = Builder(name = "Timer-flash-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3823f, 5.9681f)
                curveTo(7.922f, 4.7365f, 9.875f, 4.0f, 12.0f, 4.0f)
                curveTo(14.125f, 4.0f, 16.078f, 4.7365f, 17.6177f, 5.9681f)
                lineTo(19.0711f, 4.5147f)
                lineTo(20.4853f, 5.9289f)
                lineTo(19.0319f, 7.3823f)
                curveTo(20.2635f, 8.922f, 21.0f, 10.875f, 21.0f, 13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                curveTo(3.0f, 10.875f, 3.7365f, 8.922f, 4.9681f, 7.3823f)
                lineTo(3.5147f, 5.9289f)
                lineTo(4.9289f, 4.5147f)
                lineTo(6.3823f, 5.9681f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(15.866f, 20.0f, 19.0f, 16.866f, 19.0f, 13.0f)
                curveTo(19.0f, 9.134f, 15.866f, 6.0f, 12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 9.134f, 5.0f, 13.0f)
                curveTo(5.0f, 16.866f, 8.134f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 18.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 7.4952f)
                verticalLineTo(12.0f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return `_timer-flash-line`!!
    }

private var `_timer-flash-line`: ImageVector? = null
