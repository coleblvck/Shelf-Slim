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

public val DesignGroup.`Layout-masonry-fill`: ImageVector
    get() {
        if (`_layout-masonry-fill` != null) {
            return `_layout-masonry-fill`!!
        }
        `_layout-masonry-fill` = Builder(name = "Layout-masonry-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.999f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.999f)
                horizontalLineTo(22.0f)
                close()
                moveTo(11.0f, 15.999f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(15.999f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineTo(13.999f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(7.999f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_layout-masonry-fill`!!
    }

private var `_layout-masonry-fill`: ImageVector? = null
