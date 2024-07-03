package com.coleblvck.shelf.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Restaurant-2-fill`: ImageVector
    get() {
        if (`_restaurant-2-fill` != null) {
            return `_restaurant-2-fill`!!
        }
        `_restaurant-2-fill` = Builder(name = "Restaurant-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2224f, 3.8075f)
                lineTo(10.9399f, 10.525f)
                lineTo(8.1114f, 13.3535f)
                lineTo(4.2224f, 9.4644f)
                curveTo(2.6603f, 7.9023f, 2.6603f, 5.3696f, 4.2224f, 3.8075f)
                close()
                moveTo(14.2683f, 12.1464f)
                lineTo(13.4147f, 12.9999f)
                lineTo(20.4858f, 20.071f)
                lineTo(19.0716f, 21.4852f)
                lineTo(12.0005f, 14.4141f)
                lineTo(4.9295f, 21.4852f)
                lineTo(3.5152f, 20.071f)
                lineTo(12.854f, 10.7322f)
                curveTo(12.2664f, 9.2753f, 12.8738f, 7.1769f, 14.4754f, 5.5753f)
                curveTo(16.428f, 3.6227f, 19.119f, 3.1478f, 20.4858f, 4.5146f)
                curveTo(21.8526f, 5.8815f, 21.3778f, 8.5724f, 19.4251f, 10.525f)
                curveTo(17.8235f, 12.1267f, 15.7252f, 12.7341f, 14.2683f, 12.1464f)
                close()
            }
        }
        .build()
        return `_restaurant-2-fill`!!
    }

private var `_restaurant-2-fill`: ImageVector? = null
