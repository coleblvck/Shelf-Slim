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

public val FinanceGroup.`Shopping-bag-line`: ImageVector
    get() {
        if (`_shopping-bag-line` != null) {
            return `_shopping-bag-line`!!
        }
        `_shopping-bag-line` = Builder(name = "Shopping-bag-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0049f, 7.9997f)
                verticalLineTo(5.9997f)
                curveTo(7.0049f, 3.2382f, 9.2435f, 0.9997f, 12.0049f, 0.9997f)
                curveTo(14.7663f, 0.9997f, 17.0049f, 3.2382f, 17.0049f, 5.9997f)
                verticalLineTo(7.9997f)
                horizontalLineTo(20.0049f)
                curveTo(20.5572f, 7.9997f, 21.0049f, 8.4474f, 21.0049f, 8.9997f)
                verticalLineTo(20.9997f)
                curveTo(21.0049f, 21.5519f, 20.5572f, 21.9997f, 20.0049f, 21.9997f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 21.9997f, 3.0049f, 21.5519f, 3.0049f, 20.9997f)
                verticalLineTo(8.9997f)
                curveTo(3.0049f, 8.4474f, 3.4526f, 7.9997f, 4.0049f, 7.9997f)
                horizontalLineTo(7.0049f)
                close()
                moveTo(7.0049f, 9.9997f)
                horizontalLineTo(5.0049f)
                verticalLineTo(19.9997f)
                horizontalLineTo(19.0049f)
                verticalLineTo(9.9997f)
                horizontalLineTo(17.0049f)
                verticalLineTo(11.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(9.9997f)
                horizontalLineTo(9.0049f)
                verticalLineTo(11.9997f)
                horizontalLineTo(7.0049f)
                verticalLineTo(9.9997f)
                close()
                moveTo(9.0049f, 7.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(5.9997f)
                curveTo(15.0049f, 4.3428f, 13.6617f, 2.9997f, 12.0049f, 2.9997f)
                curveTo(10.348f, 2.9997f, 9.0049f, 4.3428f, 9.0049f, 5.9997f)
                verticalLineTo(7.9997f)
                close()
            }
        }
        .build()
        return `_shopping-bag-line`!!
    }

private var `_shopping-bag-line`: ImageVector? = null
