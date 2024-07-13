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

public val CommunicationGroup.`Chat-quote-line`: ImageVector
    get() {
        if (`_chat-quote-line` != null) {
            return `_chat-quote-line`!!
        }
        `_chat-quote-line` = Builder(name = "Chat-quote-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.5153f, 7.4116f)
                lineTo(10.9616f, 8.1004f)
                curveTo(9.294f, 9.0027f, 9.3232f, 10.4519f, 9.3232f, 10.7645f)
                curveTo(9.4783f, 10.7431f, 9.6411f, 10.7403f, 9.8024f, 10.7553f)
                curveTo(10.7045f, 10.8389f, 11.4156f, 11.5795f, 11.4156f, 12.5f)
                curveTo(11.4156f, 13.4665f, 10.6321f, 14.25f, 9.6656f, 14.25f)
                curveTo(9.1291f, 14.25f, 8.616f, 14.0048f, 8.2917f, 13.6605f)
                curveTo(7.7766f, 13.1137f, 7.5f, 12.5f, 7.5f, 11.5052f)
                curveTo(7.5f, 9.7554f, 8.7282f, 8.1868f, 10.5153f, 7.4116f)
                close()
                moveTo(15.5153f, 7.4116f)
                lineTo(15.9616f, 8.1004f)
                curveTo(14.294f, 9.0027f, 14.3232f, 10.4519f, 14.3232f, 10.7645f)
                curveTo(14.4783f, 10.7431f, 14.6411f, 10.7403f, 14.8024f, 10.7553f)
                curveTo(15.7045f, 10.8389f, 16.4156f, 11.5795f, 16.4156f, 12.5f)
                curveTo(16.4156f, 13.4665f, 15.6321f, 14.25f, 14.6656f, 14.25f)
                curveTo(14.1291f, 14.25f, 13.616f, 14.0048f, 13.2917f, 13.6605f)
                curveTo(12.7766f, 13.1137f, 12.5f, 12.5f, 12.5f, 11.5052f)
                curveTo(12.5f, 9.7554f, 13.7283f, 8.1868f, 15.5153f, 7.4116f)
                close()
            }
        }
        .build()
        return `_chat-quote-line`!!
    }

private var `_chat-quote-line`: ImageVector? = null
