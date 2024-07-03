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

public val MapGroup.`Map-pin-3-line`: ImageVector
    get() {
        if (`_map-pin-3-line` != null) {
            return `_map-pin-3-line`!!
        }
        `_map-pin-3-line` = Builder(name = "Map-pin-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.9451f)
                curveTo(6.5001f, 19.4476f, 3.0f, 15.6326f, 3.0f, 11.0f)
                curveTo(3.0f, 6.0294f, 7.0294f, 2.0f, 12.0f, 2.0f)
                curveTo(16.9706f, 2.0f, 21.0f, 6.0294f, 21.0f, 11.0f)
                curveTo(21.0f, 15.6326f, 17.5f, 19.4476f, 13.0f, 19.9451f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.9451f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(15.866f, 18.0f, 19.0f, 14.866f, 19.0f, 11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.134f, 5.0f, 11.0f)
                curveTo(5.0f, 14.866f, 8.134f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_map-pin-3-line`!!
    }

private var `_map-pin-3-line`: ImageVector? = null
