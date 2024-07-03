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

public val HealthGroup.`Heart-add-line`: ImageVector
    get() {
        if (`_heart-add-line` != null) {
            return `_heart-add-line`!!
        }
        `_heart-add-line` = Builder(name = "Heart-add-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0001f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.9991f)
                lineTo(19.0001f, 22.0f)
                horizontalLineTo(17.0001f)
                lineTo(16.9991f, 19.0f)
                horizontalLineTo(14.0001f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0001f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0001f)
                close()
                moveTo(20.2426f, 4.7575f)
                curveTo(22.505f, 7.0245f, 22.5829f, 10.6361f, 20.4795f, 12.9921f)
                lineTo(19.06f, 11.5741f)
                curveTo(20.3901f, 10.05f, 20.3201f, 7.66f, 18.827f, 6.1702f)
                curveTo(17.3244f, 4.671f, 14.9076f, 4.6071f, 13.337f, 6.017f)
                lineTo(12.0019f, 7.2154f)
                lineTo(10.6661f, 6.0179f)
                curveTo(9.091f, 4.6061f, 6.6751f, 4.6682f, 5.1716f, 6.1717f)
                curveTo(3.6818f, 7.6614f, 3.607f, 10.0474f, 4.9799f, 11.6233f)
                lineTo(13.412f, 20.0691f)
                lineTo(11.9999f, 21.4851f)
                lineTo(3.5214f, 12.9931f)
                curveTo(1.4171f, 10.6371f, 1.4957f, 7.0191f, 3.7574f, 4.7575f)
                curveTo(6.0216f, 2.4933f, 9.6452f, 2.417f, 12.001f, 4.5286f)
                curveTo(14.35f, 2.4201f, 17.98f, 2.4901f, 20.2426f, 4.7575f)
                close()
            }
        }
        .build()
        return `_heart-add-line`!!
    }

private var `_heart-add-line`: ImageVector? = null
