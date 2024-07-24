package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pantone-fill`: ImageVector
    get() {
        if (`_pantone-fill` != null) {
            return `_pantone-fill`!!
        }
        `_pantone-fill` = Builder(name = "Pantone-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0002f, 18.9223f)
                lineTo(2.6506f, 18.377f)
                curveTo(2.1385f, 18.1701f, 1.8911f, 17.5873f, 2.098f, 17.0752f)
                lineTo(4.0002f, 12.3671f)
                verticalLineTo(18.9223f)
                close()
                moveTo(8.8599f, 21.0f)
                horizontalLineTo(7.0002f)
                curveTo(6.4479f, 21.0f, 6.0002f, 20.5523f, 6.0002f, 20.0f)
                verticalLineTo(13.9221f)
                lineTo(8.8599f, 21.0f)
                close()
                moveTo(6.022f, 5.9677f)
                lineTo(15.2939f, 2.2216f)
                curveTo(15.8059f, 2.0148f, 16.3888f, 2.2622f, 16.5956f, 2.7742f)
                lineTo(22.2147f, 16.682f)
                curveTo(22.4216f, 17.194f, 22.1742f, 17.7769f, 21.6622f, 17.9838f)
                lineTo(12.3903f, 21.7298f)
                curveTo(11.8783f, 21.9367f, 11.2954f, 21.6893f, 11.0885f, 21.1773f)
                lineTo(5.4694f, 7.2695f)
                curveTo(5.2625f, 6.7574f, 5.51f, 6.1746f, 6.022f, 5.9677f)
                close()
                moveTo(9.0002f, 9.0f)
                curveTo(9.5525f, 9.0f, 10.0002f, 8.5523f, 10.0002f, 8.0f)
                curveTo(10.0002f, 7.4478f, 9.5525f, 7.0f, 9.0002f, 7.0f)
                curveTo(8.4479f, 7.0f, 8.0002f, 7.4478f, 8.0002f, 8.0f)
                curveTo(8.0002f, 8.5523f, 8.4479f, 9.0f, 9.0002f, 9.0f)
                close()
            }
        }
        .build()
        return `_pantone-fill`!!
    }

private var `_pantone-fill`: ImageVector? = null
