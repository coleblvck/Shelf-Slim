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

public val SystemGroup.`Reset-left-line`: ImageVector
    get() {
        if (`_reset-left-line` != null) {
            return `_reset-left-line`!!
        }
        `_reset-left-line` = Builder(name = "Reset-left-line", defaultWidth = 24.0.dp, defaultHeight
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
                curveTo(20.0f, 9.2502f, 18.6127f, 6.8245f, 16.4998f, 5.3845f)
                lineTo(16.5f, 8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(2.0f)
                lineTo(20.5f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(18.0008f, 3.9999f)
                curveTo(20.4293f, 5.8243f, 22.0f, 8.7287f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_reset-left-line`!!
    }

private var `_reset-left-line`: ImageVector? = null
