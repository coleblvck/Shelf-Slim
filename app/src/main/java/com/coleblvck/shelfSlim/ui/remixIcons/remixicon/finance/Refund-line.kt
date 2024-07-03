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

public val FinanceGroup.`Refund-line`: ImageVector
    get() {
        if (`_refund-line` != null) {
            return `_refund-line`!!
        }
        `_refund-line` = Builder(name = "Refund-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0049f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0049f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0049f)
                close()
                moveTo(20.0049f, 10.0f)
                horizontalLineTo(4.0049f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0049f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0049f, 3.0f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0f, 22.0049f, 3.4477f, 22.0049f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0049f, 20.5523f, 21.5572f, 21.0f, 21.0049f, 21.0f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0f, 2.0049f, 20.5523f, 2.0049f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0049f, 3.4477f, 2.4526f, 3.0f, 3.0049f, 3.0f)
                close()
                moveTo(11.0049f, 14.0f)
                horizontalLineTo(17.0049f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.5049f)
                lineTo(11.0049f, 11.5f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_refund-line`!!
    }

private var `_refund-line`: ImageVector? = null
