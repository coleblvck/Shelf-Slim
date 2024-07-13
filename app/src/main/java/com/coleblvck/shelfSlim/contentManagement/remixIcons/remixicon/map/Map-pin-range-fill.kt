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

public val MapGroup.`Map-pin-range-fill`: ImageVector
    get() {
        if (`_map-pin-range-fill` != null) {
            return `_map-pin-range-fill`!!
        }
        `_map-pin-range-fill` = Builder(name = "Map-pin-range-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.9381f)
                curveTo(7.0537f, 17.446f, 4.0f, 14.0796f, 4.0f, 10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                curveTo(20.0f, 14.0796f, 16.9463f, 17.446f, 13.0f, 17.9381f)
                verticalLineTo(20.0116f)
                curveTo(16.9463f, 20.1039f, 20.0f, 20.7351f, 20.0f, 21.5f)
                curveTo(20.0f, 22.3284f, 16.4183f, 23.0f, 12.0f, 23.0f)
                curveTo(7.5817f, 23.0f, 4.0f, 22.3284f, 4.0f, 21.5f)
                curveTo(4.0f, 20.7351f, 7.0537f, 20.1039f, 11.0f, 20.0116f)
                verticalLineTo(17.9381f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_map-pin-range-fill`!!
    }

private var `_map-pin-range-fill`: ImageVector? = null
