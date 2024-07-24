package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Prohibited-line`: ImageVector
    get() {
        if (`_prohibited-line` != null) {
            return `_prohibited-line`!!
        }
        `_prohibited-line` = Builder(name = "Prohibited-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0943f, 5.6801f)
                lineTo(18.3199f, 16.9057f)
                curveTo(19.3736f, 15.5506f, 20.0f, 13.8491f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(10.1509f, 4.0f, 8.4494f, 4.6264f, 7.0943f, 5.6801f)
                close()
                moveTo(16.9057f, 18.3199f)
                lineTo(5.6801f, 7.0943f)
                curveTo(4.6264f, 8.4494f, 4.0f, 10.1509f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(13.8491f, 20.0f, 15.5506f, 19.3736f, 16.9057f, 18.3199f)
                close()
                moveTo(4.9289f, 4.9289f)
                curveTo(6.7375f, 3.1204f, 9.2388f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7611f, 20.8796f, 17.2625f, 19.0711f, 19.0711f)
                curveTo(17.2625f, 20.8796f, 14.7611f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 9.2388f, 3.1204f, 6.7375f, 4.9289f, 4.9289f)
                close()
            }
        }
        .build()
        return `_prohibited-line`!!
    }

private var `_prohibited-line`: ImageVector? = null
