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

public val SystemGroup.`Eye-fill`: ImageVector
    get() {
        if (`_eye-fill` != null) {
            return `_eye-fill`!!
        }
        `_eye-fill` = Builder(name = "Eye-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.1816f, 12.0f)
                curveTo(2.1221f, 6.8798f, 6.6081f, 3.0f, 12.0003f, 3.0f)
                curveTo(17.3924f, 3.0f, 21.8784f, 6.8798f, 22.8189f, 12.0f)
                curveTo(21.8784f, 17.1202f, 17.3924f, 21.0f, 12.0003f, 21.0f)
                curveTo(6.6081f, 21.0f, 2.1221f, 17.1202f, 1.1816f, 12.0f)
                close()
                moveTo(12.0003f, 17.0f)
                curveTo(14.7617f, 17.0f, 17.0003f, 14.7614f, 17.0003f, 12.0f)
                curveTo(17.0003f, 9.2386f, 14.7617f, 7.0f, 12.0003f, 7.0f)
                curveTo(9.2388f, 7.0f, 7.0003f, 9.2386f, 7.0003f, 12.0f)
                curveTo(7.0003f, 14.7614f, 9.2388f, 17.0f, 12.0003f, 17.0f)
                close()
                moveTo(12.0003f, 15.0f)
                curveTo(10.3434f, 15.0f, 9.0003f, 13.6569f, 9.0003f, 12.0f)
                curveTo(9.0003f, 10.3431f, 10.3434f, 9.0f, 12.0003f, 9.0f)
                curveTo(13.6571f, 9.0f, 15.0003f, 10.3431f, 15.0003f, 12.0f)
                curveTo(15.0003f, 13.6569f, 13.6571f, 15.0f, 12.0003f, 15.0f)
                close()
            }
        }
        .build()
        return `_eye-fill`!!
    }

private var `_eye-fill`: ImageVector? = null
