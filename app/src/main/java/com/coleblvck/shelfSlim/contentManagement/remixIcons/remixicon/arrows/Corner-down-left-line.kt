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

public val ArrowsGroup.`Corner-down-left-line`: ImageVector
    get() {
        if (`_corner-down-left-line` != null) {
            return `_corner-down-left-line`!!
        }
        `_corner-down-left-line` = Builder(name = "Corner-down-left-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 13.9999f)
                lineTo(19.0002f, 5.0f)
                lineTo(17.0002f, 5.0f)
                lineTo(17.0001f, 11.9999f)
                lineTo(6.8283f, 12.0f)
                lineTo(10.778f, 8.0502f)
                lineTo(9.3638f, 6.636f)
                lineTo(2.9999f, 13.0f)
                lineTo(9.3638f, 19.364f)
                lineTo(10.778f, 17.9497f)
                lineTo(6.8282f, 14.0f)
                lineTo(19.0001f, 13.9999f)
                close()
            }
        }
        .build()
        return `_corner-down-left-line`!!
    }

private var `_corner-down-left-line`: ImageVector? = null
