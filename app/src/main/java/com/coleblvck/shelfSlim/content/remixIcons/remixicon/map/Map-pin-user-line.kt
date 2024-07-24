package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Map-pin-user-line`: ImageVector
    get() {
        if (`_map-pin-user-line` != null) {
            return `_map-pin-user-line`!!
        }
        `_map-pin-user-line` = Builder(name = "Map-pin-user-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0839f, 15.812f)
                curveTo(19.6827f, 13.0691f, 19.6379f, 8.7385f, 16.9497f, 6.0503f)
                curveTo(14.2161f, 3.3166f, 9.7839f, 3.3166f, 7.0503f, 6.0503f)
                curveTo(4.3621f, 8.7385f, 4.3173f, 13.0691f, 6.9161f, 15.812f)
                curveTo(7.9776f, 14.1228f, 9.8577f, 13.0f, 12.0f, 13.0f)
                curveTo(14.1423f, 13.0f, 16.0224f, 14.1228f, 17.0839f, 15.812f)
                close()
                moveTo(8.3854f, 17.2848f)
                lineTo(12.0f, 20.8995f)
                lineTo(15.6147f, 17.2848f)
                curveTo(14.9725f, 15.9339f, 13.5953f, 15.0f, 12.0f, 15.0f)
                curveTo(10.4047f, 15.0f, 9.0275f, 15.9339f, 8.3854f, 17.2848f)
                close()
                moveTo(12.0f, 23.7279f)
                lineTo(5.636f, 17.364f)
                curveTo(2.1213f, 13.8492f, 2.1213f, 8.1508f, 5.636f, 4.636f)
                curveTo(9.1508f, 1.1213f, 14.8492f, 1.1213f, 18.364f, 4.636f)
                curveTo(21.8787f, 8.1508f, 21.8787f, 13.8492f, 18.364f, 17.364f)
                lineTo(12.0f, 23.7279f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 9.5523f, 13.0f, 9.0f)
                curveTo(13.0f, 8.4477f, 12.5523f, 8.0f, 12.0f, 8.0f)
                curveTo(11.4477f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
                curveTo(11.0f, 9.5523f, 11.4477f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.3431f, 12.0f, 9.0f, 10.6569f, 9.0f, 9.0f)
                curveTo(9.0f, 7.3432f, 10.3431f, 6.0f, 12.0f, 6.0f)
                curveTo(13.6569f, 6.0f, 15.0f, 7.3432f, 15.0f, 9.0f)
                curveTo(15.0f, 10.6569f, 13.6569f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_map-pin-user-line`!!
    }

private var `_map-pin-user-line`: ImageVector? = null
