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

public val MediaGroup.`Rewind-mini-fill`: ImageVector
    get() {
        if (`_rewind-mini-fill` != null) {
            return `_rewind-mini-fill`!!
        }
        `_rewind-mini-fill` = Builder(name = "Rewind-mini-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0002f, 17.035f)
                curveTo(11.0002f, 17.1383f, 10.9682f, 17.239f, 10.9087f, 17.3234f)
                curveTo(10.7494f, 17.549f, 10.4375f, 17.6028f, 10.2119f, 17.4435f)
                lineTo(3.0789f, 12.4085f)
                curveTo(3.0323f, 12.3756f, 2.9916f, 12.335f, 2.9587f, 12.2883f)
                curveTo(2.7995f, 12.0627f, 2.8533f, 11.7508f, 3.0789f, 11.5915f)
                lineTo(10.2119f, 6.5565f)
                curveTo(10.2962f, 6.4969f, 10.3969f, 6.465f, 10.5002f, 6.465f)
                curveTo(10.7763f, 6.465f, 11.0002f, 6.6888f, 11.0002f, 6.965f)
                verticalLineTo(17.035f)
                close()
                moveTo(12.0789f, 12.4085f)
                curveTo(12.0323f, 12.3756f, 11.9916f, 12.335f, 11.9587f, 12.2883f)
                curveTo(11.7995f, 12.0627f, 11.8533f, 11.7508f, 12.0789f, 11.5915f)
                lineTo(19.2119f, 6.5565f)
                curveTo(19.2962f, 6.4969f, 19.3969f, 6.465f, 19.5002f, 6.465f)
                curveTo(19.7763f, 6.465f, 20.0002f, 6.6888f, 20.0002f, 6.965f)
                verticalLineTo(17.035f)
                curveTo(20.0002f, 17.1383f, 19.9682f, 17.239f, 19.9087f, 17.3234f)
                curveTo(19.7494f, 17.549f, 19.4375f, 17.6028f, 19.2119f, 17.4435f)
                lineTo(12.0789f, 12.4085f)
                close()
            }
        }
        .build()
        return `_rewind-mini-fill`!!
    }

private var `_rewind-mini-fill`: ImageVector? = null
