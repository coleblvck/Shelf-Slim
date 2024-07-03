package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Price-tag-3-line`: ImageVector
    get() {
        if (`_price-tag-3-line` != null) {
            return `_price-tag-3-line`!!
        }
        `_price-tag-3-line` = Builder(name = "Price-tag-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9042f, 2.1003f)
                lineTo(20.8037f, 3.5145f)
                lineTo(22.2179f, 13.414f)
                lineTo(13.0255f, 22.6063f)
                curveTo(12.635f, 22.9969f, 12.0019f, 22.9969f, 11.6113f, 22.6063f)
                lineTo(1.7118f, 12.7069f)
                curveTo(1.3213f, 12.3163f, 1.3213f, 11.6832f, 1.7118f, 11.2926f)
                lineTo(10.9042f, 2.1003f)
                close()
                moveTo(11.6113f, 4.2216f)
                lineTo(3.8332f, 11.9997f)
                lineTo(12.3184f, 20.485f)
                lineTo(20.0966f, 12.7069f)
                lineTo(19.036f, 5.2822f)
                lineTo(11.6113f, 4.2216f)
                close()
                moveTo(13.7327f, 10.5855f)
                curveTo(12.9516f, 9.8045f, 12.9516f, 8.5381f, 13.7327f, 7.7571f)
                curveTo(14.5137f, 6.9761f, 15.78f, 6.9761f, 16.5611f, 7.7571f)
                curveTo(17.3421f, 8.5381f, 17.3421f, 9.8045f, 16.5611f, 10.5855f)
                curveTo(15.78f, 11.3666f, 14.5137f, 11.3666f, 13.7327f, 10.5855f)
                close()
            }
        }
        .build()
        return `_price-tag-3-line`!!
    }

private var `_price-tag-3-line`: ImageVector? = null
