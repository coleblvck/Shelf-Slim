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

public val FinanceGroup.`Bank-card-fill`: ImageVector
    get() {
        if (`_bank-card-fill` != null) {
            return `_bank-card-fill`!!
        }
        `_bank-card-fill` = Builder(name = "Bank-card-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0049f, 9.9998f)
                verticalLineTo(19.9998f)
                curveTo(22.0049f, 20.5521f, 21.5572f, 20.9998f, 21.0049f, 20.9998f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9998f, 2.0049f, 20.5521f, 2.0049f, 19.9998f)
                verticalLineTo(9.9998f)
                horizontalLineTo(22.0049f)
                close()
                moveTo(22.0049f, 7.9998f)
                horizontalLineTo(2.0049f)
                verticalLineTo(3.9998f)
                curveTo(2.0049f, 3.4475f, 2.4526f, 2.9998f, 3.0049f, 2.9998f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9998f, 22.0049f, 3.4475f, 22.0049f, 3.9998f)
                verticalLineTo(7.9998f)
                close()
                moveTo(15.0049f, 15.9998f)
                verticalLineTo(17.9998f)
                horizontalLineTo(19.0049f)
                verticalLineTo(15.9998f)
                horizontalLineTo(15.0049f)
                close()
            }
        }
        .build()
        return `_bank-card-fill`!!
    }

private var `_bank-card-fill`: ImageVector? = null
