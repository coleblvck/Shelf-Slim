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

public val MediaGroup.`Play-large-fill`: ImageVector
    get() {
        if (`_play-large-fill` != null) {
            return `_play-large-fill`!!
        }
        `_play-large-fill` = Builder(name = "Play-large-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.1957f)
                verticalLineTo(3.8042f)
                curveTo(6.0f, 3.0188f, 6.8639f, 2.5399f, 7.53f, 2.9562f)
                lineTo(20.6432f, 11.152f)
                curveTo(21.2699f, 11.5436f, 21.2699f, 12.4563f, 20.6432f, 12.848f)
                lineTo(7.53f, 21.0437f)
                curveTo(6.8639f, 21.46f, 6.0f, 20.9812f, 6.0f, 20.1957f)
                close()
            }
        }
        .build()
        return `_play-large-fill`!!
    }

private var `_play-large-fill`: ImageVector? = null
