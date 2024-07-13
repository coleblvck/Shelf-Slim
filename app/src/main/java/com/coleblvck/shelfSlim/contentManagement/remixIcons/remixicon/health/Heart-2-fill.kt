package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Heart-2-fill`: ImageVector
    get() {
        if (`_heart-2-fill` != null) {
            return `_heart-2-fill`!!
        }
        `_heart-2-fill` = Builder(name = "Heart-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2426f, 4.7574f)
                curveTo(22.5053f, 7.0247f, 22.583f, 10.637f, 20.4786f, 12.993f)
                lineTo(11.9999f, 21.485f)
                lineTo(3.5214f, 12.993f)
                curveTo(1.4171f, 10.637f, 1.4957f, 7.019f, 3.7574f, 4.7574f)
                curveTo(5.5155f, 2.9993f, 8.0932f, 2.5603f, 10.2605f, 3.4404f)
                lineTo(6.3432f, 7.3584f)
                lineTo(7.7574f, 8.7726f)
                lineTo(12.0f, 4.53f)
                lineTo(11.9872f, 4.5162f)
                curveTo(11.9918f, 4.5203f, 11.9964f, 4.5244f, 12.001f, 4.5285f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.2426f, 4.7574f)
                close()
            }
        }
        .build()
        return `_heart-2-fill`!!
    }

private var `_heart-2-fill`: ImageVector? = null
