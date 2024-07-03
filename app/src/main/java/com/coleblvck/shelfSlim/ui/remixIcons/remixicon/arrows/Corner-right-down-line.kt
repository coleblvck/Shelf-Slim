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

public val ArrowsGroup.`Corner-right-down-line`: ImageVector
    get() {
        if (`_corner-right-down-line` != null) {
            return `_corner-right-down-line`!!
        }
        `_corner-right-down-line` = Builder(name = "Corner-right-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9998f, 5.0001f)
                lineTo(4.9999f, 5.0f)
                lineTo(4.9999f, 7.0f)
                lineTo(11.9998f, 7.0001f)
                lineTo(11.9999f, 17.1719f)
                lineTo(8.0501f, 13.2222f)
                lineTo(6.6359f, 14.6364f)
                lineTo(12.9999f, 21.0004f)
                lineTo(19.3639f, 14.6364f)
                lineTo(17.9496f, 13.2222f)
                lineTo(13.9999f, 17.172f)
                lineTo(13.9998f, 5.0001f)
                close()
            }
        }
        .build()
        return `_corner-right-down-line`!!
    }

private var `_corner-right-down-line`: ImageVector? = null
