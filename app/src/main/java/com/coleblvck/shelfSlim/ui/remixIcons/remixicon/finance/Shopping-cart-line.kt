package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Shopping-cart-line`: ImageVector
    get() {
        if (`_shopping-cart-line` != null) {
            return `_shopping-cart-line`!!
        }
        `_shopping-cart-line` = Builder(name = "Shopping-cart-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0049f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0049f)
                curveTo(5.5572f, 2.0f, 6.0049f, 2.4477f, 6.0049f, 3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.4433f)
                lineTo(20.4433f, 7.0f)
                horizontalLineTo(8.0049f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.7241f)
                curveTo(22.2764f, 5.0f, 22.7241f, 5.4477f, 22.7241f, 6.0f)
                curveTo(22.7241f, 6.0818f, 22.7141f, 6.1632f, 22.6942f, 6.2425f)
                lineTo(20.1942f, 16.2425f)
                curveTo(20.083f, 16.6877f, 19.683f, 17.0f, 19.2241f, 17.0f)
                horizontalLineTo(5.0049f)
                curveTo(4.4526f, 17.0f, 4.0049f, 16.5523f, 4.0049f, 16.0f)
                close()
                moveTo(6.0049f, 23.0f)
                curveTo(4.9003f, 23.0f, 4.0049f, 22.1046f, 4.0049f, 21.0f)
                curveTo(4.0049f, 19.8954f, 4.9003f, 19.0f, 6.0049f, 19.0f)
                curveTo(7.1094f, 19.0f, 8.0049f, 19.8954f, 8.0049f, 21.0f)
                curveTo(8.0049f, 22.1046f, 7.1094f, 23.0f, 6.0049f, 23.0f)
                close()
                moveTo(18.0049f, 23.0f)
                curveTo(16.9003f, 23.0f, 16.0049f, 22.1046f, 16.0049f, 21.0f)
                curveTo(16.0049f, 19.8954f, 16.9003f, 19.0f, 18.0049f, 19.0f)
                curveTo(19.1095f, 19.0f, 20.0049f, 19.8954f, 20.0049f, 21.0f)
                curveTo(20.0049f, 22.1046f, 19.1095f, 23.0f, 18.0049f, 23.0f)
                close()
            }
        }
        .build()
        return `_shopping-cart-line`!!
    }

private var `_shopping-cart-line`: ImageVector? = null
