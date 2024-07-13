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

public val FinanceGroup.`Funds-line`: ImageVector
    get() {
        if (`_funds-line` != null) {
            return `_funds-line`!!
        }
        `_funds-line` = Builder(name = "Funds-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4109f, 14.5258f)
                lineTo(7.8125f, 11.1241f)
                lineTo(10.6409f, 13.9526f)
                lineTo(13.7978f, 10.7957f)
                lineTo(12.0049f, 9.0028f)
                horizontalLineTo(17.0049f)
                verticalLineTo(14.0028f)
                lineTo(15.212f, 12.2099f)
                lineTo(10.6409f, 16.781f)
                lineTo(7.8125f, 13.9526f)
                lineTo(5.3383f, 16.4267f)
                curveTo(6.7716f, 18.5822f, 9.2223f, 20.0028f, 12.0049f, 20.0028f)
                curveTo(16.4232f, 20.0028f, 20.0049f, 16.4211f, 20.0049f, 12.0028f)
                curveTo(20.0049f, 7.5845f, 16.4232f, 4.0028f, 12.0049f, 4.0028f)
                curveTo(7.5866f, 4.0028f, 4.0049f, 7.5845f, 4.0049f, 12.0028f)
                curveTo(4.0049f, 12.8844f, 4.1475f, 13.7326f, 4.4109f, 14.5258f)
                close()
                moveTo(2.8729f, 16.084f)
                lineTo(2.8628f, 16.0739f)
                lineTo(2.8666f, 16.07f)
                curveTo(2.3128f, 14.8274f, 2.0049f, 13.4511f, 2.0049f, 12.0028f)
                curveTo(2.0049f, 6.48f, 6.482f, 2.0028f, 12.0049f, 2.0028f)
                curveTo(17.5277f, 2.0028f, 22.0049f, 6.48f, 22.0049f, 12.0028f)
                curveTo(22.0049f, 17.5257f, 17.5277f, 22.0028f, 12.0049f, 22.0028f)
                curveTo(7.9357f, 22.0028f, 4.4343f, 19.5724f, 2.8729f, 16.084f)
                close()
            }
        }
        .build()
        return `_funds-line`!!
    }

private var `_funds-line`: ImageVector? = null
