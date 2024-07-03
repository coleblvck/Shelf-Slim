package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Eye-close-line`: ImageVector
    get() {
        if (`_eye-close-line` != null) {
            return `_eye-close-line`!!
        }
        `_eye-close-line` = Builder(name = "Eye-close-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3427f, 18.7819f)
                lineTo(7.4108f, 18.2642f)
                lineTo(8.1983f, 15.3254f)
                curveTo(7.0092f, 14.8874f, 5.9166f, 14.2498f, 4.9612f, 13.4534f)
                lineTo(2.8078f, 15.6067f)
                lineTo(1.3936f, 14.1925f)
                lineTo(3.547f, 12.0392f)
                curveTo(2.3558f, 10.6103f, 1.5201f, 8.8747f, 1.1758f, 6.9682f)
                lineTo(3.1439f, 6.6104f)
                curveTo(3.9029f, 10.8126f, 7.5793f, 14.0001f, 12.0002f, 14.0001f)
                curveTo(16.4211f, 14.0001f, 20.0976f, 10.8126f, 20.8566f, 6.6104f)
                lineTo(22.8247f, 6.9682f)
                curveTo(22.4803f, 8.8747f, 21.6446f, 10.6103f, 20.4535f, 12.0392f)
                lineTo(22.6068f, 14.1925f)
                lineTo(21.1926f, 15.6067f)
                lineTo(19.0393f, 13.4534f)
                curveTo(18.0838f, 14.2498f, 16.9912f, 14.8874f, 15.8021f, 15.3254f)
                lineTo(16.5896f, 18.2642f)
                lineTo(14.6578f, 18.7819f)
                lineTo(13.87f, 15.8418f)
                curveTo(13.2623f, 15.9459f, 12.6376f, 16.0001f, 12.0002f, 16.0001f)
                curveTo(11.3629f, 16.0001f, 10.7381f, 15.9459f, 10.1305f, 15.8418f)
                lineTo(9.3427f, 18.7819f)
                close()
            }
        }
        .build()
        return `_eye-close-line`!!
    }

private var `_eye-close-line`: ImageVector? = null
