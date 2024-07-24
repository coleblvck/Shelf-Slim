package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Heart-2-line`: ImageVector
    get() {
        if (`_heart-2-line` != null) {
            return `_heart-2-line`!!
        }
        `_heart-2-line` = Builder(name = "Heart-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2426f, 4.7574f)
                curveTo(22.5053f, 7.0247f, 22.583f, 10.637f, 20.4786f, 12.993f)
                lineTo(11.9999f, 21.485f)
                lineTo(3.5214f, 12.993f)
                curveTo(1.4171f, 10.637f, 1.4957f, 7.019f, 3.7574f, 4.7574f)
                curveTo(6.0216f, 2.4931f, 9.6452f, 2.4169f, 12.001f, 4.5285f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.2426f, 4.7574f)
                close()
                moveTo(5.1716f, 6.1716f)
                curveTo(3.6818f, 7.6613f, 3.607f, 10.0473f, 4.9799f, 11.6232f)
                lineTo(11.9999f, 18.6543f)
                lineTo(19.0201f, 11.6232f)
                curveTo(20.3935f, 10.0467f, 20.319f, 7.6652f, 18.827f, 6.1701f)
                curveTo(17.3397f, 4.6798f, 14.9458f, 4.6081f, 13.3743f, 5.9838f)
                lineTo(9.1716f, 10.1869f)
                lineTo(7.7574f, 8.7726f)
                lineTo(10.582f, 5.946f)
                lineTo(10.5002f, 5.877f)
                curveTo(8.9255f, 4.612f, 6.6232f, 4.7199f, 5.1716f, 6.1716f)
                close()
            }
        }
        .build()
        return `_heart-2-line`!!
    }

private var `_heart-2-line`: ImageVector? = null
