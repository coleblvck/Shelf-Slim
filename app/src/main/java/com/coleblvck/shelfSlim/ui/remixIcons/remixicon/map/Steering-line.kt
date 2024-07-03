package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Steering-line`: ImageVector
    get() {
        if (`_steering-line` != null) {
            return `_steering-line`!!
        }
        `_steering-line` = Builder(name = "Steering-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7992f, 14.001f)
                curveTo(20.9633f, 18.1168f, 17.5995f, 21.3145f, 13.399f, 21.9028f)
                lineTo(13.3992f, 19.878f)
                curveTo(16.4926f, 19.3321f, 18.9729f, 17.0086f, 19.7473f, 14.0004f)
                lineTo(21.7992f, 14.001f)
                close()
                moveTo(4.2516f, 14.0004f)
                curveTo(5.0176f, 16.9759f, 7.4524f, 19.2814f, 10.4989f, 19.8595f)
                verticalLineTo(21.8882f)
                curveTo(6.3456f, 21.2632f, 3.0289f, 18.0838f, 2.1997f, 14.001f)
                lineTo(4.2516f, 14.0004f)
                close()
                moveTo(17.9994f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.9994f)
                curveTo(13.9451f, 13.0f, 13.0813f, 13.8159f, 13.0049f, 14.8507f)
                lineTo(12.9994f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.9994f)
                verticalLineTo(15.0f)
                curveTo(10.9994f, 13.9456f, 10.1836f, 13.0818f, 9.1487f, 13.0055f)
                lineTo(8.9994f, 13.0f)
                horizontalLineTo(5.9994f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.9994f)
                close()
                moveTo(11.9994f, 2.0f)
                curveTo(17.1848f, 2.0f, 21.4483f, 5.9466f, 21.9501f, 10.9999f)
                lineTo(19.9376f, 11.0f)
                curveTo(19.4455f, 7.0537f, 16.0791f, 4.0f, 11.9994f, 4.0f)
                curveTo(7.9198f, 4.0f, 4.5534f, 7.0537f, 4.0613f, 11.0f)
                lineTo(2.0488f, 10.9999f)
                curveTo(2.5506f, 5.9466f, 6.8141f, 2.0f, 11.9994f, 2.0f)
                close()
            }
        }
        .build()
        return `_steering-line`!!
    }

private var `_steering-line`: ImageVector? = null
