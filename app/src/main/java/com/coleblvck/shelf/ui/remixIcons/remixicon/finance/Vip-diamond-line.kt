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

public val FinanceGroup.`Vip-diamond-line`: ImageVector
    get() {
        if (`_vip-diamond-line` != null) {
            return `_vip-diamond-line`!!
        }
        `_vip-diamond-line` = Builder(name = "Vip-diamond-line", defaultWidth = 24.0.dp,
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
                curveTo(11.6591f, 21.627f, 7.8649f, 17.5174f, 0.283f, 9.3042f)
                curveTo(0.1212f, 9.129f, 0.1058f, 8.8638f, 0.246f, 8.671f)
                lineTo(4.0689f, 3.4146f)
                curveTo(4.257f, 3.1558f, 4.5577f, 3.0027f, 4.8776f, 3.0027f)
                close()
                moveTo(5.3868f, 5.0027f)
                lineTo(2.5874f, 8.852f)
                lineTo(12.0047f, 19.0541f)
                lineTo(21.4221f, 8.852f)
                lineTo(18.6226f, 5.0027f)
                horizontalLineTo(5.3868f)
                close()
            }
        }
        .build()
        return `_vip-diamond-line`!!
    }

private var `_vip-diamond-line`: ImageVector? = null
