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

public val CommunicationGroup.`Chat-off-fill`: ImageVector
    get() {
        if (`_chat-off-fill` != null) {
            return `_chat-off-fill`!!
        }
        `_chat-off-fill` = Builder(name = "Chat-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8078f, 1.3934f)
                lineTo(22.6068f, 21.1924f)
                lineTo(21.1925f, 22.6066f)
                lineTo(17.5846f, 18.9994f)
                lineTo(6.4552f, 19.0f)
                lineTo(2.0002f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0002f, 3.8307f, 2.0422f, 3.6712f, 2.1165f, 3.5314f)
                lineTo(1.3936f, 2.8076f)
                lineTo(2.8078f, 1.3934f)
                close()
                moveTo(21.0002f, 3.0f)
                curveTo(21.5524f, 3.0f, 22.0002f, 3.4477f, 22.0002f, 4.0f)
                verticalLineTo(17.785f)
                lineTo(7.2142f, 3.0f)
                horizontalLineTo(21.0002f)
                close()
            }
        }
        .build()
        return `_chat-off-fill`!!
    }

private var `_chat-off-fill`: ImageVector? = null
