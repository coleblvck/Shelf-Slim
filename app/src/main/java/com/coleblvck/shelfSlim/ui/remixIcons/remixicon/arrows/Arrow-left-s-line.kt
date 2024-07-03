package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-left-s-line`: ImageVector
    get() {
        if (`_arrow-left-s-line` != null) {
            return `_arrow-left-s-line`!!
        }
        `_arrow-left-s-line` = Builder(name = "Arrow-left-s-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8284f, 12.0007f)
                lineTo(15.7782f, 16.9504f)
                lineTo(14.364f, 18.3646f)
                lineTo(8.0f, 12.0007f)
                lineTo(14.364f, 5.6367f)
                lineTo(15.7782f, 7.0509f)
                lineTo(10.8284f, 12.0007f)
                close()
            }
        }
        .build()
        return `_arrow-left-s-line`!!
    }

private var `_arrow-left-s-line`: ImageVector? = null
