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

public val FinanceGroup.`Stock-fill`: ImageVector
    get() {
        if (`_stock-fill` != null) {
            return `_stock-fill`!!
        }
        `_stock-fill` = Builder(name = "Stock-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0049f, 5.0028f)
                horizontalLineTo(11.0049f)
                verticalLineTo(14.0028f)
                horizontalLineTo(8.0049f)
                verticalLineTo(17.0028f)
                horizontalLineTo(6.0049f)
                verticalLineTo(14.0028f)
                horizontalLineTo(3.0049f)
                verticalLineTo(5.0028f)
                horizontalLineTo(6.0049f)
                verticalLineTo(2.0028f)
                horizontalLineTo(8.0049f)
                verticalLineTo(5.0028f)
                close()
                moveTo(18.0049f, 10.0028f)
                horizontalLineTo(21.0049f)
                verticalLineTo(19.0028f)
                horizontalLineTo(18.0049f)
                verticalLineTo(22.0028f)
                horizontalLineTo(16.0049f)
                verticalLineTo(19.0028f)
                horizontalLineTo(13.0049f)
                verticalLineTo(10.0028f)
                horizontalLineTo(16.0049f)
                verticalLineTo(7.0028f)
                horizontalLineTo(18.0049f)
                verticalLineTo(10.0028f)
                close()
            }
        }
        .build()
        return `_stock-fill`!!
    }

private var `_stock-fill`: ImageVector? = null
