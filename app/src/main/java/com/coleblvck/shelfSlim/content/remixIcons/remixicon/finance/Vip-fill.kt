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

public val FinanceGroup.`Vip-fill`: ImageVector
    get() {
        if (`_vip-fill` != null) {
            return `_vip-fill`!!
        }
        `_vip-fill` = Builder(name = "Vip-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 3.0f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0f, 22.0049f, 3.4477f, 22.0049f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0049f, 20.5523f, 21.5572f, 21.0f, 21.0049f, 21.0f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0f, 2.0049f, 20.5523f, 2.0049f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0049f, 3.4477f, 2.4526f, 3.0f, 3.0049f, 3.0f)
                close()
                moveTo(11.0049f, 8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(13.0049f)
                verticalLineTo(8.5f)
                horizontalLineTo(11.0049f)
                close()
                moveTo(10.72f, 8.5f)
                horizontalLineTo(8.606f)
                lineTo(7.1091f, 12.6127f)
                lineTo(5.6122f, 8.5f)
                horizontalLineTo(3.4983f)
                lineTo(6.1091f, 15.4637f)
                horizontalLineTo(8.1091f)
                lineTo(10.72f, 8.5f)
                close()
                moveTo(16.0049f, 13.5f)
                horizontalLineTo(17.5049f)
                curveTo(18.8856f, 13.5f, 20.0049f, 12.3807f, 20.0049f, 11.0f)
                curveTo(20.0049f, 9.6193f, 18.8856f, 8.5f, 17.5049f, 8.5f)
                horizontalLineTo(14.0049f)
                verticalLineTo(15.5f)
                horizontalLineTo(16.0049f)
                verticalLineTo(13.5f)
                close()
                moveTo(16.0049f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(17.5049f)
                curveTo(17.781f, 10.5f, 18.0049f, 10.7239f, 18.0049f, 11.0f)
                curveTo(18.0049f, 11.2761f, 17.781f, 11.5f, 17.5049f, 11.5f)
                horizontalLineTo(16.0049f)
                close()
            }
        }
        .build()
        return `_vip-fill`!!
    }

private var `_vip-fill`: ImageVector? = null
