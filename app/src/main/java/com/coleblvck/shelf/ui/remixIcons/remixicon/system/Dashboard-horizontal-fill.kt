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

public val SystemGroup.`Dashboard-horizontal-fill`: ImageVector
    get() {
        if (`_dashboard-horizontal-fill` != null) {
            return `_dashboard-horizontal-fill`!!
        }
        `_dashboard-horizontal-fill` = Builder(name = "Dashboard-horizontal-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                lineTo(13.0f, 10.0f)
                curveTo(13.0f, 10.5523f, 12.5523f, 11.0f, 12.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                curveTo(3.4477f, 11.0f, 3.0f, 10.5523f, 3.0f, 10.0f)
                lineTo(3.0f, 4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(20.0f, 3.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                lineTo(21.0f, 10.0f)
                curveTo(21.0f, 10.5523f, 20.5523f, 11.0f, 20.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                curveTo(15.4477f, 11.0f, 15.0f, 10.5523f, 15.0f, 10.0f)
                lineTo(15.0f, 4.0f)
                curveTo(15.0f, 3.4477f, 15.4477f, 3.0f, 16.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                close()
                moveTo(20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 13.4477f, 21.0f, 14.0f)
                lineTo(21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                lineTo(12.0f, 21.0f)
                curveTo(11.4477f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                lineTo(11.0f, 14.0f)
                curveTo(11.0f, 13.4477f, 11.4477f, 13.0f, 12.0f, 13.0f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(3.0f, 14.0f)
                curveTo(3.0f, 13.4477f, 3.4477f, 13.0f, 4.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                curveTo(8.5523f, 13.0f, 9.0f, 13.4477f, 9.0f, 14.0f)
                lineTo(9.0f, 20.0f)
                curveTo(9.0f, 20.5523f, 8.5523f, 21.0f, 8.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                lineTo(3.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_dashboard-horizontal-fill`!!
    }

private var `_dashboard-horizontal-fill`: ImageVector? = null
