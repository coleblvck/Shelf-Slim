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

public val CommunicationGroup.`Chat-1-fill`: ImageVector
    get() {
        if (`_chat-1-fill` != null) {
            return `_chat-1-fill`!!
        }
        `_chat-1-fill` = Builder(name = "Chat-1-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(18.4183f, 3.0f, 22.0f, 6.5817f, 22.0f, 11.0f)
                curveTo(22.0f, 15.4183f, 18.4183f, 19.0f, 14.0f, 19.0f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 20.5f, 2.0f, 17.5f, 2.0f, 11.0f)
                curveTo(2.0f, 6.5817f, 5.5817f, 3.0f, 10.0f, 3.0f)
                close()
            }
        }
        .build()
        return `_chat-1-fill`!!
    }

private var `_chat-1-fill`: ImageVector? = null
