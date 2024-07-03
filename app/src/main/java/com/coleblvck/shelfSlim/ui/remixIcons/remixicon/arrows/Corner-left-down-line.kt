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

public val ArrowsGroup.`Corner-left-down-line`: ImageVector
    get() {
        if (`_corner-left-down-line` != null) {
            return `_corner-left-down-line`!!
        }
        `_corner-left-down-line` = Builder(name = "Corner-left-down-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0002f, 5.0001f)
                lineTo(19.0001f, 5.0f)
                lineTo(19.0001f, 7.0f)
                lineTo(12.0002f, 7.0001f)
                lineTo(12.0001f, 17.1719f)
                lineTo(15.9498f, 13.2222f)
                lineTo(17.3641f, 14.6364f)
                lineTo(11.0001f, 21.0004f)
                lineTo(4.6361f, 14.6364f)
                lineTo(6.0504f, 13.2222f)
                lineTo(10.0001f, 17.172f)
                lineTo(10.0002f, 5.0001f)
                close()
            }
        }
        .build()
        return `_corner-left-down-line`!!
    }

private var `_corner-left-down-line`: ImageVector? = null
