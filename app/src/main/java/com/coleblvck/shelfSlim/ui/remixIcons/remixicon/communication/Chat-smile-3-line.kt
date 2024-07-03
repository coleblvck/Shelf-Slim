package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Chat-smile-3-line`: ImageVector
    get() {
        if (`_chat-smile-3-line` != null) {
            return `_chat-smile-3-line`!!
        }
        `_chat-smile-3-line` = Builder(name = "Chat-smile-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(2.0f)
                lineTo(4.9289f, 19.0711f)
                curveTo(3.1193f, 17.2614f, 2.0f, 14.7614f, 2.0f, 12.0f)
                close()
                moveTo(6.8284f, 20.0f)
                horizontalLineTo(12.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 14.1524f, 4.8512f, 16.1649f, 6.3432f, 17.6569f)
                lineTo(7.7574f, 19.0711f)
                lineTo(6.8284f, 20.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 15.2091f, 14.2091f, 17.0f, 12.0f, 17.0f)
                curveTo(9.7909f, 17.0f, 8.0f, 15.2091f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_chat-smile-3-line`!!
    }

private var `_chat-smile-3-line`: ImageVector? = null
