package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Rewind-start-mini-line`: ImageVector
    get() {
        if (`_rewind-start-mini-line` != null) {
            return `_rewind-start-mini-line`!!
        }
        `_rewind-start-mini-line` = Builder(name = "Rewind-start-mini-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(2.4477f, 6.0f, 2.0f, 6.4477f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.5523f, 2.4477f, 18.0f, 3.0f, 18.0f)
                curveTo(3.5523f, 18.0f, 4.0f, 17.5523f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.4477f, 3.5523f, 6.0f, 3.0f, 6.0f)
                close()
                moveTo(7.9683f, 11.9999f)
                lineTo(11.0002f, 9.8597f)
                verticalLineTo(14.14f)
                lineTo(7.9683f, 11.9999f)
                close()
                moveTo(12.2119f, 17.4434f)
                curveTo(12.4375f, 17.6027f, 12.7494f, 17.5489f, 12.9087f, 17.3233f)
                curveTo(12.9682f, 17.2389f, 13.0002f, 17.1382f, 13.0002f, 17.0349f)
                verticalLineTo(6.9648f)
                curveTo(13.0002f, 6.6887f, 12.7763f, 6.4648f, 12.5002f, 6.4648f)
                curveTo(12.3969f, 6.4648f, 12.2962f, 6.4968f, 12.2119f, 6.5564f)
                lineTo(5.0789f, 11.5914f)
                curveTo(4.8533f, 11.7506f, 4.7995f, 12.0626f, 4.9587f, 12.2882f)
                curveTo(4.9916f, 12.3348f, 5.0323f, 12.3755f, 5.0789f, 12.4084f)
                lineTo(12.2119f, 17.4434f)
                close()
                moveTo(16.9683f, 11.9999f)
                lineTo(20.0002f, 9.8597f)
                verticalLineTo(14.14f)
                lineTo(16.9683f, 11.9999f)
                close()
                moveTo(13.9587f, 12.2882f)
                curveTo(13.9916f, 12.3348f, 14.0323f, 12.3755f, 14.0789f, 12.4084f)
                lineTo(21.2119f, 17.4434f)
                curveTo(21.4375f, 17.6027f, 21.7494f, 17.5489f, 21.9087f, 17.3233f)
                curveTo(21.9682f, 17.2389f, 22.0002f, 17.1382f, 22.0002f, 17.0349f)
                verticalLineTo(6.9648f)
                curveTo(22.0002f, 6.6887f, 21.7763f, 6.4648f, 21.5002f, 6.4648f)
                curveTo(21.3969f, 6.4648f, 21.2962f, 6.4968f, 21.2119f, 6.5564f)
                lineTo(14.0789f, 11.5914f)
                curveTo(13.8533f, 11.7506f, 13.7995f, 12.0626f, 13.9587f, 12.2882f)
                close()
            }
        }
        .build()
        return `_rewind-start-mini-line`!!
    }

private var `_rewind-start-mini-line`: ImageVector? = null
