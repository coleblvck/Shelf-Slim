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

public val ArrowsGroup.`Arrow-drop-right-line`: ImageVector
    get() {
        if (`_arrow-drop-right-line` != null) {
            return `_arrow-drop-right-line`!!
        }
        `_arrow-drop-right-line` = Builder(name = "Arrow-drop-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1717f, 12.0005f)
                lineTo(9.3433f, 9.172f)
                lineTo(10.7575f, 7.7578f)
                lineTo(15.0001f, 12.0005f)
                lineTo(10.7575f, 16.2431f)
                lineTo(9.3433f, 14.8289f)
                lineTo(12.1717f, 12.0005f)
                close()
            }
        }
        .build()
        return `_arrow-drop-right-line`!!
    }

private var `_arrow-drop-right-line`: ImageVector? = null
