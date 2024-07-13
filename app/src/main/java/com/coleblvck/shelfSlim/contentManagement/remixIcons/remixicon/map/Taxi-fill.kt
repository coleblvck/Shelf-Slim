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

public val MapGroup.`Taxi-fill`: ImageVector
    get() {
        if (`_taxi-fill` != null) {
            return `_taxi-fill`!!
        }
        `_taxi-fill` = Builder(name = "Taxi-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.4477f, 22.0f, 19.0f, 21.5523f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
                verticalLineTo(12.0f)
                lineTo(4.4805f, 6.2122f)
                curveTo(4.7957f, 5.4768f, 5.5187f, 5.0f, 6.3188f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.6812f)
                curveTo(18.4813f, 5.0f, 19.2043f, 5.4768f, 19.5195f, 6.2122f)
                lineTo(22.0f, 12.0f)
                close()
                moveTo(4.1759f, 12.0f)
                horizontalLineTo(19.8241f)
                lineTo(17.6812f, 7.0f)
                horizontalLineTo(6.3188f)
                lineTo(4.1759f, 12.0f)
                close()
                moveTo(6.5f, 17.0f)
                curveTo(7.3284f, 17.0f, 8.0f, 16.3284f, 8.0f, 15.5f)
                curveTo(8.0f, 14.6716f, 7.3284f, 14.0f, 6.5f, 14.0f)
                curveTo(5.6716f, 14.0f, 5.0f, 14.6716f, 5.0f, 15.5f)
                curveTo(5.0f, 16.3284f, 5.6716f, 17.0f, 6.5f, 17.0f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(18.3284f, 17.0f, 19.0f, 16.3284f, 19.0f, 15.5f)
                curveTo(19.0f, 14.6716f, 18.3284f, 14.0f, 17.5f, 14.0f)
                curveTo(16.6716f, 14.0f, 16.0f, 14.6716f, 16.0f, 15.5f)
                curveTo(16.0f, 16.3284f, 16.6716f, 17.0f, 17.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_taxi-fill`!!
    }

private var `_taxi-fill`: ImageVector? = null
