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

public val FinanceGroup.`Water-flash-fill`: ImageVector
    get() {
        if (`_water-flash-fill` != null) {
            return `_water-flash-fill`!!
        }
        `_water-flash-fill` = Builder(name = "Water-flash-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6409f, 6.6387f)
                lineTo(12.0049f, 0.2748f)
                lineTo(18.3688f, 6.6387f)
                curveTo(21.8836f, 10.1535f, 21.8836f, 15.8519f, 18.3688f, 19.3667f)
                curveTo(14.8541f, 22.8814f, 9.1556f, 22.8814f, 5.6409f, 19.3667f)
                curveTo(2.1262f, 15.8519f, 2.1262f, 10.1535f, 5.6409f, 6.6387f)
                horizontalLineTo(5.6409f)
                close()
                moveTo(13.0049f, 11.0027f)
                verticalLineTo(6.5027f)
                lineTo(8.5049f, 13.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(17.5027f)
                lineTo(15.5049f, 11.0027f)
                horizontalLineTo(13.0049f)
                close()
            }
        }
        .build()
        return `_water-flash-fill`!!
    }

private var `_water-flash-fill`: ImageVector? = null
