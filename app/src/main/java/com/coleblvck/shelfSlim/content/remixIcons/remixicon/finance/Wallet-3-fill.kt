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

public val FinanceGroup.`Wallet-3-fill`: ImageVector
    get() {
        if (`_wallet-3-fill` != null) {
            return `_wallet-3-fill`!!
        }
        `_wallet-3-fill` = Builder(name = "Wallet-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0049f, 5.9998f)
                horizontalLineTo(15.0049f)
                curveTo(11.6912f, 5.9998f, 9.0049f, 8.6861f, 9.0049f, 11.9998f)
                curveTo(9.0049f, 15.3135f, 11.6912f, 17.9998f, 15.0049f, 17.9998f)
                horizontalLineTo(22.0049f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9998f, 22.0049f, 3.4475f, 22.0049f, 3.9998f)
                verticalLineTo(5.9998f)
                close()
                moveTo(15.0049f, 7.9998f)
                horizontalLineTo(23.0049f)
                verticalLineTo(15.9998f)
                horizontalLineTo(15.0049f)
                curveTo(12.7957f, 15.9998f, 11.0049f, 14.2089f, 11.0049f, 11.9998f)
                curveTo(11.0049f, 9.7907f, 12.7957f, 7.9998f, 15.0049f, 7.9998f)
                close()
                moveTo(15.0049f, 10.9998f)
                verticalLineTo(12.9998f)
                horizontalLineTo(18.0049f)
                verticalLineTo(10.9998f)
                horizontalLineTo(15.0049f)
                close()
            }
        }
        .build()
        return `_wallet-3-fill`!!
    }

private var `_wallet-3-fill`: ImageVector? = null
