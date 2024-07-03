package com.coleblvck.shelf.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Coin-fill`: ImageVector
    get() {
        if (`_coin-fill` != null) {
            return `_coin-fill`!!
        }
        `_coin-fill` = Builder(name = "Coin-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0049f, 12.0027f)
                verticalLineTo(14.0027f)
                curveTo(23.0049f, 17.3165f, 18.08f, 20.0027f, 12.0049f, 20.0027f)
                curveTo(6.0382f, 20.0027f, 1.1811f, 17.4115f, 1.0096f, 14.1797f)
                lineTo(1.0049f, 14.0027f)
                verticalLineTo(12.0027f)
                curveTo(1.0049f, 15.3165f, 5.9297f, 18.0027f, 12.0049f, 18.0027f)
                curveTo(18.08f, 18.0027f, 23.0049f, 15.3165f, 23.0049f, 12.0027f)
                close()
                moveTo(12.0049f, 4.0027f)
                curveTo(18.08f, 4.0027f, 23.0049f, 6.689f, 23.0049f, 10.0027f)
                curveTo(23.0049f, 13.3165f, 18.08f, 16.0027f, 12.0049f, 16.0027f)
                curveTo(5.9297f, 16.0027f, 1.0049f, 13.3165f, 1.0049f, 10.0027f)
                curveTo(1.0049f, 6.689f, 5.9297f, 4.0027f, 12.0049f, 4.0027f)
                close()
            }
        }
        .build()
        return `_coin-fill`!!
    }

private var `_coin-fill`: ImageVector? = null
