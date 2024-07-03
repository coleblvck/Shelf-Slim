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

public val MediaGroup.`Play-reverse-large-fill`: ImageVector
    get() {
        if (`_play-reverse-large-fill` != null) {
            return `_play-reverse-large-fill`!!
        }
        `_play-reverse-large-fill` = Builder(name = "Play-reverse-large-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.1957f)
                verticalLineTo(3.8042f)
                curveTo(18.0f, 3.0188f, 17.1361f, 2.5399f, 16.47f, 2.9562f)
                lineTo(3.3568f, 11.152f)
                curveTo(2.7301f, 11.5436f, 2.7301f, 12.4563f, 3.3568f, 12.848f)
                lineTo(16.47f, 21.0437f)
                curveTo(17.136f, 21.46f, 18.0f, 20.9812f, 18.0f, 20.1957f)
                close()
            }
        }
        .build()
        return `_play-reverse-large-fill`!!
    }

private var `_play-reverse-large-fill`: ImageVector? = null
