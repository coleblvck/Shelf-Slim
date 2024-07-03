package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Moon-fill`: ImageVector
    get() {
        if (`_moon-fill` != null) {
            return `_moon-fill`!!
        }
        `_moon-fill` = Builder(name = "Moon-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3807f, 2.0189f)
                curveTo(9.9157f, 3.3877f, 9.0f, 5.3369f, 9.0f, 7.5f)
                curveTo(9.0f, 11.6421f, 12.3579f, 15.0f, 16.5f, 15.0f)
                curveTo(18.6631f, 15.0f, 20.6123f, 14.0843f, 21.9811f, 12.6193f)
                curveTo(21.6613f, 17.8537f, 17.3149f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.6851f, 6.1463f, 2.3387f, 11.3807f, 2.0189f)
                close()
            }
        }
        .build()
        return `_moon-fill`!!
    }

private var `_moon-fill`: ImageVector? = null
