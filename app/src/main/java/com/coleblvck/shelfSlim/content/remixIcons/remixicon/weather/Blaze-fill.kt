package com.coleblvck.shelfSlim.content.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Blaze-fill`: ImageVector
    get() {
        if (`_blaze-fill` != null) {
            return `_blaze-fill`!!
        }
        `_blaze-fill` = Builder(name = "Blaze-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.0f)
                curveTo(19.5f, 10.0606f, 20.0f, 11.3939f, 20.0f, 13.0f)
                curveTo(20.0f, 16.4664f, 16.3f, 17.276f, 14.5f, 22.0f)
                curveTo(13.8333f, 21.4254f, 13.5f, 20.5921f, 13.5f, 19.5f)
                curveTo(13.5f, 16.0181f, 18.5f, 14.2101f, 18.5f, 9.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(15.7f, 6.2384f, 16.3f, 7.5718f, 16.3f, 9.0f)
                curveTo(16.3f, 13.9513f, 10.2552f, 14.6918f, 11.5f, 22.0f)
                curveTo(9.8333f, 20.8392f, 9.0f, 19.1726f, 9.0f, 17.0f)
                curveTo(9.0f, 13.675f, 14.5f, 11.0f, 14.5f, 5.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveTo(11.3333f, 2.6667f, 12.0f, 4.1667f, 12.0f, 5.5f)
                curveTo(12.0f, 11.75f, 3.5f, 13.7218f, 8.0f, 22.0f)
                curveTo(5.3835f, 21.4203f, 3.5f, 19.0f, 3.5f, 16.0f)
                curveTo(3.5f, 9.5f, 10.0f, 8.5f, 10.0f, 1.0f)
                close()
            }
        }
        .build()
        return `_blaze-fill`!!
    }

private var `_blaze-fill`: ImageVector? = null
