package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.FoodGroup

public val FoodGroup.`Cup-line`: ImageVector
    get() {
        if (`_cup-line` != null) {
            return `_cup-line`!!
        }
        `_cup-line` = Builder(name = "Cup-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 14.1046f, 6.8954f, 15.0f, 8.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1046f, 15.0f, 16.0f, 14.1046f, 16.0f, 13.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 3.0f, 22.0f, 3.8954f, 22.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 9.1046f, 21.1046f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 15.2091f, 16.2091f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 17.0f, 4.0f, 15.2091f, 4.0f, 13.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.4477f, 4.4477f, 3.0f, 5.0f, 3.0f)
                close()
                moveTo(18.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_cup-line`!!
    }

private var `_cup-line`: ImageVector? = null
