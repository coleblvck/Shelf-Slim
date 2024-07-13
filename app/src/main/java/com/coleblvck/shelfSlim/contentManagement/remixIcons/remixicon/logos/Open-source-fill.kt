package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Open-source-fill`: ImageVector
    get() {
        if (`_open-source-fill` != null) {
            return `_open-source-fill`!!
        }
        `_open-source-fill` = Builder(name = "Open-source-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 16.1302f, 19.497f, 19.6757f, 15.9243f, 21.201f)
                lineTo(13.4058f, 14.6514f)
                curveTo(14.3548f, 14.1476f, 15.001f, 13.1493f, 15.001f, 12.0f)
                curveTo(15.001f, 10.3431f, 13.6578f, 9.0f, 12.001f, 9.0f)
                curveTo(10.3441f, 9.0f, 9.001f, 10.3431f, 9.001f, 12.0f)
                curveTo(9.001f, 13.1497f, 9.6477f, 14.1483f, 10.5971f, 14.6519f)
                lineTo(8.0786f, 21.2014f)
                curveTo(4.5054f, 19.6763f, 2.001f, 16.1306f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4771f, 6.4781f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return `_open-source-fill`!!
    }

private var `_open-source-fill`: ImageVector? = null
