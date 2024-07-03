package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Close-fill`: ImageVector
    get() {
        if (`_close-fill` != null) {
            return `_close-fill`!!
        }
        `_close-fill` = Builder(name = "Close-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9997f, 10.5865f)
                lineTo(16.9495f, 5.6367f)
                lineTo(18.3637f, 7.0509f)
                lineTo(13.4139f, 12.0007f)
                lineTo(18.3637f, 16.9504f)
                lineTo(16.9495f, 18.3646f)
                lineTo(11.9997f, 13.4149f)
                lineTo(7.05f, 18.3646f)
                lineTo(5.6357f, 16.9504f)
                lineTo(10.5855f, 12.0007f)
                lineTo(5.6357f, 7.0509f)
                lineTo(7.05f, 5.6367f)
                lineTo(11.9997f, 10.5865f)
                close()
            }
        }
        .build()
        return `_close-fill`!!
    }

private var `_close-fill`: ImageVector? = null
