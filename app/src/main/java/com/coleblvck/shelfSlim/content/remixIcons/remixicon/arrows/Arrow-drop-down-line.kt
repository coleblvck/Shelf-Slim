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

public val ArrowsGroup.`Arrow-drop-down-line`: ImageVector
    get() {
        if (`_arrow-drop-down-line` != null) {
            return `_arrow-drop-down-line`!!
        }
        `_arrow-drop-down-line` = Builder(name = "Arrow-drop-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0006f)
                lineTo(7.7573f, 10.758f)
                lineTo(9.1715f, 9.3438f)
                lineTo(12.0f, 12.1722f)
                lineTo(14.8284f, 9.3438f)
                lineTo(16.2426f, 10.758f)
                lineTo(12.0f, 15.0006f)
                close()
            }
        }
        .build()
        return `_arrow-drop-down-line`!!
    }

private var `_arrow-drop-down-line`: ImageVector? = null
