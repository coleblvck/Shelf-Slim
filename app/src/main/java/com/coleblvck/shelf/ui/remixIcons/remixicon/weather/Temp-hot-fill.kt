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

public val WeatherGroup.`Temp-hot-fill`: ImageVector
    get() {
        if (`_temp-hot-fill` != null) {
            return `_temp-hot-fill`!!
        }
        `_temp-hot-fill` = Builder(name = "Temp-hot-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.2547f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 2.7909f, 9.7909f, 1.0f, 12.0f, 1.0f)
                curveTo(14.2091f, 1.0f, 16.0f, 2.7909f, 16.0f, 5.0f)
                verticalLineTo(10.2547f)
                curveTo(17.8135f, 11.5196f, 19.0f, 13.6213f, 19.0f, 16.0f)
                curveTo(19.0f, 19.866f, 15.866f, 23.0f, 12.0f, 23.0f)
                curveTo(8.134f, 23.0f, 5.0f, 19.866f, 5.0f, 16.0f)
                curveTo(5.0f, 13.6213f, 6.1865f, 11.5196f, 8.0f, 10.2547f)
                close()
                moveTo(11.0f, 12.126f)
                curveTo(9.2748f, 12.5701f, 8.0f, 14.1362f, 8.0f, 16.0f)
                curveTo(8.0f, 18.2091f, 9.7909f, 20.0f, 12.0f, 20.0f)
                curveTo(14.2091f, 20.0f, 16.0f, 18.2091f, 16.0f, 16.0f)
                curveTo(16.0f, 14.1362f, 14.7252f, 12.5701f, 13.0f, 12.126f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.126f)
                close()
            }
        }
        .build()
        return `_temp-hot-fill`!!
    }

private var `_temp-hot-fill`: ImageVector? = null
