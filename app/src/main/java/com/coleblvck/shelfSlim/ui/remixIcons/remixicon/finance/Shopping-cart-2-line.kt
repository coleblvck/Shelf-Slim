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

public val FinanceGroup.`Shopping-cart-2-line`: ImageVector
    get() {
        if (`_shopping-cart-2-line` != null) {
            return `_shopping-cart-2-line`!!
        }
        `_shopping-cart-2-line` = Builder(name = "Shopping-cart-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0044f, 6.4169f)
                lineTo(0.7617f, 3.1742f)
                lineTo(2.1759f, 1.76f)
                lineTo(5.4186f, 5.0026f)
                horizontalLineTo(20.6603f)
                curveTo(21.2126f, 5.0026f, 21.6603f, 5.4504f, 21.6603f, 6.0026f)
                curveTo(21.6603f, 6.1f, 21.6461f, 6.1968f, 21.6182f, 6.29f)
                lineTo(19.2182f, 14.29f)
                curveTo(19.0913f, 14.713f, 18.7019f, 15.0027f, 18.2603f, 15.0027f)
                horizontalLineTo(6.0044f)
                verticalLineTo(17.0027f)
                horizontalLineTo(17.0044f)
                verticalLineTo(19.0027f)
                horizontalLineTo(5.0044f)
                curveTo(4.4521f, 19.0027f, 4.0044f, 18.5549f, 4.0044f, 18.0027f)
                verticalLineTo(6.4169f)
                close()
                moveTo(6.0044f, 7.0026f)
                verticalLineTo(13.0027f)
                horizontalLineTo(17.5163f)
                lineTo(19.3163f, 7.0026f)
                horizontalLineTo(6.0044f)
                close()
                moveTo(5.5044f, 23.0027f)
                curveTo(4.6759f, 23.0027f, 4.0044f, 22.3311f, 4.0044f, 21.5027f)
                curveTo(4.0044f, 20.6742f, 4.6759f, 20.0027f, 5.5044f, 20.0027f)
                curveTo(6.3328f, 20.0027f, 7.0044f, 20.6742f, 7.0044f, 21.5027f)
                curveTo(7.0044f, 22.3311f, 6.3328f, 23.0027f, 5.5044f, 23.0027f)
                close()
                moveTo(17.5044f, 23.0027f)
                curveTo(16.6759f, 23.0027f, 16.0044f, 22.3311f, 16.0044f, 21.5027f)
                curveTo(16.0044f, 20.6742f, 16.6759f, 20.0027f, 17.5044f, 20.0027f)
                curveTo(18.3328f, 20.0027f, 19.0044f, 20.6742f, 19.0044f, 21.5027f)
                curveTo(19.0044f, 22.3311f, 18.3328f, 23.0027f, 17.5044f, 23.0027f)
                close()
            }
        }
        .build()
        return `_shopping-cart-2-line`!!
    }

private var `_shopping-cart-2-line`: ImageVector? = null
