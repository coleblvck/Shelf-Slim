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

public val SystemGroup.`Lock-line`: ImageVector
    get() {
        if (`_lock-line` != null) {
            return `_lock-line`!!
        }
        `_lock-line` = Builder(name = "Lock-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 10.0f, 21.0f, 10.4477f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.4477f, 3.4477f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 6.2386f, 14.7614f, 4.0f, 12.0f, 4.0f)
                curveTo(9.2386f, 4.0f, 7.0f, 6.2386f, 7.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_lock-line`!!
    }

private var `_lock-line`: ImageVector? = null
