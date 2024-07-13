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

public val FinanceGroup.`Wallet-line`: ImageVector
    get() {
        if (`_wallet-line` != null) {
            return `_wallet-line`!!
        }
        `_wallet-line` = Builder(name = "Wallet-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0049f, 6.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 6.9998f, 22.0049f, 7.4475f, 22.0049f, 7.9998f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                horizontalLineTo(18.0049f)
                verticalLineTo(6.9998f)
                close()
                moveTo(4.0049f, 8.9998f)
                verticalLineTo(18.9998f)
                horizontalLineTo(20.0049f)
                verticalLineTo(8.9998f)
                horizontalLineTo(4.0049f)
                close()
                moveTo(4.0049f, 4.9998f)
                verticalLineTo(6.9998f)
                horizontalLineTo(16.0049f)
                verticalLineTo(4.9998f)
                horizontalLineTo(4.0049f)
                close()
                moveTo(15.0049f, 12.9998f)
                horizontalLineTo(18.0049f)
                verticalLineTo(14.9998f)
                horizontalLineTo(15.0049f)
                verticalLineTo(12.9998f)
                close()
            }
        }
        .build()
        return `_wallet-line`!!
    }

private var `_wallet-line`: ImageVector? = null
