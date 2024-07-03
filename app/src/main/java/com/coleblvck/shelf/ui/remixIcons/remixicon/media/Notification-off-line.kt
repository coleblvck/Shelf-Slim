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

public val MediaGroup.`Notification-off-line`: ImageVector
    get() {
        if (`_notification-off-line` != null) {
            return `_notification-off-line`!!
        }
        `_notification-off-line` = Builder(name = "Notification-off-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5859f, 20.0f)
                horizontalLineTo(4.0002f)
                curveTo(3.724f, 20.0f, 3.5002f, 19.7762f, 3.5002f, 19.5f)
                curveTo(3.5002f, 19.3918f, 3.5352f, 19.2866f, 3.6002f, 19.2f)
                lineTo(4.0002f, 18.6667f)
                verticalLineTo(10.0f)
                curveTo(4.0002f, 8.6702f, 4.3246f, 7.4162f, 4.8987f, 6.3128f)
                lineTo(1.3936f, 2.8077f)
                lineTo(2.8078f, 1.3934f)
                lineTo(22.6068f, 21.1924f)
                lineTo(21.1925f, 22.6066f)
                lineTo(18.5859f, 20.0f)
                close()
                moveTo(6.4078f, 7.8218f)
                curveTo(6.1446f, 8.4971f, 6.0002f, 9.2317f, 6.0002f, 10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.5859f)
                lineTo(6.4078f, 7.8218f)
                close()
                moveTo(20.0002f, 15.7858f)
                lineTo(18.0002f, 13.7858f)
                verticalLineTo(10.0f)
                curveTo(18.0002f, 6.6863f, 15.3139f, 4.0f, 12.0002f, 4.0f)
                curveTo(10.9117f, 4.0f, 9.891f, 4.2899f, 9.0109f, 4.7965f)
                lineTo(7.5592f, 3.3449f)
                curveTo(8.8297f, 2.4954f, 10.3571f, 2.0f, 12.0002f, 2.0f)
                curveTo(16.4184f, 2.0f, 20.0002f, 5.5818f, 20.0002f, 10.0f)
                verticalLineTo(15.7858f)
                close()
                moveTo(9.5002f, 21.0f)
                horizontalLineTo(14.5002f)
                curveTo(14.5002f, 22.3807f, 13.3809f, 23.5f, 12.0002f, 23.5f)
                curveTo(10.6194f, 23.5f, 9.5002f, 22.3807f, 9.5002f, 21.0f)
                close()
            }
        }
        .build()
        return `_notification-off-line`!!
    }

private var `_notification-off-line`: ImageVector? = null
