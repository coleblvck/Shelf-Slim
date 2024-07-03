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

public val FinanceGroup.`Shopping-basket-fill`: ImageVector
    get() {
        if (`_shopping-basket-fill` != null) {
            return `_shopping-basket-fill`!!
        }
        `_shopping-basket-fill` = Builder(name = "Shopping-basket-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 2.0f)
                curveTo(15.3186f, 2.0f, 18.0049f, 4.6863f, 18.0049f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.8379f)
                lineTo(20.0813f, 20.083f)
                curveTo(20.0381f, 20.6013f, 19.6048f, 21.0f, 19.0847f, 21.0f)
                horizontalLineTo(4.925f)
                curveTo(4.4049f, 21.0f, 3.9717f, 20.6013f, 3.9285f, 20.083f)
                lineTo(3.1709f, 11.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0049f)
                verticalLineTo(8.0f)
                curveTo(6.0049f, 4.6863f, 8.6912f, 2.0f, 12.0049f, 2.0f)
                close()
                moveTo(13.0049f, 13.0f)
                horizontalLineTo(11.0049f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0049f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.0049f, 13.0f)
                horizontalLineTo(7.0049f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0049f)
                verticalLineTo(13.0f)
                close()
                moveTo(17.0049f, 13.0f)
                horizontalLineTo(15.0049f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0049f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0049f, 4.0f)
                curveTo(9.8627f, 4.0f, 8.1138f, 5.684f, 8.0098f, 7.8004f)
                lineTo(8.0049f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0049f)
                verticalLineTo(8.0f)
                curveTo(16.0049f, 5.8578f, 14.3209f, 4.1089f, 12.2045f, 4.0049f)
                lineTo(12.0049f, 4.0f)
                close()
            }
        }
        .build()
        return `_shopping-basket-fill`!!
    }

private var `_shopping-basket-fill`: ImageVector? = null
