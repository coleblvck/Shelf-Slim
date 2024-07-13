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

public val FinanceGroup.`Shopping-basket-2-line`: ImageVector
    get() {
        if (`_shopping-basket-2-line` != null) {
            return `_shopping-basket-2-line`!!
        }
        `_shopping-basket-2-line` = Builder(name = "Shopping-basket-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3709f, 3.44f)
                lineTo(18.5819f, 9.002f)
                lineTo(22.0049f, 9.0022f)
                verticalLineTo(11.0022f)
                lineTo(20.8379f, 11.002f)
                lineTo(20.0813f, 20.0852f)
                curveTo(20.0381f, 20.6035f, 19.6048f, 21.0022f, 19.0847f, 21.0022f)
                horizontalLineTo(4.925f)
                curveTo(4.4049f, 21.0022f, 3.9717f, 20.6035f, 3.9285f, 20.0852f)
                lineTo(3.1709f, 11.002f)
                lineTo(2.0049f, 11.0022f)
                verticalLineTo(9.0022f)
                lineTo(5.4269f, 9.002f)
                lineTo(8.6389f, 3.44f)
                lineTo(10.3709f, 4.44f)
                lineTo(7.7369f, 9.002f)
                horizontalLineTo(16.2719f)
                lineTo(13.6389f, 4.44f)
                lineTo(15.3709f, 3.44f)
                close()
                moveTo(18.8309f, 11.002f)
                lineTo(5.1779f, 11.0022f)
                lineTo(5.8449f, 19.0022f)
                horizontalLineTo(18.1639f)
                lineTo(18.8309f, 11.002f)
                close()
                moveTo(13.0049f, 13.0022f)
                verticalLineTo(17.0022f)
                horizontalLineTo(11.0049f)
                verticalLineTo(13.0022f)
                horizontalLineTo(13.0049f)
                close()
                moveTo(9.0049f, 13.0022f)
                verticalLineTo(17.0022f)
                horizontalLineTo(7.0049f)
                verticalLineTo(13.0022f)
                horizontalLineTo(9.0049f)
                close()
                moveTo(17.0049f, 13.0022f)
                verticalLineTo(17.0022f)
                horizontalLineTo(15.0049f)
                verticalLineTo(13.0022f)
                horizontalLineTo(17.0049f)
                close()
            }
        }
        .build()
        return `_shopping-basket-2-line`!!
    }

private var `_shopping-basket-2-line`: ImageVector? = null
