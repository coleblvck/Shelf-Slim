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

public val CommunicationGroup.`Message-3-fill`: ImageVector
    get() {
        if (`_message-3-fill` != null) {
            return `_message-3-fill`!!
        }
        `_message-3-fill` = Builder(name = "Message-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.9937f)
                curveTo(2.0f, 5.6835f, 4.6765f, 3.0f, 8.0007f, 3.0f)
                horizontalLineTo(15.9993f)
                curveTo(19.3134f, 3.0f, 22.0f, 5.6948f, 22.0f, 8.9937f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0007f)
                curveTo(4.6866f, 21.0f, 2.0f, 18.3052f, 2.0f, 15.0063f)
                verticalLineTo(8.9937f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_message-3-fill`!!
    }

private var `_message-3-fill`: ImageVector? = null
