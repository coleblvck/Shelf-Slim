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

public val FinanceGroup.`Eth-fill`: ImageVector
    get() {
        if (`_eth-fill` != null) {
            return `_eth-fill`!!
        }
        `_eth-fill` = Builder(name = "Eth-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 0.0f)
                lineTo(4.6299f, 12.2201f)
                lineTo(11.9999f, 16.5743f)
                lineTo(19.3699f, 12.2201f)
                lineTo(11.9999f, 0.0f)
                close()
                moveTo(11.9999f, 24.0f)
                lineTo(4.6299f, 13.6172f)
                lineTo(11.9999f, 18.0f)
                lineTo(19.3699f, 13.6172f)
                lineTo(11.9999f, 24.0f)
                close()
            }
        }
        .build()
        return `_eth-fill`!!
    }

private var `_eth-fill`: ImageVector? = null
