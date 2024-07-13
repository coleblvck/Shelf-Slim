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

public val CommunicationGroup.`Chat-thread-fill`: ImageVector
    get() {
        if (`_chat-thread-fill` != null) {
            return `_chat-thread-fill`!!
        }
        `_chat-thread-fill` = Builder(name = "Chat-thread-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineTo(7.2912f, 20.8242f)
                curveTo(8.6944f, 21.5746f, 10.2975f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.7025f, 2.4254f, 15.3056f, 3.1758f, 16.7088f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(15.4487f, 7.0f)
                lineTo(15.2737f, 9.0002f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0002f)
                horizontalLineTo(15.0987f)
                lineTo(14.9237f, 13.0002f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0002f)
                horizontalLineTo(14.7488f)
                lineTo(14.5738f, 17.0f)
                horizontalLineTo(12.5662f)
                lineTo(12.7411f, 15.0002f)
                horizontalLineTo(10.7335f)
                lineTo(10.5585f, 17.0f)
                horizontalLineTo(8.5509f)
                lineTo(8.7258f, 15.0002f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0002f)
                horizontalLineTo(8.9008f)
                lineTo(9.0758f, 11.0002f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0002f)
                horizontalLineTo(9.2508f)
                lineTo(9.4258f, 7.0f)
                horizontalLineTo(11.4334f)
                lineTo(11.2584f, 9.0002f)
                horizontalLineTo(13.2661f)
                lineTo(13.4411f, 7.0f)
                horizontalLineTo(15.4487f)
                close()
                moveTo(11.0834f, 11.0002f)
                lineTo(10.9085f, 13.0002f)
                horizontalLineTo(12.9161f)
                lineTo(13.0911f, 11.0002f)
                horizontalLineTo(11.0834f)
                close()
            }
        }
        .build()
        return `_chat-thread-fill`!!
    }

private var `_chat-thread-fill`: ImageVector? = null
