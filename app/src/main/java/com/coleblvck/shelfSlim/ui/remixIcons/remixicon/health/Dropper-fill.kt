package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Dropper-fill`: ImageVector
    get() {
        if (`_dropper-fill` != null) {
            return `_dropper-fill`!!
        }
        `_dropper-fill` = Builder(name = "Dropper-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5355f, 2.8074f)
                curveTo(17.0976f, 1.2453f, 19.6303f, 1.2453f, 21.1924f, 2.8074f)
                curveTo(22.7545f, 4.3695f, 22.7545f, 6.9022f, 21.1924f, 8.4643f)
                lineTo(18.3638f, 11.2929f)
                lineTo(18.7175f, 11.6466f)
                curveTo(19.108f, 12.0371f, 19.108f, 12.6703f, 18.7175f, 13.0608f)
                curveTo(18.327f, 13.4513f, 17.6938f, 13.4513f, 17.3033f, 13.0608f)
                lineTo(16.9498f, 12.7073f)
                lineTo(10.7351f, 18.922f)
                curveTo(10.1767f, 19.4804f, 9.4655f, 19.861f, 8.6911f, 20.0159f)
                lineTo(6.9369f, 20.3667f)
                curveTo(6.5498f, 20.4442f, 6.1942f, 20.6345f, 5.915f, 20.9137f)
                lineTo(4.9289f, 21.8997f)
                curveTo(4.5384f, 22.2902f, 3.9053f, 22.2902f, 3.5147f, 21.8997f)
                lineTo(2.1005f, 20.4855f)
                curveTo(1.71f, 20.095f, 1.71f, 19.4618f, 2.1005f, 19.0713f)
                lineTo(3.0865f, 18.0852f)
                curveTo(3.3657f, 17.806f, 3.5561f, 17.4504f, 3.6335f, 17.0633f)
                lineTo(3.9843f, 15.3091f)
                curveTo(4.1392f, 14.5347f, 4.5198f, 13.8235f, 5.0782f, 13.2651f)
                lineTo(11.2929f, 7.0504f)
                lineTo(10.9393f, 6.6969f)
                curveTo(10.5488f, 6.3063f, 10.5488f, 5.6732f, 10.9393f, 5.2826f)
                curveTo(11.3299f, 4.8921f, 11.963f, 4.8921f, 12.3535f, 5.2826f)
                lineTo(12.7069f, 5.636f)
                lineTo(15.5355f, 2.8074f)
                close()
                moveTo(12.7071f, 8.4647f)
                lineTo(6.4924f, 14.6794f)
                curveTo(6.2132f, 14.9586f, 6.0229f, 15.3142f, 5.9455f, 15.7013f)
                lineTo(5.5946f, 17.4555f)
                curveTo(5.4398f, 18.2299f, 5.0592f, 18.9411f, 4.5008f, 19.4995f)
                curveTo(5.0592f, 18.9411f, 5.7703f, 18.5604f, 6.5447f, 18.4056f)
                lineTo(8.2989f, 18.0547f)
                curveTo(8.6861f, 17.9773f, 9.0416f, 17.787f, 9.3209f, 17.5078f)
                lineTo(15.5355f, 11.2931f)
                lineTo(12.7071f, 8.4647f)
                close()
            }
        }
        .build()
        return `_dropper-fill`!!
    }

private var `_dropper-fill`: ImageVector? = null
