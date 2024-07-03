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

public val FinanceGroup.`Water-flash-line`: ImageVector
    get() {
        if (`_water-flash-line` != null) {
            return `_water-flash-line`!!
        }
        `_water-flash-line` = Builder(name = "Water-flash-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 3.1032f)
                lineTo(7.0551f, 8.0529f)
                curveTo(4.3215f, 10.7866f, 4.3215f, 15.2188f, 7.0551f, 17.9524f)
                curveTo(9.7888f, 20.6861f, 14.221f, 20.6861f, 16.9546f, 17.9524f)
                curveTo(19.6883f, 15.2188f, 19.6883f, 10.7866f, 16.9546f, 8.053f)
                lineTo(12.0049f, 3.1032f)
                close()
                moveTo(12.0049f, 0.2748f)
                lineTo(18.3688f, 6.6387f)
                curveTo(21.8836f, 10.1535f, 21.8836f, 15.8519f, 18.3688f, 19.3667f)
                curveTo(14.8541f, 22.8814f, 9.1556f, 22.8814f, 5.6409f, 19.3667f)
                curveTo(2.1262f, 15.8519f, 2.1262f, 10.1535f, 5.6409f, 6.6387f)
                lineTo(12.0049f, 0.2748f)
                close()
                moveTo(13.0049f, 11.0027f)
                horizontalLineTo(15.5049f)
                lineTo(11.0049f, 17.5027f)
                verticalLineTo(13.0027f)
                horizontalLineTo(8.5049f)
                lineTo(13.0049f, 6.5027f)
                verticalLineTo(11.0027f)
                close()
            }
        }
        .build()
        return `_water-flash-line`!!
    }

private var `_water-flash-line`: ImageVector? = null
