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

public val LogosGroup.`Spectrum-fill`: ImageVector
    get() {
        if (`_spectrum-fill` != null) {
            return `_spectrum-fill`!!
        }
        `_spectrum-fill` = Builder(name = "Spectrum-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1997f, 2.006f)
                curveTo(21.2413f, 2.0931f, 22.0006f, 3.2501f, 22.0006f, 12.0001f)
                lineTo(21.9948f, 13.1991f)
                curveTo(21.9077f, 21.2408f, 20.7506f, 22.0001f, 12.0006f, 22.0001f)
                lineTo(10.8016f, 21.9942f)
                curveTo(3.1429f, 21.9113f, 2.0895f, 20.8579f, 2.0065f, 13.1991f)
                lineTo(2.001f, 11.6908f)
                lineTo(2.0065f, 10.801f)
                curveTo(2.0915f, 2.9509f, 3.1962f, 2.0404f, 11.3885f, 2.0015f)
                lineTo(13.1997f, 2.006f)
                close()
                moveTo(8.2506f, 7.0001f)
                horizontalLineTo(7.6673f)
                curveTo(7.3327f, 7.0001f, 7.0555f, 7.2468f, 7.0079f, 7.5683f)
                lineTo(7.0006f, 7.6667f)
                verticalLineTo(11.3334f)
                curveTo(7.0006f, 11.6683f, 7.2474f, 11.9453f, 7.5688f, 11.9929f)
                lineTo(7.6673f, 12.0001f)
                horizontalLineTo(8.2506f)
                curveTo(10.2549f, 12.0001f, 11.8919f, 13.5725f, 11.9954f, 15.5509f)
                lineTo(12.0006f, 15.7501f)
                verticalLineTo(16.3334f)
                curveTo(12.0006f, 16.6683f, 12.2474f, 16.9453f, 12.5688f, 16.9929f)
                lineTo(12.6673f, 17.0001f)
                horizontalLineTo(16.334f)
                curveTo(16.6686f, 17.0001f, 16.9458f, 16.7535f, 16.9934f, 16.432f)
                lineTo(17.0006f, 16.3334f)
                verticalLineTo(15.7501f)
                curveTo(17.0006f, 11.0039f, 13.2218f, 7.1403f, 8.5086f, 7.0038f)
                lineTo(8.2506f, 7.0001f)
                close()
            }
        }
        .build()
        return `_spectrum-fill`!!
    }

private var `_spectrum-fill`: ImageVector? = null
