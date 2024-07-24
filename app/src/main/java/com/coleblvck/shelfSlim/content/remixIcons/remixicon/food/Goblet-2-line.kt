package com.coleblvck.shelfSlim.content.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Goblet-2-line`: ImageVector
    get() {
        if (`_goblet-2-line` != null) {
            return `_goblet-2-line`!!
        }
        `_goblet-2-line` = Builder(name = "Goblet-2-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(6.9904f, 10.1414f)
                lineTo(7.8678f, 4.0f)
                horizontalLineTo(16.1332f)
                lineTo(17.0105f, 10.1414f)
                curveTo(17.2085f, 11.5272f, 16.6892f, 12.7109f, 15.7514f, 13.5785f)
                curveTo(14.7968f, 14.4618f, 13.4178f, 15.0f, 12.0005f, 15.0f)
                curveTo(10.5831f, 15.0f, 9.2041f, 14.4618f, 8.2495f, 13.5785f)
                curveTo(7.3118f, 12.7109f, 6.7924f, 11.5272f, 6.9904f, 10.1414f)
                close()
            }
        }
        .build()
        return `_goblet-2-line`!!
    }

private var `_goblet-2-line`: ImageVector? = null
