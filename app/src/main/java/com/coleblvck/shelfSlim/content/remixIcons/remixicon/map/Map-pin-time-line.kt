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

public val MapGroup.`Map-pin-time-line`: ImageVector
    get() {
        if (`_map-pin-time-line` != null) {
            return `_map-pin-time-line`!!
        }
        `_map-pin-time-line` = Builder(name = "Map-pin-time-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9497f, 15.9497f)
                curveTo(19.6834f, 13.2161f, 19.6834f, 8.7839f, 16.9497f, 6.0503f)
                curveTo(14.2161f, 3.3166f, 9.7839f, 3.3166f, 7.0503f, 6.0503f)
                curveTo(4.3166f, 8.7839f, 4.3166f, 13.2161f, 7.0503f, 15.9497f)
                lineTo(12.0f, 20.8995f)
                lineTo(16.9497f, 15.9497f)
                close()
                moveTo(12.0f, 23.7279f)
                lineTo(5.636f, 17.364f)
                curveTo(2.1213f, 13.8492f, 2.1213f, 8.1508f, 5.636f, 4.636f)
                curveTo(9.1508f, 1.1213f, 14.8492f, 1.1213f, 18.364f, 4.636f)
                curveTo(21.8787f, 8.1508f, 21.8787f, 13.8492f, 18.364f, 17.364f)
                lineTo(12.0f, 23.7279f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_map-pin-time-line`!!
    }

private var `_map-pin-time-line`: ImageVector? = null
