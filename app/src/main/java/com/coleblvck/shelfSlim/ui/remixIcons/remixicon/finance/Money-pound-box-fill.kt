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

public val FinanceGroup.`Money-pound-box-fill`: ImageVector
    get() {
        if (`_money-pound-box-fill` != null) {
            return `_money-pound-box-fill`!!
        }
        `_money-pound-box-fill` = Builder(name = "Money-pound-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 3.0027f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0027f, 22.0049f, 3.4505f, 22.0049f, 4.0027f)
                verticalLineTo(20.0027f)
                curveTo(22.0049f, 20.555f, 21.5572f, 21.0027f, 21.0049f, 21.0027f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0027f, 2.0049f, 20.555f, 2.0049f, 20.0027f)
                verticalLineTo(4.0027f)
                curveTo(2.0049f, 3.4505f, 2.4526f, 3.0027f, 3.0049f, 3.0027f)
                close()
                moveTo(9.0049f, 13.0027f)
                verticalLineTo(15.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(17.0027f)
                horizontalLineTo(16.0049f)
                verticalLineTo(15.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(14.0049f)
                verticalLineTo(11.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(10.0027f)
                curveTo(11.0049f, 9.1743f, 11.6765f, 8.5028f, 12.5049f, 8.5028f)
                curveTo(13.0329f, 8.5028f, 13.4971f, 8.7755f, 13.7644f, 9.1879f)
                lineTo(15.7509f, 8.6912f)
                curveTo(15.2319f, 7.408f, 13.9741f, 6.5027f, 12.5049f, 6.5027f)
                curveTo(10.5719f, 6.5027f, 9.0049f, 8.0697f, 9.0049f, 10.0027f)
                verticalLineTo(11.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(9.0049f)
                close()
            }
        }
        .build()
        return `_money-pound-box-fill`!!
    }

private var `_money-pound-box-fill`: ImageVector? = null
