package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-right-double-line`: ImageVector
    get() {
        if (`_arrow-right-double-line` != null) {
            return `_arrow-right-double-line`!!
        }
        `_arrow-right-double-line` = Builder(name = "Arrow-right-double-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1642f, 12.0f)
                lineTo(12.9571f, 5.7929f)
                lineTo(11.5429f, 7.2071f)
                lineTo(16.3358f, 12.0f)
                lineTo(11.5429f, 16.7929f)
                lineTo(12.9571f, 18.2071f)
                lineTo(19.1642f, 12.0f)
                close()
                moveTo(13.5143f, 12.0f)
                lineTo(7.3072f, 5.7929f)
                lineTo(5.893f, 7.2071f)
                lineTo(10.6859f, 12.0f)
                lineTo(5.893f, 16.7929f)
                lineTo(7.3072f, 18.2071f)
                lineTo(13.5143f, 12.0f)
                close()
            }
        }
        .build()
        return `_arrow-right-double-line`!!
    }

private var `_arrow-right-double-line`: ImageVector? = null
