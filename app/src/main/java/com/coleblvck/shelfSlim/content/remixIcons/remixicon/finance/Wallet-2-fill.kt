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

public val FinanceGroup.`Wallet-2-fill`: ImageVector
    get() {
        if (`_wallet-2-fill` != null) {
            return `_wallet-2-fill`!!
        }
        `_wallet-2-fill` = Builder(name = "Wallet-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0049f, 7.9998f)
                horizontalLineTo(13.0049f)
                curveTo(12.4526f, 7.9998f, 12.0049f, 8.4475f, 12.0049f, 8.9998f)
                verticalLineTo(14.9998f)
                curveTo(12.0049f, 15.5521f, 12.4526f, 15.9998f, 13.0049f, 15.9998f)
                horizontalLineTo(22.0049f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9998f, 22.0049f, 3.4475f, 22.0049f, 3.9998f)
                verticalLineTo(7.9998f)
                close()
                moveTo(15.0049f, 10.9998f)
                horizontalLineTo(18.0049f)
                verticalLineTo(12.9998f)
                horizontalLineTo(15.0049f)
                verticalLineTo(10.9998f)
                close()
            }
        }
        .build()
        return `_wallet-2-fill`!!
    }

private var `_wallet-2-fill`: ImageVector? = null
