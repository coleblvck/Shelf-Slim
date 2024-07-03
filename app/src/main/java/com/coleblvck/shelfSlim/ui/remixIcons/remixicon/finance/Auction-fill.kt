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

public val FinanceGroup.`Auction-fill`: ImageVector
    get() {
        if (`_auction-fill` != null) {
            return `_auction-fill`!!
        }
        `_auction-fill` = Builder(name = "Auction-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0049f, 20.0028f)
                verticalLineTo(22.0028f)
                horizontalLineTo(2.0049f)
                verticalLineTo(20.0028f)
                horizontalLineTo(14.0049f)
                close()
                moveTo(14.5907f, 0.6891f)
                lineTo(22.3688f, 8.4673f)
                lineTo(20.9546f, 9.8815f)
                lineTo(19.894f, 9.5279f)
                lineTo(17.4191f, 12.0028f)
                lineTo(23.076f, 17.6597f)
                lineTo(21.6617f, 19.0739f)
                lineTo(16.0049f, 13.417f)
                lineTo(13.6007f, 15.8212f)
                lineTo(13.8836f, 16.9525f)
                lineTo(12.4693f, 18.3668f)
                lineTo(4.6912f, 10.5886f)
                lineTo(6.1054f, 9.1744f)
                lineTo(7.2368f, 9.4572f)
                lineTo(13.53f, 3.164f)
                lineTo(13.1765f, 2.1033f)
                lineTo(14.5907f, 0.6891f)
                close()
            }
        }
        .build()
        return `_auction-fill`!!
    }

private var `_auction-fill`: ImageVector? = null
