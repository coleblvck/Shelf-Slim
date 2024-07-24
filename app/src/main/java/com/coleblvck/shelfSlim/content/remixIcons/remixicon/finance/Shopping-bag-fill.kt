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

public val FinanceGroup.`Shopping-bag-fill`: ImageVector
    get() {
        if (`_shopping-bag-fill` != null) {
            return `_shopping-bag-fill`!!
        }
        `_shopping-bag-fill` = Builder(name = "Shopping-bag-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 0.9997f)
                curveTo(14.7663f, 0.9997f, 17.0049f, 3.2383f, 17.0049f, 5.9997f)
                verticalLineTo(7.9997f)
                horizontalLineTo(20.0049f)
                curveTo(20.5572f, 7.9997f, 21.0049f, 8.4474f, 21.0049f, 8.9997f)
                verticalLineTo(20.9997f)
                curveTo(21.0049f, 21.552f, 20.5572f, 21.9997f, 20.0049f, 21.9997f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 21.9997f, 3.0049f, 21.552f, 3.0049f, 20.9997f)
                verticalLineTo(8.9997f)
                curveTo(3.0049f, 8.4474f, 3.4526f, 7.9997f, 4.0049f, 7.9997f)
                horizontalLineTo(7.0049f)
                verticalLineTo(5.9997f)
                curveTo(7.0049f, 3.2383f, 9.2435f, 0.9997f, 12.0049f, 0.9997f)
                close()
                moveTo(17.0049f, 10.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(11.9997f)
                curveTo(15.0049f, 12.552f, 15.4526f, 12.9997f, 16.0049f, 12.9997f)
                curveTo(16.5177f, 12.9997f, 16.9404f, 12.6137f, 16.9982f, 12.1163f)
                lineTo(17.0049f, 11.9997f)
                verticalLineTo(10.9997f)
                close()
                moveTo(9.0049f, 10.9997f)
                horizontalLineTo(7.0049f)
                verticalLineTo(11.9997f)
                curveTo(7.0049f, 12.552f, 7.4526f, 12.9997f, 8.0049f, 12.9997f)
                curveTo(8.5177f, 12.9997f, 8.9404f, 12.6137f, 8.9981f, 12.1163f)
                lineTo(9.0049f, 11.9997f)
                verticalLineTo(10.9997f)
                close()
                moveTo(12.0049f, 2.9997f)
                curveTo(10.4072f, 2.9997f, 9.1012f, 4.2486f, 9.01f, 5.8234f)
                lineTo(9.0049f, 5.9997f)
                verticalLineTo(7.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(5.9997f)
                curveTo(15.0049f, 4.402f, 13.756f, 3.096f, 12.1812f, 3.0048f)
                lineTo(12.0049f, 2.9997f)
                close()
            }
        }
        .build()
        return `_shopping-bag-fill`!!
    }

private var `_shopping-bag-fill`: ImageVector? = null
