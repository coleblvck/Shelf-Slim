package com.coleblvck.shelf.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Drinks-fill`: ImageVector
    get() {
        if (`_drinks-fill` != null) {
            return `_drinks-fill`!!
        }
        `_drinks-fill` = Builder(name = "Drinks-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.2049f)
                curveTo(5.6091f, 2.0f, 5.0961f, 2.4206f, 4.9792f, 3.0048f)
                lineTo(4.1802f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.1087f)
                horizontalLineTo(19.8912f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.8198f)
                lineTo(19.0208f, 3.0048f)
                curveTo(18.9039f, 2.4206f, 18.3909f, 2.0f, 17.795f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.6605f, 11.0f)
                horizontalLineTo(4.3395f)
                lineTo(5.4811f, 20.8933f)
                curveTo(5.5538f, 21.524f, 6.0879f, 22.0f, 6.7228f, 22.0f)
                horizontalLineTo(17.2772f)
                curveTo(17.9121f, 22.0f, 18.4462f, 21.524f, 18.5189f, 20.8933f)
                lineTo(19.6605f, 11.0f)
                close()
            }
        }
        .build()
        return `_drinks-fill`!!
    }

private var `_drinks-fill`: ImageVector? = null
