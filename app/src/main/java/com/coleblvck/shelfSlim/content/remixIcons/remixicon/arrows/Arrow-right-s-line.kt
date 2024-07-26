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

public val ArrowsGroup.`Arrow-right-s-line`: ImageVector
    get() {
        if (`_arrow-right-s-line` != null) {
            return `_arrow-right-s-line`!!
        }
        `_arrow-right-s-line` = Builder(name = "Arrow-right-s-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1717f, 12.0007f)
                lineTo(8.2219f, 7.0509f)
                lineTo(9.6361f, 5.6367f)
                lineTo(16.0001f, 12.0007f)
                lineTo(9.6361f, 18.3646f)
                lineTo(8.2219f, 16.9504f)
                lineTo(13.1717f, 12.0007f)
                close()
            }
        }
        .build()
        return `_arrow-right-s-line`!!
    }

private var `_arrow-right-s-line`: ImageVector? = null