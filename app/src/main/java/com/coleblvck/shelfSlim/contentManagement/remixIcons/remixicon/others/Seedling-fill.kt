package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Seedling-fill`: ImageVector
    get() {
        if (`_seedling-fill` != null) {
            return `_seedling-fill`!!
        }
        `_seedling-fill` = Builder(name = "Seedling-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.998f, 7.0f)
                verticalLineTo(9.5f)
                curveTo(21.998f, 13.0899f, 19.0879f, 16.0f, 15.498f, 16.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(14.0f)
                lineTo(11.0169f, 13.0007f)
                curveTo(11.2719f, 9.6441f, 14.0762f, 7.0f, 17.498f, 7.0f)
                horizontalLineTo(21.998f)
                close()
                moveTo(5.9981f, 3.0f)
                curveTo(9.0904f, 3.0f, 11.7144f, 5.0052f, 12.6408f, 7.7863f)
                curveTo(11.1417f, 9.0612f, 10.1516f, 10.9143f, 10.0144f, 13.0004f)
                lineTo(8.998f, 13.0f)
                curveTo(5.1321f, 13.0f, 1.998f, 9.866f, 1.998f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.9981f)
                close()
            }
        }
        .build()
        return `_seedling-fill`!!
    }

private var `_seedling-fill`: ImageVector? = null
