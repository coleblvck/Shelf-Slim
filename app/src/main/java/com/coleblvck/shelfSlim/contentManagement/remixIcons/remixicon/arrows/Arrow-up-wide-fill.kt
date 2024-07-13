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

public val ArrowsGroup.`Arrow-up-wide-fill`: ImageVector
    get() {
        if (`_arrow-up-wide-fill` != null) {
            return `_arrow-up-wide-fill`!!
        }
        `_arrow-up-wide-fill` = Builder(name = "Arrow-up-wide-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.3685f)
                lineTo(20.9679f, 13.1162f)
                lineTo(20.0321f, 14.8838f)
                lineTo(12.0f, 10.6315f)
                lineTo(3.9679f, 14.8838f)
                lineTo(3.0321f, 13.1162f)
                lineTo(12.0f, 8.3685f)
                close()
            }
        }
        .build()
        return `_arrow-up-wide-fill`!!
    }

private var `_arrow-up-wide-fill`: ImageVector? = null
