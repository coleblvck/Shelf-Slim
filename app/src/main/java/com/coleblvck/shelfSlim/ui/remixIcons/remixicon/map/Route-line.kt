package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Route-line`: ImageVector
    get() {
        if (`_route-line` != null) {
            return `_route-line`!!
        }
        `_route-line` = Builder(name = "Route-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 6.0147f, 6.0147f, 4.0f, 8.5f, 4.0f)
                curveTo(10.9853f, 4.0f, 13.0f, 6.0147f, 13.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 16.8807f, 14.1193f, 18.0f, 15.5f, 18.0f)
                curveTo(16.8807f, 18.0f, 18.0f, 16.8807f, 18.0f, 15.5f)
                verticalLineTo(8.8293f)
                curveTo(16.8348f, 8.4175f, 16.0f, 7.3062f, 16.0f, 6.0f)
                curveTo(16.0f, 4.3432f, 17.3431f, 3.0f, 19.0f, 3.0f)
                curveTo(20.6569f, 3.0f, 22.0f, 4.3432f, 22.0f, 6.0f)
                curveTo(22.0f, 7.3062f, 21.1652f, 8.4175f, 20.0f, 8.8293f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 17.9853f, 17.9853f, 20.0f, 15.5f, 20.0f)
                curveTo(13.0147f, 20.0f, 11.0f, 17.9853f, 11.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 7.1193f, 9.8807f, 6.0f, 8.5f, 6.0f)
                curveTo(7.1193f, 6.0f, 6.0f, 7.1193f, 6.0f, 8.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                lineTo(5.0f, 20.0f)
                lineTo(1.0f, 15.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveTo(19.5523f, 7.0f, 20.0f, 6.5523f, 20.0f, 6.0f)
                curveTo(20.0f, 5.4477f, 19.5523f, 5.0f, 19.0f, 5.0f)
                curveTo(18.4477f, 5.0f, 18.0f, 5.4477f, 18.0f, 6.0f)
                curveTo(18.0f, 6.5523f, 18.4477f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_route-line`!!
    }

private var `_route-line`: ImageVector? = null
