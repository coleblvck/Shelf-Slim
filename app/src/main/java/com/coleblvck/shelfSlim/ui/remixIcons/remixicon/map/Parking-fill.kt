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

public val MapGroup.`Parking-fill`: ImageVector
    get() {
        if (`_parking-fill` != null) {
            return `_parking-fill`!!
        }
        `_parking-fill` = Builder(name = "Parking-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(16.3137f, 3.0f, 19.0f, 5.6863f, 19.0f, 9.0f)
                curveTo(19.0f, 12.3137f, 16.3137f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1046f, 11.0f, 15.0f, 10.1046f, 15.0f, 9.0f)
                curveTo(15.0f, 7.8954f, 14.1046f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_parking-fill`!!
    }

private var `_parking-fill`: ImageVector? = null
