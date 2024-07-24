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

public val SystemGroup.`Toggle-line`: ImageVector
    get() {
        if (`_toggle-line` != null) {
            return `_toggle-line`!!
        }
        `_toggle-line` = Builder(name = "Toggle-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(5.2386f, 7.0f, 3.0f, 9.2386f, 3.0f, 12.0f)
                curveTo(3.0f, 14.7614f, 5.2386f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(18.7614f, 17.0f, 21.0f, 14.7614f, 21.0f, 12.0f)
                curveTo(21.0f, 9.2386f, 18.7614f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(19.866f, 5.0f, 23.0f, 8.134f, 23.0f, 12.0f)
                curveTo(23.0f, 15.866f, 19.866f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(4.134f, 19.0f, 1.0f, 15.866f, 1.0f, 12.0f)
                curveTo(1.0f, 8.134f, 4.134f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveTo(6.3432f, 15.0f, 5.0f, 13.6569f, 5.0f, 12.0f)
                curveTo(5.0f, 10.3431f, 6.3432f, 9.0f, 8.0f, 9.0f)
                curveTo(9.6568f, 9.0f, 11.0f, 10.3431f, 11.0f, 12.0f)
                curveTo(11.0f, 13.6569f, 9.6568f, 15.0f, 8.0f, 15.0f)
                close()
            }
        }
        .build()
        return `_toggle-line`!!
    }

private var `_toggle-line`: ImageVector? = null
