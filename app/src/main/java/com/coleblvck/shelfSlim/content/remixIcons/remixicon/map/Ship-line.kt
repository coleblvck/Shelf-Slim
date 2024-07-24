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

public val MapGroup.`Ship-line`: ImageVector
    get() {
        if (`_ship-line` != null) {
            return `_ship-line`!!
        }
        `_ship-line` = Builder(name = "Ship-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.4f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.4477f, 4.4477f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 3.0f, 20.0f, 3.4477f, 20.0f, 4.0f)
                verticalLineTo(10.4f)
                lineTo(21.0857f, 10.7257f)
                curveTo(21.5974f, 10.8792f, 21.8981f, 11.4078f, 21.7685f, 11.9261f)
                lineTo(20.2516f, 17.9938f)
                curveTo(20.1682f, 17.9979f, 20.0844f, 18.0f, 20.0f, 18.0f)
                curveTo(19.4218f, 18.0f, 18.8665f, 17.9019f, 18.3499f, 17.7213f)
                lineTo(19.6f, 12.37f)
                lineTo(12.0f, 10.0f)
                lineTo(4.4f, 12.37f)
                lineTo(5.6501f, 17.7213f)
                curveTo(5.1335f, 17.9019f, 4.5782f, 18.0f, 4.0f, 18.0f)
                curveTo(3.9156f, 18.0f, 3.8318f, 17.9979f, 3.7485f, 17.9938f)
                lineTo(2.2315f, 11.9261f)
                curveTo(2.1019f, 11.4078f, 2.4026f, 10.8792f, 2.9143f, 10.7257f)
                lineTo(4.0f, 10.4f)
                close()
                moveTo(6.0f, 9.8f)
                lineTo(12.0f, 8.0f)
                lineTo(18.0f, 9.8f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.8f)
                close()
                moveTo(4.0f, 20.0f)
                curveTo(5.5367f, 20.0f, 6.9385f, 19.4223f, 8.0f, 18.4722f)
                curveTo(9.0615f, 19.4223f, 10.4633f, 20.0f, 12.0f, 20.0f)
                curveTo(13.5367f, 20.0f, 14.9385f, 19.4223f, 16.0f, 18.4722f)
                curveTo(17.0615f, 19.4223f, 18.4633f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                curveTo(18.5429f, 22.0f, 17.1767f, 21.6104f, 16.0f, 20.9297f)
                curveTo(14.8233f, 21.6104f, 13.4571f, 22.0f, 12.0f, 22.0f)
                curveTo(10.5429f, 22.0f, 9.1767f, 21.6104f, 8.0f, 20.9297f)
                curveTo(6.8233f, 21.6104f, 5.4571f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_ship-line`!!
    }

private var `_ship-line`: ImageVector? = null
