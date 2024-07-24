package com.coleblvck.shelfSlim.content.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Flower-fill`: ImageVector
    get() {
        if (`_flower-fill` != null) {
            return `_flower-fill`!!
        }
        `_flower-fill` = Builder(name = "Flower-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.455f, 2.3089f)
                lineTo(11.9998f, 2.0762f)
                lineTo(11.5447f, 2.3089f)
                curveTo(10.3952f, 2.8965f, 9.3532f, 3.6638f, 8.4556f, 4.5739f)
                curveTo(9.7739f, 5.2602f, 10.9693f, 6.1502f, 12.0001f, 7.2021f)
                curveTo(13.0308f, 6.1503f, 14.2261f, 5.2604f, 15.5443f, 4.5741f)
                curveTo(14.6466f, 3.6639f, 13.6045f, 2.8965f, 12.455f, 2.3089f)
                close()
                moveTo(10.6993f, 8.7343f)
                curveTo(8.9893f, 6.935f, 6.7263f, 5.6654f, 4.1807f, 5.1978f)
                lineTo(3.0f, 4.981f)
                verticalLineTo(13.0002f)
                curveTo(3.0f, 16.8047f, 5.3607f, 20.0579f, 8.6971f, 21.3748f)
                curveTo(8.2447f, 19.9984f, 8.0f, 18.5278f, 8.0f, 17.0f)
                curveTo(8.0f, 13.9083f, 9.0021f, 11.0507f, 10.6993f, 8.7343f)
                close()
                moveTo(21.0f, 4.981f)
                lineTo(19.8193f, 5.1978f)
                curveTo(14.233f, 6.224f, 10.0f, 11.1168f, 10.0f, 17.0002f)
                curveTo(10.0f, 18.5362f, 10.2891f, 20.0071f, 10.8167f, 21.3598f)
                lineTo(11.0569f, 21.9754f)
                curveTo(11.3711f, 21.9852f, 11.6856f, 22.0002f, 12.0f, 22.0002f)
                curveTo(16.9706f, 22.0002f, 21.0f, 17.9708f, 21.0f, 13.0002f)
                verticalLineTo(4.981f)
                close()
            }
        }
        .build()
        return `_flower-fill`!!
    }

private var `_flower-fill`: ImageVector? = null
