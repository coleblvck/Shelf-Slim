package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Notification-3-line`: ImageVector
    get() {
        if (`_notification-3-line` != null) {
            return `_notification-3-line`!!
        }
        `_notification-3-line` = Builder(name = "Notification-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 6.6863f, 15.3137f, 4.0f, 12.0f, 4.0f)
                curveTo(8.6863f, 4.0f, 6.0f, 6.6863f, 6.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_notification-3-line`!!
    }

private var `_notification-3-line`: ImageVector? = null