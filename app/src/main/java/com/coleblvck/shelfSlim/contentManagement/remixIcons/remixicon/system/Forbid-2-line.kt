package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Forbid-2-line`: ImageVector
    get() {
        if (`_forbid-2-line` != null) {
            return `_forbid-2-line`!!
        }
        `_forbid-2-line` = Builder(name = "Forbid-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(16.8911f, 8.5231f)
                lineTo(8.5231f, 16.8911f)
                curveTo(8.2546f, 16.6997f, 7.9983f, 16.4836f, 7.7574f, 16.2426f)
                curveTo(7.5164f, 16.0017f, 7.3003f, 15.7454f, 7.1089f, 15.4769f)
                lineTo(15.4769f, 7.1089f)
                curveTo(15.7454f, 7.3003f, 16.0017f, 7.5164f, 16.2426f, 7.7574f)
                curveTo(16.4836f, 7.9983f, 16.6997f, 8.2546f, 16.8911f, 8.5231f)
                close()
            }
        }
        .build()
        return `_forbid-2-line`!!
    }

private var `_forbid-2-line`: ImageVector? = null
