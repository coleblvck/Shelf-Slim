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

public val SystemGroup.`Eye-2-fill`: ImageVector
    get() {
        if (`_eye-2-fill` != null) {
            return `_eye-2-fill`!!
        }
        `_eye-2-fill` = Builder(name = "Eye-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.4872f, 7.0f, 10.9925f, 7.0772f, 10.5269f, 7.22f)
                curveTo(11.3954f, 7.6118f, 12.0f, 8.4853f, 12.0f, 9.5f)
                curveTo(12.0f, 10.8807f, 10.8807f, 12.0f, 9.5f, 12.0f)
                curveTo(8.4853f, 12.0f, 7.6118f, 11.3954f, 7.2206f, 10.5268f)
                curveTo(7.0772f, 10.9925f, 7.0f, 11.4872f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_eye-2-fill`!!
    }

private var `_eye-2-fill`: ImageVector? = null
