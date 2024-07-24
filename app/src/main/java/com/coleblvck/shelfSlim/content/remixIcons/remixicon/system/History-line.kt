package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`History-line`: ImageVector
    get() {
        if (`_history-line` != null) {
            return `_history-line`!!
        }
        `_history-line` = Builder(name = "History-line", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(9.2502f, 4.0f, 6.8245f, 5.3873f, 5.3845f, 7.5002f)
                lineTo(8.0f, 7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(4.0f)
                lineTo(3.9999f, 5.9992f)
                curveTo(5.8243f, 3.5707f, 8.7287f, 2.0f, 12.0f, 2.0f)
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
        return `_history-line`!!
    }

private var `_history-line`: ImageVector? = null
