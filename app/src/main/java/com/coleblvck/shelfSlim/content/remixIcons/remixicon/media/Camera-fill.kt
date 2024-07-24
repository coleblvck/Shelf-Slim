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

public val MediaGroup.`Camera-fill`: ImageVector
    get() {
        if (`_camera-fill` != null) {
            return `_camera-fill`!!
        }
        `_camera-fill` = Builder(name = "Camera-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(15.3137f, 19.0f, 18.0f, 16.3137f, 18.0f, 13.0f)
                curveTo(18.0f, 9.6863f, 15.3137f, 7.0f, 12.0f, 7.0f)
                curveTo(8.6863f, 7.0f, 6.0f, 9.6863f, 6.0f, 13.0f)
                curveTo(6.0f, 16.3137f, 8.6863f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(9.7909f, 17.0f, 8.0f, 15.2091f, 8.0f, 13.0f)
                curveTo(8.0f, 10.7909f, 9.7909f, 9.0f, 12.0f, 9.0f)
                curveTo(14.2091f, 9.0f, 16.0f, 10.7909f, 16.0f, 13.0f)
                curveTo(16.0f, 15.2091f, 14.2091f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_camera-fill`!!
    }

private var `_camera-fill`: ImageVector? = null
