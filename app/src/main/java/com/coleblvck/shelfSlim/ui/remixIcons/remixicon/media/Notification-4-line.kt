package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Notification-4-line`: ImageVector
    get() {
        if (`_notification-4-line` != null) {
            return `_notification-4-line`!!
        }
        `_notification-4-line` = Builder(name = "Notification-4-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveTo(18.0f, 6.6863f, 15.3137f, 4.0f, 12.0f, 4.0f)
                curveTo(8.6863f, 4.0f, 6.0f, 6.6863f, 6.0f, 10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(20.0f, 18.6667f)
                lineTo(20.4f, 19.2f)
                curveTo(20.5657f, 19.4209f, 20.5209f, 19.7343f, 20.3f, 19.9f)
                curveTo(20.2135f, 19.9649f, 20.1082f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7239f, 20.0f, 3.5f, 19.7761f, 3.5f, 19.5f)
                curveTo(3.5f, 19.3918f, 3.5351f, 19.2865f, 3.6f, 19.2f)
                lineTo(4.0f, 18.6667f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                verticalLineTo(18.6667f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.3807f, 13.3807f, 23.5f, 12.0f, 23.5f)
                curveTo(10.6193f, 23.5f, 9.5f, 22.3807f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return `_notification-4-line`!!
    }

private var `_notification-4-line`: ImageVector? = null
