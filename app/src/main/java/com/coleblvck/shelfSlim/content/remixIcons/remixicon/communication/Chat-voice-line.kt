package com.coleblvck.shelfSlim.content.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Chat-voice-line`: ImageVector
    get() {
        if (`_chat-voice-line` != null) {
            return `_chat-voice-line`!!
        }
        `_chat-voice-line` = Builder(name = "Chat-voice-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(11.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_chat-voice-line`!!
    }

private var `_chat-voice-line`: ImageVector? = null
