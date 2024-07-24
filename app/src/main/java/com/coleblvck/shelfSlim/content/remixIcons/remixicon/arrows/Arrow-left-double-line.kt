package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-left-double-line`: ImageVector
    get() {
        if (`_arrow-left-double-line` != null) {
            return `_arrow-left-double-line`!!
        }
        `_arrow-left-double-line` = Builder(name = "Arrow-left-double-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8358f, 12.0f)
                lineTo(11.0429f, 18.2071f)
                lineTo(12.4571f, 16.7929f)
                lineTo(7.6642f, 12.0f)
                lineTo(12.4571f, 7.2071f)
                lineTo(11.0429f, 5.7929f)
                lineTo(4.8358f, 12.0f)
                close()
                moveTo(10.4857f, 12.0f)
                lineTo(16.6928f, 18.2071f)
                lineTo(18.107f, 16.7929f)
                lineTo(13.3141f, 12.0f)
                lineTo(18.107f, 7.2071f)
                lineTo(16.6928f, 5.7929f)
                lineTo(10.4857f, 12.0f)
                close()
            }
        }
        .build()
        return `_arrow-left-double-line`!!
    }

private var `_arrow-left-double-line`: ImageVector? = null
