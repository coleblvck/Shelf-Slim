package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Google-play-fill`: ImageVector
    get() {
        if (`_google-play-fill` != null) {
            return `_google-play-fill`!!
        }
        `_google-play-fill` = Builder(name = "Google-play-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6097f, 1.814f)
                lineTo(13.793f, 12.0f)
                lineTo(3.6108f, 22.1864f)
                curveTo(3.4178f, 22.1048f, 3.2487f, 21.962f, 3.1356f, 21.7667f)
                curveTo(3.0474f, 21.6144f, 3.001f, 21.4416f, 3.001f, 21.2656f)
                verticalLineTo(2.7345f)
                curveTo(3.001f, 2.3211f, 3.2519f, 1.9662f, 3.6097f, 1.814f)
                close()
                moveTo(14.5f, 12.707f)
                lineTo(16.802f, 15.009f)
                lineTo(5.865f, 21.342f)
                lineTo(14.5f, 12.707f)
                close()
                moveTo(17.699f, 9.509f)
                lineTo(20.5061f, 11.1347f)
                curveTo(20.9841f, 11.4114f, 21.1473f, 12.0232f, 20.8705f, 12.5011f)
                curveTo(20.783f, 12.6523f, 20.6574f, 12.778f, 20.5061f, 12.8655f)
                lineTo(17.698f, 14.491f)
                lineTo(15.207f, 12.0f)
                lineTo(17.699f, 9.509f)
                close()
                moveTo(5.865f, 2.658f)
                lineTo(16.803f, 8.99f)
                lineTo(14.5f, 11.293f)
                lineTo(5.865f, 2.658f)
                close()
            }
        }
        .build()
        return `_google-play-fill`!!
    }

private var `_google-play-fill`: ImageVector? = null
