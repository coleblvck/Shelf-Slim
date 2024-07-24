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

public val HealthGroup.`Hearts-line`: ImageVector
    get() {
        if (`_hearts-line` != null) {
            return `_hearts-line`!!
        }
        `_hearts-line` = Builder(name = "Hearts-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2426f, 4.7574f)
                curveTo(20.705f, 6.2228f, 21.2547f, 8.25f, 20.8924f, 10.1368f)
                curveTo(21.4614f, 10.2972f, 21.9987f, 10.6002f, 22.4471f, 11.0453f)
                curveTo(23.851f, 12.439f, 23.851f, 14.6987f, 22.4471f, 16.0924f)
                lineTo(17.0f, 21.5f)
                lineTo(13.978f, 18.5f)
                lineTo(10.9999f, 21.485f)
                lineTo(2.5214f, 12.993f)
                curveTo(0.417f, 10.637f, 0.4957f, 7.019f, 2.7574f, 4.7574f)
                curveTo(5.0216f, 2.4931f, 8.6452f, 2.4169f, 11.001f, 4.5285f)
                curveTo(13.35f, 2.42f, 16.98f, 2.49f, 19.2426f, 4.7574f)
                close()
                moveTo(12.962f, 12.4646f)
                curveTo(12.346f, 13.0761f, 12.346f, 14.0615f, 12.962f, 14.673f)
                lineTo(17.0f, 18.6818f)
                lineTo(21.038f, 14.673f)
                curveTo(21.654f, 14.0615f, 21.654f, 13.0761f, 21.038f, 12.4646f)
                curveTo(20.414f, 11.8451f, 19.3962f, 11.8451f, 18.77f, 12.4668f)
                lineTo(16.9979f, 14.2206f)
                lineTo(15.591f, 12.825f)
                lineTo(15.2278f, 12.4646f)
                curveTo(14.6038f, 11.8451f, 13.586f, 11.8451f, 12.962f, 12.4646f)
                close()
                moveTo(4.1716f, 6.1716f)
                curveTo(2.6818f, 7.6613f, 2.607f, 10.0473f, 3.9799f, 11.6232f)
                lineTo(10.9999f, 18.6543f)
                lineTo(12.559f, 17.092f)
                lineTo(11.5529f, 16.0924f)
                curveTo(10.149f, 14.6987f, 10.149f, 12.439f, 11.5529f, 11.0453f)
                curveTo(12.9568f, 9.6516f, 15.233f, 9.6516f, 16.6369f, 11.0453f)
                lineTo(16.9996f, 11.4051f)
                lineTo(17.3631f, 11.0453f)
                curveTo(17.7877f, 10.6238f, 18.2921f, 10.3297f, 18.828f, 10.1632f)
                curveTo(19.2436f, 8.7958f, 18.9058f, 7.2512f, 17.827f, 6.1701f)
                curveTo(16.3279f, 4.6679f, 13.9076f, 4.607f, 12.337f, 6.0169f)
                lineTo(11.0019f, 7.2152f)
                lineTo(9.666f, 6.0178f)
                curveTo(8.091f, 4.606f, 5.6751f, 4.6681f, 4.1716f, 6.1716f)
                close()
            }
        }
        .build()
        return `_hearts-line`!!
    }

private var `_hearts-line`: ImageVector? = null
