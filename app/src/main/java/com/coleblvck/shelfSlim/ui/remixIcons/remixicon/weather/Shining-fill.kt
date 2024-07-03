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

public val WeatherGroup.`Shining-fill`: ImageVector
    get() {
        if (`_shining-fill` != null) {
            return `_shining-fill`!!
        }
        `_shining-fill` = Builder(name = "Shining-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                curveTo(6.5229f, 11.0f, 11.0f, 6.5229f, 11.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 6.5229f, 17.4772f, 11.0f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(17.4772f, 13.0f, 13.0f, 17.4772f, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 17.4772f, 6.5229f, 13.0f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_shining-fill`!!
    }

private var `_shining-fill`: ImageVector? = null