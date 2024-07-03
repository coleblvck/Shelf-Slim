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

public val FinanceGroup.`Money-dollar-circle-fill`: ImageVector
    get() {
        if (`_money-dollar-circle-fill` != null) {
            return `_money-dollar-circle-fill`!!
        }
        `_money-dollar-circle-fill` = Builder(name = "Money-dollar-circle-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0049f, 22.0027f)
                curveTo(6.482f, 22.0027f, 2.0049f, 17.5256f, 2.0049f, 12.0027f)
                curveTo(2.0049f, 6.4799f, 6.482f, 2.0027f, 12.0049f, 2.0027f)
                curveTo(17.5277f, 2.0027f, 22.0049f, 6.4799f, 22.0049f, 12.0027f)
                curveTo(22.0049f, 17.5256f, 17.5277f, 22.0027f, 12.0049f, 22.0027f)
                close()
                moveTo(8.5049f, 14.0027f)
                verticalLineTo(16.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(18.0027f)
                horizontalLineTo(13.0049f)
                verticalLineTo(16.0027f)
                horizontalLineTo(14.0049f)
                curveTo(15.3856f, 16.0027f, 16.5049f, 14.8835f, 16.5049f, 13.5027f)
                curveTo(16.5049f, 12.122f, 15.3856f, 11.0027f, 14.0049f, 11.0027f)
                horizontalLineTo(10.0049f)
                curveTo(9.7287f, 11.0027f, 9.5049f, 10.7789f, 9.5049f, 10.5027f)
                curveTo(9.5049f, 10.2266f, 9.7287f, 10.0027f, 10.0049f, 10.0027f)
                horizontalLineTo(15.5049f)
                verticalLineTo(8.0028f)
                horizontalLineTo(13.0049f)
                verticalLineTo(6.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(8.0028f)
                horizontalLineTo(10.0049f)
                curveTo(8.6242f, 8.0028f, 7.5049f, 9.122f, 7.5049f, 10.5027f)
                curveTo(7.5049f, 11.8835f, 8.6242f, 13.0027f, 10.0049f, 13.0027f)
                horizontalLineTo(14.0049f)
                curveTo(14.281f, 13.0027f, 14.5049f, 13.2266f, 14.5049f, 13.5027f)
                curveTo(14.5049f, 13.7789f, 14.281f, 14.0027f, 14.0049f, 14.0027f)
                horizontalLineTo(8.5049f)
                close()
            }
        }
        .build()
        return `_money-dollar-circle-fill`!!
    }

private var `_money-dollar-circle-fill`: ImageVector? = null
