package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Eye-close-fill`: ImageVector
    get() {
        if (`_eye-close-fill` != null) {
            return `_eye-close-fill`!!
        }
        `_eye-close-fill` = Builder(name = "Eye-close-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1305f, 15.8421f)
                lineTo(9.3427f, 18.7821f)
                lineTo(7.4108f, 18.2645f)
                lineTo(8.1983f, 15.3256f)
                curveTo(7.0092f, 14.8876f, 5.9166f, 14.2501f, 4.9612f, 13.4536f)
                lineTo(2.8078f, 15.6069f)
                lineTo(1.3936f, 14.1927f)
                lineTo(3.547f, 12.0394f)
                curveTo(2.3558f, 10.6105f, 1.5201f, 8.8749f, 1.1758f, 6.9684f)
                lineTo(2.0763f, 6.8047f)
                curveTo(4.8688f, 8.8157f, 8.2962f, 10.0003f, 12.0002f, 10.0003f)
                curveTo(15.7043f, 10.0003f, 19.1316f, 8.8157f, 21.9241f, 6.8047f)
                lineTo(22.8247f, 6.9684f)
                curveTo(22.4803f, 8.8749f, 21.6446f, 10.6105f, 20.4535f, 12.0394f)
                lineTo(22.6068f, 14.1927f)
                lineTo(21.1926f, 15.6069f)
                lineTo(19.0393f, 13.4536f)
                curveTo(18.0838f, 14.2501f, 16.9912f, 14.8876f, 15.8021f, 15.3256f)
                lineTo(16.5896f, 18.2645f)
                lineTo(14.6578f, 18.7821f)
                lineTo(13.87f, 15.8421f)
                curveTo(13.2623f, 15.9461f, 12.6376f, 16.0003f, 12.0002f, 16.0003f)
                curveTo(11.3629f, 16.0003f, 10.7381f, 15.9461f, 10.1305f, 15.8421f)
                close()
            }
        }
        .build()
        return `_eye-close-fill`!!
    }

private var `_eye-close-fill`: ImageVector? = null
