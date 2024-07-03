package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Knife-fill`: ImageVector
    get() {
        if (`_knife-fill` != null) {
            return `_knife-fill`!!
        }
        `_knife-fill` = Builder(name = "Knife-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.3744f, 19.4394f)
                curveTo(22.9602f, 20.0252f, 22.9602f, 20.975f, 22.3744f, 21.5607f)
                curveTo(21.7886f, 22.1465f, 20.8388f, 22.1465f, 20.253f, 21.5607f)
                lineTo(15.6569f, 16.9646f)
                lineTo(12.1213f, 20.5001f)
                lineTo(4.3432f, 12.7219f)
                curveTo(1.2779f, 9.6567f, 1.2201f, 4.7228f, 4.1696f, 1.5871f)
                lineTo(4.3432f, 1.4082f)
                lineTo(22.3744f, 19.4394f)
                close()
            }
        }
        .build()
        return `_knife-fill`!!
    }

private var `_knife-fill`: ImageVector? = null
