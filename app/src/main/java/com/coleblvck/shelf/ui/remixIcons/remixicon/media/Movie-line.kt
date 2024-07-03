package com.coleblvck.shelf.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Movie-line`: ImageVector
    get() {
        if (`_movie-line` != null) {
            return `_movie-line`!!
        }
        `_movie-line` = Builder(name = "Movie-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.9934f)
                curveTo(2.0f, 3.4448f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(3.9934f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(10.6219f, 8.4146f)
                lineTo(15.5008f, 11.6672f)
                curveTo(15.6846f, 11.7897f, 15.7343f, 12.0381f, 15.6117f, 12.2219f)
                curveTo(15.5824f, 12.2658f, 15.5447f, 12.3035f, 15.5008f, 12.3328f)
                lineTo(10.6219f, 15.5854f)
                curveTo(10.4381f, 15.708f, 10.1897f, 15.6583f, 10.0672f, 15.4745f)
                curveTo(10.0234f, 15.4088f, 10.0f, 15.3316f, 10.0f, 15.2526f)
                verticalLineTo(8.7474f)
                curveTo(10.0f, 8.5265f, 10.1791f, 8.3474f, 10.4f, 8.3474f)
                curveTo(10.479f, 8.3474f, 10.5562f, 8.3708f, 10.6219f, 8.4146f)
                close()
            }
        }
        .build()
        return `_movie-line`!!
    }

private var `_movie-line`: ImageVector? = null
