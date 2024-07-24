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

public val MediaGroup.`Mic-2-line`: ImageVector
    get() {
        if (`_mic-2-line` != null) {
            return `_mic-2-line`!!
        }
        `_mic-2-line` = Builder(name = "Mic-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 3.0f)
                curveTo(10.3432f, 3.0f, 9.0001f, 4.3432f, 9.0001f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(9.0001f, 13.6569f, 10.3432f, 15.0f, 12.0001f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0001f, 13.6569f, 15.0001f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(15.0001f, 4.3432f, 13.6569f, 3.0f, 12.0001f, 3.0f)
                close()
                moveTo(12.0001f, 1.0f)
                curveTo(14.7615f, 1.0f, 17.0001f, 3.2386f, 17.0001f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(17.0001f, 14.7614f, 14.7615f, 17.0f, 12.0001f, 17.0f)
                curveTo(9.2387f, 17.0f, 7.0001f, 14.7614f, 7.0001f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(7.0001f, 3.2386f, 9.2387f, 1.0f, 12.0001f, 1.0f)
                close()
                moveTo(2.1924f, 13.9615f)
                lineTo(4.1539f, 13.5692f)
                curveTo(4.8832f, 17.2361f, 8.1189f, 20.0f, 12.0001f, 20.0f)
                curveTo(15.8813f, 20.0f, 19.1169f, 17.2361f, 19.8462f, 13.5692f)
                lineTo(21.8078f, 13.9615f)
                curveTo(20.8961f, 18.5452f, 16.8516f, 22.0f, 12.0001f, 22.0f)
                curveTo(7.1486f, 22.0f, 3.104f, 18.5452f, 2.1924f, 13.9615f)
                close()
            }
        }
        .build()
        return `_mic-2-line`!!
    }

private var `_mic-2-line`: ImageVector? = null
