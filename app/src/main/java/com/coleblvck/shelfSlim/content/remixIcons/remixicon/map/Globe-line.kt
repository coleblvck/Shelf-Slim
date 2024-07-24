package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Globe-line`: ImageVector
    get() {
        if (`_globe-line` != null) {
            return `_globe-line`!!
        }
        `_globe-line` = Builder(name = "Globe-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0003f, 21.0f)
                horizontalLineTo(18.0003f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0003f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0003f)
                verticalLineTo(19.9506f)
                curveTo(7.7069f, 19.6236f, 4.8835f, 17.6987f, 3.3164f, 14.9622f)
                lineTo(5.0532f, 13.9697f)
                curveTo(6.4321f, 16.3776f, 9.0267f, 18.0f, 12.0003f, 18.0f)
                curveTo(16.4186f, 18.0f, 20.0003f, 14.4182f, 20.0003f, 10.0f)
                curveTo(20.0003f, 7.0264f, 18.378f, 4.4317f, 15.9701f, 3.0528f)
                lineTo(16.9626f, 1.316f)
                curveTo(19.9724f, 3.0396f, 22.0003f, 6.283f, 22.0003f, 10.0f)
                curveTo(22.0003f, 15.1853f, 18.0536f, 19.4489f, 13.0003f, 19.9506f)
                verticalLineTo(21.0f)
                close()
                moveTo(12.0003f, 17.0f)
                curveTo(8.1343f, 17.0f, 5.0003f, 13.8659f, 5.0003f, 10.0f)
                curveTo(5.0003f, 6.134f, 8.1343f, 2.9999f, 12.0003f, 2.9999f)
                curveTo(15.8663f, 2.9999f, 19.0003f, 6.134f, 19.0003f, 10.0f)
                curveTo(19.0003f, 13.8659f, 15.8663f, 17.0f, 12.0003f, 17.0f)
                close()
                moveTo(12.0003f, 15.0f)
                curveTo(14.7617f, 15.0f, 17.0003f, 12.7614f, 17.0003f, 10.0f)
                curveTo(17.0003f, 7.2385f, 14.7617f, 4.9999f, 12.0003f, 4.9999f)
                curveTo(9.2389f, 4.9999f, 7.0003f, 7.2385f, 7.0003f, 10.0f)
                curveTo(7.0003f, 12.7614f, 9.2389f, 15.0f, 12.0003f, 15.0f)
                close()
            }
        }
        .build()
        return `_globe-line`!!
    }

private var `_globe-line`: ImageVector? = null
