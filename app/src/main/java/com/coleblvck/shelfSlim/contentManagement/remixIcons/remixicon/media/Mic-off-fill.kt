package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Mic-off-fill`: ImageVector
    get() {
        if (`_mic-off-fill` != null) {
            return `_mic-off-fill`!!
        }
        `_mic-off-fill` = Builder(name = "Mic-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4249f, 17.839f)
                curveTo(15.3929f, 18.4228f, 14.2341f, 18.8087f, 13.0002f, 18.9451f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0002f)
                verticalLineTo(18.9451f)
                curveTo(6.8285f, 18.4839f, 3.5162f, 15.1716f, 3.0551f, 11.0f)
                horizontalLineTo(5.0711f)
                curveTo(5.5563f, 14.3923f, 8.4737f, 17.0f, 12.0002f, 17.0f)
                curveTo(13.0503f, 17.0f, 14.0464f, 16.7688f, 14.9404f, 16.3544f)
                lineTo(13.3902f, 14.8042f)
                curveTo(12.9489f, 14.9317f, 12.4825f, 15.0f, 12.0002f, 15.0f)
                curveTo(9.2387f, 15.0f, 7.0002f, 12.7614f, 7.0002f, 10.0f)
                verticalLineTo(8.4142f)
                lineTo(1.3936f, 2.8076f)
                lineTo(2.8078f, 1.3934f)
                lineTo(22.6068f, 21.1924f)
                lineTo(21.1925f, 22.6066f)
                lineTo(16.4249f, 17.839f)
                close()
                moveTo(19.3747f, 15.1604f)
                lineTo(17.9323f, 13.7179f)
                curveTo(18.4407f, 12.9084f, 18.788f, 11.9874f, 18.9293f, 11.0f)
                horizontalLineTo(20.9452f)
                curveTo(20.7754f, 12.5366f, 20.2187f, 13.9565f, 19.3747f, 15.1604f)
                close()
                moveTo(16.4658f, 12.2514f)
                lineTo(7.6858f, 3.4714f)
                curveTo(8.5543f, 1.9927f, 10.1613f, 1.0f, 12.0002f, 1.0f)
                curveTo(14.7616f, 1.0f, 17.0002f, 3.2386f, 17.0002f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(17.0002f, 10.8099f, 16.8076f, 11.5748f, 16.4658f, 12.2514f)
                close()
            }
        }
        .build()
        return `_mic-off-fill`!!
    }

private var `_mic-off-fill`: ImageVector? = null
