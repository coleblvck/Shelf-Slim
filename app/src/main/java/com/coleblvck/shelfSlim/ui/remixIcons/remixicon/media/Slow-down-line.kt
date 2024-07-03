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

public val MediaGroup.`Slow-down-line`: ImageVector
    get() {
        if (`_slow-down-line` != null) {
            return `_slow-down-line`!!
        }
        `_slow-down-line` = Builder(name = "Slow-down-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 15.2091f, 4.8954f, 17.2091f, 6.3432f, 18.6569f)
                lineTo(4.9289f, 20.0711f)
                curveTo(3.1193f, 18.2614f, 2.0f, 15.7614f, 2.0f, 13.0f)
                curveTo(2.0f, 7.4771f, 6.4771f, 3.0f, 12.0f, 3.0f)
                curveTo(17.5228f, 3.0f, 22.0f, 7.4771f, 22.0f, 13.0f)
                curveTo(22.0f, 15.7614f, 20.8807f, 18.2614f, 19.0711f, 20.0711f)
                lineTo(17.6569f, 18.6569f)
                curveTo(19.1046f, 17.2091f, 20.0f, 15.2091f, 20.0f, 13.0f)
                curveTo(20.0f, 8.5817f, 16.4183f, 5.0f, 12.0f, 5.0f)
                curveTo(7.5817f, 5.0f, 4.0f, 8.5817f, 4.0f, 13.0f)
                close()
                moveTo(8.707f, 8.293f)
                lineTo(13.207f, 12.793f)
                lineTo(11.7928f, 14.2072f)
                lineTo(7.2928f, 9.7072f)
                lineTo(8.707f, 8.293f)
                close()
            }
        }
        .build()
        return `_slow-down-line`!!
    }

private var `_slow-down-line`: ImageVector? = null
