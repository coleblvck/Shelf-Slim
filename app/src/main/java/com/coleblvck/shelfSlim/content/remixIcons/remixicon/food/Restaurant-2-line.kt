package com.coleblvck.shelfSlim.content.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Restaurant-2-line`: ImageVector
    get() {
        if (`_restaurant-2-line` != null) {
            return `_restaurant-2-line`!!
        }
        `_restaurant-2-line` = Builder(name = "Restaurant-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2683f, 12.1466f)
                lineTo(13.4147f, 13.0002f)
                lineTo(20.4858f, 20.0712f)
                lineTo(19.0716f, 21.4854f)
                lineTo(12.0005f, 14.4144f)
                lineTo(4.9295f, 21.4854f)
                lineTo(3.5152f, 20.0712f)
                lineTo(12.854f, 10.7324f)
                curveTo(12.2664f, 9.2755f, 12.8738f, 7.1771f, 14.4754f, 5.5755f)
                curveTo(16.428f, 3.6229f, 19.119f, 3.1481f, 20.4858f, 4.5149f)
                curveTo(21.8526f, 5.8817f, 21.3778f, 8.5727f, 19.4251f, 10.5253f)
                curveTo(17.8235f, 12.1269f, 15.7252f, 12.7343f, 14.2683f, 12.1466f)
                close()
                moveTo(4.2224f, 3.8078f)
                lineTo(10.9399f, 10.5253f)
                lineTo(8.1114f, 13.3537f)
                lineTo(4.2224f, 9.4646f)
                curveTo(2.6603f, 7.9025f, 2.6603f, 5.3699f, 4.2224f, 3.8078f)
                close()
                moveTo(18.0109f, 9.1111f)
                curveTo(19.2682f, 7.8539f, 19.5274f, 6.3849f, 19.0716f, 5.9291f)
                curveTo(18.6158f, 5.4733f, 17.1468f, 5.7325f, 15.8896f, 6.9897f)
                curveTo(14.6324f, 8.247f, 14.3732f, 9.716f, 14.829f, 10.1717f)
                curveTo(15.2847f, 10.6275f, 16.7537f, 10.3683f, 18.0109f, 9.1111f)
                close()
            }
        }
        .build()
        return `_restaurant-2-line`!!
    }

private var `_restaurant-2-line`: ImageVector? = null
