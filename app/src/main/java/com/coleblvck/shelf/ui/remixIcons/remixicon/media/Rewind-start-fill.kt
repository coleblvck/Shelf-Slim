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

public val MediaGroup.`Rewind-start-fill`: ImageVector
    get() {
        if (`_rewind-start-fill` != null) {
            return `_rewind-start-fill`!!
        }
        `_rewind-start-fill` = Builder(name = "Rewind-start-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(1.4477f, 4.0f, 1.0f, 4.4477f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.5523f, 1.4477f, 20.0f, 2.0f, 20.0f)
                curveTo(2.5523f, 20.0f, 3.0f, 19.5523f, 3.0f, 19.0f)
                verticalLineTo(13.3332f)
                lineTo(12.2227f, 19.4816f)
                curveTo(12.3048f, 19.5364f, 12.4013f, 19.5656f, 12.5f, 19.5656f)
                curveTo(12.7762f, 19.5656f, 13.0f, 19.3418f, 13.0f, 19.0656f)
                verticalLineTo(13.3332f)
                lineTo(22.2227f, 19.4816f)
                curveTo(22.3048f, 19.5364f, 22.4013f, 19.5656f, 22.5f, 19.5656f)
                curveTo(22.7762f, 19.5656f, 23.0f, 19.3418f, 23.0f, 19.0656f)
                verticalLineTo(4.9341f)
                curveTo(23.0f, 4.8354f, 22.9708f, 4.7389f, 22.9161f, 4.6568f)
                curveTo(22.7629f, 4.427f, 22.4524f, 4.3649f, 22.2227f, 4.5181f)
                lineTo(13.0f, 10.6665f)
                verticalLineTo(4.9341f)
                curveTo(13.0f, 4.8354f, 12.9708f, 4.7389f, 12.9161f, 4.6568f)
                curveTo(12.7629f, 4.427f, 12.4524f, 4.3649f, 12.2227f, 4.5181f)
                lineTo(3.0f, 10.6666f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.4477f, 2.5523f, 4.0f, 2.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_rewind-start-fill`!!
    }

private var `_rewind-start-fill`: ImageVector? = null
