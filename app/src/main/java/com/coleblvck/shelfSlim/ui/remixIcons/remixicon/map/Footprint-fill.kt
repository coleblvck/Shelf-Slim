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

public val MapGroup.`Footprint-fill`: ImageVector
    get() {
        if (`_footprint-fill` != null) {
            return `_footprint-fill`!!
        }
        `_footprint-fill` = Builder(name = "Footprint-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0001f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.2501f)
                curveTo(9.5f, 20.7688f, 8.2688f, 22.0001f, 6.75f, 22.0001f)
                curveTo(5.2312f, 22.0001f, 4.0f, 20.7688f, 4.0f, 19.2501f)
                verticalLineTo(18.0001f)
                close()
                moveTo(8.0f, 6.1207f)
                curveTo(10.0f, 6.1207f, 11.0f, 9.0001f, 11.0f, 11.0001f)
                curveTo(11.0f, 12.0001f, 10.5f, 13.0001f, 10.0f, 14.5001f)
                lineTo(9.5f, 16.0001f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 15.0001f, 3.5f, 13.5001f, 3.5f, 11.0001f)
                curveTo(3.5f, 8.5001f, 5.4978f, 6.1207f, 8.0f, 6.1207f)
                close()
                moveTo(20.054f, 14.0984f)
                lineTo(19.8369f, 15.3294f)
                curveTo(19.5732f, 16.8251f, 18.1468f, 17.8238f, 16.6511f, 17.5601f)
                curveTo(15.1554f, 17.2964f, 14.1567f, 15.87f, 14.4205f, 14.3743f)
                lineTo(14.6375f, 13.1433f)
                lineTo(20.054f, 14.0984f)
                close()
                moveTo(18.1776f, 1.7049f)
                curveTo(20.6417f, 2.1394f, 22.196f, 4.8295f, 21.7619f, 7.2916f)
                curveTo(21.3278f, 9.7536f, 20.5749f, 11.144f, 20.4013f, 12.1288f)
                lineTo(14.9848f, 11.1737f)
                lineTo(14.7529f, 9.6097f)
                curveTo(14.5209f, 8.0456f, 14.2022f, 6.974f, 14.3758f, 5.9892f)
                curveTo(14.7231f, 4.0196f, 16.2079f, 1.3576f, 18.1776f, 1.7049f)
                close()
            }
        }
        .build()
        return `_footprint-fill`!!
    }

private var `_footprint-fill`: ImageVector? = null
