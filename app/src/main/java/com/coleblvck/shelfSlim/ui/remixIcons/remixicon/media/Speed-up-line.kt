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

public val MediaGroup.`Speed-up-line`: ImageVector
    get() {
        if (`_speed-up-line` != null) {
            return `_speed-up-line`!!
        }
        `_speed-up-line` = Builder(name = "Speed-up-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(20.0f, 15.2091f, 19.1046f, 17.2091f, 17.6569f, 18.6569f)
                lineTo(19.0711f, 20.0711f)
                curveTo(20.8807f, 18.2614f, 22.0f, 15.7614f, 22.0f, 13.0f)
                curveTo(22.0f, 7.4771f, 17.5228f, 3.0f, 12.0f, 3.0f)
                curveTo(6.4771f, 3.0f, 2.0f, 7.4771f, 2.0f, 13.0f)
                curveTo(2.0f, 15.7614f, 3.1193f, 18.2614f, 4.9289f, 20.0711f)
                lineTo(6.3432f, 18.6569f)
                curveTo(4.8954f, 17.2091f, 4.0f, 15.2091f, 4.0f, 13.0f)
                curveTo(4.0f, 8.5817f, 7.5817f, 5.0f, 12.0f, 5.0f)
                curveTo(16.4183f, 5.0f, 20.0f, 8.5817f, 20.0f, 13.0f)
                close()
                moveTo(15.293f, 8.293f)
                lineTo(10.793f, 12.793f)
                lineTo(12.2072f, 14.2072f)
                lineTo(16.7072f, 9.7072f)
                lineTo(15.293f, 8.293f)
                close()
            }
        }
        .build()
        return `_speed-up-line`!!
    }

private var `_speed-up-line`: ImageVector? = null
