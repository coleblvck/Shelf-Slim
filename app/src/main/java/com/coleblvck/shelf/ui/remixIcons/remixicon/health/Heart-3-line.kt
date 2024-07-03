package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Heart-3-line`: ImageVector
    get() {
        if (`_heart-3-line` != null) {
            return `_heart-3-line`!!
        }
        `_heart-3-line` = Builder(name = "Heart-3-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.5376f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 16.0f, 14.5f, 20.0f, 12.0f, 21.5f)
                curveTo(9.5f, 20.0f, 2.0f, 16.0f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
                close()
                moveTo(12.9339f, 18.6038f)
                curveTo(13.8155f, 18.0485f, 14.61f, 17.4955f, 15.3549f, 16.9029f)
                curveTo(18.3337f, 14.533f, 20.0f, 11.9435f, 20.0f, 9.0f)
                curveTo(20.0f, 6.6408f, 18.463f, 5.0f, 16.5f, 5.0f)
                curveTo(15.4241f, 5.0f, 14.2593f, 5.5691f, 13.4142f, 6.4142f)
                lineTo(12.0f, 7.8284f)
                lineTo(10.5858f, 6.4142f)
                curveTo(9.7407f, 5.5691f, 8.5759f, 5.0f, 7.5f, 5.0f)
                curveTo(5.5591f, 5.0f, 4.0f, 6.6565f, 4.0f, 9.0f)
                curveTo(4.0f, 11.9435f, 5.6663f, 14.533f, 8.6451f, 16.9029f)
                curveTo(9.39f, 17.4955f, 10.1845f, 18.0485f, 11.0661f, 18.6038f)
                curveTo(11.3646f, 18.7919f, 11.6611f, 18.9729f, 12.0f, 19.1752f)
                curveTo(12.3389f, 18.9729f, 12.6354f, 18.7919f, 12.9339f, 18.6038f)
                close()
            }
        }
        .build()
        return `_heart-3-line`!!
    }

private var `_heart-3-line`: ImageVector? = null
