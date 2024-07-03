package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Eject-fill`: ImageVector
    get() {
        if (`_eject-fill` != null) {
            return `_eject-fill`!!
        }
        `_eject-fill` = Builder(name = "Eject-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.416f, 3.6241f)
                lineTo(19.4818f, 14.2227f)
                curveTo(19.6349f, 14.4524f, 19.5729f, 14.7629f, 19.3431f, 14.9161f)
                curveTo(19.261f, 14.9708f, 19.1645f, 15.0f, 19.0657f, 15.0f)
                horizontalLineTo(4.9343f)
                curveTo(4.6581f, 15.0f, 4.4343f, 14.7762f, 4.4343f, 14.5f)
                curveTo(4.4343f, 14.4013f, 4.4635f, 14.3048f, 4.5182f, 14.2227f)
                lineTo(11.584f, 3.6241f)
                curveTo(11.7372f, 3.3943f, 12.0476f, 3.3322f, 12.2774f, 3.4854f)
                curveTo(12.3323f, 3.522f, 12.3794f, 3.5691f, 12.416f, 3.6241f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 17.4477f, 20.0f, 18.0f)
                curveTo(20.0f, 18.5523f, 19.5523f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 19.0f, 4.0f, 18.5523f, 4.0f, 18.0f)
                curveTo(4.0f, 17.4477f, 4.4477f, 17.0f, 5.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_eject-fill`!!
    }

private var `_eject-fill`: ImageVector? = null
