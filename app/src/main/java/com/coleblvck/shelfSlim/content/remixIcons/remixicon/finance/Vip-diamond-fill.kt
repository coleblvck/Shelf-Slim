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

public val FinanceGroup.`Vip-diamond-fill`: ImageVector
    get() {
        if (`_vip-diamond-fill` != null) {
            return `_vip-diamond-fill`!!
        }
        `_vip-diamond-fill` = Builder(name = "Vip-diamond-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8776f, 3.0027f)
                horizontalLineTo(19.1319f)
                curveTo(19.4518f, 3.0027f, 19.7524f, 3.1558f, 19.9406f, 3.4146f)
                lineTo(23.7634f, 8.671f)
                curveTo(23.9037f, 8.8638f, 23.8882f, 9.129f, 23.7265f, 9.3042f)
                lineTo(12.3721f, 21.6047f)
                curveTo(12.1848f, 21.8076f, 11.8685f, 21.8203f, 11.6656f, 21.633f)
                curveTo(11.6558f, 21.6239f, 11.6464f, 21.6145f, 11.6373f, 21.6047f)
                lineTo(0.283f, 9.3042f)
                curveTo(0.1212f, 9.129f, 0.1058f, 8.8638f, 0.246f, 8.671f)
                lineTo(4.0689f, 3.4146f)
                curveTo(4.257f, 3.1558f, 4.5577f, 3.0027f, 4.8776f, 3.0027f)
                close()
            }
        }
        .build()
        return `_vip-diamond-fill`!!
    }

private var `_vip-diamond-fill`: ImageVector? = null
