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

public val MediaGroup.`Volume-off-vibrate-fill`: ImageVector
    get() {
        if (`_volume-off-vibrate-fill` != null) {
            return `_volume-off-vibrate-fill`!!
        }
        `_volume-off-vibrate-fill` = Builder(name = "Volume-off-vibrate-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3891f, 3.1612f)
                lineTo(20.8033f, 4.5754f)
                lineTo(18.3277f, 7.0496f)
                lineTo(20.8033f, 9.5251f)
                lineTo(18.3277f, 11.9993f)
                lineTo(20.8033f, 14.4749f)
                lineTo(18.3284f, 16.9498f)
                lineTo(20.8033f, 19.4246f)
                lineTo(19.3891f, 20.8388f)
                lineTo(15.5f, 16.9498f)
                lineTo(17.9749f, 14.4749f)
                lineTo(15.5f, 12.0f)
                lineTo(17.9749f, 9.5251f)
                lineTo(15.5f, 7.0503f)
                lineTo(19.3891f, 3.1612f)
                close()
                moveTo(13.0f, 19.9449f)
                curveTo(13.0f, 20.221f, 12.7761f, 20.4449f, 12.5f, 20.4449f)
                curveTo(12.3846f, 20.4449f, 12.2727f, 20.405f, 12.1834f, 20.3319f)
                lineTo(6.889f, 15.9991f)
                lineTo(3.0f, 16.0f)
                curveTo(2.4477f, 16.0f, 2.0f, 15.5523f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 8.4477f, 2.4477f, 8.0f, 3.0f, 8.0f)
                lineTo(5.5836f, 7.9976f)
                lineTo(1.8076f, 4.2218f)
                lineTo(3.2218f, 2.8076f)
                lineTo(12.9996f, 12.5856f)
                lineTo(13.0f, 19.9449f)
                close()
                moveTo(12.887f, 3.7385f)
                curveTo(12.9601f, 3.8278f, 13.0f, 3.9397f, 13.0f, 4.0551f)
                verticalLineTo(9.7572f)
                lineTo(9.282f, 6.0402f)
                lineTo(12.1834f, 3.6681f)
                curveTo(12.3971f, 3.4933f, 12.7121f, 3.5248f, 12.887f, 3.7385f)
                close()
            }
        }
        .build()
        return `_volume-off-vibrate-fill`!!
    }

private var `_volume-off-vibrate-fill`: ImageVector? = null
