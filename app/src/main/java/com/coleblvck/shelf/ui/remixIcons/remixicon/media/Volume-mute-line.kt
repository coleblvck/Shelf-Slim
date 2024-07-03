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

public val MediaGroup.`Volume-mute-line`: ImageVector
    get() {
        if (`_volume-mute-line` != null) {
            return `_volume-mute-line`!!
        }
        `_volume-mute-line` = Builder(name = "Volume-mute-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.2205f)
                lineTo(6.6028f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.6028f)
                lineTo(10.0f, 16.7795f)
                verticalLineTo(7.2205f)
                close()
                moveTo(5.8889f, 16.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 16.0f, 1.0f, 15.5523f, 1.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 8.4477f, 1.4477f, 8.0f, 2.0f, 8.0f)
                horizontalLineTo(5.8889f)
                lineTo(11.1834f, 3.6681f)
                curveTo(11.3971f, 3.4933f, 11.7121f, 3.5248f, 11.887f, 3.7385f)
                curveTo(11.9601f, 3.8278f, 12.0f, 3.9397f, 12.0f, 4.0551f)
                verticalLineTo(19.9449f)
                curveTo(12.0f, 20.221f, 11.7761f, 20.4449f, 11.5f, 20.4449f)
                curveTo(11.3846f, 20.4449f, 11.2727f, 20.405f, 11.1834f, 20.3319f)
                lineTo(5.8889f, 16.0f)
                close()
                moveTo(20.4142f, 12.0f)
                lineTo(23.9497f, 15.5355f)
                lineTo(22.5355f, 16.9498f)
                lineTo(19.0f, 13.4142f)
                lineTo(15.4645f, 16.9498f)
                lineTo(14.0503f, 15.5355f)
                lineTo(17.5858f, 12.0f)
                lineTo(14.0503f, 8.4645f)
                lineTo(15.4645f, 7.0503f)
                lineTo(19.0f, 10.5858f)
                lineTo(22.5355f, 7.0503f)
                lineTo(23.9497f, 8.4645f)
                lineTo(20.4142f, 12.0f)
                close()
            }
        }
        .build()
        return `_volume-mute-line`!!
    }

private var `_volume-mute-line`: ImageVector? = null
