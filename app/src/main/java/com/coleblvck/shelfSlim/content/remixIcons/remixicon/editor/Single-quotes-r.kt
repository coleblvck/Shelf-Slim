package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Single-quotes-r`: ImageVector
    get() {
        if (`_single-quotes-r` != null) {
            return `_single-quotes-r`!!
        }
        `_single-quotes-r` = Builder(name = "Single-quotes-r", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4167f, 6.6789f)
                curveTo(15.4469f, 7.7726f, 16.0001f, 9.0f, 16.0001f, 10.9897f)
                curveTo(16.0001f, 14.4891f, 13.5436f, 17.6263f, 9.9695f, 19.1768f)
                lineTo(9.0768f, 17.7992f)
                curveTo(12.4121f, 15.9946f, 13.0639f, 13.6539f, 13.3245f, 12.178f)
                curveTo(12.7875f, 12.4557f, 12.0845f, 12.5533f, 11.3954f, 12.4895f)
                curveTo(9.591f, 12.3222f, 8.169f, 10.8409f, 8.169f, 9.0f)
                curveTo(8.169f, 7.067f, 9.736f, 5.5f, 11.6689f, 5.5f)
                curveTo(12.742f, 5.5f, 13.7681f, 5.9904f, 14.4167f, 6.6789f)
                close()
            }
        }
        .build()
        return `_single-quotes-r`!!
    }

private var `_single-quotes-r`: ImageVector? = null
