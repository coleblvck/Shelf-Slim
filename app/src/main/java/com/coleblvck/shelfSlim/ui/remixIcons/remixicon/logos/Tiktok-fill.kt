package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Tiktok-fill`: ImageVector
    get() {
        if (`_tiktok-fill` != null) {
            return `_tiktok-fill`!!
        }
        `_tiktok-fill` = Builder(name = "Tiktok-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.2454f)
                verticalLineTo(15.5f)
                curveTo(16.0f, 19.0899f, 13.0899f, 22.0f, 9.5f, 22.0f)
                curveTo(5.9102f, 22.0f, 3.0f, 19.0899f, 3.0f, 15.5f)
                curveTo(3.0f, 11.9101f, 5.9102f, 9.0f, 9.5f, 9.0f)
                curveTo(10.0163f, 9.0f, 10.5185f, 9.0602f, 11.0f, 9.1739f)
                verticalLineTo(12.3368f)
                curveTo(10.5454f, 12.1208f, 10.0368f, 12.0f, 9.5f, 12.0f)
                curveTo(7.567f, 12.0f, 6.0f, 13.567f, 6.0f, 15.5f)
                curveTo(6.0f, 17.433f, 7.567f, 19.0f, 9.5f, 19.0f)
                curveTo(11.433f, 19.0f, 13.0f, 17.433f, 13.0f, 15.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 4.7614f, 18.2386f, 7.0f, 21.0f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(19.1081f, 10.0f, 17.3696f, 9.3433f, 16.0f, 8.2454f)
                close()
            }
        }
        .build()
        return `_tiktok-fill`!!
    }

private var `_tiktok-fill`: ImageVector? = null
