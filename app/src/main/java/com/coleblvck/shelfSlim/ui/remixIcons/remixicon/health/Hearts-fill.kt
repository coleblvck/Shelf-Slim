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

public val HealthGroup.`Hearts-fill`: ImageVector
    get() {
        if (`_hearts-fill` != null) {
            return `_hearts-fill`!!
        }
        `_hearts-fill` = Builder(name = "Hearts-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3631f, 11.0453f)
                curveTo(18.767f, 9.6516f, 21.0432f, 9.6516f, 22.4471f, 11.0453f)
                curveTo(23.851f, 12.439f, 23.851f, 14.6987f, 22.4471f, 16.0924f)
                lineTo(17.0f, 21.5f)
                lineTo(11.5529f, 16.0924f)
                curveTo(10.149f, 14.6987f, 10.149f, 12.439f, 11.5529f, 11.0453f)
                curveTo(12.9568f, 9.6516f, 15.233f, 9.6516f, 16.6369f, 11.0453f)
                lineTo(16.9996f, 11.4051f)
                lineTo(17.3631f, 11.0453f)
                close()
                moveTo(19.2426f, 4.7574f)
                curveTo(20.1831f, 5.6998f, 20.7461f, 6.8745f, 20.9318f, 8.0948f)
                curveTo(19.5993f, 7.8475f, 18.1932f, 8.0854f, 17.0001f, 8.808f)
                curveTo(14.8491f, 7.5052f, 12.0056f, 7.7777f, 10.1439f, 9.6259f)
                curveTo(8.0129f, 11.7414f, 7.9537f, 15.1405f, 9.9663f, 17.3273f)
                lineTo(10.1439f, 17.5117f)
                lineTo(12.565f, 19.916f)
                lineTo(10.9999f, 21.485f)
                lineTo(2.5214f, 12.993f)
                curveTo(0.417f, 10.637f, 0.4957f, 7.019f, 2.7574f, 4.7574f)
                curveTo(5.0216f, 2.4931f, 8.6452f, 2.4169f, 11.001f, 4.5285f)
                curveTo(13.35f, 2.42f, 16.98f, 2.49f, 19.2426f, 4.7574f)
                close()
            }
        }
        .build()
        return `_hearts-fill`!!
    }

private var `_hearts-fill`: ImageVector? = null
