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

public val WeatherGroup.`Blaze-line`: ImageVector
    get() {
        if (`_blaze-line` != null) {
            return `_blaze-line`!!
        }
        `_blaze-line` = Builder(name = "Blaze-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveTo(19.6667f, 10.0606f, 20.0f, 11.3939f, 20.0f, 13.0f)
                curveTo(20.0f, 16.0f, 16.5f, 17.0f, 15.0f, 22.0f)
                curveTo(14.3333f, 21.4254f, 14.0f, 20.5921f, 14.0f, 19.5f)
                curveTo(14.0f, 16.0181f, 19.0f, 14.2101f, 19.0f, 9.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(15.1667f, 6.2384f, 15.5f, 7.5718f, 15.5f, 9.0f)
                curveTo(15.5f, 14.0f, 9.5f, 15.0f, 11.5f, 22.0f)
                curveTo(9.8333f, 20.8392f, 9.0f, 19.1726f, 9.0f, 17.0f)
                curveTo(9.0f, 13.675f, 14.5f, 11.0f, 14.5f, 5.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveTo(10.6667f, 2.3333f, 11.0f, 3.8333f, 11.0f, 5.5f)
                curveTo(11.0f, 11.5f, 2.0f, 13.0f, 8.0f, 22.0f)
                curveTo(5.5f, 21.5f, 3.5f, 19.0f, 3.5f, 16.0f)
                curveTo(3.5f, 9.5f, 10.0f, 8.5f, 10.0f, 1.0f)
                close()
            }
        }
        .build()
        return `_blaze-line`!!
    }

private var `_blaze-line`: ImageVector? = null
