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

public val FinanceGroup.`Token-swap-fill`: ImageVector
    get() {
        if (`_token-swap-fill` != null) {
            return `_token-swap-fill`!!
        }
        `_token-swap-fill` = Builder(name = "Token-swap-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.0f)
                curveTo(21.5f, 11.7039f, 19.849f, 14.0223f, 17.5f, 15.0018f)
                lineTo(17.5f, 15.0f)
                curveTo(17.5f, 10.3056f, 13.6944f, 6.5f, 9.0f, 6.5f)
                lineTo(8.9982f, 6.5f)
                curveTo(9.9777f, 4.1511f, 12.2961f, 2.5f, 15.0f, 2.5f)
                curveTo(18.5899f, 2.5f, 21.5f, 5.4102f, 21.5f, 9.0f)
                close()
                moveTo(7.0f, 3.0f)
                curveTo(4.7909f, 3.0f, 3.0f, 4.7909f, 3.0f, 7.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.8954f, 5.8954f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(19.0f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.1046f, 18.1046f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2091f, 21.0f, 21.0f, 19.2091f, 21.0f, 17.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.0f)
                close()
                moveTo(9.0f, 21.5f)
                curveTo(12.5899f, 21.5f, 15.5f, 18.5899f, 15.5f, 15.0f)
                curveTo(15.5f, 11.4101f, 12.5899f, 8.5f, 9.0f, 8.5f)
                curveTo(5.4102f, 8.5f, 2.5f, 11.4101f, 2.5f, 15.0f)
                curveTo(2.5f, 18.5899f, 5.4102f, 21.5f, 9.0f, 21.5f)
                close()
                moveTo(9.0f, 12.5f)
                lineTo(11.5f, 15.0f)
                lineTo(9.0f, 17.5f)
                lineTo(6.5f, 15.0f)
                lineTo(9.0f, 12.5f)
                close()
            }
        }
        .build()
        return `_token-swap-fill`!!
    }

private var `_token-swap-fill`: ImageVector? = null
