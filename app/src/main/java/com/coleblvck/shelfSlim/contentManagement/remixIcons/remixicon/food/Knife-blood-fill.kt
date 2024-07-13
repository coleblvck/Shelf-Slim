package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Knife-blood-fill`: ImageVector
    get() {
        if (`_knife-blood-fill` != null) {
            return `_knife-blood-fill`!!
        }
        `_knife-blood-fill` = Builder(name = "Knife-blood-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3432f, 1.4082f)
                lineTo(22.3744f, 19.4394f)
                curveTo(22.9602f, 20.0252f, 22.9602f, 20.975f, 22.3744f, 21.5607f)
                curveTo(21.7886f, 22.1465f, 20.8388f, 22.1465f, 20.253f, 21.5607f)
                lineTo(15.6569f, 16.9646f)
                lineTo(12.1213f, 20.5001f)
                lineTo(8.001f, 16.3792f)
                lineTo(8.0013f, 19.0001f)
                curveTo(8.0013f, 19.5524f, 7.5536f, 20.0001f, 7.0013f, 20.0001f)
                curveTo(6.449f, 20.0001f, 6.0013f, 19.5524f, 6.0013f, 19.0001f)
                verticalLineTo(15.0001f)
                curveTo(6.0013f, 14.4478f, 5.5536f, 14.0001f, 5.0013f, 14.0001f)
                curveTo(4.4885f, 14.0001f, 4.0658f, 14.3861f, 4.008f, 14.8835f)
                lineTo(4.0013f, 15.0001f)
                verticalLineTo(16.0001f)
                curveTo(4.0013f, 16.5524f, 3.5536f, 17.0001f, 3.0013f, 17.0001f)
                curveTo(2.449f, 17.0001f, 2.0013f, 16.5524f, 2.0013f, 16.0001f)
                lineTo(2.0014f, 7.2139f)
                curveTo(1.964f, 5.1945f, 2.6868f, 3.1636f, 4.1696f, 1.5871f)
                lineTo(4.3432f, 1.4082f)
                close()
            }
        }
        .build()
        return `_knife-blood-fill`!!
    }

private var `_knife-blood-fill`: ImageVector? = null
