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

public val CommunicationGroup.`Chat-delete-fill`: ImageVector
    get() {
        if (`_chat-delete-fill` != null) {
            return `_chat-delete-fill`!!
        }
        `_chat-delete-fill` = Builder(name = "Chat-delete-fill", defaultWidth = 24.0.dp,
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
                moveTo(13.4142f, 11.0f)
                lineTo(15.8891f, 8.5251f)
                lineTo(14.4749f, 7.1109f)
                lineTo(12.0f, 9.5858f)
                lineTo(9.5251f, 7.1109f)
                lineTo(8.1109f, 8.5251f)
                lineTo(10.5858f, 11.0f)
                lineTo(8.1109f, 13.4749f)
                lineTo(9.5251f, 14.8891f)
                lineTo(12.0f, 12.4142f)
                lineTo(14.4749f, 14.8891f)
                lineTo(15.8891f, 13.4749f)
                lineTo(13.4142f, 11.0f)
                close()
            }
        }
        .build()
        return `_chat-delete-fill`!!
    }

private var `_chat-delete-fill`: ImageVector? = null
