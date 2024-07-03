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

public val SystemGroup.`Prohibited-2-fill`: ImageVector
    get() {
        if (`_prohibited-2-fill` != null) {
            return `_prohibited-2-fill`!!
        }
        `_prohibited-2-fill` = Builder(name = "Prohibited-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2571f, 18.3287f)
                curveTo(2.8464f, 16.6049f, 2.0f, 14.4013f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(14.4013f, 2.0f, 16.6049f, 2.8464f, 18.3287f, 4.2571f)
                lineTo(4.2571f, 18.3287f)
                close()
                moveTo(19.7429f, 5.6713f)
                curveTo(21.1536f, 7.3951f, 22.0f, 9.5987f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(9.5987f, 22.0f, 7.3951f, 21.1536f, 5.6713f, 19.7429f)
                lineTo(19.7429f, 5.6713f)
                close()
            }
        }
        .build()
        return `_prohibited-2-fill`!!
    }

private var `_prohibited-2-fill`: ImageVector? = null
