package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Prohibited-2-line`: ImageVector
    get() {
        if (`_prohibited-2-line` != null) {
            return `_prohibited-2-line`!!
        }
        `_prohibited-2-line` = Builder(name = "Prohibited-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9057f, 5.6801f)
                lineTo(5.6801f, 16.9057f)
                curveTo(4.6264f, 15.5506f, 4.0f, 13.8491f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(13.8491f, 4.0f, 15.5506f, 4.6264f, 16.9057f, 5.6801f)
                close()
                moveTo(7.0943f, 18.3199f)
                lineTo(18.3199f, 7.0943f)
                curveTo(19.3736f, 8.4494f, 20.0f, 10.1509f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(10.1509f, 20.0f, 8.4494f, 19.3736f, 7.0943f, 18.3199f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5223f, 6.4777f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4777f, 17.5223f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_prohibited-2-line`!!
    }

private var `_prohibited-2-line`: ImageVector? = null
