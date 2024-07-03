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

public val SystemGroup.`History-fill`: ImageVector
    get() {
        if (`_history-fill` != null) {
            return `_history-fill`!!
        }
        `_history-fill` = Builder(name = "History-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(9.5361f, 4.0f, 7.3324f, 5.1138f, 5.8649f, 6.8654f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                lineTo(4.4466f, 5.4465f)
                curveTo(6.28f, 3.3351f, 8.9841f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(12.9998f, 11.585f)
                lineTo(16.2426f, 14.8284f)
                lineTo(14.8284f, 16.2426f)
                lineTo(10.9998f, 12.413f)
                lineTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_history-fill`!!
    }

private var `_history-fill`: ImageVector? = null
