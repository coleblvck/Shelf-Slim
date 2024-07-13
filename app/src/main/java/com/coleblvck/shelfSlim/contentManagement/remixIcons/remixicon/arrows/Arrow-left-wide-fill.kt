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

public val ArrowsGroup.`Arrow-left-wide-fill`: ImageVector
    get() {
        if (`_arrow-left-wide-fill` != null) {
            return `_arrow-left-wide-fill`!!
        }
        `_arrow-left-wide-fill` = Builder(name = "Arrow-left-wide-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3685f, 12.0f)
                lineTo(13.1162f, 3.0321f)
                lineTo(14.8838f, 3.9679f)
                lineTo(10.6315f, 12.0f)
                lineTo(14.8838f, 20.0321f)
                lineTo(13.1162f, 20.9679f)
                lineTo(8.3685f, 12.0f)
                close()
            }
        }
        .build()
        return `_arrow-left-wide-fill`!!
    }

private var `_arrow-left-wide-fill`: ImageVector? = null
