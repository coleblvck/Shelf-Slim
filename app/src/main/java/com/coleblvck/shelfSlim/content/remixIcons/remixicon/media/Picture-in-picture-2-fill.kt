package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Picture-in-picture-2-fill`: ImageVector
    get() {
        if (`_picture-in-picture-2-fill` != null) {
            return `_picture-in-picture-2-fill`!!
        }
        `_picture-in-picture-2-fill` = Builder(name = "Picture-in-picture-2-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(6.7071f, 6.2929f)
                lineTo(8.9569f, 8.5429f)
                lineTo(11.0f, 6.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.5f)
                lineTo(7.5429f, 9.9569f)
                lineTo(5.2929f, 7.7071f)
                lineTo(6.7071f, 6.2929f)
                close()
            }
        }
        .build()
        return `_picture-in-picture-2-fill`!!
    }

private var `_picture-in-picture-2-fill`: ImageVector? = null
