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

public val FinanceGroup.`Bank-card-2-line`: ImageVector
    get() {
        if (`_bank-card-2-line` != null) {
            return `_bank-card-2-line`!!
        }
        `_bank-card-2-line` = Builder(name = "Bank-card-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 2.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9998f, 22.0049f, 3.4475f, 22.0049f, 3.9998f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                close()
                moveTo(20.0049f, 11.9998f)
                horizontalLineTo(4.0049f)
                verticalLineTo(18.9998f)
                horizontalLineTo(20.0049f)
                verticalLineTo(11.9998f)
                close()
                moveTo(20.0049f, 7.9998f)
                verticalLineTo(4.9998f)
                horizontalLineTo(4.0049f)
                verticalLineTo(7.9998f)
                horizontalLineTo(20.0049f)
                close()
            }
        }
        .build()
        return `_bank-card-2-line`!!
    }

private var `_bank-card-2-line`: ImageVector? = null
