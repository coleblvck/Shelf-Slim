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

public val WeatherGroup.`Rainbow-fill`: ImageVector
    get() {
        if (`_rainbow-fill` != null) {
            return `_rainbow-fill`!!
        }
        `_rainbow-fill` = Builder(name = "Rainbow-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(18.0751f, 4.0f, 23.0f, 8.9249f, 23.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 10.6651f, 16.5522f, 7.1355f, 12.2492f, 7.0038f)
                lineTo(12.0f, 7.0f)
                curveTo(7.6651f, 7.0f, 4.1355f, 10.4478f, 4.0038f, 14.7508f)
                lineTo(4.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 8.9249f, 5.9249f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(15.866f, 8.0f, 19.0f, 11.134f, 19.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 12.8578f, 14.316f, 11.1089f, 12.1996f, 11.0049f)
                lineTo(12.0f, 11.0f)
                curveTo(9.8578f, 11.0f, 8.1089f, 12.684f, 8.0049f, 14.8004f)
                lineTo(8.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 11.134f, 8.134f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 13.3431f, 15.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 13.3431f, 10.3431f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_rainbow-fill`!!
    }

private var `_rainbow-fill`: ImageVector? = null
