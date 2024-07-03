package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Notification-2-line`: ImageVector
    get() {
        if (`_notification-2-line` != null) {
            return `_notification-2-line`!!
        }
        `_notification-2-line` = Builder(name = "Notification-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0314f)
                curveTo(3.0f, 6.0435f, 7.0294f, 2.0f, 12.0f, 2.0f)
                curveTo(16.9706f, 2.0f, 21.0f, 6.0435f, 21.0f, 11.0314f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0314f)
                curveTo(19.0f, 7.1481f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.1481f, 5.0f, 11.0314f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.3807f, 13.3807f, 23.5f, 12.0f, 23.5f)
                curveTo(10.6193f, 23.5f, 9.5f, 22.3807f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return `_notification-2-line`!!
    }

private var `_notification-2-line`: ImageVector? = null
