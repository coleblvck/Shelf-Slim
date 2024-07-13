package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Live-fill`: ImageVector
    get() {
        if (`_live-fill` != null) {
            return `_live-fill`!!
        }
        `_live-fill` = Builder(name = "Live-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(16.5523f, 4.0f, 17.0f, 4.4477f, 17.0f, 5.0f)
                verticalLineTo(9.2f)
                lineTo(22.2133f, 5.5507f)
                curveTo(22.4395f, 5.3924f, 22.7513f, 5.4474f, 22.9096f, 5.6736f)
                curveTo(22.9684f, 5.7576f, 23.0f, 5.8577f, 23.0f, 5.9603f)
                verticalLineTo(18.0397f)
                curveTo(23.0f, 18.3158f, 22.7761f, 18.5397f, 22.5f, 18.5397f)
                curveTo(22.3974f, 18.5397f, 22.2973f, 18.5081f, 22.2133f, 18.4493f)
                lineTo(17.0f, 14.8f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.5523f, 16.5523f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 20.0f, 1.0f, 19.5523f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 4.4477f, 1.4477f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(7.4f, 8.8287f)
                curveTo(7.2067f, 8.8287f, 7.0454f, 8.9658f, 7.0081f, 9.1481f)
                lineTo(7.0f, 9.2287f)
                verticalLineTo(14.7713f)
                curveTo(7.0f, 14.8474f, 7.0217f, 14.9219f, 7.0625f, 14.9861f)
                curveTo(7.1663f, 15.1492f, 7.3686f, 15.2116f, 7.5424f, 15.1452f)
                lineTo(7.6147f, 15.1088f)
                lineTo(11.9697f, 12.3375f)
                curveTo(12.0191f, 12.306f, 12.061f, 12.2641f, 12.0924f, 12.2148f)
                curveTo(12.1962f, 12.0517f, 12.1671f, 11.842f, 12.0333f, 11.7127f)
                lineTo(11.9697f, 11.6625f)
                lineTo(7.6147f, 8.8912f)
                curveTo(7.5506f, 8.8504f, 7.4761f, 8.8287f, 7.4f, 8.8287f)
                close()
            }
        }
        .build()
        return `_live-fill`!!
    }

private var `_live-fill`: ImageVector? = null
