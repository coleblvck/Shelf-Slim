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

public val CommunicationGroup.`Chat-smile-line`: ImageVector
    get() {
        if (`_chat-smile-line` != null) {
            return `_chat-smile-line`!!
        }
        `_chat-smile-line` = Builder(name = "Chat-smile-line", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(5.7628f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.3851f)
                lineTo(5.7628f, 17.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 12.7614f, 14.7614f, 15.0f, 12.0f, 15.0f)
                curveTo(9.2386f, 15.0f, 7.0f, 12.7614f, 7.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_chat-smile-line`!!
    }

private var `_chat-smile-line`: ImageVector? = null
