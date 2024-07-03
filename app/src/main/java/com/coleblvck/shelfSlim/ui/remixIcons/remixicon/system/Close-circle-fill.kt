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

public val SystemGroup.`Close-circle-fill`: ImageVector
    get() {
        if (`_close-circle-fill` != null) {
            return `_close-circle-fill`!!
        }
        `_close-circle-fill` = Builder(name = "Close-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 10.5858f)
                lineTo(9.1716f, 7.7574f)
                lineTo(7.7574f, 9.1716f)
                lineTo(10.5858f, 12.0f)
                lineTo(7.7574f, 14.8284f)
                lineTo(9.1716f, 16.2426f)
                lineTo(12.0f, 13.4142f)
                lineTo(14.8284f, 16.2426f)
                lineTo(16.2426f, 14.8284f)
                lineTo(13.4142f, 12.0f)
                lineTo(16.2426f, 9.1716f)
                lineTo(14.8284f, 7.7574f)
                lineTo(12.0f, 10.5858f)
                close()
            }
        }
        .build()
        return `_close-circle-fill`!!
    }

private var `_close-circle-fill`: ImageVector? = null