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

public val ArrowsGroup.`Arrow-down-double-line`: ImageVector
    get() {
        if (`_arrow-down-double-line` != null) {
            return `_arrow-down-double-line`!!
        }
        `_arrow-down-double-line` = Builder(name = "Arrow-down-double-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.1642f)
                lineTo(18.2071f, 12.9571f)
                lineTo(16.7929f, 11.5429f)
                lineTo(12.0f, 16.3358f)
                lineTo(7.2071f, 11.5429f)
                lineTo(5.7929f, 12.9571f)
                lineTo(12.0f, 19.1642f)
                close()
                moveTo(12.0f, 13.5143f)
                lineTo(18.2071f, 7.3072f)
                lineTo(16.7929f, 5.893f)
                lineTo(12.0f, 10.6859f)
                lineTo(7.2071f, 5.893f)
                lineTo(5.7929f, 7.3072f)
                lineTo(12.0f, 13.5143f)
                close()
            }
        }
        .build()
        return `_arrow-down-double-line`!!
    }

private var `_arrow-down-double-line`: ImageVector? = null
