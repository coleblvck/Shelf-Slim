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

public val MapGroup.`Bike-line`: ImageVector
    get() {
        if (`_bike-line` != null) {
            return `_bike-line`!!
        }
        `_bike-line` = Builder(name = "Bike-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.7955f)
                lineTo(15.8131f, 7.1661f)
                lineTo(15.2327f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.9784f)
                curveTo(16.4286f, 2.9899f, 16.8442f, 3.2869f, 16.9659f, 3.7412f)
                lineTo(18.5188f, 9.5367f)
                lineTo(16.587f, 10.0544f)
                lineTo(16.3307f, 9.0979f)
                lineTo(5.5f, 12.0f)
                close()
                moveTo(5.0f, 19.0f)
                curveTo(6.1046f, 19.0f, 7.0f, 18.1046f, 7.0f, 17.0f)
                curveTo(7.0f, 15.8954f, 6.1046f, 15.0f, 5.0f, 15.0f)
                curveTo(3.8954f, 15.0f, 3.0f, 15.8954f, 3.0f, 17.0f)
                curveTo(3.0f, 18.1046f, 3.8954f, 19.0f, 5.0f, 19.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveTo(2.7909f, 21.0f, 1.0f, 19.2091f, 1.0f, 17.0f)
                curveTo(1.0f, 14.7909f, 2.7909f, 13.0f, 5.0f, 13.0f)
                curveTo(7.2091f, 13.0f, 9.0f, 14.7909f, 9.0f, 17.0f)
                curveTo(9.0f, 19.2091f, 7.2091f, 21.0f, 5.0f, 21.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveTo(19.6569f, 19.0f, 21.0f, 17.6569f, 21.0f, 16.0f)
                curveTo(21.0f, 14.3431f, 19.6569f, 13.0f, 18.0f, 13.0f)
                curveTo(16.3431f, 13.0f, 15.0f, 14.3431f, 15.0f, 16.0f)
                curveTo(15.0f, 17.6569f, 16.3431f, 19.0f, 18.0f, 19.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveTo(15.2386f, 21.0f, 13.0f, 18.7614f, 13.0f, 16.0f)
                curveTo(13.0f, 13.2386f, 15.2386f, 11.0f, 18.0f, 11.0f)
                curveTo(20.7614f, 11.0f, 23.0f, 13.2386f, 23.0f, 16.0f)
                curveTo(23.0f, 18.7614f, 20.7614f, 21.0f, 18.0f, 21.0f)
                close()
            }
        }
        .build()
        return `_bike-line`!!
    }

private var `_bike-line`: ImageVector? = null
