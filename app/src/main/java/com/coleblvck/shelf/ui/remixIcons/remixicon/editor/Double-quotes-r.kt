package com.coleblvck.shelf.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Double-quotes-r`: ImageVector
    get() {
        if (`_double-quotes-r` != null) {
            return `_double-quotes-r`!!
        }
        `_double-quotes-r` = Builder(name = "Double-quotes-r", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4167f, 6.6789f)
                curveTo(20.4469f, 7.7726f, 21.0001f, 9.0f, 21.0001f, 10.9897f)
                curveTo(21.0001f, 14.4891f, 18.5436f, 17.6263f, 14.9695f, 19.1768f)
                lineTo(14.0768f, 17.7992f)
                curveTo(17.4121f, 15.9946f, 18.0639f, 13.6539f, 18.3245f, 12.178f)
                curveTo(17.7875f, 12.4557f, 17.0845f, 12.5533f, 16.3954f, 12.4895f)
                curveTo(14.591f, 12.3222f, 13.1689f, 10.8409f, 13.1689f, 9.0f)
                curveTo(13.1689f, 7.067f, 14.7359f, 5.5f, 16.6689f, 5.5f)
                curveTo(17.742f, 5.5f, 18.7681f, 5.9904f, 19.4167f, 6.6789f)
                close()
                moveTo(9.4167f, 6.6789f)
                curveTo(10.4469f, 7.7726f, 11.0001f, 9.0f, 11.0001f, 10.9897f)
                curveTo(11.0001f, 14.4891f, 8.5436f, 17.6263f, 4.9695f, 19.1768f)
                lineTo(4.0768f, 17.7992f)
                curveTo(7.4121f, 15.9946f, 8.0639f, 13.6539f, 8.3245f, 12.178f)
                curveTo(7.7875f, 12.4557f, 7.0845f, 12.5533f, 6.3954f, 12.4895f)
                curveTo(4.591f, 12.3222f, 3.169f, 10.8409f, 3.169f, 9.0f)
                curveTo(3.169f, 7.067f, 4.7359f, 5.5f, 6.669f, 5.5f)
                curveTo(7.742f, 5.5f, 8.7681f, 5.9904f, 9.4167f, 6.6789f)
                close()
            }
        }
        .build()
        return `_double-quotes-r`!!
    }

private var `_double-quotes-r`: ImageVector? = null
