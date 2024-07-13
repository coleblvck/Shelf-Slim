package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Ruler-line`: ImageVector
    get() {
        if (`_ruler-line` != null) {
            return `_ruler-line`!!
        }
        `_ruler-line` = Builder(name = "Ruler-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3432f, 14.728f)
                lineTo(3.5148f, 17.5565f)
                lineTo(7.0503f, 21.092f)
                lineTo(20.4854f, 7.657f)
                lineTo(16.9498f, 4.1214f)
                lineTo(14.8285f, 6.2428f)
                lineTo(16.2427f, 7.657f)
                lineTo(14.8285f, 9.0712f)
                lineTo(13.4143f, 7.657f)
                lineTo(11.293f, 9.7783f)
                lineTo(13.4143f, 11.8996f)
                lineTo(12.0001f, 13.3138f)
                lineTo(9.8788f, 11.1925f)
                lineTo(7.7574f, 13.3138f)
                lineTo(9.1716f, 14.728f)
                lineTo(7.7574f, 16.1422f)
                lineTo(6.3432f, 14.728f)
                close()
                moveTo(17.6569f, 2.0001f)
                lineTo(22.6067f, 6.9499f)
                curveTo(22.9972f, 7.3404f, 22.9972f, 7.9735f, 22.6067f, 8.3641f)
                lineTo(7.7574f, 23.2133f)
                curveTo(7.3669f, 23.6038f, 6.7337f, 23.6038f, 6.3432f, 23.2133f)
                lineTo(1.3935f, 18.2636f)
                curveTo(1.0029f, 17.873f, 1.0029f, 17.2399f, 1.3935f, 16.8494f)
                lineTo(16.2427f, 2.0001f)
                curveTo(16.6332f, 1.6096f, 17.2664f, 1.6096f, 17.6569f, 2.0001f)
                close()
            }
        }
        .build()
        return `_ruler-line`!!
    }

private var `_ruler-line`: ImageVector? = null
