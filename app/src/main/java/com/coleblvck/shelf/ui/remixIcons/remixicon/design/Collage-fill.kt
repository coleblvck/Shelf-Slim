package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Collage-fill`: ImageVector
    get() {
        if (`_collage-fill` != null) {
            return `_collage-fill`!!
        }
        `_collage-fill` = Builder(name = "Collage-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1889f, 13.2642f)
                lineTo(12.5715f, 21.106f)
                lineTo(4.0002f, 21.1067f)
                curveTo(3.4479f, 21.1067f, 3.0002f, 20.659f, 3.0002f, 20.1067f)
                lineTo(2.9995f, 14.709f)
                lineTo(11.1889f, 13.2642f)
                close()
                moveTo(20.0002f, 3.1067f)
                curveTo(20.5525f, 3.1067f, 21.0002f, 3.5544f, 21.0002f, 4.1067f)
                verticalLineTo(20.1067f)
                curveTo(21.0002f, 20.659f, 20.5525f, 21.1067f, 20.0002f, 21.1067f)
                lineTo(14.6025f, 21.106f)
                lineTo(11.4285f, 3.106f)
                lineTo(20.0002f, 3.1067f)
                close()
                moveTo(9.3975f, 3.106f)
                lineTo(10.8416f, 11.2945f)
                lineTo(2.9995f, 12.678f)
                lineTo(3.0002f, 4.1067f)
                curveTo(3.0002f, 3.5544f, 3.4479f, 3.1067f, 4.0002f, 3.1067f)
                lineTo(9.3975f, 3.106f)
                close()
            }
        }
        .build()
        return `_collage-fill`!!
    }

private var `_collage-fill`: ImageVector? = null
