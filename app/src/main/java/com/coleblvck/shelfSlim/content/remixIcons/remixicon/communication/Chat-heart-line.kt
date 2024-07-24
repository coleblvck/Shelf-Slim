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

public val CommunicationGroup.`Chat-heart-line`: ImageVector
    get() {
        if (`_chat-heart-line` != null) {
            return `_chat-heart-line`!!
        }
        `_chat-heart-line` = Builder(name = "Chat-heart-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4545f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.4545f)
                close()
                moveTo(4.0f, 18.3851f)
                lineTo(5.7628f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.3851f)
                close()
                moveTo(12.0178f, 14.6997f)
                lineTo(8.659f, 11.341f)
                curveTo(7.7803f, 10.4623f, 7.7803f, 9.0377f, 8.659f, 8.159f)
                curveTo(9.5377f, 7.2803f, 10.9623f, 7.2803f, 11.841f, 8.159f)
                lineTo(12.0178f, 8.3358f)
                lineTo(12.1945f, 8.159f)
                curveTo(13.0732f, 7.2803f, 14.4978f, 7.2803f, 15.3765f, 8.159f)
                curveTo(16.2552f, 9.0377f, 16.2552f, 10.4623f, 15.3765f, 11.341f)
                lineTo(12.0178f, 14.6997f)
                close()
            }
        }
        .build()
        return `_chat-heart-line`!!
    }

private var `_chat-heart-line`: ImageVector? = null
