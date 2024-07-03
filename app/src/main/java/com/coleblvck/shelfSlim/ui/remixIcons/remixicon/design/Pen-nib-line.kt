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

public val DesignGroup.`Pen-nib-line`: ImageVector
    get() {
        if (`_pen-nib-line` != null) {
            return `_pen-nib-line`!!
        }
        `_pen-nib-line` = Builder(name = "Pen-nib-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5962f, 1.0365f)
                lineTo(22.9428f, 7.3831f)
                curveTo(23.1381f, 7.5784f, 23.1381f, 7.895f, 22.9428f, 8.0902f)
                curveTo(22.8679f, 8.1651f, 22.7712f, 8.2143f, 22.6665f, 8.2307f)
                lineTo(21.1924f, 8.4611f)
                lineTo(15.5356f, 2.8043f)
                lineTo(15.7477f, 1.3194f)
                curveTo(15.7868f, 1.046f, 16.04f, 0.856f, 16.3134f, 0.8951f)
                curveTo(16.4205f, 0.9104f, 16.5197f, 0.96f, 16.5962f, 1.0365f)
                close()
                moveTo(4.5949f, 20.1478f)
                curveTo(8.3173f, 16.8163f, 12.5899f, 15.82f, 17.2379f, 14.6273f)
                lineTo(17.6843f, 10.6099f)
                lineTo(13.3869f, 6.3124f)
                lineTo(9.3694f, 6.7588f)
                curveTo(8.1767f, 11.4068f, 7.1804f, 15.6795f, 3.8489f, 19.4018f)
                lineTo(2.4541f, 18.0071f)
                curveTo(5.2825f, 14.7072f, 6.3432f, 11.0539f, 7.7574f, 4.9256f)
                lineTo(14.1214f, 4.2185f)
                lineTo(19.7783f, 9.8754f)
                lineTo(19.0711f, 16.2393f)
                curveTo(12.9429f, 17.6535f, 9.2895f, 18.7142f, 5.9896f, 21.5426f)
                lineTo(4.5949f, 20.1478f)
                close()
                moveTo(9.8787f, 14.118f)
                curveTo(9.0977f, 13.3369f, 9.0977f, 12.0706f, 9.8787f, 11.2896f)
                curveTo(10.6598f, 10.5085f, 11.9261f, 10.5085f, 12.7071f, 11.2896f)
                curveTo(13.4882f, 12.0706f, 13.4882f, 13.3369f, 12.7071f, 14.118f)
                curveTo(11.9261f, 14.899f, 10.6598f, 14.899f, 9.8787f, 14.118f)
                close()
            }
        }
        .build()
        return `_pen-nib-line`!!
    }

private var `_pen-nib-line`: ImageVector? = null
