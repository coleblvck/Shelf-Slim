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

public val FinanceGroup.`Nft-line`: ImageVector
    get() {
        if (`_nft-line` != null) {
            return `_nft-line`!!
        }
        `_nft-line` = Builder(name = "Nft-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveTo(10.1046f, 12.0f, 11.0f, 11.1046f, 11.0f, 10.0f)
                curveTo(11.0f, 8.8954f, 10.1046f, 8.0f, 9.0f, 8.0f)
                curveTo(7.8954f, 8.0f, 7.0f, 8.8954f, 7.0f, 10.0f)
                curveTo(7.0f, 11.1046f, 7.8954f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(21.5f, 6.5f)
                lineTo(12.0f, 1.0f)
                lineTo(2.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(21.5f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(12.0f, 3.311f)
                lineTo(19.5f, 7.6531f)
                verticalLineTo(14.5338f)
                lineTo(14.9379f, 11.7966f)
                lineTo(6.9667f, 17.775f)
                lineTo(4.5f, 16.3469f)
                verticalLineTo(7.6531f)
                lineTo(12.0f, 3.311f)
                close()
                moveTo(12.0f, 20.689f)
                lineTo(8.8479f, 18.8641f)
                lineTo(15.0621f, 14.2034f)
                lineTo(19.0595f, 16.6019f)
                lineTo(12.0f, 20.689f)
                close()
            }
        }
        .build()
        return `_nft-line`!!
    }

private var `_nft-line`: ImageVector? = null
