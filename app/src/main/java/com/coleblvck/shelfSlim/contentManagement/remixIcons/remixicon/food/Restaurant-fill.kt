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

public val FoodGroup.`Restaurant-fill`: ImageVector
    get() {
        if (`_restaurant-fill` != null) {
            return `_restaurant-fill`!!
        }
        `_restaurant-fill` = Builder(name = "Restaurant-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 4.2386f, 18.2386f, 2.0f, 21.0f, 2.0f)
                close()
                moveTo(9.0f, 13.9f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.9f)
                curveTo(4.7178f, 13.4367f, 3.0f, 11.419f, 3.0f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 11.419f, 11.2822f, 13.4367f, 9.0f, 13.9f)
                close()
            }
        }
        .build()
        return `_restaurant-fill`!!
    }

private var `_restaurant-fill`: ImageVector? = null