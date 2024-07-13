package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Rewind-fill`: ImageVector
    get() {
        if (`_rewind-fill` != null) {
            return `_rewind-fill`!!
        }
        `_rewind-fill` = Builder(name = "Rewind-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.6667f)
                lineTo(21.2227f, 4.5182f)
                curveTo(21.4524f, 4.3651f, 21.7629f, 4.4271f, 21.9161f, 4.6569f)
                curveTo(21.9708f, 4.739f, 22.0f, 4.8355f, 22.0f, 4.9343f)
                verticalLineTo(19.0657f)
                curveTo(22.0f, 19.3419f, 21.7762f, 19.5657f, 21.5f, 19.5657f)
                curveTo(21.4013f, 19.5657f, 21.3048f, 19.5365f, 21.2227f, 19.4818f)
                lineTo(12.0f, 13.3333f)
                verticalLineTo(19.0657f)
                curveTo(12.0f, 19.3419f, 11.7762f, 19.5657f, 11.5f, 19.5657f)
                curveTo(11.4013f, 19.5657f, 11.3048f, 19.5365f, 11.2227f, 19.4818f)
                lineTo(0.6241f, 12.416f)
                curveTo(0.3943f, 12.2628f, 0.3322f, 11.9524f, 0.4854f, 11.7226f)
                curveTo(0.522f, 11.6677f, 0.5691f, 11.6206f, 0.6241f, 11.584f)
                lineTo(11.2227f, 4.5182f)
                curveTo(11.4524f, 4.3651f, 11.7629f, 4.4271f, 11.9161f, 4.6569f)
                curveTo(11.9708f, 4.739f, 12.0f, 4.8355f, 12.0f, 4.9343f)
                verticalLineTo(10.6667f)
                close()
            }
        }
        .build()
        return `_rewind-fill`!!
    }

private var `_rewind-fill`: ImageVector? = null
