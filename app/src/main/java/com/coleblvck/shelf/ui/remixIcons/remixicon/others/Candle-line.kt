package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Candle-line`: ImageVector
    get() {
        if (`_candle-line` != null) {
            return `_candle-line`!!
        }
        `_candle-line` = Builder(name = "Candle-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1716f, 9.3315f)
                curveTo(7.6095f, 7.7694f, 7.6095f, 5.2367f, 9.1716f, 3.6746f)
                lineTo(12.0f, 0.8462f)
                lineTo(14.8284f, 3.6746f)
                curveTo(16.3905f, 5.2367f, 16.3905f, 7.7694f, 14.8284f, 9.3315f)
                curveTo(14.3039f, 9.856f, 13.6699f, 10.2044f, 13.0f, 10.3767f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 12.0f, 19.0f, 12.4477f, 19.0f, 13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 12.4477f, 5.4477f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.3767f)
                curveTo(10.3301f, 10.2044f, 9.6961f, 9.856f, 9.1716f, 9.3315f)
                close()
                moveTo(10.5858f, 5.0888f)
                curveTo(9.8047f, 5.8699f, 9.8047f, 7.1362f, 10.5858f, 7.9173f)
                curveTo(11.3668f, 8.6983f, 12.6332f, 8.6983f, 13.4142f, 7.9173f)
                curveTo(14.1953f, 7.1362f, 14.1953f, 5.8699f, 13.4142f, 5.0888f)
                lineTo(12.0f, 3.6746f)
                lineTo(10.5858f, 5.0888f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_candle-line`!!
    }

private var `_candle-line`: ImageVector? = null
