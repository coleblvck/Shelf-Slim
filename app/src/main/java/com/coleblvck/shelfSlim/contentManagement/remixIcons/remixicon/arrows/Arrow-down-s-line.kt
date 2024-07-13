package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-down-s-line`: ImageVector
    get() {
        if (`_arrow-down-s-line` != null) {
            return `_arrow-down-s-line`!!
        }
        `_arrow-down-s-line` = Builder(name = "Arrow-down-s-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 13.1714f)
                lineTo(16.9497f, 8.2217f)
                lineTo(18.3639f, 9.6359f)
                lineTo(11.9999f, 15.9999f)
                lineTo(5.636f, 9.6359f)
                lineTo(7.0502f, 8.2217f)
                lineTo(11.9999f, 13.1714f)
                close()
            }
        }
        .build()
        return `_arrow-down-s-line`!!
    }

private var `_arrow-down-s-line`: ImageVector? = null
