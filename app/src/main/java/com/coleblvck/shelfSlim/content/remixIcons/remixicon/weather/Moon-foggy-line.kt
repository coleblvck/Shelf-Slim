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

public val WeatherGroup.`Moon-foggy-line`: ImageVector
    get() {
        if (`_moon-foggy-line` != null) {
            return `_moon-foggy-line`!!
        }
        `_moon-foggy-line` = Builder(name = "Moon-foggy-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.3345f)
                verticalLineTo(18.135f)
                curveTo(17.6993f, 17.2367f, 19.012f, 15.7047f, 19.6233f, 13.8537f)
                curveTo(19.0927f, 13.9504f, 18.5498f, 14.0f, 18.0f, 14.0f)
                curveTo(13.0294f, 14.0f, 9.0f, 9.9706f, 9.0f, 5.0f)
                curveTo(9.0f, 4.9544f, 9.0003f, 4.9089f, 9.001f, 4.8634f)
                curveTo(7.0415f, 5.8987f, 5.6028f, 7.7758f, 5.1505f, 10.0f)
                horizontalLineTo(3.1177f)
                curveTo(3.7938f, 5.7383f, 7.3038f, 2.4201f, 11.6562f, 2.037f)
                curveTo(11.2352f, 2.9368f, 11.0f, 3.9409f, 11.0f, 5.0f)
                curveTo(11.0f, 8.866f, 14.134f, 12.0f, 18.0f, 12.0f)
                curveTo(19.475f, 12.0f, 20.8435f, 11.5438f, 21.972f, 10.7648f)
                curveTo(21.9905f, 11.0074f, 22.0f, 11.2526f, 22.0f, 11.5f)
                curveTo(22.0f, 15.5107f, 19.5146f, 18.9409f, 16.0f, 20.3345f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
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
        return `_moon-foggy-line`!!
    }

private var `_moon-foggy-line`: ImageVector? = null
