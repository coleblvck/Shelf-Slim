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

public val OthersGroup.`Seedling-line`: ImageVector
    get() {
        if (`_seedling-line` != null) {
            return `_seedling-line`!!
        }
        `_seedling-line` = Builder(name = "Seedling-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9981f, 3.0f)
                curveTo(9.4879f, 3.0f, 12.3812f, 5.5538f, 12.9112f, 8.8945f)
                curveTo(14.0863f, 7.7239f, 15.7076f, 7.0f, 17.498f, 7.0f)
                horizontalLineTo(21.998f)
                verticalLineTo(9.5f)
                curveTo(21.998f, 13.0899f, 19.0879f, 16.0f, 15.498f, 16.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.998f)
                curveTo(5.1321f, 13.0f, 1.998f, 9.866f, 1.998f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.9981f)
                close()
                moveTo(19.998f, 9.0f)
                horizontalLineTo(17.498f)
                curveTo(15.0128f, 9.0f, 12.998f, 11.0147f, 12.998f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.498f)
                curveTo(17.9833f, 14.0f, 19.998f, 11.9853f, 19.998f, 9.5f)
                verticalLineTo(9.0f)
                close()
                moveTo(5.9981f, 5.0f)
                horizontalLineTo(3.998f)
                verticalLineTo(6.0f)
                curveTo(3.998f, 8.7614f, 6.2366f, 11.0f, 8.998f, 11.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(10.0f)
                curveTo(10.998f, 7.2386f, 8.7595f, 5.0f, 5.9981f, 5.0f)
                close()
            }
        }
        .build()
        return `_seedling-line`!!
    }

private var `_seedling-line`: ImageVector? = null
