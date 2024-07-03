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

public val FinanceGroup.`Eth-line`: ImageVector
    get() {
        if (`_eth-line` != null) {
            return `_eth-line`!!
        }
        `_eth-line` = Builder(name = "Eth-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1488f, 15.3042f)
                lineTo(12.0f, 20.5996f)
                lineTo(15.8513f, 15.3042f)
                lineTo(12.0f, 17.6742f)
                lineTo(8.1488f, 15.3042f)
                close()
                moveTo(17.1374f, 12.1643f)
                lineTo(12.0f, 3.8161f)
                lineTo(6.8626f, 12.1643f)
                lineTo(12.0f, 15.3258f)
                lineTo(17.1374f, 12.1643f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(12.0f, 0.0f)
                lineTo(20.0f, 13.0f)
                lineTo(12.0001f, 24.0f)
                lineTo(4.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_eth-line`!!
    }

private var `_eth-line`: ImageVector? = null
