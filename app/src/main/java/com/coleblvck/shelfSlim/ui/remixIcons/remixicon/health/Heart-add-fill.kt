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

public val HealthGroup.`Heart-add-fill`: ImageVector
    get() {
        if (`_heart-add-fill` != null) {
            return `_heart-add-fill`!!
        }
        `_heart-add-fill` = Builder(name = "Heart-add-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 13.9999f)
                verticalLineTo(16.9999f)
                horizontalLineTo(22.0001f)
                verticalLineTo(18.9999f)
                horizontalLineTo(18.9991f)
                lineTo(19.0001f, 21.9999f)
                horizontalLineTo(17.0001f)
                lineTo(16.9991f, 18.9999f)
                horizontalLineTo(14.0001f)
                verticalLineTo(16.9999f)
                horizontalLineTo(17.0001f)
                verticalLineTo(13.9999f)
                horizontalLineTo(19.0001f)
                close()
                moveTo(20.2426f, 4.7574f)
                curveTo(22.4033f, 6.9225f, 22.5715f, 10.3141f, 20.7498f, 12.667f)
                curveTo(19.9261f, 12.2403f, 18.9911f, 12.0f, 18.0f, 12.0f)
                curveTo(14.6863f, 12.0f, 12.0f, 14.6863f, 12.0f, 18.0f)
                curveTo(12.0f, 19.0089f, 12.249f, 19.9596f, 12.6889f, 20.794f)
                lineTo(11.9999f, 21.485f)
                lineTo(3.5214f, 12.993f)
                curveTo(1.4171f, 10.637f, 1.4957f, 7.019f, 3.7574f, 4.7574f)
                curveTo(6.0216f, 2.4931f, 9.6452f, 2.4169f, 12.001f, 4.5285f)
                curveTo(14.35f, 2.42f, 17.98f, 2.49f, 20.2426f, 4.7574f)
                close()
            }
        }
        .build()
        return `_heart-add-fill`!!
    }

private var `_heart-add-fill`: ImageVector? = null
