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

public val DesignGroup.`Align-item-left-fill`: ImageVector
    get() {
        if (`_align-item-left-fill` != null) {
            return `_align-item-left-fill`!!
        }
        `_align-item-left-fill` = Builder(name = "Align-item-left-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(7.0f, 14.0f)
                curveTo(7.0f, 13.4477f, 7.4477f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 13.0f, 17.0f, 13.4477f, 17.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.5523f, 16.5523f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 20.0f, 7.0f, 19.5523f, 7.0f, 19.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(7.4477f, 4.0f, 7.0f, 4.4477f, 7.0f, 5.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 10.5523f, 7.4477f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 10.5523f, 21.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 4.4477f, 20.5523f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_align-item-left-fill`!!
    }

private var `_align-item-left-fill`: ImageVector? = null
