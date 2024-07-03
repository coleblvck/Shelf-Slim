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

public val FinanceGroup.`Shopping-bag-4-line`: ImageVector
    get() {
        if (`_shopping-bag-4-line` != null) {
            return `_shopping-bag-4-line`!!
        }
        `_shopping-bag-4-line` = Builder(name = "Shopping-bag-4-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 4.3432f, 13.6569f, 3.0f, 12.0f, 3.0f)
                curveTo(10.3431f, 3.0f, 9.0f, 4.3432f, 9.0f, 6.0f)
                close()
                moveTo(7.0f, 6.0f)
                curveTo(7.0f, 3.2386f, 9.2386f, 1.0f, 12.0f, 1.0f)
                curveTo(14.7614f, 1.0f, 17.0f, 3.2386f, 17.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 6.4477f, 21.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.4477f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 12.7614f, 14.7614f, 15.0f, 12.0f, 15.0f)
                curveTo(9.2386f, 15.0f, 7.0f, 12.7614f, 7.0f, 10.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_shopping-bag-4-line`!!
    }

private var `_shopping-bag-4-line`: ImageVector? = null
