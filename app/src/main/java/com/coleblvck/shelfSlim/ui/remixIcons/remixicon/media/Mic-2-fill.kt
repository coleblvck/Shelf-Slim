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

public val MediaGroup.`Mic-2-fill`: ImageVector
    get() {
        if (`_mic-2-fill` != null) {
            return `_mic-2-fill`!!
        }
        `_mic-2-fill` = Builder(name = "Mic-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
        return `_mic-2-fill`!!
    }

private var `_mic-2-fill`: ImageVector? = null
