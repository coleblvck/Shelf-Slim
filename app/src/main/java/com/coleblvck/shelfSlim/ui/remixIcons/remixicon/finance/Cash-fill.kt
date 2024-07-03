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

public val FinanceGroup.`Cash-fill`: ImageVector
    get() {
        if (`_cash-fill` != null) {
            return `_cash-fill`!!
        }
        `_cash-fill` = Builder(name = "Cash-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 4.0029f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 4.0029f, 22.0049f, 4.4506f, 22.0049f, 5.0029f)
                verticalLineTo(19.0029f)
                curveTo(22.0049f, 19.5552f, 21.5572f, 20.0029f, 21.0049f, 20.0029f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.0029f, 2.0049f, 19.5552f, 2.0049f, 19.0029f)
                verticalLineTo(5.0029f)
                curveTo(2.0049f, 4.4506f, 2.4526f, 4.0029f, 3.0049f, 4.0029f)
                close()
                moveTo(6.5004f, 6.0f)
                horizontalLineTo(4.0004f)
                verticalLineTo(8.5f)
                curveTo(5.3811f, 8.5f, 6.5004f, 7.3807f, 6.5004f, 6.0f)
                close()
                moveTo(17.5004f, 6.0f)
                curveTo(17.5004f, 7.3807f, 18.6197f, 8.5f, 20.0004f, 8.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.5004f)
                close()
                moveTo(4.0004f, 15.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.5004f)
                curveTo(6.5004f, 16.6193f, 5.3811f, 15.5f, 4.0004f, 15.5f)
                close()
                moveTo(17.5004f, 18.0f)
                horizontalLineTo(20.0004f)
                verticalLineTo(15.5f)
                curveTo(18.6197f, 15.5f, 17.5004f, 16.6193f, 17.5004f, 18.0f)
                close()
                moveTo(12.0004f, 16.0f)
                curveTo(14.2095f, 16.0f, 16.0004f, 14.2091f, 16.0004f, 12.0f)
                curveTo(16.0004f, 9.7909f, 14.2095f, 8.0f, 12.0004f, 8.0f)
                curveTo(9.7912f, 8.0f, 8.0004f, 9.7909f, 8.0004f, 12.0f)
                curveTo(8.0004f, 14.2091f, 9.7912f, 16.0f, 12.0004f, 16.0f)
                close()
            }
        }
        .build()
        return `_cash-fill`!!
    }

private var `_cash-fill`: ImageVector? = null
