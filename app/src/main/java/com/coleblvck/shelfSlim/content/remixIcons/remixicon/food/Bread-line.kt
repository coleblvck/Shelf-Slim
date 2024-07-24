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

public val FoodGroup.`Bread-line`: ImageVector
    get() {
        if (`_bread-line` != null) {
            return `_bread-line`!!
        }
        `_bread-line` = Builder(name = "Bread-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(2.7909f, 3.0f, 1.0f, 4.7909f, 1.0f, 7.0f)
                curveTo(1.0f, 8.4817f, 1.8052f, 9.7734f, 3.0f, 10.4646f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.6569f, 4.3432f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 22.0f, 21.0f, 20.6569f, 21.0f, 19.0f)
                verticalLineTo(10.4646f)
                curveTo(22.1948f, 9.7734f, 23.0f, 8.4817f, 23.0f, 7.0f)
                curveTo(23.0f, 4.7909f, 21.2091f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 20.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                verticalLineTo(9.1221f)
                lineTo(5.3333f, 8.8864f)
                curveTo(4.5551f, 8.6114f, 4.0f, 7.8692f, 4.0f, 7.0f)
                curveTo(4.0f, 5.8954f, 4.8954f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 5.0f, 21.0f, 5.8954f, 21.0f, 7.0f)
                curveTo(21.0f, 7.8692f, 20.4449f, 8.6114f, 19.6668f, 8.8864f)
                lineTo(19.0f, 9.1221f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.5523f, 18.5523f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_bread-line`!!
    }

private var `_bread-line`: ImageVector? = null
