package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Lock-unlock-line`: ImageVector
    get() {
        if (`_lock-unlock-line` != null) {
            return `_lock-unlock-line`!!
        }
        `_lock-unlock-line` = Builder(name = "Lock-unlock-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
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
                curveTo(14.7405f, 2.0f, 17.1131f, 3.5748f, 18.2624f, 5.8688f)
                lineTo(16.4731f, 6.7634f)
                curveTo(15.6522f, 5.1249f, 13.9575f, 4.0f, 12.0f, 4.0f)
                curveTo(9.2386f, 4.0f, 7.0f, 6.2386f, 7.0f, 9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_lock-unlock-line`!!
    }

private var `_lock-unlock-line`: ImageVector? = null
