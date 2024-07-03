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

public val FinanceGroup.`Copper-coin-line`: ImageVector
    get() {
        if (`_copper-coin-line` != null) {
            return `_copper-coin-line`!!
        }
        `_copper-coin-line` = Builder(name = "Copper-coin-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 22.0027f)
                curveTo(6.482f, 22.0027f, 2.0049f, 17.5256f, 2.0049f, 12.0027f)
                curveTo(2.0049f, 6.4799f, 6.482f, 2.0027f, 12.0049f, 2.0027f)
                curveTo(17.5277f, 2.0027f, 22.0049f, 6.4799f, 22.0049f, 12.0027f)
                curveTo(22.0049f, 17.5256f, 17.5277f, 22.0027f, 12.0049f, 22.0027f)
                close()
                moveTo(12.0049f, 20.0027f)
                curveTo(16.4232f, 20.0027f, 20.0049f, 16.421f, 20.0049f, 12.0027f)
                curveTo(20.0049f, 7.5845f, 16.4232f, 4.0027f, 12.0049f, 4.0027f)
                curveTo(7.5866f, 4.0027f, 4.0049f, 7.5845f, 4.0049f, 12.0027f)
                curveTo(4.0049f, 16.421f, 7.5866f, 20.0027f, 12.0049f, 20.0027f)
                close()
                moveTo(12.0049f, 7.053f)
                lineTo(16.9546f, 12.0027f)
                lineTo(12.0049f, 16.9525f)
                lineTo(7.0551f, 12.0027f)
                lineTo(12.0049f, 7.053f)
                close()
                moveTo(12.0049f, 9.8814f)
                lineTo(9.8836f, 12.0027f)
                lineTo(12.0049f, 14.1241f)
                lineTo(14.1262f, 12.0027f)
                lineTo(12.0049f, 9.8814f)
                close()
            }
        }
        .build()
        return `_copper-coin-line`!!
    }

private var `_copper-coin-line`: ImageVector? = null
