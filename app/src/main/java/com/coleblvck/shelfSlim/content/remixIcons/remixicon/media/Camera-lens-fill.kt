package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Camera-lens-fill`: ImageVector
    get() {
        if (`_camera-lens-fill` != null) {
            return `_camera-lens-fill`!!
        }
        `_camera-lens-fill` = Builder(name = "Camera-lens-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8273f, 21.7633f)
                lineTo(14.3094f, 14.0f)
                lineTo(17.8413f, 20.1175f)
                curveTo(16.198f, 21.3021f, 14.1805f, 22.0f, 12.0f, 22.0f)
                curveTo(11.2538f, 22.0f, 10.5268f, 21.9183f, 9.8273f, 21.7633f)
                close()
                moveTo(7.8899f, 21.119f)
                curveTo(5.3115f, 19.955f, 3.3152f, 17.7297f, 2.4578f, 15.0f)
                horizontalLineTo(11.4226f)
                lineTo(7.8899f, 21.119f)
                close()
                moveTo(2.0494f, 13.0f)
                curveTo(2.0167f, 12.6711f, 2.0f, 12.3375f, 2.0f, 12.0f)
                curveTo(2.0f, 9.3928f, 2.9977f, 7.0187f, 4.6322f, 5.2386f)
                lineTo(9.1132f, 13.0f)
                horizontalLineTo(2.0494f)
                close()
                moveTo(6.1587f, 3.8825f)
                curveTo(7.802f, 2.6979f, 9.8195f, 2.0f, 12.0f, 2.0f)
                curveTo(12.7462f, 2.0f, 13.4732f, 2.0817f, 14.1727f, 2.2367f)
                lineTo(9.6906f, 10.0f)
                lineTo(6.1587f, 3.8825f)
                close()
                moveTo(16.1101f, 2.881f)
                curveTo(18.6885f, 4.045f, 20.6848f, 6.2703f, 21.5422f, 9.0f)
                horizontalLineTo(12.5774f)
                lineTo(16.1101f, 2.881f)
                close()
                moveTo(21.9506f, 11.0f)
                curveTo(21.9833f, 11.3289f, 22.0f, 11.6625f, 22.0f, 12.0f)
                curveTo(22.0f, 14.6072f, 21.0023f, 16.9813f, 19.3678f, 18.7614f)
                lineTo(14.8868f, 11.0f)
                horizontalLineTo(21.9506f)
                close()
            }
        }
        .build()
        return `_camera-lens-fill`!!
    }

private var `_camera-lens-fill`: ImageVector? = null
