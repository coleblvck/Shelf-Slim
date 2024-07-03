package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Map-pin-2-fill`: ImageVector
    get() {
        if (`_map-pin-2-fill` != null) {
            return `_map-pin-2-fill`!!
        }
        `_map-pin-2-fill` = Builder(name = "Map-pin-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 17.364f)
                lineTo(12.0f, 23.7279f)
                lineTo(5.636f, 17.364f)
                curveTo(2.1213f, 13.8492f, 2.1213f, 8.1508f, 5.636f, 4.636f)
                curveTo(9.1508f, 1.1213f, 14.8492f, 1.1213f, 18.364f, 4.636f)
                curveTo(21.8787f, 8.1508f, 21.8787f, 13.8492f, 18.364f, 17.364f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.1046f, 13.0f, 14.0f, 12.1046f, 14.0f, 11.0f)
                curveTo(14.0f, 9.8954f, 13.1046f, 9.0f, 12.0f, 9.0f)
                curveTo(10.8954f, 9.0f, 10.0f, 9.8954f, 10.0f, 11.0f)
                curveTo(10.0f, 12.1046f, 10.8954f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_map-pin-2-fill`!!
    }

private var `_map-pin-2-fill`: ImageVector? = null
