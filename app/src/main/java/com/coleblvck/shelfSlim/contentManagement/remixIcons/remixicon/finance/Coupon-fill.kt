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

public val FinanceGroup.`Coupon-fill`: ImageVector
    get() {
        if (`_coupon-fill` != null) {
            return `_coupon-fill`!!
        }
        `_coupon-fill` = Builder(name = "Coupon-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0049f, 9.4997f)
                verticalLineTo(3.9997f)
                curveTo(2.0049f, 3.4474f, 2.4526f, 2.9997f, 3.0049f, 2.9997f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9997f, 22.0049f, 3.4474f, 22.0049f, 3.9997f)
                verticalLineTo(9.4997f)
                curveTo(20.6242f, 9.4997f, 19.5049f, 10.619f, 19.5049f, 11.9997f)
                curveTo(19.5049f, 13.3804f, 20.6242f, 14.4997f, 22.0049f, 14.4997f)
                verticalLineTo(19.9997f)
                curveTo(22.0049f, 20.5519f, 21.5572f, 20.9997f, 21.0049f, 20.9997f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9997f, 2.0049f, 20.5519f, 2.0049f, 19.9997f)
                verticalLineTo(14.4997f)
                curveTo(3.3856f, 14.4997f, 4.5049f, 13.3804f, 4.5049f, 11.9997f)
                curveTo(4.5049f, 10.619f, 3.3856f, 9.4997f, 2.0049f, 9.4997f)
                close()
                moveTo(9.0049f, 8.9997f)
                verticalLineTo(10.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(8.9997f)
                horizontalLineTo(9.0049f)
                close()
                moveTo(9.0049f, 12.9997f)
                verticalLineTo(14.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(12.9997f)
                horizontalLineTo(9.0049f)
                close()
            }
        }
        .build()
        return `_coupon-fill`!!
    }

private var `_coupon-fill`: ImageVector? = null
