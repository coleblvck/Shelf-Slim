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

public val FinanceGroup.`Refund-fill`: ImageVector
    get() {
        if (`_refund-fill` != null) {
            return `_refund-fill`!!
        }
        `_refund-fill` = Builder(name = "Refund-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0049f, 7.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(4.0f)
                curveTo(2.0049f, 3.4477f, 2.4526f, 3.0f, 3.0049f, 3.0f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0f, 22.0049f, 3.4477f, 22.0049f, 4.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(22.0049f, 9.0f)
                verticalLineTo(20.0f)
                curveTo(22.0049f, 20.5523f, 21.5572f, 21.0f, 21.0049f, 21.0f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0f, 2.0049f, 20.5523f, 2.0049f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0049f)
                close()
                moveTo(11.0049f, 14.0f)
                verticalLineTo(11.5f)
                lineTo(6.5049f, 16.0f)
                horizontalLineTo(17.0049f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0049f)
                close()
            }
        }
        .build()
        return `_refund-fill`!!
    }

private var `_refund-fill`: ImageVector? = null
