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

public val CommunicationGroup.`Chat-private-fill`: ImageVector
    get() {
        if (`_chat-private-fill` != null) {
            return `_chat-private-fill`!!
        }
        `_chat-private-fill` = Builder(name = "Chat-private-fill", defaultWidth = 24.0.dp,
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
                moveTo(12.0f, 7.0f)
                curveTo(10.4023f, 7.0f, 9.0f, 8.34f, 9.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.3432f, 13.6569f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(12.4762f, 9.0f, 13.0f, 9.49f, 13.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 9.49f, 11.4872f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return `_chat-private-fill`!!
    }

private var `_chat-private-fill`: ImageVector? = null
