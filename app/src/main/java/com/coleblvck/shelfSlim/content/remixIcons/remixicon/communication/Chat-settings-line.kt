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

public val CommunicationGroup.`Chat-settings-line`: ImageVector
    get() {
        if (`_chat-settings-line` != null) {
            return `_chat-settings-line`!!
        }
        `_chat-settings-line` = Builder(name = "Chat-settings-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.3851f)
                lineTo(5.7628f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.4545f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(14.145f, 19.071f)
                curveTo(14.0505f, 18.7301f, 14.0f, 18.371f, 14.0f, 18.0f)
                curveTo(14.0f, 17.629f, 14.0505f, 17.2699f, 14.145f, 16.929f)
                lineTo(13.1699f, 16.366f)
                lineTo(14.1699f, 14.634f)
                lineTo(15.1459f, 15.1975f)
                curveTo(15.6475f, 14.6867f, 16.2851f, 14.31f, 17.0f, 14.126f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.126f)
                curveTo(19.7149f, 14.31f, 20.3525f, 14.6867f, 20.8541f, 15.1975f)
                lineTo(21.8301f, 14.634f)
                lineTo(22.8301f, 16.366f)
                lineTo(21.855f, 16.929f)
                curveTo(21.9495f, 17.2699f, 22.0f, 17.629f, 22.0f, 18.0f)
                curveTo(22.0f, 18.371f, 21.9495f, 18.7301f, 21.855f, 19.071f)
                lineTo(22.8301f, 19.634f)
                lineTo(21.8301f, 21.366f)
                lineTo(20.8541f, 20.8025f)
                curveTo(20.3525f, 21.3133f, 19.7149f, 21.69f, 19.0f, 21.874f)
                verticalLineTo(23.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.874f)
                curveTo(16.2851f, 21.69f, 15.6475f, 21.3133f, 15.1459f, 20.8025f)
                lineTo(14.1699f, 21.366f)
                lineTo(13.1699f, 19.634f)
                lineTo(14.145f, 19.071f)
                close()
                moveTo(18.0f, 20.0f)
                curveTo(19.1046f, 20.0f, 20.0f, 19.1046f, 20.0f, 18.0f)
                curveTo(20.0f, 16.8954f, 19.1046f, 16.0f, 18.0f, 16.0f)
                curveTo(16.8954f, 16.0f, 16.0f, 16.8954f, 16.0f, 18.0f)
                curveTo(16.0f, 19.1046f, 16.8954f, 20.0f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_chat-settings-line`!!
    }

private var `_chat-settings-line`: ImageVector? = null
