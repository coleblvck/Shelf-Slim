package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Layout-grid-2-fill`: ImageVector
    get() {
        if (`_layout-grid-2-fill` != null) {
            return `_layout-grid-2-fill`!!
        }
        `_layout-grid-2-fill` = Builder(name = "Layout-grid-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(8.0f)
                lineTo(7.5f, 8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(9.5f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(16.5f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(14.5f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(7.5f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(2.0f, 14.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.0f)
                lineTo(2.0f, 10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.5f, 10.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_layout-grid-2-fill`!!
    }

private var `_layout-grid-2-fill`: ImageVector? = null
