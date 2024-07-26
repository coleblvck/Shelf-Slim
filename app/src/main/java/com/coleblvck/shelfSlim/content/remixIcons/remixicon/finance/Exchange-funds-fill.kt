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

public val FinanceGroup.`Exchange-funds-fill`: ImageVector
    get() {
        if (`_exchange-funds-fill` != null) {
            return `_exchange-funds-fill`!!
        }
        `_exchange-funds-fill` = Builder(name = "Exchange-funds-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3783f, 4.5134f)
                curveTo(7.1426f, 2.9511f, 9.463f, 2.0027f, 12.0049f, 2.0027f)
                curveTo(17.5277f, 2.0027f, 22.0049f, 6.4799f, 22.0049f, 12.0027f)
                curveTo(22.0049f, 14.1277f, 21.3421f, 16.0978f, 20.212f, 17.7177f)
                lineTo(17.5049f, 12.0027f)
                horizontalLineTo(20.0049f)
                curveTo(20.0049f, 7.5845f, 16.4232f, 4.0027f, 12.0049f, 4.0027f)
                curveTo(9.7606f, 4.0027f, 7.7321f, 4.9269f, 6.2793f, 6.4154f)
                lineTo(5.3783f, 4.5134f)
                close()
                moveTo(18.6314f, 19.4921f)
                curveTo(16.8671f, 21.0544f, 14.5468f, 22.0027f, 12.0049f, 22.0027f)
                curveTo(6.482f, 22.0027f, 2.0049f, 17.5256f, 2.0049f, 12.0027f)
                curveTo(2.0049f, 9.8778f, 2.6677f, 7.9077f, 3.7978f, 6.2878f)
                lineTo(6.5049f, 12.0027f)
                horizontalLineTo(4.0049f)
                curveTo(4.0049f, 16.421f, 7.5866f, 20.0027f, 12.0049f, 20.0027f)
                curveTo(14.2492f, 20.0027f, 16.2776f, 19.0786f, 17.7304f, 17.59f)
                lineTo(18.6314f, 19.4921f)
                close()
                moveTo(13.4191f, 14.8312f)
                lineTo(10.5907f, 12.0027f)
                lineTo(7.7622f, 14.8312f)
                lineTo(6.348f, 13.417f)
                lineTo(10.5907f, 9.1743f)
                lineTo(13.4191f, 12.0027f)
                lineTo(16.2475f, 9.1743f)
                lineTo(17.6617f, 10.5885f)
                lineTo(13.4191f, 14.8312f)
                close()
            }
        }
        .build()
        return `_exchange-funds-fill`!!
    }

private var `_exchange-funds-fill`: ImageVector? = null