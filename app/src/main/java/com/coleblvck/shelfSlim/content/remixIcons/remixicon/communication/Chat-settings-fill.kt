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

public val CommunicationGroup.`Chat-settings-fill`: ImageVector
    get() {
        if (`_chat-settings-fill` != null) {
            return `_chat-settings-fill`!!
        }
        `_chat-settings-fill` = Builder(name = "Chat-settings-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.145f, 12.071f)
                lineTo(7.1699f, 12.634f)
                lineTo(8.1699f, 14.366f)
                lineTo(9.1459f, 13.8025f)
                curveTo(9.6475f, 14.3133f, 10.2851f, 14.69f, 11.0f, 14.874f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.874f)
                curveTo(13.7149f, 14.69f, 14.3525f, 14.3133f, 14.8541f, 13.8025f)
                lineTo(15.8301f, 14.366f)
                lineTo(16.8301f, 12.634f)
                lineTo(15.855f, 12.071f)
                curveTo(15.9495f, 11.7301f, 16.0f, 11.371f, 16.0f, 11.0f)
                curveTo(16.0f, 10.629f, 15.9495f, 10.2699f, 15.855f, 9.929f)
                lineTo(16.8301f, 9.366f)
                lineTo(15.8301f, 7.634f)
                lineTo(14.8541f, 8.1975f)
                curveTo(14.3525f, 7.6867f, 13.7149f, 7.31f, 13.0f, 7.126f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.126f)
                curveTo(10.2851f, 7.31f, 9.6475f, 7.6867f, 9.1459f, 8.1975f)
                lineTo(8.1699f, 7.634f)
                lineTo(7.1699f, 9.366f)
                lineTo(8.145f, 9.929f)
                curveTo(8.0505f, 10.2699f, 8.0f, 10.629f, 8.0f, 11.0f)
                curveTo(8.0f, 11.371f, 8.0505f, 11.7301f, 8.145f, 12.071f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.8954f, 13.0f, 10.0f, 12.1046f, 10.0f, 11.0f)
                curveTo(10.0f, 9.8954f, 10.8954f, 9.0f, 12.0f, 9.0f)
                curveTo(13.1046f, 9.0f, 14.0f, 9.8954f, 14.0f, 11.0f)
                curveTo(14.0f, 12.1046f, 13.1046f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_chat-settings-fill`!!
    }

private var `_chat-settings-fill`: ImageVector? = null
