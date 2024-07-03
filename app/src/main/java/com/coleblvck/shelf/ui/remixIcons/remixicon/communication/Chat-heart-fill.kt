package com.coleblvck.shelf.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Chat-heart-fill`: ImageVector
    get() {
        if (`_chat-heart-fill` != null) {
            return `_chat-heart-fill`!!
        }
        `_chat-heart-fill` = Builder(name = "Chat-heart-fill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(12.0178f, 14.6997f)
                lineTo(15.3765f, 11.341f)
                curveTo(16.2552f, 10.4623f, 16.2552f, 9.0377f, 15.3765f, 8.159f)
                curveTo(14.4978f, 7.2803f, 13.0732f, 7.2803f, 12.1945f, 8.159f)
                lineTo(12.0178f, 8.3358f)
                lineTo(11.841f, 8.159f)
                curveTo(10.9623f, 7.2803f, 9.5377f, 7.2803f, 8.659f, 8.159f)
                curveTo(7.7803f, 9.0377f, 7.7803f, 10.4623f, 8.659f, 11.341f)
                lineTo(12.0178f, 14.6997f)
                close()
            }
        }
        .build()
        return `_chat-heart-fill`!!
    }

private var `_chat-heart-fill`: ImageVector? = null
