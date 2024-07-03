package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Pen-nib-fill`: ImageVector
    get() {
        if (`_pen-nib-fill` != null) {
            return `_pen-nib-fill`!!
        }
        `_pen-nib-fill` = Builder(name = "Pen-nib-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 21.4819f)
                lineTo(10.775f, 15.6359f)
                curveTo(11.4423f, 15.8141f, 12.1837f, 15.6414f, 12.7071f, 15.118f)
                curveTo(13.4882f, 14.3369f, 13.4882f, 13.0706f, 12.7071f, 12.2896f)
                curveTo(11.9261f, 11.5085f, 10.6598f, 11.5085f, 9.8787f, 12.2896f)
                curveTo(9.3553f, 12.813f, 9.1826f, 13.5544f, 9.3608f, 14.2217f)
                lineTo(3.5148f, 20.0677f)
                lineTo(2.4541f, 19.0071f)
                curveTo(5.2825f, 15.7072f, 6.3432f, 12.0539f, 7.7574f, 5.9256f)
                lineTo(14.1214f, 5.2185f)
                lineTo(19.7783f, 10.8754f)
                lineTo(19.0711f, 17.2393f)
                curveTo(12.9429f, 18.6535f, 9.2895f, 19.7142f, 5.9896f, 22.5426f)
                lineTo(4.929f, 21.4819f)
                close()
                moveTo(16.5962f, 2.0365f)
                lineTo(22.9428f, 8.3831f)
                curveTo(23.1381f, 8.5784f, 23.1381f, 8.895f, 22.9428f, 9.0902f)
                curveTo(22.8679f, 9.1651f, 22.7712f, 9.2143f, 22.6665f, 9.2307f)
                lineTo(21.1924f, 9.4611f)
                lineTo(15.5356f, 3.8043f)
                lineTo(15.7477f, 2.3194f)
                curveTo(15.7868f, 2.046f, 16.04f, 1.856f, 16.3134f, 1.8951f)
                curveTo(16.4205f, 1.9104f, 16.5197f, 1.96f, 16.5962f, 2.0365f)
                close()
            }
        }
        .build()
        return `_pen-nib-fill`!!
    }

private var `_pen-nib-fill`: ImageVector? = null
