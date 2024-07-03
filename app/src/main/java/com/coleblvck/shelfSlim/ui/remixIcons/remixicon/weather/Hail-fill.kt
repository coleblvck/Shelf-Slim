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

public val WeatherGroup.`Hail-fill`: ImageVector
    get() {
        if (`_hail-fill` != null) {
            return `_hail-fill`!!
        }
        `_hail-fill` = Builder(name = "Hail-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9948f, 17.7944f)
                curveTo(18.8878f, 15.6808f, 17.1402f, 14.0f, 15.0f, 14.0f)
                curveTo(14.622f, 14.0f, 14.2562f, 14.0524f, 13.9096f, 14.1504f)
                curveTo(13.5201f, 12.3494f, 11.9176f, 11.0f, 10.0f, 11.0f)
                curveTo(7.7909f, 11.0f, 6.0f, 12.7909f, 6.0f, 15.0f)
                curveTo(6.0f, 16.0794f, 6.4275f, 17.0589f, 7.1225f, 17.7784f)
                curveTo(3.61f, 16.9337f, 1.0f, 13.7716f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
                curveTo(12.3949f, 2.0f, 15.2959f, 4.1147f, 16.4576f, 7.0986f)
                curveTo(16.7951f, 7.0339f, 17.1436f, 7.0f, 17.5f, 7.0f)
                curveTo(20.5376f, 7.0f, 23.0f, 9.4624f, 23.0f, 12.5f)
                curveTo(23.0f, 15.0194f, 21.306f, 17.1432f, 18.9948f, 17.7944f)
                close()
                moveTo(10.0f, 17.0f)
                curveTo(8.8954f, 17.0f, 8.0f, 16.1046f, 8.0f, 15.0f)
                curveTo(8.0f, 13.8954f, 8.8954f, 13.0f, 10.0f, 13.0f)
                curveTo(11.1046f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                curveTo(12.0f, 16.1046f, 11.1046f, 17.0f, 10.0f, 17.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(13.8954f, 20.0f, 13.0f, 19.1046f, 13.0f, 18.0f)
                curveTo(13.0f, 16.8954f, 13.8954f, 16.0f, 15.0f, 16.0f)
                curveTo(16.1046f, 16.0f, 17.0f, 16.8954f, 17.0f, 18.0f)
                curveTo(17.0f, 19.1046f, 16.1046f, 20.0f, 15.0f, 20.0f)
                close()
                moveTo(10.0f, 23.0f)
                curveTo(8.8954f, 23.0f, 8.0f, 22.1046f, 8.0f, 21.0f)
                curveTo(8.0f, 19.8954f, 8.8954f, 19.0f, 10.0f, 19.0f)
                curveTo(11.1046f, 19.0f, 12.0f, 19.8954f, 12.0f, 21.0f)
                curveTo(12.0f, 22.1046f, 11.1046f, 23.0f, 10.0f, 23.0f)
                close()
            }
        }
        .build()
        return `_hail-fill`!!
    }

private var `_hail-fill`: ImageVector? = null
