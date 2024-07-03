package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Notification-badge-fill`: ImageVector
    get() {
        if (`_notification-badge-fill` != null) {
            return `_notification-badge-fill`!!
        }
        `_notification-badge-fill` = Builder(name = "Notification-badge-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3414f, 4.0f)
                curveTo(13.1203f, 4.6256f, 13.0f, 5.2987f, 13.0f, 6.0f)
                curveTo(13.0f, 9.3137f, 15.6863f, 12.0f, 19.0f, 12.0f)
                curveTo(19.7013f, 12.0f, 20.3744f, 11.8797f, 21.0f, 11.6586f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.4477f, 3.4477f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(13.3414f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(16.7909f, 10.0f, 15.0f, 8.2091f, 15.0f, 6.0f)
                curveTo(15.0f, 3.7909f, 16.7909f, 2.0f, 19.0f, 2.0f)
                curveTo(21.2091f, 2.0f, 23.0f, 3.7909f, 23.0f, 6.0f)
                curveTo(23.0f, 8.2091f, 21.2091f, 10.0f, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_notification-badge-fill`!!
    }

private var `_notification-badge-fill`: ImageVector? = null
