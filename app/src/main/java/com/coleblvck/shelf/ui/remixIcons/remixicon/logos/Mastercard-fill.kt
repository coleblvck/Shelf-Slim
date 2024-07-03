package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Mastercard-fill`: ImageVector
    get() {
        if (`_mastercard-fill` != null) {
            return `_mastercard-fill`!!
        }
        `_mastercard-fill` = Builder(name = "Mastercard-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 6.6541f)
                curveTo(13.5816f, 7.8988f, 14.5965f, 9.8297f, 14.5965f, 11.9977f)
                curveTo(14.5965f, 14.1657f, 13.5816f, 16.0966f, 12.001f, 17.3413f)
                curveTo(10.4204f, 16.0966f, 9.4055f, 14.1657f, 9.4055f, 11.9977f)
                curveTo(9.4055f, 9.8297f, 10.4204f, 7.8988f, 12.001f, 6.6541f)
                close()
                moveTo(11.1316f, 6.0717f)
                curveTo(9.4602f, 7.5023f, 8.401f, 9.6274f, 8.401f, 12.0f)
                curveTo(8.401f, 14.371f, 9.4589f, 16.4949f, 11.1285f, 17.9255f)
                curveTo(10.1444f, 18.4795f, 9.0085f, 18.7955f, 7.7987f, 18.7955f)
                curveTo(4.0444f, 18.7955f, 1.001f, 15.752f, 1.001f, 11.9977f)
                curveTo(1.001f, 8.2434f, 4.0444f, 5.2f, 7.7987f, 5.2f)
                curveTo(9.0098f, 5.2f, 10.1468f, 5.5166f, 11.1316f, 6.0717f)
                close()
                moveTo(12.8735f, 17.9255f)
                curveTo(14.543f, 16.4949f, 15.601f, 14.371f, 15.601f, 12.0f)
                curveTo(15.601f, 9.6274f, 14.5417f, 7.5023f, 12.8703f, 6.0717f)
                curveTo(13.8551f, 5.5166f, 14.9922f, 5.2f, 16.2032f, 5.2f)
                curveTo(19.9575f, 5.2f, 23.001f, 8.2434f, 23.001f, 11.9977f)
                curveTo(23.001f, 15.752f, 19.9575f, 18.7955f, 16.2032f, 18.7955f)
                curveTo(14.9935f, 18.7955f, 13.8576f, 18.4795f, 12.8735f, 17.9255f)
                close()
            }
        }
        .build()
        return `_mastercard-fill`!!
    }

private var `_mastercard-fill`: ImageVector? = null
