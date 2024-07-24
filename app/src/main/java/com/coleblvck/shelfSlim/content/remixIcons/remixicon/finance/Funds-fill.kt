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

public val FinanceGroup.`Funds-fill`: ImageVector
    get() {
        if (`_funds-fill` != null) {
            return `_funds-fill`!!
        }
        `_funds-fill` = Builder(name = "Funds-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9014f, 17.8636f)
                lineTo(7.8125f, 13.9526f)
                lineTo(10.6409f, 16.781f)
                lineTo(15.212f, 12.2099f)
                lineTo(17.0049f, 14.0028f)
                verticalLineTo(9.0028f)
                horizontalLineTo(12.0049f)
                lineTo(13.7978f, 10.7957f)
                lineTo(10.6409f, 13.9526f)
                lineTo(7.8125f, 11.1241f)
                lineTo(2.8666f, 16.07f)
                curveTo(2.3128f, 14.8274f, 2.0049f, 13.4511f, 2.0049f, 12.0028f)
                curveTo(2.0049f, 6.48f, 6.482f, 2.0028f, 12.0049f, 2.0028f)
                curveTo(17.5277f, 2.0028f, 22.0049f, 6.48f, 22.0049f, 12.0028f)
                curveTo(22.0049f, 17.5257f, 17.5277f, 22.0028f, 12.0049f, 22.0028f)
                curveTo(8.6712f, 22.0028f, 5.7184f, 20.3715f, 3.9014f, 17.8636f)
                close()
            }
        }
        .build()
        return `_funds-fill`!!
    }

private var `_funds-fill`: ImageVector? = null
