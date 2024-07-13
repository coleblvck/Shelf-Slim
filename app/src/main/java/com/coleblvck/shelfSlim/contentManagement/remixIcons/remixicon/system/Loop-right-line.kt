package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Loop-right-line`: ImageVector
    get() {
        if (`_loop-right-line` != null) {
            return `_loop-right-line`!!
        }
        `_loop-right-line` = Builder(name = "Loop-right-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(14.7486f, 4.0f, 17.1749f, 5.3863f, 18.6156f, 7.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.9994f)
                curveTo(18.1762f, 3.5717f, 15.2724f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(9.2514f, 20.0f, 6.8251f, 18.6137f, 5.3844f, 16.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0006f)
                curveTo(5.8238f, 20.4283f, 8.7276f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_loop-right-line`!!
    }

private var `_loop-right-line`: ImageVector? = null
