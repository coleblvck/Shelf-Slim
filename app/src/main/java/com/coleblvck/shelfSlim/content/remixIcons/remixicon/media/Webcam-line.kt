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

public val MediaGroup.`Webcam-line`: ImageVector
    get() {
        if (`_webcam-line` != null) {
            return `_webcam-line`!!
        }
        `_webcam-line` = Builder(name = "Webcam-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                verticalLineTo(19.9291f)
                curveTo(7.6077f, 19.4439f, 5.0f, 16.5265f, 5.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 4.134f, 8.134f, 1.0f, 12.0f, 1.0f)
                curveTo(15.866f, 1.0f, 19.0f, 4.134f, 19.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 16.5265f, 16.3923f, 19.4439f, 13.0f, 19.9291f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(9.2386f, 3.0f, 7.0f, 5.2386f, 7.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.7614f, 9.2386f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.7614f, 17.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 5.2386f, 14.7614f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.5523f, 9.0f, 13.0f, 8.5523f, 13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                curveTo(11.0f, 8.5523f, 11.4477f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.3431f, 11.0f, 9.0f, 9.6568f, 9.0f, 8.0f)
                curveTo(9.0f, 6.3432f, 10.3431f, 5.0f, 12.0f, 5.0f)
                curveTo(13.6569f, 5.0f, 15.0f, 6.3432f, 15.0f, 8.0f)
                curveTo(15.0f, 9.6568f, 13.6569f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_webcam-line`!!
    }

private var `_webcam-line`: ImageVector? = null
