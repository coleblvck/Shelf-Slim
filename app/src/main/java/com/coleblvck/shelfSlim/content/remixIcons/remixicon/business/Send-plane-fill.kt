package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Send-plane-fill`: ImageVector
    get() {
        if (`_send-plane-fill` != null) {
            return `_send-plane-fill`!!
        }
        `_send-plane-fill` = Builder(name = "Send-plane-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9462f, 9.3154f)
                curveTo(1.4237f, 9.1412f, 1.4195f, 8.8602f, 1.9569f, 8.6811f)
                lineTo(21.0431f, 2.319f)
                curveTo(21.5716f, 2.1428f, 21.8747f, 2.4387f, 21.7266f, 2.9569f)
                lineTo(16.2734f, 22.0432f)
                curveTo(16.1224f, 22.5716f, 15.8178f, 22.59f, 15.5945f, 22.0876f)
                lineTo(12.0f, 14.0f)
                lineTo(18.0f, 6.0001f)
                lineTo(10.0f, 12.0f)
                lineTo(1.9462f, 9.3154f)
                close()
            }
        }
        .build()
        return `_send-plane-fill`!!
    }

private var `_send-plane-fill`: ImageVector? = null
