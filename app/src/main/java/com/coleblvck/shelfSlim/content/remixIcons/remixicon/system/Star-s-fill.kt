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

public val SystemGroup.`Star-s-fill`: ImageVector
    get() {
        if (`_star-s-fill` != null) {
            return `_star-s-fill`!!
        }
        `_star-s-fill` = Builder(name = "Star-s-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 17.0f)
                lineTo(6.122f, 20.5902f)
                lineTo(7.7201f, 13.8906f)
                lineTo(2.4893f, 9.4098f)
                lineTo(9.3548f, 8.8594f)
                lineTo(11.9998f, 2.5f)
                lineTo(14.6449f, 8.8594f)
                lineTo(21.5104f, 9.4098f)
                lineTo(16.2796f, 13.8906f)
                lineTo(17.8777f, 20.5902f)
                lineTo(11.9998f, 17.0f)
                close()
            }
        }
        .build()
        return `_star-s-fill`!!
    }

private var `_star-s-fill`: ImageVector? = null
