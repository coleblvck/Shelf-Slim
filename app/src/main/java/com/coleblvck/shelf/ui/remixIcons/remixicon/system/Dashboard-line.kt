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

public val SystemGroup.`Dashboard-line`: ImageVector
    get() {
        if (`_dashboard-line` != null) {
            return `_dashboard-line`!!
        }
        `_dashboard-line` = Builder(name = "Dashboard-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                curveTo(13.4477f, 21.0f, 13.0f, 20.5523f, 13.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 11.4477f, 13.4477f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 11.4477f, 21.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 3.0f, 11.0f, 3.4477f, 11.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(11.0f, 12.5523f, 10.5523f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(4.0f, 21.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 15.4477f, 3.4477f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.5523f, 10.5523f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.0f, 4.0f)
                curveTo(13.0f, 3.4477f, 13.4477f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 8.5523f, 20.5523f, 9.0f, 20.0f, 9.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 9.0f, 13.0f, 8.5523f, 13.0f, 8.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return `_dashboard-line`!!
    }

private var `_dashboard-line`: ImageVector? = null
