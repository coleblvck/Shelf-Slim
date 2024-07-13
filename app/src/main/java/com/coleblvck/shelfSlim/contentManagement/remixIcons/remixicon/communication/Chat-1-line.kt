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

public val CommunicationGroup.`Chat-1-line`: ImageVector
    get() {
        if (`_chat-1-line` != null) {
            return `_chat-1-line`!!
        }
        `_chat-1-line` = Builder(name = "Chat-1-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(18.4183f, 3.0f, 22.0f, 6.5817f, 22.0f, 11.0f)
                curveTo(22.0f, 15.4183f, 18.4183f, 19.0f, 14.0f, 19.0f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 20.5f, 2.0f, 17.5f, 2.0f, 11.0f)
                curveTo(2.0f, 6.5817f, 5.5817f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(17.3137f, 17.0f, 20.0f, 14.3137f, 20.0f, 11.0f)
                curveTo(20.0f, 7.6863f, 17.3137f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(6.6863f, 5.0f, 4.0f, 7.6863f, 4.0f, 11.0f)
                curveTo(4.0f, 14.61f, 6.4621f, 16.9656f, 12.0f, 19.4798f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_chat-1-line`!!
    }

private var `_chat-1-line`: ImageVector? = null
