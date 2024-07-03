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

public val FinanceGroup.`Nft-fill`: ImageVector
    get() {
        if (`_nft-fill` != null) {
            return `_nft-fill`!!
        }
        `_nft-fill` = Builder(name = "Nft-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 1.0f)
                lineTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(4.5f, 7.6531f)
                verticalLineTo(16.3469f)
                lineTo(6.8724f, 17.7204f)
                lineTo(14.9446f, 11.8008f)
                lineTo(19.5f, 14.534f)
                verticalLineTo(7.6531f)
                lineTo(12.0f, 3.311f)
                lineTo(4.5f, 7.6531f)
                close()
            }
        }
        .build()
        return `_nft-fill`!!
    }

private var `_nft-fill`: ImageVector? = null
