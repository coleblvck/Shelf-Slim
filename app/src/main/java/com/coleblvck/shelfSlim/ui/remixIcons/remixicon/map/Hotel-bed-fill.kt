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

public val MapGroup.`Hotel-bed-fill`: ImageVector
    get() {
        if (`_hotel-bed-fill` != null) {
            return `_hotel-bed-fill`!!
        }
        `_hotel-bed-fill` = Builder(name = "Hotel-bed-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 7.0f, 22.0f, 8.7909f, 22.0f, 11.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(6.3432f, 13.0f, 5.0f, 11.6569f, 5.0f, 10.0f)
                curveTo(5.0f, 8.3432f, 6.3432f, 7.0f, 8.0f, 7.0f)
                curveTo(9.6568f, 7.0f, 11.0f, 8.3432f, 11.0f, 10.0f)
                curveTo(11.0f, 11.6569f, 9.6568f, 13.0f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_hotel-bed-fill`!!
    }

private var `_hotel-bed-fill`: ImageVector? = null
