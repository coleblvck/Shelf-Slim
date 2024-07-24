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

public val FinanceGroup.`Money-cny-circle-line`: ImageVector
    get() {
        if (`_money-cny-circle-line` != null) {
            return `_money-cny-circle-line`!!
        }
        `_money-cny-circle-line` = Builder(name = "Money-cny-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0049f, 13.0027f)
                horizontalLineTo(16.0049f)
                verticalLineTo(15.0027f)
                horizontalLineTo(13.0049f)
                verticalLineTo(17.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(15.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(11.0049f)
                verticalLineTo(12.0027f)
                horizontalLineTo(8.0049f)
                verticalLineTo(10.0027f)
                horizontalLineTo(10.5907f)
                lineTo(8.4693f, 7.8814f)
                lineTo(9.8836f, 6.4672f)
                lineTo(12.0049f, 8.5885f)
                lineTo(14.1262f, 6.4672f)
                lineTo(15.5404f, 7.8814f)
                lineTo(13.4191f, 10.0027f)
                horizontalLineTo(16.0049f)
                verticalLineTo(12.0027f)
                horizontalLineTo(13.0049f)
                verticalLineTo(13.0027f)
                close()
            }
        }
        .build()
        return `_money-cny-circle-line`!!
    }

private var `_money-cny-circle-line`: ImageVector? = null
