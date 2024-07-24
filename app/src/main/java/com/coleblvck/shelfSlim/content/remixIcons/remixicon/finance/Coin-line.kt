package com.coleblvck.shelfSlim.content.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Coin-line`: ImageVector
    get() {
        if (`_coin-line` != null) {
            return `_coin-line`!!
        }
        `_coin-line` = Builder(name = "Coin-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 4.0027f)
                curveTo(18.08f, 4.0027f, 23.0049f, 6.689f, 23.0049f, 10.0027f)
                verticalLineTo(14.0027f)
                curveTo(23.0049f, 17.3165f, 18.08f, 20.0027f, 12.0049f, 20.0027f)
                curveTo(6.0382f, 20.0027f, 1.1811f, 17.4115f, 1.0096f, 14.1797f)
                lineTo(1.0049f, 14.0027f)
                verticalLineTo(10.0027f)
                curveTo(1.0049f, 6.689f, 5.9297f, 4.0027f, 12.0049f, 4.0027f)
                close()
                moveTo(12.0049f, 16.0027f)
                curveTo(8.2844f, 16.0027f, 4.9954f, 14.9953f, 3.0047f, 13.4532f)
                lineTo(3.0049f, 14.0027f)
                curveTo(3.0049f, 15.8849f, 6.8875f, 18.0027f, 12.0049f, 18.0027f)
                curveTo(17.0156f, 18.0027f, 20.8426f, 15.9723f, 20.9999f, 14.1207f)
                lineTo(21.0049f, 14.0027f)
                lineTo(21.0061f, 13.4524f)
                curveTo(19.0155f, 14.9949f, 15.726f, 16.0027f, 12.0049f, 16.0027f)
                close()
                moveTo(12.0049f, 6.0027f)
                curveTo(6.8875f, 6.0027f, 3.0049f, 8.1205f, 3.0049f, 10.0027f)
                curveTo(3.0049f, 11.8849f, 6.8875f, 14.0027f, 12.0049f, 14.0027f)
                curveTo(17.1223f, 14.0027f, 21.0049f, 11.8849f, 21.0049f, 10.0027f)
                curveTo(21.0049f, 8.1205f, 17.1223f, 6.0027f, 12.0049f, 6.0027f)
                close()
            }
        }
        .build()
        return `_coin-line`!!
    }

private var `_coin-line`: ImageVector? = null
