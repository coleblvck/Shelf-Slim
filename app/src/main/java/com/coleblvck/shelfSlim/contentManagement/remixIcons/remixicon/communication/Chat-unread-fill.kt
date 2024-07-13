package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Chat-unread-fill`: ImageVector
    get() {
        if (`_chat-unread-fill` != null) {
            return `_chat-unread-fill`!!
        }
        `_chat-unread-fill` = Builder(name = "Chat-unread-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveTo(22.6569f, 7.0f, 24.0f, 5.6568f, 24.0f, 4.0f)
                curveTo(24.0f, 2.3431f, 22.6569f, 1.0f, 21.0f, 1.0f)
                curveTo(19.3431f, 1.0f, 18.0f, 2.3431f, 18.0f, 4.0f)
                curveTo(18.0f, 5.6568f, 19.3431f, 7.0f, 21.0f, 7.0f)
                close()
                moveTo(21.0f, 9.0f)
                curveTo(21.3425f, 9.0f, 21.6769f, 8.9656f, 22.0f, 8.9f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.4545f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(16.1f)
                curveTo(16.0344f, 3.3231f, 16.0f, 3.6575f, 16.0f, 4.0f)
                curveTo(16.0f, 6.7614f, 18.2386f, 9.0f, 21.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_chat-unread-fill`!!
    }

private var `_chat-unread-fill`: ImageVector? = null
