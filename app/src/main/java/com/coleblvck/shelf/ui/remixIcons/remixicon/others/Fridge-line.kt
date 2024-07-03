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

public val OthersGroup.`Fridge-line`: ImageVector
    get() {
        if (`_fridge-line` != null) {
            return `_fridge-line`!!
        }
        `_fridge-line` = Builder(name = "Fridge-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.998f, 1.0f)
                curveTo(19.5503f, 1.0f, 19.998f, 1.4477f, 19.998f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(19.998f, 22.5523f, 19.5503f, 23.0f, 18.998f, 23.0f)
                horizontalLineTo(4.9981f)
                curveTo(4.4458f, 23.0f, 3.998f, 22.5523f, 3.998f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(3.998f, 1.4477f, 4.4458f, 1.0f, 4.9981f, 1.0f)
                horizontalLineTo(18.998f)
                close()
                moveTo(17.998f, 12.0f)
                horizontalLineTo(5.9981f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(12.0f)
                close()
                moveTo(9.998f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.9981f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.998f)
                close()
                moveTo(17.998f, 3.0f)
                horizontalLineTo(5.9981f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(3.0f)
                close()
                moveTo(9.998f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.9981f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.998f)
                close()
            }
        }
        .build()
        return `_fridge-line`!!
    }

private var `_fridge-line`: ImageVector? = null
