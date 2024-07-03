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

public val CommunicationGroup.`Chat-follow-up-line`: ImageVector
    get() {
        if (`_chat-follow-up-line` != null) {
            return `_chat-follow-up-line`!!
        }
        `_chat-follow-up-line` = Builder(name = "Chat-follow-up-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                lineTo(5.7633f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineTo(9.999f)
                lineTo(13.0f, 10.0f)
                verticalLineTo(12.0f)
                lineTo(11.0f, 11.999f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.999f)
                lineTo(7.0f, 12.0f)
                verticalLineTo(10.0f)
                lineTo(9.0f, 9.999f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_chat-follow-up-line`!!
    }

private var `_chat-follow-up-line`: ImageVector? = null
