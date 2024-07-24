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

public val HealthGroup.`Heart-fill`: ImageVector
    get() {
        if (`_heart-fill` != null) {
            return `_heart-fill`!!
        }
        `_heart-fill` = Builder(name = "Heart-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 4.5285f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.2426f, 4.7574f)
                curveTo(22.5053f, 7.0247f, 22.583f, 10.637f, 20.4786f, 12.993f)
                lineTo(11.9999f, 21.485f)
                lineTo(3.5214f, 12.993f)
                curveTo(1.4171f, 10.637f, 1.4957f, 7.019f, 3.7574f, 4.7574f)
                curveTo(6.0216f, 2.4931f, 9.6452f, 2.4169f, 12.001f, 4.5285f)
                close()
            }
        }
        .build()
        return `_heart-fill`!!
    }

private var `_heart-fill`: ImageVector? = null
