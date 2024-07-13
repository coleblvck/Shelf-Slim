package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Money-pound-circle-line`: ImageVector
    get() {
        if (`_money-pound-circle-line` != null) {
            return `_money-pound-circle-line`!!
        }
        `_money-pound-circle-line` = Builder(name = "Money-pound-circle-line", defaultWidth =
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
                moveTo(12.0049f, 20.0027f)
                curveTo(16.4232f, 20.0027f, 20.0049f, 16.421f, 20.0049f, 12.0027f)
                curveTo(20.0049f, 7.5845f, 16.4232f, 4.0027f, 12.0049f, 4.0027f)
                curveTo(7.5866f, 4.0027f, 4.0049f, 7.5845f, 4.0049f, 12.0027f)
                curveTo(4.0049f, 16.421f, 7.5866f, 20.0027f, 12.0049f, 20.0027f)
                close()
                moveTo(9.0049f, 13.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(11.0027f)
                horizontalLineTo(9.0049f)
                verticalLineTo(10.0027f)
                curveTo(9.0049f, 8.0697f, 10.5719f, 6.5027f, 12.5049f, 6.5027f)
                curveTo(13.9741f, 6.5027f, 15.2319f, 7.408f, 15.7509f, 8.6912f)
                lineTo(13.7644f, 9.1879f)
                curveTo(13.4971f, 8.7755f, 13.0329f, 8.5028f, 12.5049f, 8.5028f)
                curveTo(11.6765f, 8.5028f, 11.0049f, 9.1743f, 11.0049f, 10.0027f)
                verticalLineTo(11.0027f)
                horizontalLineTo(14.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(15.0027f)
                horizontalLineTo(16.0049f)
                verticalLineTo(17.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(15.0027f)
                horizontalLineTo(9.0049f)
                verticalLineTo(13.0027f)
                close()
            }
        }
        .build()
        return `_money-pound-circle-line`!!
    }

private var `_money-pound-circle-line`: ImageVector? = null
