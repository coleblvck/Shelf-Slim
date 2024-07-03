package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Walk-line`: ImageVector
    get() {
        if (`_walk-line` != null) {
            return `_walk-line`!!
        }
        `_walk-line` = Builder(name = "Walk-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6171f, 8.7123f)
                lineTo(10.8222f, 6.3837f)
                curveTo(11.174f, 6.1273f, 11.6087f, 5.9854f, 12.065f, 6.0008f)
                curveTo(13.1764f, 6.0281f, 14.1524f, 6.7567f, 14.4919f, 7.8204f)
                curveTo(14.6782f, 8.4043f, 14.8481f, 8.7984f, 15.0017f, 9.0025f)
                curveTo(15.914f, 10.2155f, 17.3655f, 11.0f, 19.0002f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.8255f, 13.0f, 14.8825f, 12.0083f, 13.5986f, 10.4526f)
                lineTo(12.901f, 14.4085f)
                lineTo(14.9621f, 16.138f)
                lineTo(17.1853f, 22.246f)
                lineTo(15.3059f, 22.93f)
                lineTo(13.266f, 17.3256f)
                lineTo(9.8758f, 14.4808f)
                curveTo(9.3282f, 14.0382f, 9.0314f, 13.3192f, 9.1623f, 12.5767f)
                lineTo(9.6709f, 9.6923f)
                lineTo(8.9941f, 10.1841f)
                lineTo(6.8671f, 13.1116f)
                lineTo(5.249f, 11.9361f)
                lineTo(7.6002f, 8.7f)
                lineTo(7.6171f, 8.7123f)
                close()
                moveTo(13.5002f, 5.5f)
                curveTo(12.3956f, 5.5f, 11.5002f, 4.6046f, 11.5002f, 3.5f)
                curveTo(11.5002f, 2.3954f, 12.3956f, 1.5f, 13.5002f, 1.5f)
                curveTo(14.6047f, 1.5f, 15.5002f, 2.3954f, 15.5002f, 3.5f)
                curveTo(15.5002f, 4.6046f, 14.6047f, 5.5f, 13.5002f, 5.5f)
                close()
                moveTo(10.5286f, 18.6813f)
                lineTo(7.3147f, 22.5116f)
                lineTo(5.7826f, 21.226f)
                lineTo(8.7577f, 17.6803f)
                lineTo(9.5043f, 15.5f)
                lineTo(11.2954f, 17.0f)
                lineTo(10.5286f, 18.6813f)
                close()
            }
        }
        .build()
        return `_walk-line`!!
    }

private var `_walk-line`: ImageVector? = null
