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

public val MapGroup.`Suitcase-2-fill`: ImageVector
    get() {
        if (`_suitcase-2-fill` != null) {
            return `_suitcase-2-fill`!!
        }
        `_suitcase-2-fill` = Builder(name = "Suitcase-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 23.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 22.0f, 3.0f, 21.1046f, 3.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 5.8954f, 3.8954f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                curveTo(8.0f, 2.4477f, 8.4477f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 2.0f, 16.0f, 2.4477f, 16.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 5.0f, 21.0f, 5.8954f, 21.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.1046f, 20.1046f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_suitcase-2-fill`!!
    }

private var `_suitcase-2-fill`: ImageVector? = null
