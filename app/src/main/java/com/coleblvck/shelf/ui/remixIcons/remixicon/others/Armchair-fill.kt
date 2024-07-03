package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Armchair-fill`: ImageVector
    get() {
        if (`_armchair-fill` != null) {
            return `_armchair-fill`!!
        }
        `_armchair-fill` = Builder(name = "Armchair-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 3.0f, 4.0f, 4.7909f, 4.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(6.7614f, 8.0f, 9.0f, 10.2386f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 10.2386f, 17.2386f, 8.0f, 20.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 4.7909f, 18.2091f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveTo(18.3431f, 10.0f, 17.0f, 11.3431f, 17.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 11.3431f, 5.6568f, 10.0f, 4.0f, 10.0f)
                curveTo(2.3431f, 10.0f, 1.0f, 11.3431f, 1.0f, 13.0f)
                curveTo(1.0f, 14.3062f, 1.8348f, 15.4175f, 3.0f, 15.8293f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.8293f)
                curveTo(22.1652f, 15.4175f, 23.0f, 14.3062f, 23.0f, 13.0f)
                curveTo(23.0f, 11.3431f, 21.6569f, 10.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_armchair-fill`!!
    }

private var `_armchair-fill`: ImageVector? = null
