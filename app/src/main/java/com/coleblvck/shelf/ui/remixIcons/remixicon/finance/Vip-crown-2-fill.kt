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

public val FinanceGroup.`Vip-crown-2-fill`: ImageVector
    get() {
        if (`_vip-crown-2-fill` != null) {
            return `_vip-crown-2-fill`!!
        }
        `_vip-crown-2-fill` = Builder(name = "Vip-crown-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8058f, 5.2001f)
                lineTo(7.0051f, 7.9996f)
                lineTo(11.1913f, 2.1388f)
                curveTo(11.5123f, 1.6894f, 12.1369f, 1.5853f, 12.5863f, 1.9063f)
                curveTo(12.6761f, 1.9705f, 12.7546f, 2.049f, 12.8188f, 2.1388f)
                lineTo(17.0051f, 7.9996f)
                lineTo(21.2043f, 5.2001f)
                curveTo(21.6639f, 4.8937f, 22.2847f, 5.0179f, 22.5911f, 5.4774f)
                curveTo(22.7228f, 5.675f, 22.7799f, 5.9131f, 22.7522f, 6.149f)
                lineTo(21.109f, 20.1164f)
                curveTo(21.0497f, 20.62f, 20.6229f, 20.9996f, 20.1158f, 20.9996f)
                horizontalLineTo(3.8943f)
                curveTo(3.3872f, 20.9996f, 2.9604f, 20.62f, 2.9011f, 20.1164f)
                lineTo(1.2579f, 6.149f)
                curveTo(1.1934f, 5.6005f, 1.5857f, 5.1035f, 2.1342f, 5.039f)
                curveTo(2.3701f, 5.0112f, 2.6082f, 5.0683f, 2.8058f, 5.2001f)
                close()
                moveTo(12.0051f, 14.9996f)
                curveTo(13.1096f, 14.9996f, 14.0051f, 14.1042f, 14.0051f, 12.9996f)
                curveTo(14.0051f, 11.895f, 13.1096f, 10.9996f, 12.0051f, 10.9996f)
                curveTo(10.9005f, 10.9996f, 10.0051f, 11.895f, 10.0051f, 12.9996f)
                curveTo(10.0051f, 14.1042f, 10.9005f, 14.9996f, 12.0051f, 14.9996f)
                close()
            }
        }
        .build()
        return `_vip-crown-2-fill`!!
    }

private var `_vip-crown-2-fill`: ImageVector? = null
