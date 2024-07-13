package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pantone-line`: ImageVector
    get() {
        if (`_pantone-line` != null) {
            return `_pantone-line`!!
        }
        `_pantone-line` = Builder(name = "Pantone-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7646f, 8.0f)
                lineTo(5.4694f, 7.2694f)
                curveTo(5.2625f, 6.7574f, 5.51f, 6.1745f, 6.022f, 5.9676f)
                lineTo(15.2939f, 2.2216f)
                curveTo(15.8059f, 2.0147f, 16.3888f, 2.2621f, 16.5956f, 2.7742f)
                lineTo(22.2147f, 16.6819f)
                curveTo(22.4216f, 17.194f, 22.1742f, 17.7768f, 21.6622f, 17.9837f)
                lineTo(12.3903f, 21.7298f)
                curveTo(11.8783f, 21.9367f, 11.2954f, 21.6893f, 11.0885f, 21.1772f)
                lineTo(11.0002f, 20.9586f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0002f)
                curveTo(6.4479f, 21.0f, 6.0002f, 20.5523f, 6.0002f, 20.0f)
                verticalLineTo(19.7303f)
                lineTo(2.6506f, 18.377f)
                curveTo(2.1385f, 18.1701f, 1.8911f, 17.5873f, 2.098f, 17.0752f)
                lineTo(5.7646f, 8.0f)
                close()
                moveTo(8.0002f, 19.0f)
                horizontalLineTo(10.2089f)
                lineTo(8.0002f, 13.5333f)
                verticalLineTo(19.0f)
                close()
                moveTo(6.0002f, 12.7558f)
                lineTo(4.327f, 16.8972f)
                lineTo(6.0002f, 17.6084f)
                verticalLineTo(12.7558f)
                close()
                moveTo(7.6984f, 7.4474f)
                lineTo(12.5683f, 19.5008f)
                lineTo(19.9858f, 16.5039f)
                lineTo(15.1159f, 4.4506f)
                lineTo(7.6984f, 7.4474f)
                close()
                moveTo(10.6766f, 9.4797f)
                curveTo(10.1645f, 9.6866f, 9.5817f, 9.4392f, 9.3748f, 8.9272f)
                curveTo(9.1679f, 8.4151f, 9.4153f, 7.8323f, 9.9274f, 7.6254f)
                curveTo(10.4395f, 7.4185f, 11.0223f, 7.6659f, 11.2292f, 8.1779f)
                curveTo(11.4361f, 8.69f, 11.1887f, 9.2729f, 10.6766f, 9.4797f)
                close()
            }
        }
        .build()
        return `_pantone-line`!!
    }

private var `_pantone-line`: ImageVector? = null
