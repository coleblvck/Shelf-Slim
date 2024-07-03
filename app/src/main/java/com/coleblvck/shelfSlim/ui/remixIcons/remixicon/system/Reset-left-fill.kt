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

public val SystemGroup.`Reset-left-fill`: ImageVector
    get() {
        if (`_reset-left-fill` != null) {
            return `_reset-left-fill`!!
        }
        `_reset-left-fill` = Builder(name = "Reset-left-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5229f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4772f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4772f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 9.5361f, 18.8862f, 7.3324f, 17.1346f, 5.8649f)
                lineTo(15.0f, 8.0f)
                verticalLineTo(2.0f)
                lineTo(21.0f, 2.0f)
                lineTo(18.5535f, 4.4466f)
                curveTo(20.6649f, 6.28f, 22.0f, 8.9841f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_reset-left-fill`!!
    }

private var `_reset-left-fill`: ImageVector? = null
