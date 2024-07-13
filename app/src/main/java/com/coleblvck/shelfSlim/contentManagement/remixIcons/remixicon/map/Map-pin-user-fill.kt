package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Map-pin-user-fill`: ImageVector
    get() {
        if (`_map-pin-user-fill` != null) {
            return `_map-pin-user-fill`!!
        }
        `_map-pin-user-fill` = Builder(name = "Map-pin-user-fill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 23.7279f)
                lineTo(5.636f, 17.364f)
                curveTo(2.1213f, 13.8492f, 2.1213f, 8.1508f, 5.636f, 4.636f)
                curveTo(9.1508f, 1.1213f, 14.8492f, 1.1213f, 18.364f, 4.636f)
                curveTo(21.8787f, 8.1508f, 21.8787f, 13.8492f, 18.364f, 17.364f)
                lineTo(12.0f, 23.7279f)
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
        return `_map-pin-user-fill`!!
    }

private var `_map-pin-user-fill`: ImageVector? = null