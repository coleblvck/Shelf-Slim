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

public val FinanceGroup.`Shopping-bag-3-line`: ImageVector
    get() {
        if (`_shopping-bag-3-line` != null) {
            return `_shopping-bag-3-line`!!
        }
        `_shopping-bag-3-line` = Builder(name = "Shopping-bag-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5049f, 2.0f)
                horizontalLineTo(17.5049f)
                curveTo(17.8196f, 2.0f, 18.116f, 2.1482f, 18.3049f, 2.4f)
                lineTo(21.0049f, 6.0f)
                verticalLineTo(21.0f)
                curveTo(21.0049f, 21.5523f, 20.5572f, 22.0f, 20.0049f, 22.0f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 22.0f, 3.0049f, 21.5523f, 3.0049f, 21.0f)
                verticalLineTo(6.0f)
                lineTo(5.7049f, 2.4f)
                curveTo(5.8937f, 2.1482f, 6.1901f, 2.0f, 6.5049f, 2.0f)
                close()
                moveTo(19.0049f, 8.0f)
                horizontalLineTo(5.0049f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0049f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.5049f, 6.0f)
                lineTo(17.0049f, 4.0f)
                horizontalLineTo(7.0049f)
                lineTo(5.5049f, 6.0f)
                horizontalLineTo(18.5049f)
                close()
                moveTo(9.0049f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(9.0049f, 13.6569f, 10.348f, 15.0f, 12.0049f, 15.0f)
                curveTo(13.6617f, 15.0f, 15.0049f, 13.6569f, 15.0049f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0049f)
                verticalLineTo(12.0f)
                curveTo(17.0049f, 14.7614f, 14.7663f, 17.0f, 12.0049f, 17.0f)
                curveTo(9.2435f, 17.0f, 7.0049f, 14.7614f, 7.0049f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0049f)
                close()
            }
        }
        .build()
        return `_shopping-bag-3-line`!!
    }

private var `_shopping-bag-3-line`: ImageVector? = null
