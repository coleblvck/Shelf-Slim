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

public val CommunicationGroup.`Chat-private-line`: ImageVector
    get() {
        if (`_chat-private-line` != null) {
            return `_chat-private-line`!!
        }
        `_chat-private-line` = Builder(name = "Chat-private-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.298f, 22.0f, 8.6952f, 21.5748f, 7.2923f, 20.8248f)
                lineTo(2.0f, 22.0f)
                lineTo(3.1763f, 16.7097f)
                curveTo(2.4256f, 15.3063f, 2.0f, 13.7028f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 13.3347f, 4.3256f, 14.6181f, 4.9399f, 15.7664f)
                lineTo(5.2895f, 16.4201f)
                lineTo(4.6344f, 19.3663f)
                lineTo(7.5819f, 18.7118f)
                lineTo(8.2352f, 19.061f)
                curveTo(9.3832f, 19.6747f, 10.6659f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(13.6569f, 7.0f, 15.0f, 8.3432f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.3432f, 10.3431f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(11.4477f, 9.0f, 11.0f, 9.45f, 11.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.4477f, 12.5523f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_chat-private-line`!!
    }

private var `_chat-private-line`: ImageVector? = null
