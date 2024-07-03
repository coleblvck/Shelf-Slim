package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Truck-line`: ImageVector
    get() {
        if (`_truck-line` != null) {
            return `_truck-line`!!
        }
        `_truck-line` = Builder(name = "Truck-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9646f, 18.0f)
                curveTo(8.7219f, 19.6961f, 7.2632f, 21.0f, 5.5f, 21.0f)
                curveTo(3.7368f, 21.0f, 2.2781f, 19.6961f, 2.0354f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.4477f, 1.4477f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 5.0f, 17.0f, 5.4477f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.0557f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.9646f)
                curveTo(20.7219f, 19.6961f, 19.2632f, 21.0f, 17.5f, 21.0f)
                curveTo(15.7368f, 21.0f, 14.2781f, 19.6961f, 14.0354f, 18.0f)
                horizontalLineTo(8.9646f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0505f)
                curveTo(3.6353f, 14.4022f, 4.5207f, 14.0f, 5.5f, 14.0f)
                curveTo(6.8962f, 14.0f, 8.1014f, 14.8175f, 8.6632f, 16.0f)
                horizontalLineTo(14.3368f)
                curveTo(14.5045f, 15.647f, 14.7296f, 15.3264f, 15.0f, 15.0505f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.715f)
                lineTo(18.9917f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(18.1531f, 19.0f, 18.7087f, 18.5826f, 18.9146f, 18.0f)
                curveTo(18.9699f, 17.8436f, 19.0f, 17.6753f, 19.0f, 17.5f)
                curveTo(19.0f, 16.6716f, 18.3284f, 16.0f, 17.5f, 16.0f)
                curveTo(16.6716f, 16.0f, 16.0f, 16.6716f, 16.0f, 17.5f)
                curveTo(16.0f, 17.6753f, 16.0301f, 17.8436f, 16.0854f, 18.0f)
                curveTo(16.2913f, 18.5826f, 16.8469f, 19.0f, 17.5f, 19.0f)
                close()
                moveTo(7.0f, 17.5f)
                curveTo(7.0f, 16.6716f, 6.3284f, 16.0f, 5.5f, 16.0f)
                curveTo(4.6716f, 16.0f, 4.0f, 16.6716f, 4.0f, 17.5f)
                curveTo(4.0f, 17.6753f, 4.0301f, 17.8436f, 4.0854f, 18.0f)
                curveTo(4.2913f, 18.5826f, 4.8469f, 19.0f, 5.5f, 19.0f)
                curveTo(6.1531f, 19.0f, 6.7087f, 18.5826f, 6.9146f, 18.0f)
                curveTo(6.9699f, 17.8436f, 7.0f, 17.6753f, 7.0f, 17.5f)
                close()
            }
        }
        .build()
        return `_truck-line`!!
    }

private var `_truck-line`: ImageVector? = null
