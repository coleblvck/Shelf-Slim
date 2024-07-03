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

public val FinanceGroup.`Money-euro-box-fill`: ImageVector
    get() {
        if (`_money-euro-box-fill` != null) {
            return `_money-euro-box-fill`!!
        }
        `_money-euro-box-fill` = Builder(name = "Money-euro-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0049f, 3.0027f)
                horizontalLineTo(21.0049f)
                curveTo(21.5572f, 3.0027f, 22.0049f, 3.4505f, 22.0049f, 4.0027f)
                verticalLineTo(20.0027f)
                curveTo(22.0049f, 20.555f, 21.5572f, 21.0027f, 21.0049f, 21.0027f)
                horizontalLineTo(3.0049f)
                curveTo(2.4526f, 21.0027f, 2.0049f, 20.555f, 2.0049f, 20.0027f)
                verticalLineTo(4.0027f)
                curveTo(2.0049f, 3.4505f, 2.4526f, 3.0027f, 3.0049f, 3.0027f)
                close()
                moveTo(10.0549f, 11.0027f)
                curveTo(10.2865f, 9.8616f, 11.2954f, 9.0028f, 12.5049f, 9.0028f)
                curveTo(13.1201f, 9.0028f, 13.6834f, 9.225f, 14.1189f, 9.5935f)
                lineTo(15.8198f, 8.4595f)
                curveTo(14.9973f, 7.564f, 13.8166f, 7.0027f, 12.5049f, 7.0027f)
                curveTo(10.1886f, 7.0027f, 8.2811f, 8.7528f, 8.0323f, 11.0027f)
                horizontalLineTo(7.0049f)
                verticalLineTo(13.0027f)
                horizontalLineTo(8.0323f)
                curveTo(8.2811f, 15.2527f, 10.1886f, 17.0027f, 12.5049f, 17.0027f)
                curveTo(13.8166f, 17.0027f, 14.9973f, 16.4415f, 15.8198f, 15.546f)
                lineTo(14.1188f, 14.412f)
                curveTo(13.6833f, 14.7806f, 13.1201f, 15.0027f, 12.5049f, 15.0027f)
                curveTo(11.2954f, 15.0027f, 10.2865f, 14.1439f, 10.0549f, 13.0027f)
                horizontalLineTo(15.0049f)
                verticalLineTo(11.0027f)
                horizontalLineTo(10.0549f)
                close()
            }
        }
        .build()
        return `_money-euro-box-fill`!!
    }

private var `_money-euro-box-fill`: ImageVector? = null
