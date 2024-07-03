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

public val MediaGroup.`Volume-up-line`: ImageVector
    get() {
        if (`_volume-up-line` != null) {
            return `_volume-up-line`!!
        }
        `_volume-up-line` = Builder(name = "Volume-up-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6028f, 10.0001f)
                lineTo(10.0f, 7.2206f)
                verticalLineTo(16.7796f)
                lineTo(6.6028f, 14.0001f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0001f)
                horizontalLineTo(6.6028f)
                close()
                moveTo(2.0f, 16.0001f)
                horizontalLineTo(5.8889f)
                lineTo(11.1834f, 20.3319f)
                curveTo(11.2727f, 20.405f, 11.3846f, 20.4449f, 11.5f, 20.4449f)
                curveTo(11.7761f, 20.4449f, 12.0f, 20.2211f, 12.0f, 19.9449f)
                verticalLineTo(4.0552f)
                curveTo(12.0f, 3.9398f, 11.9601f, 3.8279f, 11.887f, 3.7386f)
                curveTo(11.7121f, 3.5248f, 11.3971f, 3.4934f, 11.1834f, 3.6682f)
                lineTo(5.8889f, 8.0001f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 8.0001f, 1.0f, 8.4478f, 1.0f, 9.0001f)
                verticalLineTo(15.0001f)
                curveTo(1.0f, 15.5524f, 1.4477f, 16.0001f, 2.0f, 16.0001f)
                close()
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 15.292f, 21.5539f, 18.2463f, 19.2622f, 20.2622f)
                lineTo(17.8445f, 18.8444f)
                curveTo(19.7758f, 17.1937f, 21.0f, 14.7398f, 21.0f, 12.0f)
                curveTo(21.0f, 9.2602f, 19.7758f, 6.8063f, 17.8445f, 5.1556f)
                lineTo(19.2622f, 3.7378f)
                curveTo(21.5539f, 5.7537f, 23.0f, 8.7079f, 23.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 10.0883f, 17.106f, 8.3855f, 15.7133f, 7.2867f)
                lineTo(14.2842f, 8.7158f)
                curveTo(15.3213f, 9.4385f, 16.0f, 10.64f, 16.0f, 12.0f)
                curveTo(16.0f, 13.36f, 15.3213f, 14.5614f, 14.2842f, 15.2841f)
                lineTo(15.7133f, 16.7132f)
                curveTo(17.106f, 15.6145f, 18.0f, 13.9116f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_volume-up-line`!!
    }

private var `_volume-up-line`: ImageVector? = null
