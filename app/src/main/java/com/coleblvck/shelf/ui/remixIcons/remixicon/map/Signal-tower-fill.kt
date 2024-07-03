package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Signal-tower-fill`: ImageVector
    get() {
        if (`_signal-tower-fill` != null) {
            return `_signal-tower-fill`!!
        }
        `_signal-tower-fill` = Builder(name = "Signal-tower-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1163f, 20.0868f)
                curveTo(3.6214f, 18.2684f, 2.0f, 15.3236f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 15.3236f, 20.3786f, 18.2684f, 17.8837f, 20.0868f)
                lineTo(16.8692f, 18.348f)
                curveTo(18.7729f, 16.8856f, 20.0f, 14.5861f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 14.5861f, 5.2271f, 16.8856f, 7.1308f, 18.348f)
                lineTo(6.1163f, 20.0868f)
                close()
                moveTo(8.1496f, 16.6018f)
                curveTo(6.8356f, 15.5012f, 6.0f, 13.8482f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 13.8482f, 17.1644f, 15.5012f, 15.8503f, 16.6018f)
                lineTo(14.8203f, 14.8365f)
                curveTo(15.549f, 14.112f, 16.0f, 13.1087f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 13.1087f, 8.451f, 14.112f, 9.1797f, 14.8365f)
                lineTo(8.1496f, 16.6018f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                lineTo(11.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_signal-tower-fill`!!
    }

private var `_signal-tower-fill`: ImageVector? = null
