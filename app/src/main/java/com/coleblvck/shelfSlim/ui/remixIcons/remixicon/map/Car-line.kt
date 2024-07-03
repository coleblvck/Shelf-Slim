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

public val MapGroup.`Car-line`: ImageVector
    get() {
        if (`_car-line` != null) {
            return `_car-line`!!
        }
        `_car-line` = Builder(name = "Car-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
                verticalLineTo(11.0f)
                lineTo(4.4805f, 5.2122f)
                curveTo(4.7957f, 4.4768f, 5.5187f, 4.0f, 6.3188f, 4.0f)
                horizontalLineTo(17.6812f)
                curveTo(18.4813f, 4.0f, 19.2043f, 4.4768f, 19.5195f, 5.2122f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.4477f, 22.0f, 19.0f, 21.5523f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(4.1759f, 11.0f)
                horizontalLineTo(19.8241f)
                lineTo(17.6812f, 6.0f)
                horizontalLineTo(6.3188f)
                lineTo(4.1759f, 11.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(5.6716f, 17.0f, 5.0f, 16.3284f, 5.0f, 15.5f)
                curveTo(5.0f, 14.6716f, 5.6716f, 14.0f, 6.5f, 14.0f)
                curveTo(7.3284f, 14.0f, 8.0f, 14.6716f, 8.0f, 15.5f)
                curveTo(8.0f, 16.3284f, 7.3284f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(16.6716f, 17.0f, 16.0f, 16.3284f, 16.0f, 15.5f)
                curveTo(16.0f, 14.6716f, 16.6716f, 14.0f, 17.5f, 14.0f)
                curveTo(18.3284f, 14.0f, 19.0f, 14.6716f, 19.0f, 15.5f)
                curveTo(19.0f, 16.3284f, 18.3284f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_car-line`!!
    }

private var `_car-line`: ImageVector? = null
