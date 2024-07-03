package com.coleblvck.shelf.ui.remixIcons.remixicon.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.WeatherGroup

public val WeatherGroup.`Moon-foggy-fill`: ImageVector
    get() {
        if (`_moon-foggy-fill` != null) {
            return `_moon-foggy-fill`!!
        }
        `_moon-foggy-fill` = Builder(name = "Moon-foggy-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.3345f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.3324f)
                curveTo(3.1157f, 13.2034f, 3.0f, 12.3652f, 3.0f, 11.5f)
                curveTo(3.0f, 6.9395f, 6.2135f, 3.1296f, 10.4996f, 2.211f)
                curveTo(10.1765f, 3.0794f, 10.0f, 4.0191f, 10.0f, 5.0f)
                curveTo(10.0f, 9.4183f, 13.5817f, 13.0f, 18.0f, 13.0f)
                curveTo(19.4531f, 13.0f, 20.8157f, 12.6126f, 21.9902f, 11.9354f)
                curveTo(21.8178f, 15.7576f, 19.3867f, 18.9916f, 16.0f, 20.3345f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_moon-foggy-fill`!!
    }

private var `_moon-foggy-fill`: ImageVector? = null
