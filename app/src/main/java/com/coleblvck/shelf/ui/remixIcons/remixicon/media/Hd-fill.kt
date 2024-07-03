package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Hd-fill`: ImageVector
    get() {
        if (`_hd-fill` != null) {
            return `_hd-fill`!!
        }
        `_hd-fill` = Builder(name = "Hd-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(7.5f, 11.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.5f)
                close()
                moveTo(14.5f, 10.5f)
                horizontalLineTo(16.0f)
                curveTo(16.2761f, 10.5f, 16.5f, 10.7239f, 16.5f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.5f, 13.2761f, 16.2761f, 13.5f, 16.0f, 13.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 15.0f, 18.0f, 14.1046f, 18.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(18.0f, 9.8954f, 17.1046f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_hd-fill`!!
    }

private var `_hd-fill`: ImageVector? = null
