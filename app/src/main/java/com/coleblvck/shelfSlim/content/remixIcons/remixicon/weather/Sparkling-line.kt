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

public val WeatherGroup.`Sparkling-line`: ImageVector
    get() {
        if (`_sparkling-line` != null) {
            return `_sparkling-line`!!
        }
        `_sparkling-line` = Builder(name = "Sparkling-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.4375f)
                curveTo(15.3462f, 4.4375f, 16.4375f, 3.3462f, 16.4375f, 2.0f)
                horizontalLineTo(17.5625f)
                curveTo(17.5625f, 3.3462f, 18.6538f, 4.4375f, 20.0f, 4.4375f)
                verticalLineTo(5.5625f)
                curveTo(18.6538f, 5.5625f, 17.5625f, 6.6538f, 17.5625f, 8.0f)
                horizontalLineTo(16.4375f)
                curveTo(16.4375f, 6.6538f, 15.3462f, 5.5625f, 14.0f, 5.5625f)
                verticalLineTo(4.4375f)
                close()
                moveTo(1.0f, 11.0f)
                curveTo(4.3137f, 11.0f, 7.0f, 8.3137f, 7.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.3137f, 11.6863f, 11.0f, 15.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(11.6863f, 13.0f, 9.0f, 15.6863f, 9.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 15.6863f, 4.3137f, 13.0f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(4.876f, 12.0f)
                curveTo(6.1872f, 12.7276f, 7.2724f, 13.8128f, 8.0f, 15.124f)
                curveTo(8.7276f, 13.8128f, 9.8128f, 12.7276f, 11.124f, 12.0f)
                curveTo(9.8128f, 11.2724f, 8.7276f, 10.1872f, 8.0f, 8.876f)
                curveTo(7.2724f, 10.1872f, 6.1872f, 11.2724f, 4.876f, 12.0f)
                close()
                moveTo(17.25f, 14.0f)
                curveTo(17.25f, 15.7949f, 15.7949f, 17.25f, 14.0f, 17.25f)
                verticalLineTo(18.75f)
                curveTo(15.7949f, 18.75f, 17.25f, 20.2051f, 17.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 20.2051f, 20.2051f, 18.75f, 22.0f, 18.75f)
                verticalLineTo(17.25f)
                curveTo(20.2051f, 17.25f, 18.75f, 15.7949f, 18.75f, 14.0f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return `_sparkling-line`!!
    }

private var `_sparkling-line`: ImageVector? = null
