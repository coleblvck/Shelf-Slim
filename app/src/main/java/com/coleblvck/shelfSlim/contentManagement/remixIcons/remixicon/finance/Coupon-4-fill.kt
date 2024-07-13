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

public val FinanceGroup.`Coupon-4-fill`: ImageVector
    get() {
        if (`_coupon-4-fill` != null) {
            return `_coupon-4-fill`!!
        }
        `_coupon-4-fill` = Builder(name = "Coupon-4-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0049f, 20.9997f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 20.9997f, 2.0049f, 20.5519f, 2.0049f, 19.9997f)
                verticalLineTo(3.9997f)
                curveTo(2.0049f, 3.4474f, 2.4526f, 2.9997f, 3.0049f, 2.9997f)
                horizontalLineTo(10.0049f)
                curveTo(10.0049f, 4.1042f, 10.9003f, 4.9997f, 12.0049f, 4.9997f)
                curveTo(13.1095f, 4.9997f, 14.0049f, 4.1042f, 14.0049f, 2.9997f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 2.9997f, 22.0049f, 3.4474f, 22.0049f, 3.9997f)
                verticalLineTo(19.9997f)
                curveTo(22.0049f, 20.5519f, 21.5572f, 20.9997f, 21.0049f, 20.9997f)
                horizontalLineTo(14.0049f)
                curveTo(14.0049f, 19.8951f, 13.1095f, 18.9997f, 12.0049f, 18.9997f)
                curveTo(10.9003f, 18.9997f, 10.0049f, 19.8951f, 10.0049f, 20.9997f)
                close()
                moveTo(6.0049f, 7.9997f)
                verticalLineTo(15.9997f)
                horizontalLineTo(8.0049f)
                verticalLineTo(7.9997f)
                horizontalLineTo(6.0049f)
                close()
                moveTo(16.0049f, 7.9997f)
                verticalLineTo(15.9997f)
                horizontalLineTo(18.0049f)
                verticalLineTo(7.9997f)
                horizontalLineTo(16.0049f)
                close()
            }
        }
        .build()
        return `_coupon-4-fill`!!
    }

private var `_coupon-4-fill`: ImageVector? = null
