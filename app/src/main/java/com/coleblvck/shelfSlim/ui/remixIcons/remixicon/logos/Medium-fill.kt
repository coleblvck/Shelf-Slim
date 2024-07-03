package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Medium-fill`: ImageVector
    get() {
        if (`_medium-fill` != null) {
            return `_medium-fill`!!
        }
        `_medium-fill` = Builder(name = "Medium-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4093f, 12.0071f)
                curveTo(13.4093f, 15.4573f, 10.6314f, 18.2544f, 7.2045f, 18.2544f)
                curveTo(3.7777f, 18.2544f, 1.0f, 15.4582f, 1.0f, 12.0071f)
                curveTo(1.0f, 8.5561f, 3.7779f, 5.76f, 7.2045f, 5.76f)
                curveTo(10.6312f, 5.76f, 13.4093f, 8.5569f, 13.4093f, 12.0071f)
                close()
                moveTo(20.216f, 12.0071f)
                curveTo(20.216f, 15.2551f, 18.8269f, 17.8878f, 17.1136f, 17.8878f)
                curveTo(15.4003f, 17.8878f, 14.0112f, 15.2542f, 14.0112f, 12.0071f)
                curveTo(14.0112f, 8.76f, 15.4003f, 6.1264f, 17.1136f, 6.1264f)
                curveTo(18.8269f, 6.1264f, 20.216f, 8.76f, 20.216f, 12.0071f)
                close()
                moveTo(23.0f, 12.0071f)
                curveTo(23.0f, 14.9171f, 22.5114f, 17.276f, 21.9088f, 17.276f)
                curveTo(21.3063f, 17.276f, 20.8177f, 14.9163f, 20.8177f, 12.0071f)
                curveTo(20.8177f, 9.0979f, 21.3063f, 6.7382f, 21.9091f, 6.7382f)
                curveTo(22.5118f, 6.7382f, 23.0f, 9.0973f, 23.0f, 12.0071f)
                close()
            }
        }
        .build()
        return `_medium-fill`!!
    }

private var `_medium-fill`: ImageVector? = null
