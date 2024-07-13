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

public val MapGroup.`Truck-fill`: ImageVector
    get() {
        if (`_truck-fill` != null) {
            return `_truck-fill`!!
        }
        `_truck-fill` = Builder(name = "Truck-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.0557f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.9646f)
                curveTo(20.7219f, 19.6961f, 19.2632f, 21.0f, 17.5f, 21.0f)
                curveTo(15.7368f, 21.0f, 14.2781f, 19.6961f, 14.0354f, 18.0f)
                horizontalLineTo(8.9646f)
                curveTo(8.7219f, 19.6961f, 7.2632f, 21.0f, 5.5f, 21.0f)
                curveTo(3.7368f, 21.0f, 2.2781f, 19.6961f, 2.0354f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.4477f, 1.4477f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 5.4477f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.715f)
                lineTo(18.9917f, 10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_truck-fill`!!
    }

private var `_truck-fill`: ImageVector? = null
