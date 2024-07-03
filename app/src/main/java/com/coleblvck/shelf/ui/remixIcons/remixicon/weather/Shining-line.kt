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

public val WeatherGroup.`Shining-line`: ImageVector
    get() {
        if (`_shining-line` != null) {
            return `_shining-line`!!
        }
        `_shining-line` = Builder(name = "Shining-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(5.8034f, 12.0f)
                curveTo(8.5689f, 13.2093f, 10.7907f, 15.431f, 12.0f, 18.1966f)
                curveTo(13.2093f, 15.431f, 15.431f, 13.2093f, 18.1966f, 12.0f)
                curveTo(15.431f, 10.7907f, 13.2093f, 8.5689f, 12.0f, 5.8034f)
                curveTo(10.7907f, 8.5689f, 8.5689f, 10.7907f, 5.8034f, 12.0f)
                close()
            }
        }
        .build()
        return `_shining-line`!!
    }

private var `_shining-line`: ImageVector? = null
