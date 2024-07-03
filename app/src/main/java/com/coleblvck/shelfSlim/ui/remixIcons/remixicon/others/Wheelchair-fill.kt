package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Wheelchair-fill`: ImageVector
    get() {
        if (`_wheelchair-fill` != null) {
            return `_wheelchair-fill`!!
        }
        `_wheelchair-fill` = Builder(name = "Wheelchair-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9984f, 10.3413f)
                lineTo(7.9979f, 12.5352f)
                curveTo(6.8024f, 13.2268f, 5.9981f, 14.5195f, 5.9981f, 16.0f)
                curveTo(5.9981f, 18.2091f, 7.7889f, 20.0f, 9.998f, 20.0f)
                curveTo(11.4786f, 20.0f, 12.7712f, 19.1957f, 13.4628f, 18.0001f)
                lineTo(15.6565f, 18.0004f)
                curveTo(14.8327f, 20.3306f, 12.6103f, 22.0f, 9.998f, 22.0f)
                curveTo(6.6843f, 22.0f, 3.998f, 19.3137f, 3.998f, 16.0f)
                curveTo(3.998f, 13.3874f, 5.6678f, 11.1649f, 7.9984f, 10.3413f)
                close()
                moveTo(11.998f, 17.0f)
                curveTo(10.3412f, 17.0f, 8.998f, 15.6569f, 8.998f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(8.998f, 8.3432f, 10.3412f, 7.0f, 11.998f, 7.0f)
                curveTo(13.6549f, 7.0f, 14.998f, 8.3432f, 14.998f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.4319f)
                curveTo(17.0803f, 15.0f, 17.6849f, 15.3141f, 18.0584f, 15.8362f)
                lineTo(18.1468f, 15.971f)
                lineTo(20.8555f, 20.4855f)
                lineTo(19.1406f, 21.5145f)
                lineTo(16.4319f, 17.0f)
                horizontalLineTo(11.998f)
                close()
                moveTo(11.998f, 2.0f)
                curveTo(13.3788f, 2.0f, 14.498f, 3.1193f, 14.498f, 4.5f)
                curveTo(14.498f, 5.8807f, 13.3788f, 7.0f, 11.998f, 7.0f)
                curveTo(10.6173f, 7.0f, 9.498f, 5.8807f, 9.498f, 4.5f)
                curveTo(9.498f, 3.1193f, 10.6173f, 2.0f, 11.998f, 2.0f)
                close()
            }
        }
        .build()
        return `_wheelchair-fill`!!
    }

private var `_wheelchair-fill`: ImageVector? = null
