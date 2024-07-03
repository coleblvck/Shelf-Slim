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

public val FinanceGroup.`Currency-fill`: ImageVector
    get() {
        if (`_currency-fill` != null) {
            return `_currency-fill`!!
        }
        `_currency-fill` = Builder(name = "Currency-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0047f, 16.0027f)
                horizontalLineTo(19.0047f)
                verticalLineTo(4.0027f)
                horizontalLineTo(9.0047f)
                verticalLineTo(6.0027f)
                horizontalLineTo(17.0047f)
                verticalLineTo(16.0027f)
                close()
                moveTo(17.0047f, 18.0027f)
                verticalLineTo(21.0019f)
                curveTo(17.0047f, 21.5546f, 16.5547f, 22.0027f, 15.9978f, 22.0027f)
                horizontalLineTo(4.0115f)
                curveTo(3.4555f, 22.0027f, 3.0049f, 21.5581f, 3.0049f, 21.0019f)
                lineTo(3.0075f, 7.0036f)
                curveTo(3.0076f, 6.4509f, 3.4575f, 6.0027f, 4.0143f, 6.0027f)
                horizontalLineTo(7.0047f)
                verticalLineTo(3.0027f)
                curveTo(7.0047f, 2.4505f, 7.4524f, 2.0027f, 8.0047f, 2.0027f)
                horizontalLineTo(20.0047f)
                curveTo(20.557f, 2.0027f, 21.0047f, 2.4505f, 21.0047f, 3.0027f)
                verticalLineTo(17.0027f)
                curveTo(21.0047f, 17.555f, 20.557f, 18.0027f, 20.0047f, 18.0027f)
                horizontalLineTo(17.0047f)
                close()
                moveTo(7.0047f, 16.0027f)
                verticalLineTo(18.0027f)
                horizontalLineTo(9.0047f)
                verticalLineTo(19.0027f)
                horizontalLineTo(11.0047f)
                verticalLineTo(18.0027f)
                horizontalLineTo(11.5047f)
                curveTo(12.8854f, 18.0027f, 14.0047f, 16.8835f, 14.0047f, 15.5027f)
                curveTo(14.0047f, 14.122f, 12.8854f, 13.0027f, 11.5047f, 13.0027f)
                horizontalLineTo(8.5047f)
                curveTo(8.2285f, 13.0027f, 8.0047f, 12.7789f, 8.0047f, 12.5027f)
                curveTo(8.0047f, 12.2266f, 8.2285f, 12.0027f, 8.5047f, 12.0027f)
                horizontalLineTo(13.0047f)
                verticalLineTo(10.0027f)
                horizontalLineTo(11.0047f)
                verticalLineTo(9.0028f)
                horizontalLineTo(9.0047f)
                verticalLineTo(10.0027f)
                horizontalLineTo(8.5047f)
                curveTo(7.124f, 10.0027f, 6.0047f, 11.122f, 6.0047f, 12.5027f)
                curveTo(6.0047f, 13.8835f, 7.124f, 15.0027f, 8.5047f, 15.0027f)
                horizontalLineTo(11.5047f)
                curveTo(11.7808f, 15.0027f, 12.0047f, 15.2266f, 12.0047f, 15.5027f)
                curveTo(12.0047f, 15.7789f, 11.7808f, 16.0027f, 11.5047f, 16.0027f)
                horizontalLineTo(7.0047f)
                close()
            }
        }
        .build()
        return `_currency-fill`!!
    }

private var `_currency-fill`: ImageVector? = null
