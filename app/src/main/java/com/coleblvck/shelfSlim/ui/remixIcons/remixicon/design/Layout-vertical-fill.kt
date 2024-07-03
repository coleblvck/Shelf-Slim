package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Layout-vertical-fill`: ImageVector
    get() {
        if (`_layout-vertical-fill` != null) {
            return `_layout-vertical-fill`!!
        }
        `_layout-vertical-fill` = Builder(name = "Layout-vertical-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.9999f, 16.9999f)
                verticalLineTo(6.9999f)
                horizontalLineTo(8.9999f)
                verticalLineTo(16.9999f)
                horizontalLineTo(6.9999f)
                close()
                moveTo(10.9999f, 6.9999f)
                horizontalLineTo(12.9999f)
                verticalLineTo(16.9999f)
                horizontalLineTo(10.9999f)
                verticalLineTo(6.9999f)
                close()
                moveTo(14.9999f, 6.9999f)
                horizontalLineTo(16.9999f)
                verticalLineTo(16.9999f)
                horizontalLineTo(14.9999f)
                verticalLineTo(6.9999f)
                close()
            }
        }
        .build()
        return `_layout-vertical-fill`!!
    }

private var `_layout-vertical-fill`: ImageVector? = null