package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Goblet-2-fill`: ImageVector
    get() {
        if (`_goblet-2-fill` != null) {
            return `_goblet-2-fill`!!
        }
        `_goblet-2-fill` = Builder(name = "Goblet-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1332f, 2.0f)
                lineTo(5.0105f, 9.8586f)
                curveTo(4.7085f, 11.9728f, 5.5323f, 13.7891f, 6.8912f, 15.0465f)
                curveTo(7.996f, 16.0688f, 9.4595f, 16.7319f, 11.0005f, 16.9343f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0005f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0005f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0005f)
                verticalLineTo(16.9343f)
                curveTo(14.5415f, 16.7319f, 16.0049f, 16.0688f, 17.1098f, 15.0465f)
                curveTo(18.4686f, 13.7891f, 19.2924f, 11.9728f, 18.9904f, 9.8586f)
                lineTo(17.8678f, 2.0f)
                horizontalLineTo(6.1332f)
                close()
                moveTo(10.0003f, 7.0f)
                curveTo(9.1694f, 7.0001f, 8.1624f, 7.2424f, 7.3712f, 7.4758f)
                lineTo(7.8678f, 4.0f)
                horizontalLineTo(16.1332f)
                lineTo(16.6234f, 7.4314f)
                curveTo(15.7848f, 7.7069f, 14.8897f, 8.0f, 14.0005f, 8.0f)
                curveTo(12.6083f, 8.0f, 11.4276f, 6.9998f, 10.0003f, 7.0f)
                close()
            }
        }
        .build()
        return `_goblet-2-fill`!!
    }

private var `_goblet-2-fill`: ImageVector? = null
