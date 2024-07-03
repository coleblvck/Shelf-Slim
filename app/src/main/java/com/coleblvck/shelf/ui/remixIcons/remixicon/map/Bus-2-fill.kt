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

public val MapGroup.`Bus-2-fill`: ImageVector
    get() {
        if (`_bus-2-fill` != null) {
            return `_bus-2-fill`!!
        }
        `_bus-2-fill` = Builder(name = "Bus-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                curveTo(7.0f, 21.5523f, 6.5523f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.8954f, 3.8954f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 3.0f, 21.0f, 3.8954f, 21.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(17.4477f, 22.0f, 17.0f, 21.5523f, 17.0f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.5f, 18.0f)
                curveTo(8.3284f, 18.0f, 9.0f, 17.3284f, 9.0f, 16.5f)
                curveTo(9.0f, 15.6716f, 8.3284f, 15.0f, 7.5f, 15.0f)
                curveTo(6.6716f, 15.0f, 6.0f, 15.6716f, 6.0f, 16.5f)
                curveTo(6.0f, 17.3284f, 6.6716f, 18.0f, 7.5f, 18.0f)
                close()
                moveTo(16.5f, 18.0f)
                curveTo(17.3284f, 18.0f, 18.0f, 17.3284f, 18.0f, 16.5f)
                curveTo(18.0f, 15.6716f, 17.3284f, 15.0f, 16.5f, 15.0f)
                curveTo(15.6716f, 15.0f, 15.0f, 15.6716f, 15.0f, 16.5f)
                curveTo(15.0f, 17.3284f, 15.6716f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return `_bus-2-fill`!!
    }

private var `_bus-2-fill`: ImageVector? = null
