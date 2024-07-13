package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Picture-in-picture-exit-fill`: ImageVector
    get() {
        if (`_picture-in-picture-exit-fill` != null) {
            return `_picture-in-picture-exit-fill`!!
        }
        `_picture-in-picture-exit-fill` = Builder(name = "Picture-in-picture-exit-fill",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 13.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 13.4477f, 22.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 21.0f, 12.0f, 20.5523f, 12.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(12.0f, 13.4477f, 12.4477f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(11.5f, 7.0f)
                lineTo(9.4571f, 9.0431f)
                lineTo(11.7071f, 11.2929f)
                lineTo(10.2929f, 12.7071f)
                lineTo(8.0431f, 10.4571f)
                lineTo(6.0f, 12.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return `_picture-in-picture-exit-fill`!!
    }

private var `_picture-in-picture-exit-fill`: ImageVector? = null
