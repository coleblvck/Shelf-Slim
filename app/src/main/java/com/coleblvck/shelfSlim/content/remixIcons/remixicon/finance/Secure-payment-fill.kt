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

public val FinanceGroup.`Secure-payment-fill`: ImageVector
    get() {
        if (`_secure-payment-fill` != null) {
            return `_secure-payment-fill`!!
        }
        `_secure-payment-fill` = Builder(name = "Secure-payment-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0049f, 2.0f)
                lineTo(18.3032f, 4.2807f)
                curveTo(18.7206f, 4.4112f, 19.0049f, 4.7978f, 19.0049f, 5.2352f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 7.0f, 22.0049f, 7.4477f, 22.0049f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0049f)
                verticalLineTo(8.0f)
                curveTo(9.0049f, 7.4477f, 9.4526f, 7.0f, 10.0049f, 7.0f)
                horizontalLineTo(17.0049f)
                verticalLineTo(5.97f)
                lineTo(11.0049f, 4.094f)
                lineTo(5.0049f, 5.97f)
                verticalLineTo(13.3744f)
                curveTo(5.0049f, 14.6193f, 5.5841f, 15.7884f, 6.5633f, 16.5428f)
                lineTo(6.7515f, 16.6793f)
                lineTo(11.0049f, 19.579f)
                lineTo(14.7869f, 17.0f)
                horizontalLineTo(10.0049f)
                curveTo(9.4526f, 17.0f, 9.0049f, 16.5523f, 9.0049f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(16.0f)
                curveTo(22.0049f, 16.5523f, 21.5572f, 17.0f, 21.0049f, 17.0f)
                lineTo(17.7848f, 17.0011f)
                curveTo(17.3982f, 17.5108f, 16.9276f, 17.9618f, 16.3849f, 18.3318f)
                lineTo(11.0049f, 22.0f)
                lineTo(5.6249f, 18.3318f)
                curveTo(3.9856f, 17.2141f, 3.0049f, 15.3584f, 3.0049f, 13.3744f)
                verticalLineTo(5.2352f)
                curveTo(3.0049f, 4.7978f, 3.2891f, 4.4112f, 3.7066f, 4.2807f)
                lineTo(11.0049f, 2.0f)
                close()
            }
        }
        .build()
        return `_secure-payment-fill`!!
    }

private var `_secure-payment-fill`: ImageVector? = null
