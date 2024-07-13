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

public val CommunicationGroup.`Chat-smile-fill`: ImageVector
    get() {
        if (`_chat-smile-fill` != null) {
            return `_chat-smile-fill`!!
        }
        `_chat-smile-fill` = Builder(name = "Chat-smile-fill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(7.0f, 10.0f)
                curveTo(7.0f, 12.7614f, 9.2386f, 15.0f, 12.0f, 15.0f)
                curveTo(14.7614f, 15.0f, 17.0f, 12.7614f, 17.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 11.6569f, 13.6569f, 13.0f, 12.0f, 13.0f)
                curveTo(10.3431f, 13.0f, 9.0f, 11.6569f, 9.0f, 10.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_chat-smile-fill`!!
    }

private var `_chat-smile-fill`: ImageVector? = null