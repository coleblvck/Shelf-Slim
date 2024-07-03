package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Filter-off-fill`: ImageVector
    get() {
        if (`_filter-off-fill` != null) {
            return `_filter-off-fill`!!
        }
        `_filter-off-fill` = Builder(name = "Filter-off-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9289f, 0.5146f)
                lineTo(21.0711f, 14.6568f)
                lineTo(19.6569f, 16.071f)
                lineTo(15.834f, 12.2486f)
                lineTo(14.0f, 14.9999f)
                verticalLineTo(21.9999f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.9999f)
                lineTo(4.0f, 5.9999f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.9999f)
                lineTo(7.585f, 3.9997f)
                lineTo(5.5147f, 1.9289f)
                lineTo(6.9289f, 0.5146f)
                close()
                moveTo(21.0f, 3.9999f)
                verticalLineTo(5.9999f)
                horizontalLineTo(20.0f)
                lineTo(18.085f, 8.8719f)
                lineTo(13.213f, 3.9999f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_filter-off-fill`!!
    }

private var `_filter-off-fill`: ImageVector? = null
