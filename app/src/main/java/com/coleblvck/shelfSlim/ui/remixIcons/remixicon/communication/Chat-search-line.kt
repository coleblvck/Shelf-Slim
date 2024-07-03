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

public val CommunicationGroup.`Chat-search-line`: ImageVector
    get() {
        if (`_chat-search-line` != null) {
            return `_chat-search-line`!!
        }
        `_chat-search-line` = Builder(name = "Chat-search-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7628f, 17.0f)
                horizontalLineTo(13.083f)
                curveTo(13.0284f, 17.3252f, 13.0f, 17.6593f, 13.0f, 18.0f)
                curveTo(13.0f, 18.3407f, 13.0284f, 18.6748f, 13.083f, 19.0f)
                horizontalLineTo(6.4545f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.8027f)
                curveTo(21.3926f, 12.4513f, 20.7179f, 12.2034f, 20.0f, 12.083f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.3851f)
                lineTo(5.7628f, 17.0f)
                close()
                moveTo(23.9497f, 21.5355f)
                lineTo(22.4462f, 20.032f)
                curveTo(22.7981f, 19.4365f, 23.0f, 18.7418f, 23.0f, 18.0f)
                curveTo(23.0f, 15.7909f, 21.2091f, 14.0f, 19.0f, 14.0f)
                curveTo(16.7909f, 14.0f, 15.0f, 15.7909f, 15.0f, 18.0f)
                curveTo(15.0f, 20.2091f, 16.7909f, 22.0f, 19.0f, 22.0f)
                curveTo(19.7418f, 22.0f, 20.4365f, 21.7981f, 21.032f, 21.4462f)
                lineTo(22.5355f, 22.9497f)
                lineTo(23.9497f, 21.5355f)
                close()
                moveTo(21.0f, 18.0f)
                curveTo(21.0f, 19.1046f, 20.1046f, 20.0f, 19.0f, 20.0f)
                curveTo(17.8954f, 20.0f, 17.0f, 19.1046f, 17.0f, 18.0f)
                curveTo(17.0f, 16.8954f, 17.8954f, 16.0f, 19.0f, 16.0f)
                curveTo(20.1046f, 16.0f, 21.0f, 16.8954f, 21.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_chat-search-line`!!
    }

private var `_chat-search-line`: ImageVector? = null
