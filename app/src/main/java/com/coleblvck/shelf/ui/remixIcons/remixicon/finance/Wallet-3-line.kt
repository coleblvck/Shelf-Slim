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

public val FinanceGroup.`Wallet-3-line`: ImageVector
    get() {
        if (`_wallet-3-line` != null) {
            return `_wallet-3-line`!!
        }
        `_wallet-3-line` = Builder(name = "Wallet-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0049f, 6.9998f)
                horizontalLineTo(23.0049f)
                verticalLineTo(16.9998f)
                horizontalLineTo(22.0049f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9998f, 22.0049f, 3.4475f, 22.0049f, 3.9998f)
                verticalLineTo(6.9998f)
                close()
                moveTo(20.0049f, 16.9998f)
                horizontalLineTo(14.0049f)
                curveTo(11.2435f, 16.9998f, 9.0049f, 14.7612f, 9.0049f, 11.9998f)
                curveTo(9.0049f, 9.2384f, 11.2435f, 6.9998f, 14.0049f, 6.9998f)
                horizontalLineTo(20.0049f)
                verticalLineTo(4.9998f)
                horizontalLineTo(4.0049f)
                verticalLineTo(18.9998f)
                horizontalLineTo(20.0049f)
                verticalLineTo(16.9998f)
                close()
                moveTo(21.0049f, 14.9998f)
                verticalLineTo(8.9998f)
                horizontalLineTo(14.0049f)
                curveTo(12.348f, 8.9998f, 11.0049f, 10.3429f, 11.0049f, 11.9998f)
                curveTo(11.0049f, 13.6566f, 12.348f, 14.9998f, 14.0049f, 14.9998f)
                horizontalLineTo(21.0049f)
                close()
                moveTo(14.0049f, 10.9998f)
                horizontalLineTo(17.0049f)
                verticalLineTo(12.9998f)
                horizontalLineTo(14.0049f)
                verticalLineTo(10.9998f)
                close()
            }
        }
        .build()
        return `_wallet-3-line`!!
    }

private var `_wallet-3-line`: ImageVector? = null
