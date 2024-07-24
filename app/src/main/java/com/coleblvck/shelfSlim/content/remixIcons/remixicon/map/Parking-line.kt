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

public val MapGroup.`Parking-line`: ImageVector
    get() {
        if (`_parking-line` != null) {
            return `_parking-line`!!
        }
        `_parking-line` = Builder(name = "Parking-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(16.3137f, 3.0f, 19.0f, 5.6863f, 19.0f, 9.0f)
                curveTo(19.0f, 12.3137f, 16.3137f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                curveTo(15.2091f, 13.0f, 17.0f, 11.2091f, 17.0f, 9.0f)
                curveTo(17.0f, 6.7909f, 15.2091f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_parking-line`!!
    }

private var `_parking-line`: ImageVector? = null
