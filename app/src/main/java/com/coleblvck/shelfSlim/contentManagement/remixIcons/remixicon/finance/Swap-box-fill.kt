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

public val FinanceGroup.`Swap-box-fill`: ImageVector
    get() {
        if (`_swap-box-fill` != null) {
            return `_swap-box-fill`!!
        }
        `_swap-box-fill` = Builder(name = "Swap-box-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.0049f, 7.0027f)
                verticalLineTo(9.0028f)
                horizontalLineTo(11.0049f)
                verticalLineTo(11.0027f)
                horizontalLineTo(15.0049f)
                verticalLineTo(13.0027f)
                lineTo(18.5049f, 10.0027f)
                lineTo(15.0049f, 7.0027f)
                close()
                moveTo(9.0049f, 17.0027f)
                verticalLineTo(15.0027f)
                horizontalLineTo(13.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(9.0049f)
                verticalLineTo(11.0027f)
                lineTo(5.5049f, 14.0027f)
                lineTo(9.0049f, 17.0027f)
                close()
            }
        }
        .build()
        return `_swap-box-fill`!!
    }

private var `_swap-box-fill`: ImageVector? = null
