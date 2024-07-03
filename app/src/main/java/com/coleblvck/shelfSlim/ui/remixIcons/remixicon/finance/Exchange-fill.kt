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

public val FinanceGroup.`Exchange-fill`: ImageVector
    get() {
        if (`_exchange-fill` != null) {
            return `_exchange-fill`!!
        }
        `_exchange-fill` = Builder(name = "Exchange-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 22.0027f)
                curveTo(6.482f, 22.0027f, 2.0049f, 17.5256f, 2.0049f, 12.0027f)
                curveTo(2.0049f, 6.4799f, 6.482f, 2.0027f, 12.0049f, 2.0027f)
                curveTo(17.5277f, 2.0027f, 22.0049f, 6.4799f, 22.0049f, 12.0027f)
                curveTo(22.0049f, 17.5256f, 17.5277f, 22.0027f, 12.0049f, 22.0027f)
                close()
                moveTo(12.0049f, 9.0028f)
                horizontalLineTo(8.0049f)
                verticalLineTo(11.0027f)
                horizontalLineTo(17.0049f)
                lineTo(12.0049f, 6.0027f)
                verticalLineTo(9.0028f)
                close()
                moveTo(7.0049f, 13.0027f)
                lineTo(12.0049f, 18.0027f)
                verticalLineTo(15.0027f)
                horizontalLineTo(16.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(7.0049f)
                close()
            }
        }
        .build()
        return `_exchange-fill`!!
    }

private var `_exchange-fill`: ImageVector? = null
