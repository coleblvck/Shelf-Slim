package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Glasses-fill`: ImageVector
    get() {
        if (`_glasses-fill` != null) {
            return `_glasses-fill`!!
        }
        `_glasses-fill` = Builder(name = "Glasses-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 9.2386f, 3.2386f, 7.0f, 6.0f, 7.0f)
                curveTo(7.2139f, 7.0f, 8.3266f, 7.4331f, 9.192f, 8.1515f)
                curveTo(9.9137f, 7.44f, 10.905f, 7.0f, 12.0f, 7.0f)
                curveTo(13.095f, 7.0f, 14.0863f, 7.44f, 14.808f, 8.1515f)
                curveTo(15.6734f, 7.4331f, 16.7861f, 7.0f, 18.0f, 7.0f)
                curveTo(20.7614f, 7.0f, 23.0f, 9.2386f, 23.0f, 12.0f)
                curveTo(23.0f, 14.7614f, 20.7614f, 17.0f, 18.0f, 17.0f)
                curveTo(15.2386f, 17.0f, 13.0f, 14.7614f, 13.0f, 12.0f)
                curveTo(13.0f, 11.1835f, 13.1964f, 10.411f, 13.5445f, 9.729f)
                curveTo(13.177f, 9.283f, 12.6209f, 9.0f, 12.0f, 9.0f)
                curveTo(11.3791f, 9.0f, 10.823f, 9.283f, 10.4555f, 9.729f)
                curveTo(10.8036f, 10.411f, 11.0f, 11.1835f, 11.0f, 12.0f)
                curveTo(11.0f, 14.7614f, 8.7614f, 17.0f, 6.0f, 17.0f)
                curveTo(3.2386f, 17.0f, 1.0f, 14.7614f, 1.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_glasses-fill`!!
    }

private var `_glasses-fill`: ImageVector? = null
