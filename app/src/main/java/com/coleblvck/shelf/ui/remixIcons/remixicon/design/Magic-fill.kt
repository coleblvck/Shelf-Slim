package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Magic-fill`: ImageVector
    get() {
        if (`_magic-fill` != null) {
            return `_magic-fill`!!
        }
        `_magic-fill` = Builder(name = "Magic-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2238f, 15.5079f)
                lineTo(13.0111f, 20.1581f)
                curveTo(12.8687f, 20.4573f, 12.5107f, 20.5844f, 12.2115f, 20.442f)
                curveTo(12.1448f, 20.4103f, 12.0845f, 20.3665f, 12.0337f, 20.3129f)
                lineTo(8.4923f, 16.5741f)
                curveTo(8.3975f, 16.474f, 8.2711f, 16.4096f, 8.1344f, 16.3918f)
                lineTo(3.0282f, 15.7243f)
                curveTo(2.6996f, 15.6814f, 2.468f, 15.3802f, 2.511f, 15.0516f)
                curveTo(2.5206f, 14.9784f, 2.5436f, 14.9075f, 2.5789f, 14.8426f)
                lineTo(5.0403f, 10.3192f)
                curveTo(5.1062f, 10.1981f, 5.1284f, 10.058f, 5.1031f, 9.9225f)
                lineTo(4.16f, 4.8599f)
                curveTo(4.0993f, 4.5341f, 4.3142f, 4.2209f, 4.64f, 4.1602f)
                curveTo(4.7126f, 4.1466f, 4.7871f, 4.1466f, 4.8597f, 4.1602f)
                lineTo(9.9224f, 5.1033f)
                curveTo(10.0579f, 5.1286f, 10.198f, 5.1064f, 10.319f, 5.0405f)
                lineTo(14.8424f, 2.5791f)
                curveTo(15.1335f, 2.4207f, 15.4979f, 2.5282f, 15.6562f, 2.8193f)
                curveTo(15.6916f, 2.8842f, 15.7146f, 2.9551f, 15.7241f, 3.0283f)
                lineTo(16.3916f, 8.1346f)
                curveTo(16.4095f, 8.2713f, 16.4739f, 8.3977f, 16.5739f, 8.4924f)
                lineTo(20.3127f, 12.0338f)
                curveTo(20.5533f, 12.2617f, 20.5636f, 12.6415f, 20.3357f, 12.8821f)
                curveTo(20.2849f, 12.9357f, 20.2246f, 12.9795f, 20.1579f, 13.0112f)
                lineTo(15.5078f, 15.224f)
                curveTo(15.3833f, 15.2832f, 15.283f, 15.3835f, 15.2238f, 15.5079f)
                close()
                moveTo(16.0206f, 17.435f)
                lineTo(17.4348f, 16.0208f)
                lineTo(21.6775f, 20.2634f)
                lineTo(20.2633f, 21.6776f)
                lineTo(16.0206f, 17.435f)
                close()
            }
        }
        .build()
        return `_magic-fill`!!
    }

private var `_magic-fill`: ImageVector? = null
