package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Unpin-line`: ImageVector
    get() {
        if (`_unpin-line` != null) {
            return `_unpin-line`!!
        }
        `_unpin-line` = Builder(name = "Unpin-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9701f, 17.1716f)
                lineTo(19.5559f, 18.5858f)
                lineTo(16.0214f, 15.0513f)
                lineTo(15.9476f, 15.1251f)
                lineTo(15.2405f, 18.6606f)
                lineTo(13.8263f, 20.0748f)
                lineTo(9.5837f, 15.8322f)
                lineTo(4.6339f, 20.7819f)
                lineTo(3.2197f, 19.3677f)
                lineTo(8.1695f, 14.418f)
                lineTo(3.9268f, 10.1753f)
                lineTo(5.3411f, 8.7611f)
                lineTo(8.8766f, 8.054f)
                lineTo(8.9503f, 7.9803f)
                lineTo(5.4137f, 4.4437f)
                lineTo(6.8279f, 3.0295f)
                lineTo(20.9701f, 17.1716f)
                close()
                moveTo(10.3645f, 9.3945f)
                lineTo(9.8626f, 9.8964f)
                lineTo(7.0407f, 10.4608f)
                lineTo(13.5409f, 16.9609f)
                lineTo(14.1052f, 14.139f)
                lineTo(14.6071f, 13.6371f)
                lineTo(10.3645f, 9.3945f)
                close()
                moveTo(18.7761f, 9.4682f)
                lineTo(17.4356f, 10.8087f)
                lineTo(18.8498f, 12.2229f)
                lineTo(20.1903f, 10.8824f)
                lineTo(20.8974f, 11.5895f)
                lineTo(22.3116f, 10.1753f)
                lineTo(13.8263f, 1.69f)
                lineTo(12.4121f, 3.1042f)
                lineTo(13.1192f, 3.8114f)
                lineTo(11.7787f, 5.1519f)
                lineTo(13.1929f, 6.5661f)
                lineTo(14.5334f, 5.2256f)
                lineTo(18.7761f, 9.4682f)
                close()
            }
        }
        .build()
        return `_unpin-line`!!
    }

private var `_unpin-line`: ImageVector? = null
