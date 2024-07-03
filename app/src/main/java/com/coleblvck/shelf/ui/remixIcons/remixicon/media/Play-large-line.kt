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

public val MediaGroup.`Play-large-line`: ImageVector
    get() {
        if (`_play-large-line` != null) {
            return `_play-large-line`!!
        }
        `_play-large-line` = Builder(name = "Play-large-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.3915f)
                verticalLineTo(5.6085f)
                lineTo(18.2264f, 12.0f)
                lineTo(8.0f, 18.3915f)
                close()
                moveTo(6.0f, 3.8042f)
                verticalLineTo(20.1957f)
                curveTo(6.0f, 20.9812f, 6.8639f, 21.46f, 7.53f, 21.0437f)
                lineTo(20.6432f, 12.848f)
                curveTo(21.2699f, 12.4563f, 21.2699f, 11.5436f, 20.6432f, 11.152f)
                lineTo(7.53f, 2.9562f)
                curveTo(6.8639f, 2.5399f, 6.0f, 3.0188f, 6.0f, 3.8042f)
                close()
            }
        }
        .build()
        return `_play-large-line`!!
    }

private var `_play-large-line`: ImageVector? = null
