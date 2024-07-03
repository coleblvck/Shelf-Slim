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

public val FinanceGroup.`Money-cny-box-line`: ImageVector
    get() {
        if (`_money-cny-box-line` != null) {
            return `_money-cny-box-line`!!
        }
        `_money-cny-box-line` = Builder(name = "Money-cny-box-line", defaultWidth = 24.0.dp,
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
                moveTo(4.0049f, 5.0027f)
                verticalLineTo(19.0027f)
                horizontalLineTo(20.0049f)
                verticalLineTo(5.0027f)
                horizontalLineTo(4.0049f)
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
        return `_money-cny-box-line`!!
    }

private var `_money-cny-box-line`: ImageVector? = null
