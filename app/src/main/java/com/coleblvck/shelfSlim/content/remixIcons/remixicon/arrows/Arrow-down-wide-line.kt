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

public val ArrowsGroup.`Arrow-down-wide-line`: ImageVector
    get() {
        if (`_arrow-down-wide-line` != null) {
            return `_arrow-down-wide-line`!!
        }
        `_arrow-down-wide-line` = Builder(name = "Arrow-down-wide-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.6315f)
                lineTo(20.9679f, 10.8838f)
                lineTo(20.0321f, 9.1162f)
                lineTo(12.0f, 13.3685f)
                lineTo(3.9679f, 9.1162f)
                lineTo(3.0321f, 10.8838f)
                lineTo(12.0f, 15.6315f)
                close()
            }
        }
        .build()
        return `_arrow-down-wide-line`!!
    }

private var `_arrow-down-wide-line`: ImageVector? = null
