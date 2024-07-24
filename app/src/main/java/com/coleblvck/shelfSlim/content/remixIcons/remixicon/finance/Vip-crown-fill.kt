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

public val FinanceGroup.`Vip-crown-fill`: ImageVector
    get() {
        if (`_vip-crown-fill` != null) {
            return `_vip-crown-fill`!!
        }
        `_vip-crown-fill` = Builder(name = "Vip-crown-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0049f, 19.0f)
                horizontalLineTo(22.0049f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(19.0f)
                close()
                moveTo(2.0049f, 5.0f)
                lineTo(7.0049f, 8.0f)
                lineTo(12.0049f, 2.0f)
                lineTo(17.0049f, 8.0f)
                lineTo(22.0049f, 5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0049f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_vip-crown-fill`!!
    }

private var `_vip-crown-fill`: ImageVector? = null
