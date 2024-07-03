package com.coleblvck.shelf.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Chat-thread-line`: ImageVector
    get() {
        if (`_chat-thread-line` != null) {
            return `_chat-thread-line`!!
        }
        `_chat-thread-line` = Builder(name = "Chat-thread-line", defaultWidth = 24.0.dp,
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
                moveTo(8.2343f, 19.0605f)
                lineTo(7.5807f, 18.711f)
                lineTo(4.6342f, 19.3658f)
                lineTo(5.289f, 16.4192f)
                lineTo(4.9395f, 15.7657f)
                curveTo(4.3255f, 14.6175f, 4.0f, 13.3345f, 4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(10.6655f, 20.0f, 9.3825f, 19.6745f, 8.2343f, 19.0605f)
                close()
                moveTo(15.4487f, 7.0f)
                horizontalLineTo(13.4411f)
                lineTo(13.2661f, 9.0002f)
                horizontalLineTo(11.2584f)
                lineTo(11.4334f, 7.0f)
                horizontalLineTo(9.4258f)
                lineTo(9.2508f, 9.0002f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0002f)
                horizontalLineTo(9.0758f)
                lineTo(8.9008f, 13.0002f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0002f)
                horizontalLineTo(8.7258f)
                lineTo(8.5509f, 17.0f)
                horizontalLineTo(10.5585f)
                lineTo(10.7335f, 15.0002f)
                horizontalLineTo(12.7411f)
                lineTo(12.5662f, 17.0f)
                horizontalLineTo(14.5738f)
                lineTo(14.7488f, 15.0002f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0002f)
                horizontalLineTo(14.9237f)
                lineTo(15.0987f, 11.0002f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0002f)
                horizontalLineTo(15.2737f)
                lineTo(15.4487f, 7.0f)
                close()
                moveTo(11.0834f, 11.0002f)
                horizontalLineTo(13.0911f)
                lineTo(12.9161f, 13.0002f)
                horizontalLineTo(10.9085f)
                lineTo(11.0834f, 11.0002f)
                close()
            }
        }
        .build()
        return `_chat-thread-line`!!
    }

private var `_chat-thread-line`: ImageVector? = null
