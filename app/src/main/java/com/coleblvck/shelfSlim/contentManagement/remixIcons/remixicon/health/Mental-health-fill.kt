package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Mental-health-fill`: ImageVector
    get() {
        if (`_mental-health-fill` != null) {
            return `_mental-health-fill`!!
        }
        `_mental-health-fill` = Builder(name = "Mental-health-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(15.0675f, 2.0f, 18.426f, 5.0356f, 18.9337f, 8.9649f)
                lineTo(21.1842f, 12.5037f)
                curveTo(21.3324f, 12.7367f, 21.3025f, 13.0847f, 20.9593f, 13.2317f)
                lineTo(19.0f, 14.071f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.1046f, 18.1046f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(15.001f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0002f, 18.3061f)
                curveTo(6.0003f, 17.1252f, 5.5635f, 16.0087f, 4.7555f, 15.0011f)
                curveTo(3.6571f, 13.6313f, 3.0f, 11.8924f, 3.0f, 10.0f)
                curveTo(3.0f, 5.5817f, 6.5817f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(10.4697f, 7.7626f)
                curveTo(9.7863f, 7.0792f, 8.6782f, 7.0792f, 7.9948f, 7.7626f)
                curveTo(7.3114f, 8.446f, 7.3114f, 9.554f, 7.9948f, 10.2374f)
                lineTo(11.0f, 13.2426f)
                lineTo(14.0052f, 10.2374f)
                curveTo(14.6886f, 9.554f, 14.6886f, 8.446f, 14.0052f, 7.7626f)
                curveTo(13.3218f, 7.0792f, 12.2137f, 7.0792f, 11.5303f, 7.7626f)
                lineTo(11.0f, 8.2929f)
                lineTo(10.4697f, 7.7626f)
                close()
            }
        }
        .build()
        return `_mental-health-fill`!!
    }

private var `_mental-health-fill`: ImageVector? = null
