package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Send-plane-line`: ImageVector
    get() {
        if (`_send-plane-line` != null) {
            return `_send-plane-line`!!
        }
        `_send-plane-line` = Builder(name = "Send-plane-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7267f, 2.9569f)
                lineTo(16.2734f, 22.0432f)
                curveTo(16.1225f, 22.5716f, 15.7979f, 22.5956f, 15.5563f, 22.1126f)
                lineTo(11.0f, 13.0f)
                lineTo(1.9229f, 9.3692f)
                curveTo(1.4132f, 9.1653f, 1.4195f, 8.8602f, 1.9569f, 8.6811f)
                lineTo(21.0432f, 2.319f)
                curveTo(21.5716f, 2.1428f, 21.8747f, 2.4387f, 21.7267f, 2.9569f)
                close()
                moveTo(19.0353f, 5.0965f)
                lineTo(6.8122f, 9.1708f)
                lineTo(12.4488f, 11.4255f)
                lineTo(15.4895f, 17.5068f)
                lineTo(19.0353f, 5.0965f)
                close()
            }
        }
        .build()
        return `_send-plane-line`!!
    }

private var `_send-plane-line`: ImageVector? = null
