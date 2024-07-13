package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Carousel-view`: ImageVector
    get() {
        if (`_carousel-view` != null) {
            return `_carousel-view`!!
        }
        `_carousel-view` = Builder(name = "Carousel-view", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(4.5523f, 21.0f, 5.0f, 20.5523f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.4477f, 4.5523f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(7.0f, 4.0f)
                curveTo(7.0f, 3.4477f, 7.4477f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 3.0f, 17.0f, 3.4477f, 17.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(17.0f, 20.5523f, 16.5523f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 21.0f, 7.0f, 20.5523f, 7.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(19.0f, 4.0f)
                curveTo(19.0f, 3.4477f, 19.4477f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                curveTo(19.4477f, 21.0f, 19.0f, 20.5523f, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_carousel-view`!!
    }

private var `_carousel-view`: ImageVector? = null
