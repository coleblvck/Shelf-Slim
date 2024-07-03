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

public val CommunicationGroup.`Chat-quote-fill`: ImageVector
    get() {
        if (`_chat-quote-fill` != null) {
            return `_chat-quote-fill`!!
        }
        `_chat-quote-fill` = Builder(name = "Chat-quote-fill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(10.5153f, 7.4116f)
                curveTo(8.7282f, 8.1868f, 7.5f, 9.7554f, 7.5f, 11.5052f)
                curveTo(7.5f, 12.5f, 7.7766f, 13.1137f, 8.2917f, 13.6605f)
                curveTo(8.616f, 14.0048f, 9.1291f, 14.25f, 9.6656f, 14.25f)
                curveTo(10.6321f, 14.25f, 11.4156f, 13.4665f, 11.4156f, 12.5f)
                curveTo(11.4156f, 11.5795f, 10.7045f, 10.8389f, 9.8024f, 10.7553f)
                curveTo(9.6411f, 10.7403f, 9.4783f, 10.7431f, 9.3232f, 10.7645f)
                lineTo(9.3234f, 10.6729f)
                curveTo(9.3287f, 10.2322f, 9.4223f, 8.9333f, 10.9616f, 8.1004f)
                lineTo(10.5153f, 7.4116f)
                close()
                moveTo(15.5153f, 7.4116f)
                curveTo(13.7283f, 8.1868f, 12.5f, 9.7554f, 12.5f, 11.5052f)
                curveTo(12.5f, 12.5f, 12.7766f, 13.1137f, 13.2917f, 13.6605f)
                curveTo(13.616f, 14.0048f, 14.1291f, 14.25f, 14.6656f, 14.25f)
                curveTo(15.6321f, 14.25f, 16.4156f, 13.4665f, 16.4156f, 12.5f)
                curveTo(16.4156f, 11.5795f, 15.7045f, 10.8389f, 14.8024f, 10.7553f)
                curveTo(14.6411f, 10.7403f, 14.4783f, 10.7431f, 14.3232f, 10.7645f)
                lineTo(14.3234f, 10.6729f)
                curveTo(14.3287f, 10.2322f, 14.4223f, 8.9333f, 15.9616f, 8.1004f)
                lineTo(15.5153f, 7.4116f)
                close()
            }
        }
        .build()
        return `_chat-quote-fill`!!
    }

private var `_chat-quote-fill`: ImageVector? = null
