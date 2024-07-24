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

public val FoodGroup.`Drinks-2-fill`: ImageVector
    get() {
        if (`_drinks-2-fill` != null) {
            return `_drinks-2-fill`!!
        }
        `_drinks-2-fill` = Builder(name = "Drinks-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.323f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(8.677f)
                lineTo(10.677f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.8824f)
                lineTo(18.0554f, 21.0587f)
                curveTo(18.0243f, 21.5873f, 17.5866f, 22.0f, 17.0571f, 22.0f)
                horizontalLineTo(6.9429f)
                curveTo(6.4134f, 22.0f, 5.9757f, 21.5873f, 5.9446f, 21.0587f)
                lineTo(5.1177f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.523f)
                lineTo(7.323f, 2.0f)
                close()
                moveTo(7.1211f, 7.0f)
                lineTo(7.2991f, 10.0252f)
                curveTo(9.9706f, 10.1354f, 11.2679f, 10.6301f, 12.36f, 11.067f)
                curveTo(13.4113f, 11.4875f, 14.28f, 11.8532f, 16.5867f, 11.9676f)
                lineTo(16.8789f, 7.0f)
                horizontalLineTo(7.1211f)
                close()
            }
        }
        .build()
        return `_drinks-2-fill`!!
    }

private var `_drinks-2-fill`: ImageVector? = null
