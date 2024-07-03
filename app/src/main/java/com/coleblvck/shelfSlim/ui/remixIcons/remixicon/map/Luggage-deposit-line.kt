package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Luggage-deposit-line`: ImageVector
    get() {
        if (`_luggage-deposit-line` != null) {
            return `_luggage-deposit-line`!!
        }
        `_luggage-deposit-line` = Builder(name = "Luggage-deposit-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(15.5523f, 3.0f, 16.0f, 3.4477f, 16.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 6.4477f, 21.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.4477f, 3.4477f, 6.0f, 4.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 3.4477f, 8.4477f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(14.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_luggage-deposit-line`!!
    }

private var `_luggage-deposit-line`: ImageVector? = null