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

public val CommunicationGroup.`Chat-3-line`: ImageVector
    get() {
        if (`_chat-3-line` != null) {
            return `_chat-3-line`!!
        }
        `_chat-3-line` = Builder(name = "Chat-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2912f, 20.8242f)
                lineTo(2.0f, 22.0f)
                lineTo(3.1758f, 16.7088f)
                curveTo(2.4254f, 15.3056f, 2.0f, 13.7025f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(10.2975f, 22.0f, 8.6944f, 21.5746f, 7.2912f, 20.8242f)
                close()
                moveTo(7.5807f, 18.711f)
                lineTo(8.2343f, 19.0605f)
                curveTo(9.3825f, 19.6745f, 10.6655f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 13.3345f, 4.3255f, 14.6175f, 4.9395f, 15.7657f)
                lineTo(5.289f, 16.4192f)
                lineTo(4.6342f, 19.3658f)
                lineTo(7.5807f, 18.711f)
                close()
            }
        }
        .build()
        return `_chat-3-line`!!
    }

private var `_chat-3-line`: ImageVector? = null
