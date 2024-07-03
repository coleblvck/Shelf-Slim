package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Pause-mini-line`: ImageVector
    get() {
        if (`_pause-mini-line` != null) {
            return `_pause-mini-line`!!
        }
        `_pause-mini-line` = Builder(name = "Pause-mini-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                curveTo(15.0f, 6.4477f, 15.4477f, 6.0f, 16.0f, 6.0f)
                curveTo(16.5523f, 6.0f, 17.0f, 6.4477f, 17.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 17.5523f, 16.5523f, 18.0f, 16.0f, 18.0f)
                curveTo(15.4477f, 18.0f, 15.0f, 17.5523f, 15.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(7.0f, 7.0f)
                curveTo(7.0f, 6.4477f, 7.4477f, 6.0f, 8.0f, 6.0f)
                curveTo(8.5523f, 6.0f, 9.0f, 6.4477f, 9.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.5523f, 8.5523f, 18.0f, 8.0f, 18.0f)
                curveTo(7.4477f, 18.0f, 7.0f, 17.5523f, 7.0f, 17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_pause-mini-line`!!
    }

private var `_pause-mini-line`: ImageVector? = null
