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

public val FinanceGroup.`Coupon-5-fill`: ImageVector
    get() {
        if (`_coupon-5-fill` != null) {
            return `_coupon-5-fill`!!
        }
        `_coupon-5-fill` = Builder(name = "Coupon-5-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0049f, 13.9997f)
                verticalLineTo(20.9997f)
                curveTo(21.0049f, 21.5519f, 20.5572f, 21.9997f, 20.0049f, 21.9997f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 21.9997f, 3.0049f, 21.5519f, 3.0049f, 20.9997f)
                verticalLineTo(13.9997f)
                curveTo(4.1094f, 13.9997f, 5.0049f, 13.1042f, 5.0049f, 11.9997f)
                curveTo(5.0049f, 10.8951f, 4.1094f, 9.9997f, 3.0049f, 9.9997f)
                verticalLineTo(2.9997f)
                curveTo(3.0049f, 2.4474f, 3.4526f, 1.9997f, 4.0049f, 1.9997f)
                horizontalLineTo(20.0049f)
                curveTo(20.5572f, 1.9997f, 21.0049f, 2.4474f, 21.0049f, 2.9997f)
                verticalLineTo(9.9997f)
                curveTo(19.9003f, 9.9997f, 19.0049f, 10.8951f, 19.0049f, 11.9997f)
                curveTo(19.0049f, 13.1042f, 19.9003f, 13.9997f, 21.0049f, 13.9997f)
                close()
                moveTo(9.0049f, 5.9997f)
                verticalLineTo(7.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(5.9997f)
                horizontalLineTo(9.0049f)
                close()
                moveTo(9.0049f, 15.9997f)
                verticalLineTo(17.9997f)
                horizontalLineTo(15.0049f)
                verticalLineTo(15.9997f)
                horizontalLineTo(9.0049f)
                close()
            }
        }
        .build()
        return `_coupon-5-fill`!!
    }

private var `_coupon-5-fill`: ImageVector? = null
