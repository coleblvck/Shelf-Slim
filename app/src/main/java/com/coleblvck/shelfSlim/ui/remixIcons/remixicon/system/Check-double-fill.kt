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

public val SystemGroup.`Check-double-fill`: ImageVector
    get() {
        if (`_check-double-fill` != null) {
            return `_check-double-fill`!!
        }
        `_check-double-fill` = Builder(name = "Check-double-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.602f, 13.7599f)
                lineTo(13.014f, 15.1719f)
                lineTo(21.4795f, 6.7063f)
                lineTo(22.8938f, 8.1205f)
                lineTo(13.014f, 18.0003f)
                lineTo(6.65f, 11.6363f)
                lineTo(8.0642f, 10.2221f)
                lineTo(10.189f, 12.3469f)
                lineTo(11.6025f, 13.7594f)
                lineTo(11.602f, 13.7599f)
                close()
                moveTo(11.6037f, 10.9322f)
                lineTo(16.5563f, 5.9795f)
                lineTo(17.9666f, 7.3898f)
                lineTo(13.014f, 12.3424f)
                lineTo(11.6037f, 10.9322f)
                close()
                moveTo(8.777f, 16.5873f)
                lineTo(7.364f, 18.0003f)
                lineTo(1.0f, 11.6363f)
                lineTo(2.4142f, 10.2221f)
                lineTo(3.8272f, 11.6352f)
                lineTo(3.826f, 11.6363f)
                lineTo(8.777f, 16.5873f)
                close()
            }
        }
        .build()
        return `_check-double-fill`!!
    }

private var `_check-double-fill`: ImageVector? = null
